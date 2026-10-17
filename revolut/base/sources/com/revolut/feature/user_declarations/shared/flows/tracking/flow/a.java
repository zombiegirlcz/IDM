package com.revolut.feature.user_declarations.shared.flows.tracking.flow;

import com.revolut.feature.user_declarations.shared.flows.tracking.AnalyticsEventTrackingConsentControllerProvider;
import com.revolut.feature.user_declarations.shared.flows.tracking.flow.TrackingConsentFlowContract$Step;
import com.revolut.shared.feature.user_declarations.api.flows.tracking.TrackingConsentInputData;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rog.b;
import yki.i;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements b {
    public final TrackingConsentInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f94685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AnalyticsEventTrackingConsentControllerProvider f94686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f94687r;

    public a(TrackingConsentInputData inputData, jvh.a workflowInteractor, AnalyticsEventTrackingConsentControllerProvider analyticsEventTrackingConsentControllerProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(analyticsEventTrackingConsentControllerProvider, "analyticsEventTrackingConsentControllerProvider");
        this.o = inputData;
        this.f94685p = workflowInteractor;
        this.f94686q = analyticsEventTrackingConsentControllerProvider;
        this.f94687r = d.a(this, new rl8.d(this, 5));
    }

    @Override // yki.j
    public final void M0() {
        h.u2(this, this.f94687r, TrackingConsentFlowContract$Step.Consent.f94683a, null, 6);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f94687r;
    }
}
