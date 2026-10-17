package retrofit2.adapter.rxjava2;

import efm.r;
import efm.y;
import ifm.c;
import io.reactivex.exceptions.CompositeException;
import m70.a;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
final class CallExecuteObservable<T> extends r<Response<T>> {
    private final Call<T> originalCall;

    public static final class CallDisposable implements c {
        private final Call<?> call;
        private volatile boolean disposed;

        public CallDisposable(Call<?> call) {
            this.call = call;
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
    }

    public CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // efm.r
    public void subscribeActual(y yVar) {
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        yVar.onSubscribe(callDisposable);
        if (callDisposable.isDisposed()) {
            return;
        }
        boolean z = false;
        try {
            Response<T> responseExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                yVar.onNext(responseExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                yVar.onComplete();
            } catch (Throwable th10) {
                th = th10;
                z = true;
                a.u(th);
                if (z) {
                    mo3.a.m(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    yVar.onError(th);
                } catch (Throwable th11) {
                    a.u(th11);
                    mo3.a.m(new CompositeException(th, th11));
                }
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }
}
