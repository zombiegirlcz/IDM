package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class kk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f30296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30298c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private kk(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f30296a = rjVar;
        this.f30297b = eVar;
        this.f30298c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cj get() {
        return a(this.f30296a, (r70) this.f30297b.get(), (gj) this.f30298c.get(), (Function0) this.d.get(), (Function0) this.e.get(), (uk) this.f.get());
    }

    public static kk a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new kk(rjVar, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static cj a(rj rjVar, r70 r70Var, gj gjVar, Function0 function0, Function0 function02, uk ukVar) {
        cj cjVarA = rjVar.a(r70Var, gjVar, function0, function02, ukVar);
        vc.s.k(cjVarA);
        return cjVarA;
    }
}
