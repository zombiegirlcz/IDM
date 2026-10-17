package com.fourthline.orca.internal;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public final class ek implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rj f28163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f28164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f28165c;
    private final e4m.e d;

    private ek(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        this.f28163a = rjVar;
        this.f28164b = eVar;
        this.f28165c = eVar2;
        this.d = eVar3;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public el get() {
        return a(this.f28163a, (pf0) this.f28164b.get(), (lz) this.f28165c.get(), (Function0) this.d.get());
    }

    public static ek a(rj rjVar, e4m.e eVar, e4m.e eVar2, e4m.e eVar3) {
        return new ek(rjVar, eVar, eVar2, eVar3);
    }

    public static el a(rj rjVar, pf0 pf0Var, lz lzVar, Function0 function0) {
        el elVarA = rjVar.a(pf0Var, lzVar, function0);
        vc.s.k(elVarA);
        return elVarA;
    }
}
