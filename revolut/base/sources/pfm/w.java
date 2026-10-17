package pfm;

import efm.c0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends efm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f235771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f235772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f235773c;

    public w(long j2, TimeUnit timeUnit, c0 c0Var) {
        this.f235771a = j2;
        this.f235772b = timeUnit;
        this.f235773c = c0Var;
    }

    @Override // efm.b
    public final void x(efm.d dVar) {
        v vVar = new v(dVar, 0);
        dVar.onSubscribe(vVar);
        lfm.d.c(vVar, this.f235773c.d(vVar, this.f235771a, this.f235772b));
    }
}
