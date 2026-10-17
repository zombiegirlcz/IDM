package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class eu0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lt0 f28269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28271c;

    private eu0(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        this.f28269a = lt0Var;
        this.f28270b = eVar;
        this.f28271c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kt0 get() {
        return a(this.f28269a, (Function0) this.f28270b.get(), (xg1) this.f28271c.get());
    }

    public static eu0 a(lt0 lt0Var, e4m.e eVar, e4m.e eVar2) {
        return new eu0(lt0Var, eVar, eVar2);
    }

    public static kt0 a(lt0 lt0Var, Function0 function0, xg1 xg1Var) {
        kt0 kt0VarA = lt0Var.a(function0, xg1Var);
        vc.s.k(kt0VarA);
        return kt0VarA;
    }
}
