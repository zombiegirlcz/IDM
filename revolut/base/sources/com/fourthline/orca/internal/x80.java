package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class x80 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t80 f34919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f34921c;

    private x80(t80 t80Var, e4m.e eVar, e4m.e eVar2) {
        this.f34919a = t80Var;
        this.f34920b = eVar;
        this.f34921c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public o80 get() {
        return a(this.f34919a, (q70) this.f34920b.get(), (CoroutineScope) this.f34921c.get());
    }

    public static x80 a(t80 t80Var, e4m.e eVar, e4m.e eVar2) {
        return new x80(t80Var, eVar, eVar2);
    }

    public static o80 a(t80 t80Var, q70 q70Var, CoroutineScope coroutineScope) {
        o80 o80VarA = t80Var.a(q70Var, coroutineScope);
        vc.s.k(o80VarA);
        return o80VarA;
    }
}
