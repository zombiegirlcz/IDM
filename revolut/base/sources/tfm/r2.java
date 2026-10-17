package tfm;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class r2 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Future f270767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270768h;
    public final TimeUnit i;

    public r2(Future future, long j2, TimeUnit timeUnit) {
        this.f270767g = future;
        this.f270768h = j2;
        this.i = timeUnit;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        ofm.j jVar = new ofm.j(yVar);
        yVar.onSubscribe(jVar);
        if (jVar.isDisposed()) {
            return;
        }
        try {
            TimeUnit timeUnit = this.i;
            Future future = this.f270767g;
            Object obj2 = timeUnit != null ? future.get(this.f270768h, timeUnit) : future.get();
            mfm.f.b(obj2, "Future returned null");
            jVar.a(obj2);
        } catch (Throwable th10) {
            m70.a.u(th10);
            if (jVar.isDisposed()) {
                return;
            }
            yVar.onError(th10);
        }
    }
}
