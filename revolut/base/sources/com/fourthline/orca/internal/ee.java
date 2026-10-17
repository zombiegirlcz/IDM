package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class ee implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f28111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28113c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f28114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e4m.e f28115h;

    private ee(xd xdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        this.f28111a = xdVar;
        this.f28112b = eVar;
        this.f28113c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f28114g = eVar6;
        this.f28115h = eVar7;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public sb1 get() {
        return a(this.f28111a, (je) this.f28112b.get(), (mc1) this.f28113c.get(), (jf) this.d.get(), (r70) this.e.get(), (sg0) this.f.get(), (Function0) this.f28114g.get(), (ef) this.f28115h.get());
    }

    public static ee a(xd xdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6, e4m.e eVar7) {
        return new ee(xdVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static sb1 a(xd xdVar, je jeVar, mc1 mc1Var, jf jfVar, r70 r70Var, sg0 sg0Var, Function0 function0, ef efVar) {
        sb1 sb1VarA = xdVar.a(jeVar, mc1Var, jfVar, r70Var, sg0Var, function0, efVar);
        vc.s.k(sb1VarA);
        return sb1VarA;
    }
}
