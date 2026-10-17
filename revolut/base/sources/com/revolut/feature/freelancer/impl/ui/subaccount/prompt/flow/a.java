package com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow;

import com.revolut.feature.freelancer.impl.ui.subaccount.prompt.flow.FreelancerCreateSubaccountPromptFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import umd.n;
import v27.b;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final w27.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FreelancerCreateSubaccountPromptFlowContract$InputData f74231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f74232q;

    public a(w27.b freelancerCreateSubaccountPromptFactory, FreelancerCreateSubaccountPromptFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(freelancerCreateSubaccountPromptFactory, "freelancerCreateSubaccountPromptFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = freelancerCreateSubaccountPromptFactory;
        this.f74231p = inputData;
        n nVar = new n(this, 28);
        this.f74232q = d.a(this, FreelancerCreateSubaccountPromptFlowContract$Step.Prompt.f74230a, f0.f322471a, nVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74232q;
    }
}
