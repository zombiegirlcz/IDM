package com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review;

import com.revolut.feature.insurance_embedded.impl.ui.flow.documents_review.InsuranceDocumentsReviewFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import uu7.b;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(InsuranceDocumentsReviewFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new InsuranceDocumentsReviewFlowContract$Step.DocumentsReview(inputData.f76066a), f0.f322471a, new utk.b(3));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
