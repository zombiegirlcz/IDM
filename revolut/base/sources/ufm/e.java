package ufm;

import efm.c0;
import efm.d0;
import efm.f0;
import java.util.concurrent.TimeUnit;
import pfm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f279878a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f279879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f279880c;
    public final Object d;

    public e(long j2, TimeUnit timeUnit, c0 c0Var) {
        this.f279879b = j2;
        this.d = timeUnit;
        this.f279880c = c0Var;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        switch (this.f279878a) {
            case 0:
                lfm.b bVar = new lfm.b(1);
                f0Var.onSubscribe(bVar);
                ((d0) this.d).q(new d(this, bVar, f0Var));
                break;
            default:
                v vVar = new v(f0Var, 1);
                f0Var.onSubscribe(vVar);
                lfm.d.c(vVar, this.f279880c.d(vVar, this.f279879b, (TimeUnit) this.d));
                break;
        }
    }

    public e(d0 d0Var, long j2, c0 c0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.d = d0Var;
        this.f279879b = j2;
        this.f279880c = c0Var;
    }
}
