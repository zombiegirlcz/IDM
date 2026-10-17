package com.fourthline.orca.internal;

import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class jc implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ec f29849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29851c;
    private final e4m.e d;
    private final e4m.e e;

    private jc(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f29849a = ecVar;
        this.f29850b = eVar;
        this.f29851c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public oc get() {
        return a(this.f29849a, (eb) this.f29850b.get(), (gj) this.f29851c.get(), (v9) this.d.get(), (List) this.e.get());
    }

    public static jc a(ec ecVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new jc(ecVar, eVar, eVar2, eVar3, eVar4);
    }

    public static oc a(ec ecVar, eb ebVar, gj gjVar, v9 v9Var, List list) {
        oc ocVarA = ecVar.a(ebVar, gjVar, v9Var, list);
        vc.s.k(ocVarA);
        return ocVarA;
    }
}
