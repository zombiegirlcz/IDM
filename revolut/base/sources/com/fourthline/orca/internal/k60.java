package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadata;

/* JADX INFO: loaded from: classes23.dex */
public final class k60 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g60 f30135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30136b;

    private k60(g60 g60Var, e4m.e eVar) {
        this.f30135a = g60Var;
        this.f30136b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public r60 get() {
        return a(this.f30135a, (DeviceMetadata) this.f30136b.get());
    }

    public static k60 a(g60 g60Var, e4m.e eVar) {
        return new k60(g60Var, eVar);
    }

    public static r60 a(g60 g60Var, DeviceMetadata deviceMetadata) {
        r60 r60VarA = g60Var.a(deviceMetadata);
        vc.s.k(r60VarA);
        return r60VarA;
    }
}
