package retrofit2.adapter.rxjava3;

import ce9.m;
import fgm.l;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/* JADX INFO: loaded from: classes14.dex */
final class CallEnqueueObservable<T> extends Observable {
    private final Call<T> originalCall;

    public static final class CallCallback<T> implements Disposable, Callback<T> {
        private final Call<?> call;
        private volatile boolean disposed;
        private final l observer;
        boolean terminated = false;

        public CallCallback(Call<?> call, l lVar) {
            this.call = call;
            this.observer = lVar;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
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
                m.F(th11);
                jb3.l.v(new CompositeException(th10, th11));
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
                m.F(th10);
                if (this.terminated) {
                    jb3.l.v(th10);
                    return;
                }
                if (this.disposed) {
                    return;
                }
                try {
                    this.observer.onError(th10);
                } catch (Throwable th11) {
                    m.F(th11);
                    jb3.l.v(new CompositeException(th10, th11));
                }
            }
        }
    }

    public CallEnqueueObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(l lVar) {
        Call<T> callClone = this.originalCall.clone();
        CallCallback callCallback = new CallCallback(callClone, lVar);
        lVar.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        callClone.enqueue(callCallback);
    }
}
