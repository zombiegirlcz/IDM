package com.revolut.feature.apm.bills.bpay.impl.flow;

import bhi.c;
import bo1.b;
import com.revolut.feature.apm.bills.bpay.impl.flow.BPayFlowContract$Step;
import com.revolut.feature.apm.bills.bpay.impl.flow.configuration.ScreenConfiguration;
import com.revolut.feature.apm.bills.bpay.impl.model.BPayBillerData;
import com.revolut.feature.apm.bills.bpay.impl.screen.amount.AmountScreenContract$InputData;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import te0.w;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {
    public final BPayFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b3a.a f61200p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final co1.b f61201q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final co9.b f61202r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qpk.b f61203s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f61204t;
    public final yki.a u;

    public a(BPayFlowContract$InputData inputData, b3a.a chatTransferNavigationProvider, co1.b screenConfigurationProvider, co9.b paymentCounterpartyInteractor, qpk.b rateDetailsFeatureConfigProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatTransferNavigationProvider, "chatTransferNavigationProvider");
        Intrinsics.checkNotNullParameter(screenConfigurationProvider, "screenConfigurationProvider");
        Intrinsics.checkNotNullParameter(paymentCounterpartyInteractor, "paymentCounterpartyInteractor");
        Intrinsics.checkNotNullParameter(rateDetailsFeatureConfigProvider, "rateDetailsFeatureConfigProvider");
        this.o = inputData;
        this.f61200p = chatTransferNavigationProvider;
        this.f61201q = screenConfigurationProvider;
        this.f61202r = paymentCounterpartyInteractor;
        this.f61203s = rateDetailsFeatureConfigProvider;
        Lazy lazyY0 = w.y0(new bc1.b(this, 17));
        this.f61204t = lazyY0;
        PaymentCounterpartyInfo paymentCounterpartyInfo = inputData.f61193b;
        FlowStep amount = BPayFlowContract$Step.Input.f61196a;
        if (paymentCounterpartyInfo != null) {
            String strA = paymentCounterpartyInfo.a("BILLER_CODE");
            String strA2 = paymentCounterpartyInfo.a("REFERENCE_NUMBER");
            if (strA != null) {
                amount = new BPayFlowContract$Step.Amount(new AmountScreenContract$InputData(new BPayBillerData(paymentCounterpartyInfo.getDisplayName(), strA, paymentCounterpartyInfo.f, strA2, paymentCounterpartyInfo.d, strA2 == null), true, inputData.f61194c, (ScreenConfiguration) lazyY0.getValue()));
            }
        }
        this.u = d.a(this, amount, f0.f322471a, new c(this, 10));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
