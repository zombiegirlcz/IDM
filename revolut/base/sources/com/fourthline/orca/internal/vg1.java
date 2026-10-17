package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class vg1 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tg1 f34357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34358b;

    private vg1(tg1 tg1Var, e4m.e eVar) {
        this.f34357a = tg1Var;
        this.f34358b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mb.d get() {
        return a(this.f34357a, (r70) this.f34358b.get());
    }

    public static vg1 a(tg1 tg1Var, e4m.e eVar) {
        return new vg1(tg1Var, eVar);
    }

    public static mb.d a(tg1 tg1Var, r70 r70Var) {
        mb.d dVarC = tg1Var.c(r70Var);
        vc.s.k(dVarC);
        return dVarC;
    }
}
