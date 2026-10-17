package q6;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkerKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f242436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CallbackToFutureAdapter.Completer f242437c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ b(AtomicBoolean atomicBoolean, CallbackToFutureAdapter.Completer completer, Function0 function0, int i) {
        this.f242435a = i;
        this.f242436b = atomicBoolean;
        this.f242437c = completer;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f242435a) {
            case 0:
                ListenableFutureKt.executeAsync$lambda$4$lambda$3(this.f242436b, this.f242437c, this.d);
                break;
            default:
                WorkerKt.future$lambda$2$lambda$1(this.f242436b, this.f242437c, this.d);
                break;
        }
    }
}
