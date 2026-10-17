package com.revolut.feature.insurance_car.impl.ui.flow.mta_review;

import com.revolut.feature.insurance_car.impl.data.model.MtaCreateResult;
import com.revolut.feature.insurance_car.impl.ui.flow.mta_review.MtaReviewFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import i69.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements im7.b {
    public final MtaReviewFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f75390p;

    public c(MtaReviewFlowContract$InputData inputData) {
        FlowStep decline;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        MtaCreateResult mtaCreateResult = inputData.f75384c;
        if (mtaCreateResult instanceof MtaCreateResult.Success) {
            MtaCreateResult.Success success = (MtaCreateResult.Success) mtaCreateResult;
            decline = new MtaReviewFlowContract$Step.Review(success.f75248a, success.f75249b);
        } else {
            if (!(mtaCreateResult instanceof MtaCreateResult.Decline)) {
                throw new NoWhenBranchMatchedException();
            }
            decline = new MtaReviewFlowContract$Step.Decline(((MtaCreateResult.Decline) mtaCreateResult).f75247a);
        }
        this.f75390p = d.a(this, decline, f0.f322471a, new p(this, 26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f75390p;
    }
}
