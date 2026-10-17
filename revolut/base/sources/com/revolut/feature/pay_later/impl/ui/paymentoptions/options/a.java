package com.revolut.feature.pay_later.impl.ui.paymentoptions.options;

import cli.y;
import ej9.e0;
import hx7.e;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import yji.l;
import zfd.s;
import zhm.h0;
import zj9.f;
import zj9.g;
import zj9.j;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements g {
    public final PaymentOptionsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f78888p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f78889q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f78890r;

    public a(PaymentOptionsControllerContract$InputData inputData, j stateMapper, xh9.a payLaterInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        this.o = inputData;
        this.f78888p = payLaterInteractor;
        this.f78889q = e.a(this, new zba.a(this, 21));
        this.f78890r = d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        ti9.g gVar = (ti9.g) this.f78888p;
        gVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        e0 e0Var = (e0) gVar.f271456a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, rd0.e.n(e0Var.o.a(Unit.f186387a, loadingStrategy), h0.f322473a), null, null, new s(this, (Continuation) null, 9), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f78889q;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f78890r;
    }
}
