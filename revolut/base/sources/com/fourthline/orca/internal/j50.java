package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class j50 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h50 f29802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29804c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private j50(h50 h50Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f29802a = h50Var;
        this.f29803b = eVar;
        this.f29804c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ry get() {
        return a(this.f29802a, (r70) this.f29803b.get(), (ie) this.f29804c.get(), this.d, (w70) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static j50 a(h50 h50Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new j50(h50Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static ry a(h50 h50Var, r70 r70Var, ie ieVar, phm.a aVar, w70 w70Var, CoroutineScope coroutineScope) {
        ry ryVarA = h50Var.a(r70Var, ieVar, aVar, w70Var, coroutineScope);
        vc.s.k(ryVarA);
        return ryVarA;
    }
}
