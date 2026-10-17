package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class t8 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m8 f33245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33247c;

    private t8(m8 m8Var, e4m.e eVar, e4m.e eVar2) {
        this.f33245a = m8Var;
        this.f33246b = eVar;
        this.f33247c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cd0 get() {
        return a(this.f33245a, (gh) this.f33246b.get(), (yj0) this.f33247c.get());
    }

    public static t8 a(m8 m8Var, e4m.e eVar, e4m.e eVar2) {
        return new t8(m8Var, eVar, eVar2);
    }

    public static cd0 a(m8 m8Var, gh ghVar, yj0 yj0Var) {
        cd0 cd0VarA = m8Var.a(ghVar, yj0Var);
        vc.s.k(cd0VarA);
        return cd0VarA;
    }
}
