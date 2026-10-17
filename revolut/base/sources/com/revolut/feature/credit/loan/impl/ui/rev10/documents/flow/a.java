package com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow;

import com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.LoanDocumentsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qce.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements t65.a {
    public final yki.a o;

    public a(LoanDocumentsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new LoanDocumentsFlowContract$Step.SectionsList(inputData.f70416a), f0.f322471a, new b(inputData, this, 23));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
