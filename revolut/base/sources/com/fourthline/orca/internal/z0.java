package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class z0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f35472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35474c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private z0(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f35472a = p0Var;
        this.f35473b = eVar;
        this.f35474c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f35472a, (Function0) this.f35473b.get(), (z) this.f35474c.get(), (m0) this.d.get(), (ry) this.e.get(), (lz) this.f.get());
    }

    public static z0 a(p0 p0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new z0(p0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static wd1 a(p0 p0Var, Function0 function0, z zVar, m0 m0Var, ry ryVar, lz lzVar) {
        wd1 wd1VarA = p0Var.a(function0, zVar, m0Var, ryVar, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
