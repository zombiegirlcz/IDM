package retrofit2.adapter.rxjava3;

import ce9.m;
import fgm.l;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import retrofit2.Call;
import retrofit2.Response;

/* JADX INFO: loaded from: classes14.dex */
final class CallExecuteObservable<T> extends Observable {
    private final Call<T> originalCall;

    public static final class CallDisposable implements Disposable {
        private final Call<?> call;
        private volatile boolean disposed;

        public CallDisposable(Call<?> call) {
            this.call = call;
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
    }

    public CallExecuteObservable(Call<T> call) {
        this.originalCall = call;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(l lVar) {
        Call<T> callClone = this.originalCall.clone();
        CallDisposable callDisposable = new CallDisposable(callClone);
        lVar.onSubscribe(callDisposable);
        if (callDisposable.isDisposed()) {
            return;
        }
        boolean z = false;
        try {
            Response<T> responseExecute = callClone.execute();
            if (!callDisposable.isDisposed()) {
                lVar.onNext(responseExecute);
            }
            if (callDisposable.isDisposed()) {
                return;
            }
            try {
                lVar.onComplete();
            } catch (Throwable th10) {
                th = th10;
                z = true;
                m.F(th);
                if (z) {
                    jb3.l.v(th);
                    return;
                }
                if (callDisposable.isDisposed()) {
                    return;
                }
                try {
                    lVar.onError(th);
                } catch (Throwable th11) {
                    m.F(th11);
                    jb3.l.v(new CompositeException(th, th11));
                }
            }
        } catch (Throwable th12) {
            th = th12;
        }
    }
}
