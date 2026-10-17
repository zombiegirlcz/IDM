package com.revolut.feature.revolut_shop.ui.flow.order_history;

import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlowContract$InputData;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import s3c.b;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(OrderHistoryFlowContract$InputData inputData) {
        FlowStep orderConfirmation;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        if (inputData.equals(OrderHistoryFlowContract$InputData.OrderHistory.f84219a)) {
            orderConfirmation = OrderHistoryFlowContract$Step.OrderHistory.f84222a;
        } else {
            if (!(inputData instanceof OrderHistoryFlowContract$InputData.OrderConfirmation)) {
                throw new NoWhenBranchMatchedException();
            }
            orderConfirmation = new OrderHistoryFlowContract$Step.OrderConfirmation(((OrderHistoryFlowContract$InputData.OrderConfirmation) inputData).f84218a, false);
        }
        this.o = d.a(this, orderConfirmation, f0.f322471a, new rl8.d(this, 29));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
