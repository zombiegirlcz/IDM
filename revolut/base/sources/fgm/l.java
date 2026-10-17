package fgm;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public interface l {
    void onComplete();

    void onError(Throwable th10);

    void onNext(Object obj2);

    void onSubscribe(Disposable disposable);
}
