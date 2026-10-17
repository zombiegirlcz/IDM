package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class q60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f32206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f32208c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private q60(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f32206a = g60Var;
        this.f32207b = eVar;
        this.f32208c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public wd1 get() {
        return a(this.f32206a, (Function0) this.f32207b.get(), (DeviceMetadata) this.f32208c.get(), (d60) this.d.get(), (ry) this.e.get(), (lz) this.f.get());
    }

    public static q60 a(g60 g60Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new q60(g60Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static wd1 a(g60 g60Var, Function0 function0, DeviceMetadata deviceMetadata, d60 d60Var, ry ryVar, lz lzVar) {
        wd1 wd1VarA = g60Var.a(function0, deviceMetadata, d60Var, ryVar, lzVar);
        vc.s.k(wd1VarA);
        return wd1VarA;
    }
}
