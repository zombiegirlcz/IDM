package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class mc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f31156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f31157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f31158c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private mc(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f31156a = ecVar;
        this.f31157b = eVar;
        this.f31158c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f31156a, (Function0) this.f31157b.get(), (eb) this.f31158c.get(), (bc) this.d.get(), (ry) this.e.get(), (lz) this.f.get());
    }

    public static mc a(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new mc(ecVar, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static wd1 a(ec ecVar, Function0 function0, eb ebVar, bc bcVar, ry ryVar, lz lzVar) {
        wd1 wd1VarA = ecVar.a(function0, ebVar, bcVar, ryVar, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
