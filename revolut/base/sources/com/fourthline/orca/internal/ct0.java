package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.WorkerErrorPopupStateBuilder;

/* JADX INFO: loaded from: classes23.dex */
public final class ct0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f27545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27546b;

    private ct0(ms0 ms0Var, e4m.e eVar) {
        this.f27545a = ms0Var;
        this.f27546b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WorkerErrorPopupStateBuilder get() {
        return a(this.f27545a, (v10) this.f27546b.get());
    }

    public static ct0 a(ms0 ms0Var, e4m.e eVar) {
        return new ct0(ms0Var, eVar);
    }

    public static WorkerErrorPopupStateBuilder a(ms0 ms0Var, v10 v10Var) {
        WorkerErrorPopupStateBuilder workerErrorPopupStateBuilderE = ms0Var.e(v10Var);
        vc.s.k(workerErrorPopupStateBuilderE);
        return workerErrorPopupStateBuilderE;
    }
}
