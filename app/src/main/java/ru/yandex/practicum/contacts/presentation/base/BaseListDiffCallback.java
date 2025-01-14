package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

/** @noinspection rawtypes*/
public class BaseListDiffCallback<T extends ListDiffInterface> extends DiffUtil.ItemCallback<T>{
    @Override
    public boolean areItemsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        //noinspection unchecked
        return oldItem.theSameAs(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull T oldItem, @NonNull T newItem) {
        return false;
    }
}
