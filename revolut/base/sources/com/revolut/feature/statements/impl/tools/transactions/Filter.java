package com.revolut.feature.statements.impl.tools.transactions;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
abstract class Filter<T> {
    @NonNull
    public List<T> filter(List<T> list) {
        return list;
    }

    public abstract boolean isPass(@NonNull T t2);
}
