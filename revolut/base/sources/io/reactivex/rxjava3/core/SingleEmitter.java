package io.reactivex.rxjava3.core;

import igm.f;

/* JADX INFO: loaded from: classes5.dex */
public interface SingleEmitter {
    void a(f fVar);

    boolean isDisposed();

    void onError(Throwable th10);

    void onSuccess(Object obj2);
}
