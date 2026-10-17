package fgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public interface b {
    void onComplete();

    void onError(Throwable th10);

    void onSubscribe(Disposable disposable);
}
