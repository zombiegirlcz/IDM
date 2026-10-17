package com.revolut.feature.push_to_card.impl.ui.flow;

import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.push_to_card.impl.ui.amount.PushToCardTransferAmountScreenContract$InputData;
import com.revolut.feature.push_to_card.impl.ui.flow.PushToCardTransferFlowContract$Step;
import com.revolut.feature.push_to_card.impl.ui.review.PushToCardTransferReviewScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import in0.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements msa.b, g {
    public final PushToCardTransferInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f81614p;

    public b(PushToCardTransferInputData inputData) {
        FlowStep review;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        if (inputData instanceof PushToCardTransferInputData.NewTransfer) {
            PushToCardTransferInputData.NewTransfer newTransfer = (PushToCardTransferInputData.NewTransfer) inputData;
            review = new PushToCardTransferFlowContract$Step.Amount(new PushToCardTransferAmountScreenContract$InputData.NewTransfer(newTransfer.f81533a, newTransfer.f81535c, newTransfer.f81534b, newTransfer.f));
        } else {
            if (!(inputData instanceof PushToCardTransferInputData.ReviewOnly)) {
                throw new NoWhenBranchMatchedException();
            }
            PushToCardTransferInputData.ReviewOnly reviewOnly = (PushToCardTransferInputData.ReviewOnly) inputData;
            review = new PushToCardTransferFlowContract$Step.Review(new PushToCardTransferReviewScreenContract$InputData(reviewOnly.f81536a, reviewOnly.f81537b, 4));
        }
        this.f81614p = d.a(this, review, f0.f322471a, new mnl.g(this, 12));
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f81614p;
    }
}
