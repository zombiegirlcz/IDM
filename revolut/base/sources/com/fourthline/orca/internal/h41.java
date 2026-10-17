package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DeviceMetadata;

/* JADX INFO: loaded from: classes23.dex */
public final class h41 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a41 f29138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29140c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e4m.e f29141g;

    private h41(a41 a41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        this.f29138a = a41Var;
        this.f29139b = eVar;
        this.f29140c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
        this.f29141g = eVar6;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gh1 get() {
        return a(this.f29138a, (Context) this.f29139b.get(), (mb.d) this.f29140c.get(), (ib0) this.d.get(), (DeviceMetadata) this.e.get(), (sg0) this.f.get(), this.f29141g);
    }

    public static h41 a(a41 a41Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5, e4m.e eVar6) {
        return new h41(a41Var, eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static gh1 a(a41 a41Var, Context context, mb.d dVar, ib0 ib0Var, DeviceMetadata deviceMetadata, sg0 sg0Var, phm.a aVar) {
        gh1 gh1VarA = a41Var.a(context, dVar, ib0Var, deviceMetadata, sg0Var, aVar);
        vc.s.k(gh1VarA);
        return gh1VarA;
    }
}
