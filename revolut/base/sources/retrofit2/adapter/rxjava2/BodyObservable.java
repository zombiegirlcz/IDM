package retrofit2.adapter.rxjava2;

import efm.r;
import efm.y;
import ifm.c;
import io.reactivex.exceptions.CompositeException;
import mo3.a;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
final class BodyObservable<T> extends r<T> {
    private final r<Response<T>> upstream;

    public static class BodyObserver<R> implements y {
        private final y observer;
        private boolean terminated;

        public BodyObserver(y yVar) {
            this.observer = yVar;
        }

        @Override // efm.y
        public void onComplete() {
            if (this.terminated) {
                return;
            }
            this.observer.onComplete();
        }

        @Override // efm.y
        public void onError(Throwable th10) {
            if (!this.terminated) {
                this.observer.onError(th10);
                return;
            }
            AssertionError assertionError = new AssertionError("This should never happen! Report as a bug with the full stacktrace.");
            assertionError.initCause(th10);
            a.m(assertionError);
        }

        @Override // efm.y
        public void onSubscribe(c cVar) {
            this.observer.onSubscribe(cVar);
        }

        @Override // efm.y
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
                m70.a.u(th10);
                a.m(new CompositeException(httpException, th10));
            }
        }
    }

    public BodyObservable(r<Response<T>> rVar) {
        this.upstream = rVar;
    }

    @Override // efm.r
    public void subscribeActual(y yVar) {
        this.upstream.subscribe(new BodyObserver(yVar));
    }
}
