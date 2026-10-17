package pgm;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class w1 extends Flowable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scheduler f236174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f236175c;

    public w1(long j2, Scheduler scheduler) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f236175c = j2;
        this.f236174b = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public final void k(dom.a aVar) {
        v1 v1Var = new v1(aVar, 0);
        aVar.e(v1Var);
        Disposable disposableD = this.f236174b.d(v1Var, this.f236175c, TimeUnit.MILLISECONDS);
        while (!v1Var.compareAndSet(null, disposableD)) {
            if (v1Var.get() != null) {
                if (v1Var.get() == jgm.b.DISPOSED) {
                    disposableD.dispose();
                    return;
                }
                return;
            }
        }
    }
}
