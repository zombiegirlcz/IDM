package retrofit2.adapter.rxjava3;

import ce9.m;
import fgm.l;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes14.dex */
final class ResultObservable<T> extends Observable {
    private final Observable upstream;

    public static class ResultObserver<R> implements l {
        private final l observer;

        public ResultObserver(l lVar) {
            this.observer = lVar;
        }

        @Override // fgm.l
        public void onComplete() {
            this.observer.onComplete();
        }

        @Override // fgm.l
        public void onError(Throwable th10) {
            try {
                this.observer.onNext(Result.error(th10));
                this.observer.onComplete();
            } catch (Throwable th11) {
                try {
                    this.observer.onError(th11);
                } catch (Throwable th12) {
                    m.F(th12);
                    jb3.l.v(new CompositeException(th11, th12));
                }
            }
        }

        @Override // fgm.l
        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        @Override // fgm.l
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }
    }

    public ResultObservable(Observable observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(l lVar) {
        this.upstream.subscribe(new ResultObserver(lVar));
    }
}
