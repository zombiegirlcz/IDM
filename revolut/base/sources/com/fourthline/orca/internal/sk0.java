package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class sk0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fk0 f33040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33042c;
    private final e4m.e d;
    private final e4m.e e;

    private sk0(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f33040a = fk0Var;
        this.f33041b = eVar;
        this.f33042c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public cl0 get() {
        return a(this.f33040a, (Function0) this.f33041b.get(), (yj0) this.f33042c.get(), (m81) this.d.get(), (vc1) this.e.get());
    }

    public static sk0 a(fk0 fk0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new sk0(fk0Var, eVar, eVar2, eVar3, eVar4);
    }

    public static cl0 a(fk0 fk0Var, Function0 function0, yj0 yj0Var, m81 m81Var, vc1 vc1Var) {
        cl0 cl0VarA = fk0Var.a(function0, yj0Var, m81Var, vc1Var);
        vc.s.k(cl0VarA);
        return cl0VarA;
    }
}
