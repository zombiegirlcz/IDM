package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class tl implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ol f33795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33797c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f33798g;

    private tl(ol olVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f33795a = olVar;
        this.f33796b = eVar;
        this.f33797c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f33798g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xm get() {
        return a(this.f33795a, (bg) this.f33796b.get(), (ef) this.f33797c.get(), (sg0) this.d.get(), (ml) this.e.get(), (List) this.f.get(), ((Boolean) this.f33798g.get()).booleanValue());
    }

    public static tl a(ol olVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new tl(olVar, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static xm a(ol olVar, bg bgVar, ef efVar, sg0 sg0Var, ml mlVar, List list, boolean z) {
        xm xmVarA = olVar.a(bgVar, efVar, sg0Var, mlVar, list, z);
        vc.s.k(xmVarA);
        return xmVarA;
    }
}
