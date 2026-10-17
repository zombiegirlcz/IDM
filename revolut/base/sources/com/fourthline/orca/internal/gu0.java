package com.fourthline.orca.internal;

import com.fourthline.orca.internal.e40;

/* JADX INFO: loaded from: classes23.dex */
public final class gu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f29005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29007c;
    private final e4m.e d;
    private final e4m.e e;

    private gu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f29005a = lt0Var;
        this.f29006b = eVar;
        this.f29007c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e40 get() {
        return a(this.f29005a, (j30) this.f29006b.get(), (jt0) this.f29007c.get(), (iv0) this.d.get(), (e40.c) this.e.get());
    }

    public static gu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new gu0(lt0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static e40 a(lt0 lt0Var, j30 j30Var, jt0 jt0Var, iv0 iv0Var, e40.c cVar) {
        e40 e40VarA = lt0Var.a(j30Var, jt0Var, iv0Var, cVar);
        vc.s.k(e40VarA);
        return e40VarA;
    }
}
