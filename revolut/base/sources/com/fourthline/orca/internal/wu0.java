package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class wu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f34801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34803c;
    private final e4m.e d;
    private final e4m.e e;

    private wu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f34801a = lt0Var;
        this.f34802b = eVar;
        this.f34803c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public m11 get() {
        return a(this.f34801a, (jt0) this.f34802b.get(), (f11) this.f34803c.get(), (l11) this.d.get(), (aq0) this.e.get());
    }

    public static wu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new wu0(lt0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static m11 a(lt0 lt0Var, jt0 jt0Var, f11 f11Var, l11 l11Var, aq0 aq0Var) {
        m11 m11VarA = lt0Var.a(jt0Var, f11Var, l11Var, aq0Var);
        vc.s.k(m11VarA);
        return m11VarA;
    }
}
