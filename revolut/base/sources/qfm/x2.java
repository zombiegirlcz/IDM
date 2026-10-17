package qfm;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class x2 extends efm.d0 implements nfm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f245578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfm.b f245579b;

    public x2(t0 t0Var) {
        zfm.b bVar = zfm.b.INSTANCE;
        this.f245578a = t0Var;
        this.f245579b = bVar;
    }

    @Override // nfm.b
    public final efm.i b() {
        return new n(this.f245578a, this.f245579b, 3);
    }

    @Override // efm.d0
    public final void r(efm.f0 f0Var) {
        try {
            this.f245579b.getClass();
            this.f245578a.n(new g1(f0Var, new ArrayList()));
        } catch (Throwable th10) {
            m70.a.u(th10);
            lfm.e.e(th10, f0Var);
        }
    }
}
