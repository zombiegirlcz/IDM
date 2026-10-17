package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;

/* JADX INFO: loaded from: classes23.dex */
public final class gy0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wx0 f29073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29075c;
    private final e4m.e d;

    private gy0(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f29073a = wx0Var;
        this.f29074b = eVar;
        this.f29075c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ex0 get() {
        return a(this.f29073a, (ls0) this.f29074b.get(), (DeviceMetadata) this.f29075c.get(), (ib0) this.d.get());
    }

    public static gy0 a(wx0 wx0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new gy0(wx0Var, eVar, eVar2, eVar3);
    }

    public static ex0 a(wx0 wx0Var, ls0 ls0Var, DeviceMetadata deviceMetadata, ib0 ib0Var) {
        ex0 ex0VarA = wx0Var.a(ls0Var, deviceMetadata, ib0Var);
        vc.s.k(ex0VarA);
        return ex0VarA;
    }
}
