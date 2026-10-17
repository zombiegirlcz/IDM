package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import dfj.s4;
import dfj.w;
import hcj.o;
import hx7.e;
import i69.p;
import ijj.g;
import ijj.m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mjj.f;
import mra.d;
import oki.h;
import vkm.q;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements g {
    public final EsimMobilePlanCancellationScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s4 f101121p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f101122q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w f101123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f101124s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f101125t;
    public final vii.b u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(EsimMobilePlanCancellationScreenContract$InputData inputData, n stateMapper, s4 refundQuoteInteractor, f cancellationStatusDialogMapper, w esimMobilePlansInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(refundQuoteInteractor, "refundQuoteInteractor");
        Intrinsics.checkNotNullParameter(cancellationStatusDialogMapper, "cancellationStatusDialogMapper");
        Intrinsics.checkNotNullParameter(esimMobilePlansInteractor, "esimMobilePlansInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f101121p = refundQuoteInteractor;
        this.f101122q = cancellationStatusDialogMapper;
        this.f101123r = esimMobilePlansInteractor;
        this.f101124s = deeplinkHandler;
        this.f101125t = d.b(this, new ijj.f(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = new vii.b();
        this.v = e.a(this, new p(this, 24));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, com.revolut.data.database.models.openbanking.d.x("EsimMobilePlanCancellationScreenModel", "loadRefundQuoteTillFinish", nim.a.v(q.Q(this.u, new o(continuation, this, 26)), new m(this, 0))), null, null, new ijj.n(this, continuation, 0), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b.I2():void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f101125t;
    }
}
