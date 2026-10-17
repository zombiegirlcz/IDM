package com.revolut.feature.freelancer.impl.ui.profile.website.flow;

import et6.h1;
import eul.f;
import jr6.r;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements f17.b {

    @NotNull
    public static final f17.d Companion = new f17.d();
    public final h1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r f74084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jvh.a f74085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gte.a f74086r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FreelancerWebsiteFlowContract$InputData f74087s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f74088t;

    public d(h1 freelancerInteractor, r freelancerPendingPromptFactory, jvh.a workflowInteractor, gte.a featureToggleInteractor, FreelancerWebsiteFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerPendingPromptFactory, "freelancerPendingPromptFactory");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = freelancerInteractor;
        this.f74084p = freelancerPendingPromptFactory;
        this.f74085q = workflowInteractor;
        this.f74086r = featureToggleInteractor;
        this.f74087s = inputData;
        this.f74088t = d8l.d.a(this, new f(this, 12));
    }

    @Override // yki.j
    public final void M0() {
        l2(new ewa.d(this, null, 5), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74088t;
    }
}
