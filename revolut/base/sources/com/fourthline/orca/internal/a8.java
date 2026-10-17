package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class a8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y7 f26722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26723b;

    private a8(y7 y7Var, e4m.e eVar) {
        this.f26722a = y7Var;
        this.f26723b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y11 get() {
        return a(this.f26722a, (sg0) this.f26723b.get());
    }

    public static a8 a(y7 y7Var, e4m.e eVar) {
        return new a8(y7Var, eVar);
    }

    public static y11 a(y7 y7Var, sg0 sg0Var) {
        y11 y11VarA = y7Var.a(sg0Var);
        vc.s.k(y11VarA);
        return y11VarA;
    }
}
