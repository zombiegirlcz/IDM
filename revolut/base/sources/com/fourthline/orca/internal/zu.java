package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class zu implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xu f35719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f35720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f35721c;

    private zu(xu xuVar, e4m.e eVar, e4m.e eVar2) {
        this.f35719a = xuVar;
        this.f35720b = eVar;
        this.f35721c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ev get() {
        return a(this.f35719a, (bs) this.f35720b.get(), (Context) this.f35721c.get());
    }

    public static zu a(xu xuVar, e4m.e eVar, e4m.e eVar2) {
        return new zu(xuVar, eVar, eVar2);
    }

    public static ev a(xu xuVar, bs bsVar, Context context) {
        ev evVarA = xuVar.a(bsVar, context);
        vc.s.k(evVarA);
        return evVarA;
    }
}
