package com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow;

import com.revolut.feature.rev_points.impl.ui.post_onboarding_personalisation.flow.RevPointsPostOnboardingPersonalisationFlowContract$Step;
import cp5.d;
import eub.k;
import kotlin.jvm.internal.Intrinsics;
import lzb.c;
import oki.h;
import yzb.b;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final RevPointsPostOnboardingPersonalisationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f83839p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f83840q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f83841r;

    public a(RevPointsPostOnboardingPersonalisationFlowContract$InputData inputData, k personalisationAvailabilityInteractor, c personalisationExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(personalisationAvailabilityInteractor, "personalisationAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(personalisationExtension, "personalisationExtension");
        this.o = inputData;
        this.f83839p = personalisationAvailabilityInteractor;
        this.f83840q = personalisationExtension;
        yz4.b bVar = new yz4.b(this, 2);
        this.f83841r = d.a(this, RevPointsPostOnboardingPersonalisationFlowContract$Step.Categories.f83838a, f0.f322471a, bVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83841r;
    }
}
