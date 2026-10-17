package com.revolut.feature.crypto.onboarding.impl.ui.eligibility;

import com.revolut.feature.crypto.onboarding.impl.ui.eligibility.CryptoOnboardingWorkflowFlowContract$Step;
import cp5.d;
import ji5.i;
import kotlin.jvm.internal.Intrinsics;
import oi5.b;
import oi5.c;
import oki.h;
import til.m;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f70891p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f70892q;

    public a(c inputData, m workflowFlowDestinationProvider, i cryptoOnboardingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowFlowDestinationProvider, "workflowFlowDestinationProvider");
        Intrinsics.checkNotNullParameter(cryptoOnboardingInteractor, "cryptoOnboardingInteractor");
        this.o = workflowFlowDestinationProvider;
        this.f70891p = cryptoOnboardingInteractor;
        kp0.m mVar = new kp0.m(this, inputData, 20);
        this.f70892q = d.a(this, CryptoOnboardingWorkflowFlowContract$Step.Initial.f70890a, f0.f322471a, mVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f70892q;
    }
}
