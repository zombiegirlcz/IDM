package pfm;

import efm.c0;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.b f235736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f235737c;
    public final TimeUnit d;
    public final c0 e;

    public /* synthetic */ j(efm.b bVar, long j2, TimeUnit timeUnit, c0 c0Var, int i) {
        this.f235735a = i;
        this.f235736b = bVar;
        this.f235737c = j2;
        this.d = timeUnit;
        this.e = c0Var;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        switch (this.f235735a) {
            case 0:
                this.f235736b.d(new i(dVar, this.f235737c, this.d, this.e));
                break;
            default:
                ifm.b bVar = new ifm.b();
                dVar.onSubscribe(bVar);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                bVar.a(this.e.d(new byl.g(this, atomicBoolean, bVar, dVar, false, 2), this.f235737c, this.d));
                this.f235736b.d(new jpc.e(bVar, 17, atomicBoolean, dVar));
                break;
        }
    }
}
