package androidx.camera.core.impl;

/* JADX INFO: loaded from: classes15.dex */
public class MutableStateObservable<T> extends StateObservable<T> {
    private MutableStateObservable(Object obj2, boolean z) {
        super(obj2, z);
    }

    public static <T> MutableStateObservable<T> withInitialState(T t2) {
        return new MutableStateObservable<>(t2, false);
    }

    public void setError(Throwable th10) {
        updateStateAsError(th10);
    }

    public void setState(T t2) {
        updateState(t2);
    }
}
