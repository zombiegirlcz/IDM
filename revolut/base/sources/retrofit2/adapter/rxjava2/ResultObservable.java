package retrofit2.adapter.rxjava2;

import efm.r;
import efm.y;
import ifm.c;
import io.reactivex.exceptions.CompositeException;
import m70.a;
import retrofit2.Response;

/* JADX INFO: loaded from: classes14.dex */
final class ResultObservable<T> extends r<Result<T>> {
    private final r<Response<T>> upstream;

    public static class ResultObserver<R> implements y {
        private final y observer;

        public ResultObserver(y yVar) {
            this.observer = yVar;
        }

        @Override // efm.y
        public void onComplete() {
            this.observer.onComplete();
        }

        @Override // efm.y
        public void onError(Throwable th10) {
            try {
                this.observer.onNext(Result.error(th10));
                this.observer.onComplete();
            } catch (Throwable th11) {
                try {
                    this.observer.onError(th11);
                } catch (Throwable th12) {
                    a.u(th12);
                    mo3.a.m(new CompositeException(th11, th12));
                }
            }
        }

        @Override // efm.y
        public void onSubscribe(c cVar) {
            this.observer.onSubscribe(cVar);
        }

        @Override // efm.y
        public void onNext(Response<R> response) {
            this.observer.onNext(Result.response(response));
        }
    }

    public ResultObservable(r<Response<T>> rVar) {
        this.upstream = rVar;
    }

    @Override // efm.r
    public void subscribeActual(y yVar) {
        this.upstream.subscribe(new ResultObserver(yVar));
    }
}
