package com.revolut.feature.tax_residency.impl.v2.ui.crs_flow;

import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import lpe.e;
import oki.h;
import ope.b;
import ope.j;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final CrsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j f90213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f90214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f90215r;

    public a(CrsFlowContract$InputData inputData, j soleResidencyQuestionScreenProvider, e dialogProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(soleResidencyQuestionScreenProvider, "soleResidencyQuestionScreenProvider");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f90213p = soleResidencyQuestionScreenProvider;
        this.f90214q = dialogProvider;
        this.f90215r = d.a(this, inputData.f90204b ? CrsFlowContract$Step.SoleResidencyQuestion.f90211a : new CrsFlowContract$Step.MultiResidencyDeclaration(inputData.f90208j), f0.f322471a, new ope.h(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90215r;
    }
}
