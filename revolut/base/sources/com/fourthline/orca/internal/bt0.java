package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.WorkerErrorPopupClicksHandler;

/* JADX INFO: loaded from: classes23.dex */
public final class bt0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f27221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f27222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e4m.e f27223c;

    private bt0(ms0 ms0Var, e4m.e eVar, e4m.e eVar2) {
        this.f27221a = ms0Var;
        this.f27222b = eVar;
        this.f27223c = eVar2;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public WorkerErrorPopupClicksHandler get() {
        return a(this.f27221a, (fh0) this.f27222b.get(), (kt0) this.f27223c.get());
    }

    public static bt0 a(ms0 ms0Var, e4m.e eVar, e4m.e eVar2) {
        return new bt0(ms0Var, eVar, eVar2);
    }

    public static WorkerErrorPopupClicksHandler a(ms0 ms0Var, fh0 fh0Var, kt0 kt0Var) {
        WorkerErrorPopupClicksHandler workerErrorPopupClicksHandlerA = ms0Var.a(fh0Var, kt0Var);
        vc.s.k(workerErrorPopupClicksHandlerA);
        return workerErrorPopupClicksHandlerA;
    }
}
