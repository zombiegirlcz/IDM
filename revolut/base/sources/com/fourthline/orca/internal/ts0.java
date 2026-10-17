package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.QesErrorPopupStateBuilder;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ts0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f33860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f33861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f33862c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private ts0(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f33860a = ms0Var;
        this.f33861b = eVar;
        this.f33862c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw get() {
        return a(this.f33860a, (QesErrorPopupClicksHandler) this.f33861b.get(), (fq0) this.f33862c.get(), (QesErrorPopupStateBuilder) this.d.get(), (uw) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static ts0 a(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new ts0(ms0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static kw a(ms0 ms0Var, QesErrorPopupClicksHandler qesErrorPopupClicksHandler, fq0 fq0Var, QesErrorPopupStateBuilder qesErrorPopupStateBuilder, uw uwVar, CoroutineScope coroutineScope) {
        kw kwVarA = ms0Var.a(qesErrorPopupClicksHandler, fq0Var, qesErrorPopupStateBuilder, uwVar, coroutineScope);
        vc.s.k(kwVarA);
        return kwVarA;
    }
}
