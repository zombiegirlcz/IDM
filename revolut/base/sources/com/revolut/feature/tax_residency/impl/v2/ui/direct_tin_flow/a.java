package com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow;

import com.revolut.feature.tax_residency.impl.v2.ui.direct_tin_flow.DirectTinFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lpe.e;
import oki.h;
import qm2.c;
import qpe.b;
import qpe.g;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final DirectTinFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final qpe.h f90245p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f90246q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f90247r;

    public a(DirectTinFlowContract$InputData inputData, qpe.h localResidencyQuestionScreenProvider, e dialogProvider) {
        FlowStep taxResidencyDeclaration;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(localResidencyQuestionScreenProvider, "localResidencyQuestionScreenProvider");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.o = inputData;
        this.f90245p = localResidencyQuestionScreenProvider;
        this.f90246q = dialogProvider;
        int i = g.f248378a[inputData.f90238b.ordinal()];
        if (i == 1) {
            taxResidencyDeclaration = new DirectTinFlowContract$Step.TaxResidencyDeclaration(inputData.i);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            taxResidencyDeclaration = DirectTinFlowContract$Step.ResidencyQuestion.f90242a;
        }
        this.f90247r = d.a(this, taxResidencyDeclaration, f0.f322471a, new c(this, 5));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f90247r;
    }
}
