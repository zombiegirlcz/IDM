package com.fourthline.orca.internal;

import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class he implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xd f29233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29235c;
    private final e4m.e d;
    private final e4m.e e;

    private he(xd xdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        this.f29233a = xdVar;
        this.f29234b = eVar;
        this.f29235c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ry0 get() {
        return a(this.f29233a, (AndroidDataCollectorHelper) this.f29234b.get(), (ef) this.f29235c.get(), (r70) this.d.get(), (CoroutineScope) this.e.get());
    }

    public static he a(xd xdVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4) {
        return new he(xdVar, eVar, eVar2, eVar3, eVar4);
    }

    public static ry0 a(xd xdVar, AndroidDataCollectorHelper androidDataCollectorHelper, ef efVar, r70 r70Var, CoroutineScope coroutineScope) {
        ry0 ry0VarA = xdVar.a(androidDataCollectorHelper, efVar, r70Var, coroutineScope);
        vc.s.k(ry0VarA);
        return ry0VarA;
    }
}
