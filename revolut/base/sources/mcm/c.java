package mcm;

import com.google.common.base.MoreObjects;
import ecm.k2;
import ecm.r0;
import ecm.u0;
import ecm.x0;
import ecm.y0;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c extends u0 {
    @Override // ecm.u0
    public x0 a(r0 r0Var) {
        return g().a(r0Var);
    }

    @Override // ecm.u0
    public final ecm.g b() {
        return g().b();
    }

    @Override // ecm.u0
    public final ScheduledExecutorService c() {
        return g().c();
    }

    @Override // ecm.u0
    public final k2 d() {
        return g().d();
    }

    @Override // ecm.u0
    public final void e() {
        g().e();
    }

    @Override // ecm.u0
    public void f(ecm.r rVar, y0 y0Var) {
        g().f(rVar, y0Var);
    }

    public abstract u0 g();

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", g()).toString();
    }
}
