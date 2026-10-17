package androidx.camera.core.impl.utils.futures;

/* JADX INFO: loaded from: classes15.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable th10);

    void onSuccess(V v);
}
