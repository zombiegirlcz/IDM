package com.fourthline.orca.internal;

import com.fourthline.orca.internal.e40;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class l4 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4 f30515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f30516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f30517c;
    private final e4m.e d;

    private l4(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f30515a = e4Var;
        this.f30516b = eVar;
        this.f30517c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e40.e get() {
        return a(this.f30515a, (d3) this.f30516b.get(), (aq0) this.f30517c.get(), (CoroutineScope) this.d.get());
    }

    public static l4 a(e4 e4Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new l4(e4Var, eVar, eVar2, eVar3);
    }

    public static e40.e a(e4 e4Var, d3 d3Var, aq0 aq0Var, CoroutineScope coroutineScope) {
        e40.e eVarA = e4Var.a(d3Var, aq0Var, coroutineScope);
        vc.s.k(eVarA);
        return eVarA;
    }
}
