package retrofit2.adapter.rxjava3;

import ce9.m;
import fgm.l;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.Response;

/* JADX INFO: loaded from: classes14.dex */
final class BodyObservable<T> extends Observable {
    private final Observable upstream;

    public static class BodyObserver<R> implements l {
        private final l observer;
        private boolean terminated;

        public BodyObserver(l lVar) {
            this.observer = lVar;
        }

        @Override // fgm.l
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // fgm.l
        public void onError(Throwable th10) {
            if (!this.terminated) {
                this.observer.onError(th10);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th10);
            jb3.l.v(assertionError);
        }

        @Override // fgm.l
        public void onSubscribe(Disposable disposable) {
            this.observer.onSubscribe(disposable);
        }

        @Override // fgm.l
        public void onNext(Response<R> response) {
            if (response.isSuccessful()) {
                this.observer.onNext(response.body());
                return;
            }
            this.terminated = true;
            HttpException httpException = new HttpException(response);
            try {
                this.observer.onError(httpException);
            } catch (Throwable th10) {
                m.F(th10);
                jb3.l.v(new CompositeException(httpException, th10));
            }
        }
    }

    public BodyObservable(Observable observable) {
        this.upstream = observable;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(l lVar) {
        this.upstream.subscribe(new BodyObserver(lVar));
    }
}
