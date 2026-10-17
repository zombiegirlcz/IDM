package com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking;

import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlowContract$InputData;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import i83.m;
import ibc.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(TrackingFlowContract$InputData inputData) {
        FlowStep orderDetails;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData instanceof TrackingFlowContract$InputData.TrackingDetails) {
            TrackingFlowContract$InputData.TrackingDetails trackingDetails = (TrackingFlowContract$InputData.TrackingDetails) inputData;
            orderDetails = new TrackingFlowContract$Step.TrackingDetails(trackingDetails.f84614a, trackingDetails.f84615b);
        } else {
            if (!(inputData instanceof TrackingFlowContract$InputData.OrderDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            orderDetails = new TrackingFlowContract$Step.OrderDetails(((TrackingFlowContract$InputData.OrderDetails) inputData).f84613a);
        }
        this.o = d.a(this, orderDetails, f0.f322471a, new m(9));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
