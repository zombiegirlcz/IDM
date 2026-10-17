package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import kotlin.jvm.internal.Intrinsics;
import njf.d;
import njj.b0;
import njj.d1;
import njj.k0;
import org.jetbrains.annotations.NotNull;
import qjj.c;
import qjj.f;
import qjj.i;
import qjj.k;
import qjj.l;
import qjj.m;
import unj.e;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements n {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanCheckoutScreenContract$InputData f101179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f101180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f101181c;
    public final e d;
    public final com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a e;
    public final qjj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f101182g;

    public b(EsimMobilePlanCheckoutScreenContract$InputData inputData, f payWithItemMapper, i paymentSummaryMapper, e coverageItemMapper, qjj.b actionButtonClauseMapper, com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a esimDynamicTermsMapper, qjj.a allowanceMapper, k phoneNumbersMapper, qjj.e mobilePlanCheckoutNavBarMapper, m planStartDateItemMapper, l planPriceItemMapper, c additionalInformationMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(payWithItemMapper, "payWithItemMapper");
        Intrinsics.checkNotNullParameter(paymentSummaryMapper, "paymentSummaryMapper");
        Intrinsics.checkNotNullParameter(coverageItemMapper, "coverageItemMapper");
        Intrinsics.checkNotNullParameter(actionButtonClauseMapper, "actionButtonClauseMapper");
        Intrinsics.checkNotNullParameter(esimDynamicTermsMapper, "esimDynamicTermsMapper");
        Intrinsics.checkNotNullParameter(allowanceMapper, "allowanceMapper");
        Intrinsics.checkNotNullParameter(phoneNumbersMapper, "phoneNumbersMapper");
        Intrinsics.checkNotNullParameter(mobilePlanCheckoutNavBarMapper, "mobilePlanCheckoutNavBarMapper");
        Intrinsics.checkNotNullParameter(planStartDateItemMapper, "planStartDateItemMapper");
        Intrinsics.checkNotNullParameter(planPriceItemMapper, "planPriceItemMapper");
        Intrinsics.checkNotNullParameter(additionalInformationMapper, "additionalInformationMapper");
        this.f101179a = inputData;
        this.f101180b = payWithItemMapper;
        this.f101181c = paymentSummaryMapper;
        this.d = coverageItemMapper;
        this.e = esimDynamicTermsMapper;
        this.f = allowanceMapper;
        this.f101182g = phoneNumbersMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        b0 domainState = (b0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k0) iii.c.f(t1.u(domainState.d, domainState.f216544b, domainState.e), new d(this, 8), new nij.d(this), new m88.c(this, domainState, 29));
    }
}
