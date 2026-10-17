package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.SynchronousExecutor;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import efm.c0;
import efm.d0;
import efm.f0;
import hhm.f;
import ifm.c;
import java.util.Objects;
import java.util.concurrent.Executor;
import kp0.b;
import o6.a;
import ufm.n;
import wfm.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class RxWorker extends ListenableWorker {
    static final Executor INSTANT_EXECUTOR = new SynchronousExecutor();

    public RxWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private <T> ListenableFuture<T> convert(d0<T> d0Var) {
        return CallbackToFutureAdapter.getFuture(new b(this, d0Var, 26));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object lambda$convert$0(d0 d0Var, final CallbackToFutureAdapter.Completer completer) throws Exception {
        n nVarS = d0Var.s(getBackgroundScheduler());
        SerialExecutor serialTaskExecutor = getTaskExecutor().getSerialTaskExecutor();
        c0 c0Var = f.f152429a;
        nVarS.n(new j(serialTaskExecutor)).q(new f0() { // from class: androidx.work.RxWorker.1
            @Override // efm.f0
            public void onError(Throwable th10) {
                completer.setException(th10);
            }

            @Override // efm.f0
            public void onSubscribe(c cVar) {
                CallbackToFutureAdapter.Completer completer2 = completer;
                Objects.requireNonNull(cVar);
                completer2.addCancellationListener(new a(cVar, 13), RxWorker.INSTANT_EXECUTOR);
            }

            @Override // efm.f0
            public void onSuccess(T t2) {
                completer.set(t2);
            }
        });
        return "converted single to future";
    }

    @NonNull
    public abstract d0<ListenableWorker.Result> createWork();

    @NonNull
    public c0 getBackgroundScheduler() {
        Executor backgroundExecutor = getBackgroundExecutor();
        c0 c0Var = f.f152429a;
        return new j(backgroundExecutor);
    }

    @NonNull
    public d0<ForegroundInfo> getForegroundInfo() {
        return d0.l(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"));
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture<ForegroundInfo> getForegroundInfoAsync() {
        return convert(getForegroundInfo());
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public ListenableFuture<ListenableWorker.Result> startWork() {
        return convert(createWork());
    }
}
