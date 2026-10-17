package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.flows.refund.EsimRefundFlowContract$EsimSubscriptionsToRefund;
import dfj.s4;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lnj.f;
import lnj.p;
import mra.d;
import oki.h;
import vkm.q;
import wli.x;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends h implements lnj.h {
    public final EsimRefundScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s4 f101456p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p f101457q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f101458r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f101459s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f101460t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public c(n stateMapper, EsimRefundScreenContract$InputData inputData, s4 esimSubscriptionsRefundQuoteInteractor, p esimSubscriptionsRefundStatusDialogFactory, x deeplinkHandler) {
        String str;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimSubscriptionsRefundQuoteInteractor, "esimSubscriptionsRefundQuoteInteractor");
        Intrinsics.checkNotNullParameter(esimSubscriptionsRefundStatusDialogFactory, "esimSubscriptionsRefundStatusDialogFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f101456p = esimSubscriptionsRefundQuoteInteractor;
        this.f101457q = esimSubscriptionsRefundStatusDialogFactory;
        this.f101458r = deeplinkHandler;
        this.f101459s = new vii.b();
        EsimRefundFlowContract$EsimSubscriptionsToRefund esimRefundFlowContract$EsimSubscriptionsToRefund = inputData.f101443a;
        if (Intrinsics.f(esimRefundFlowContract$EsimSubscriptionsToRefund, EsimRefundFlowContract$EsimSubscriptionsToRefund.AllAvailable.f100866a)) {
            str = null;
        } else {
            if (!(esimRefundFlowContract$EsimSubscriptionsToRefund instanceof EsimRefundFlowContract$EsimSubscriptionsToRefund.Subscription)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((EsimRefundFlowContract$EsimSubscriptionsToRefund.Subscription) inputData.f101443a).f100867a;
        }
        this.f101460t = str;
        this.u = d.b(this, new f(new Data(null, null, true, 3, null), str, false), stateMapper, null, false, 12);
        this.v = e.a(this, new lcc.c(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f101459s, new li2.f(continuation, this, 5)), null, null, new lnj.l(this, continuation, 0), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
