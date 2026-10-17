package com.revolut.feature.trusted_merchants.impl.ui.kompot;

import com.revolut.feature.trusted_merchants.api.navigation.TrustedMerchantsFlowDestination;
import com.revolut.feature.trusted_merchants.impl.ui.kompot.TrustedMerchantsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import i69.p;
import ijg.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(TrustedMerchantsFlowContract$InputData inputData) {
        FlowStep merchantDetails;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        TrustedMerchantsFlowDestination.StartType startType = inputData.f94420a;
        if (startType instanceof TrustedMerchantsFlowDestination.StartType.MerchantList) {
            merchantDetails = TrustedMerchantsFlowContract$Step.MerchantList.f94422a;
        } else {
            if (!(startType instanceof TrustedMerchantsFlowDestination.StartType.MerchantDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            merchantDetails = new TrustedMerchantsFlowContract$Step.MerchantDetails(((TrustedMerchantsFlowDestination.StartType.MerchantDetails) startType).f94415a);
        }
        this.o = d.a(this, merchantDetails, f0.f322471a, new p(this, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
