package com.revolut.feature_retail_user_declarations.risk_assessment.flow;

import com.revolut.feature_retail_user_declarations.risk_assessment.flow.RiskAssessmentFlowContract$Step;
import cp5.d;
import i69.p;
import ici.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements c {
    public final RiskAssessmentFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f97730q;

    public a(RiskAssessmentFlowInputData inputData, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = inputData;
        this.f97729p = workflowInteractor;
        p pVar = new p(this, 13);
        this.f97730q = d.a(this, RiskAssessmentFlowContract$Step.RiskAssessment.f97726a, f0.f322471a, pVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f97730q;
    }
}
