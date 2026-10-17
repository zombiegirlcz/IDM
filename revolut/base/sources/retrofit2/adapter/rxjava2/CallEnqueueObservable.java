package retrofit2.adapter.rxjava2;

import efm.r;
import efm.y;
import ifm.c;
import io.reactivex.exceptions.CompositeException;
import m70.a;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes14.dex */
final class CallEnqueueObservable<T> extends r<Response<T>> {
    private final Call<T> originalCall;

    public static final class CallCallback<T> implements c, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final y observer;
        boolean terminated = false;

        public CallCallback(Call<?> call, y yVar) {
            this.call = call;
            this.observer = yVar;
        }

        @Override // ifm.c
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // ifm.c
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call<T> call, Throwable th10) {
            if (call.isCanceled()) {
                return;
            }
            try {
                this.observer.onError(th10);
            } catch (Throwable th11) {
                a.u(th11);
                mo3.a.m(new CompositeException(th10, th11));
            }
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<T> call, Response<T> response) {
            if (this.disposed) {
                return;
            }
            try {
                this.observer.onNext(response);
                if (this.disposed) {
                    return;
                }
                this.terminated = true;
                this.observer.onComplete();
            } catch (Throwable th10) {
                a.u(th10);
                if (this.terminated) {
                    mo3.a.m(th10);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th10);
                } catch (Throwable th11) {
                    a.u(th11);
                    mo3.a.m(new CompositeException(th10, th11));
                }
            }
        }
    }

    public CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // efm.r
    public void subscribeActual(y yVar) {
        Call<T> callClone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(callClone, yVar);
        yVar.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        callClone.enqueue(callCallback);
    }
}
