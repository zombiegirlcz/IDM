package com.fourthline.orca.internal;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hs implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ds f29394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f29395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f29396c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private hs(ds dsVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f29394a = dsVar;
        this.f29395b = eVar;
        this.f29396c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public os get() {
        return a(this.f29394a, (ns) this.f29395b.get(), (n9) this.f29396c.get(), (qc0) this.d.get(), (ws) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static hs a(ds dsVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new hs(dsVar, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static os a(ds dsVar, ns nsVar, n9 n9Var, qc0 qc0Var, ws wsVar, CoroutineScope coroutineScope) {
        os osVarA = dsVar.a(nsVar, n9Var, qc0Var, wsVar, coroutineScope);
        vc.s.k(osVarA);
        return osVarA;
    }
}
