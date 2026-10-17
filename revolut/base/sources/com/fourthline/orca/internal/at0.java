package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.WorkerErrorPopupClicksHandler;
import com.fourthline.orca.qes.internal.error.WorkerErrorPopupStateBuilder;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class at0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f26900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f26901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f26902c;
    private final e4m.e d;
    private final e4m.e e;
    private final e4m.e f;

    private at0(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        this.f26900a = ms0Var;
        this.f26901b = eVar;
        this.f26902c = eVar2;
        this.d = eVar3;
        this.e = eVar4;
        this.f = eVar5;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kw get() {
        return a(this.f26900a, (WorkerErrorPopupClicksHandler) this.f26901b.get(), (fq0) this.f26902c.get(), (WorkerErrorPopupStateBuilder) this.d.get(), (uw) this.e.get(), (CoroutineScope) this.f.get());
    }

    public static at0 a(ms0 ms0Var, e4m.e eVar, e4m.e eVar2, e4m.e eVar3, e4m.e eVar4, e4m.e eVar5) {
        return new at0(ms0Var, eVar, eVar2, eVar3, eVar4, eVar5);
    }

    public static kw a(ms0 ms0Var, WorkerErrorPopupClicksHandler workerErrorPopupClicksHandler, fq0 fq0Var, WorkerErrorPopupStateBuilder workerErrorPopupStateBuilder, uw uwVar, CoroutineScope coroutineScope) {
        kw kwVarA = ms0Var.a(workerErrorPopupClicksHandler, fq0Var, workerErrorPopupStateBuilder, uwVar, coroutineScope);
        vc.s.k(kwVarA);
        return kwVarA;
    }
}
