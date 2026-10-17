package com.revolut.feature.kyc.impl.external.web.flow;

import com.revolut.feature.kyc.impl.external.web.flow.ExternalWebKycProviderFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import cp5.d;
import iv8.c;
import kotlin.jvm.internal.Intrinsics;
import mnl.g;
import mv8.b;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements b {
    public final ExternalWebKycProviderFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final iv8.a f77664p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f77665q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f77666r;

    public a(ExternalWebKycProviderFlowContract$InputData inputData, iv8.a uiConfigurationProvider, c uiProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(uiConfigurationProvider, "uiConfigurationProvider");
        Intrinsics.checkNotNullParameter(uiProvider, "uiProvider");
        this.o = inputData;
        this.f77664p = uiConfigurationProvider;
        this.f77665q = uiProvider;
        g gVar = new g(this, 21);
        this.f77666r = d.a(this, ExternalWebKycProviderFlowContract$Step.Portal.f77662a, f0.f322471a, gVar);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (j2 > 0) {
            h.t2(this, this.f77666r, ExternalWebKycProviderFlowContract$Step.Prompt.f77663a, false, TransitionAnimation.REPLACE.f98394a, false, 8);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f77666r;
    }
}
