package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public interface FutureCallback<V> {
    void onFailure(Throwable th10);

    void onSuccess(@ParametricNullness V v);
}
