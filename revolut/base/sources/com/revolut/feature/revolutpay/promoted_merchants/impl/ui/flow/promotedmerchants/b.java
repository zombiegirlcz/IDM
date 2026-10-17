package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants;

import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants.PromotedMerchantsFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import d8l.d;
import eub.i;
import kotlin.jvm.internal.Intrinsics;
import lcc.c;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements lcc.b {
    public final PromotedMerchantsDestination.InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f84675p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.i f84676q;

    public b(PromotedMerchantsDestination.InputData inputData, i revPointsOptInInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        this.o = inputData;
        this.f84675p = revPointsOptInInteractor;
        this.f84676q = d.a(this, new c(this, 0));
    }

    public final void I2() {
        PromotedMerchantsDestination.InputData inputData = this.o;
        h.t2(this, this.f84676q, (inputData.f84667a && inputData.f84668b) ? PromotedMerchantsFlowContract$Step.PromotedMerchants.f84672a : PromotedMerchantsFlowContract$Step.IntroArticle.f84671a, false, TransitionAnimation.FADE.f98392a, false, 8);
    }

    @Override // yki.j
    public final void M0() {
        PromotedMerchantsDestination.InputData inputData = this.o;
        if (inputData.d) {
            l2(new a(this, null), new yi5.b(26));
        } else {
            h.u2(this, this.f84676q, (inputData.f84667a && inputData.f84668b) ? PromotedMerchantsFlowContract$Step.PromotedMerchants.f84672a : PromotedMerchantsFlowContract$Step.IntroArticle.f84671a, null, 6);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84676q;
    }
}
