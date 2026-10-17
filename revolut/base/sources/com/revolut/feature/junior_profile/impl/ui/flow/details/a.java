package com.revolut.feature.junior_profile.impl.ui.flow.details;

import com.revolut.feature.junior_profile.impl.ui.flow.details.JuniorProfileDetailsFlowContract$Step;
import kge.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sj8.b;
import sj8.c;
import til.m;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f77138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f77139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f77140r;

    public a(c inputData, m workflowFlowDestinationProvider, d juniorWorkflowBasedProfileInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        Intrinsics.checkNotNullParameter(juniorWorkflowBasedProfileInteractor, "juniorWorkflowBasedProfileInteractor");
        this.o = inputData;
        this.f77138p = workflowFlowDestinationProvider;
        this.f77139q = juniorWorkflowBasedProfileInteractor;
        scl.h hVar = new scl.h(this, 11);
        this.f77140r = cp5.d.a(this, JuniorProfileDetailsFlowContract$Step.Details.f77133a, f0.f322471a, hVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77140r;
    }
}
