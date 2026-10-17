package sgm;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class o2 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263043a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f263044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f263045c;
    public final Object d;

    public o2(long j2, TimeUnit timeUnit, Scheduler scheduler) {
        this.f263044b = j2;
        this.f263045c = timeUnit;
        this.d = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        int i = this.f263043a;
        TimeUnit timeUnit = this.f263045c;
        long j2 = this.f263044b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Future future = (Future) obj2;
                ngm.h hVar = new ngm.h(lVar);
                lVar.onSubscribe(hVar);
                if (hVar.isDisposed()) {
                    return;
                }
                try {
                    Object obj3 = timeUnit != null ? future.get(j2, timeUnit) : future.get();
                    if (obj3 == null) {
                        throw ygm.g.b("Future returned a null value.");
                    }
                    q75.t tVar = ygm.g.f313672a;
                    hVar.a(obj3);
                    return;
                } catch (Throwable th10) {
                    ce9.m.F(th10);
                    if (hVar.isDisposed()) {
                        return;
                    }
                    lVar.onError(th10);
                    return;
                }
            default:
                ogm.o oVar = new ogm.o(lVar, 1);
                lVar.onSubscribe(oVar);
                Disposable disposableD = ((Scheduler) obj2).d(oVar, j2, timeUnit);
                while (!oVar.compareAndSet(null, disposableD)) {
                    if (oVar.get() != null) {
                        if (oVar.get() == jgm.b.DISPOSED) {
                            disposableD.dispose();
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    public o2(Future future, long j2, TimeUnit timeUnit) {
        this.d = future;
        this.f263044b = j2;
        this.f263045c = timeUnit;
    }
}
