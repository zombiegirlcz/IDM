package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class tk implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f33787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33789c;
    private final e4m.e d;

    private tk(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f33787a = rjVar;
        this.f33788b = eVar;
        this.f33789c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public qd1 get() {
        return a(this.f33787a, (Function0) this.f33788b.get(), (gj) this.f33789c.get(), (ry) this.d.get());
    }

    public static tk a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new tk(rjVar, eVar, eVar2, eVar3);
    }

    public static qd1 a(rj rjVar, Function0 function0, gj gjVar, ry ryVar) {
        qd1 qd1VarA = rjVar.a(function0, gjVar, ryVar);
        vc.s.k(qd1VarA);
        return qd1VarA;
    }
}
