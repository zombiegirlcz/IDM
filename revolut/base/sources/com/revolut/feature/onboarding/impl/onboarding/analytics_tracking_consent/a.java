package com.revolut.feature.onboarding.impl.onboarding.analytics_tracking_consent;

import com.revolut.feature.onboarding.impl.onboarding.analytics_tracking_consent.AnalyticsTrackingConsentFlowContract$Step;
import com.revolut.feature.user_declarations.shared.flows.tracking.AnalyticsEventTrackingConsentControllerProvider;
import d8l.d;
import h1c.c;
import ha9.b;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final AnalyticsTrackingConsentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AnalyticsEventTrackingConsentControllerProvider f78384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f78385q;

    public a(AnalyticsTrackingConsentFlowContract$InputData inputData, AnalyticsEventTrackingConsentControllerProvider analyticsEventTrackingConsentControllerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(analyticsEventTrackingConsentControllerProvider, "analyticsEventTrackingConsentControllerProvider");
        this.o = inputData;
        this.f78384p = analyticsEventTrackingConsentControllerProvider;
        this.f78385q = d.a(this, new c(this, 20));
    }

    @Override // yki.j
    public final void M0() {
        if (this.o.f78380a) {
            h.u2(this, this.f78385q, AnalyticsTrackingConsentFlowContract$Step.Consent.f78382a, null, 6);
        } else {
            C2(new ha9.d(true));
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f78385q;
    }
}
