package androidx.camera.viewfinder.internal.utils.futures;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes15.dex */
public interface FutureCallback<V> {
    void onFailure(@NonNull Throwable th10);

    void onSuccess(V v);
}
