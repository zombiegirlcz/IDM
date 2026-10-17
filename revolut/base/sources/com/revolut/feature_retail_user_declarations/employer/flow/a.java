package com.revolut.feature_retail_user_declarations.employer.flow;

import com.revolut.feature_retail_user_declarations.employer.EmployerInputData;
import com.revolut.feature_retail_user_declarations.employer.flow.EmployerFlowContract$Step;
import cp5.d;
import i69.p;
import ibi.c;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements c {
    public final EmployerInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f97639q;

    public a(EmployerInputData inputData, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = inputData;
        this.f97638p = workflowInteractor;
        p pVar = new p(this, 9);
        this.f97639q = d.a(this, EmployerFlowContract$Step.Employer.f97637a, f0.f322471a, pVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f97639q;
    }
}
