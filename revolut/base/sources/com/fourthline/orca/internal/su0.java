package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public final class su0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f33142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33144c;

    private su0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f33142a = lt0Var;
        this.f33143b = eVar;
        this.f33144c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cx0 get() {
        return a(this.f33142a, (kt0) this.f33143b.get(), (r70) this.f33144c.get());
    }

    public static su0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new su0(lt0Var, eVar, eVar2);
    }

    public static cx0 a(lt0 lt0Var, kt0 kt0Var, r70 r70Var) {
        cx0 cx0VarA = lt0Var.a(kt0Var, r70Var);
        vc.s.k(cx0VarA);
        return cx0VarA;
    }
}
