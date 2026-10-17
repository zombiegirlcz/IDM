package gcm;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class o0 extends ecm.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.h f142789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f142790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f142791c = new ArrayList();

    public o0(ecm.h hVar) {
        this.f142789a = hVar;
    }

    @Override // ecm.h
    public final void a(ecm.g2 g2Var, ecm.m1 m1Var) {
        e(new ecm.h2(this, 2, g2Var, m1Var));
    }

    @Override // ecm.h
    public final void b(ecm.m1 m1Var) {
        if (this.f142790b) {
            this.f142789a.b(m1Var);
        } else {
            e(new au0.x5(9, (Object) this, false, (Object) m1Var));
        }
    }

    @Override // ecm.h
    public final void c(Object obj2) {
        if (this.f142790b) {
            this.f142789a.c(obj2);
        } else {
            e(new au0.x5(10, (Object) this, false, obj2));
        }
    }

    @Override // ecm.h
    public final void d() {
        if (this.f142790b) {
            this.f142789a.d();
        } else {
            e(new ag.q(this, 7));
        }
    }

    public final void e(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f142790b) {
                    runnable.run();
                } else {
                    this.f142791c.add(runnable);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
