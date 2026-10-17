package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class jp implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hp f29994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29996c;

    private jp(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        this.f29994a = hpVar;
        this.f29995b = eVar;
        this.f29996c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public pd get() {
        return a(this.f29994a, (List) this.f29995b.get(), (p71) this.f29996c.get());
    }

    public static jp a(hp hpVar, e4m.e eVar, e4m.e eVar2) {
        return new jp(hpVar, eVar, eVar2);
    }

    public static pd a(hp hpVar, List list, p71 p71Var) {
        pd pdVarA = hpVar.a(list, p71Var);
        vc.s.k(pdVarA);
        return pdVarA;
    }
}
