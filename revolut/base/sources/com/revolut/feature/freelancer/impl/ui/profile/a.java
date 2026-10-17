package com.revolut.feature.freelancer.impl.ui.profile;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.profile.FreelancerProfileFlowContract$Step;
import et6.h1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zz6.b;
import zz6.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final FreelancerProfileFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1 f74033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f74034q;

    public a(FreelancerProfileFlowContract$InputData inputData, h1 freelancerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        this.o = inputData;
        this.f74033p = freelancerInteractor;
        this.f74034q = cp5.d.a(this, I2(), f0.f322471a, new zo2.h(this, 22));
    }

    public final FreelancerProfileFlowContract$Step I2() {
        FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode launchMode = this.o.f74015a;
        if (launchMode instanceof FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.Default) {
            return FreelancerProfileFlowContract$Step.Profile.f74022a;
        }
        if (launchMode instanceof FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.Vat) {
            return ((FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.Vat) launchMode).f73205a ? FreelancerProfileFlowContract$Step.VatPrompt.f74029a : FreelancerProfileFlowContract$Step.Vat.f74028a;
        }
        if (launchMode instanceof FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.ProcessingFees) {
            return new FreelancerProfileFlowContract$Step.PaymentProcessingFees(((FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.ProcessingFees) launchMode).f73204a);
        }
        if (launchMode instanceof FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.WebsiteUrl) {
            return new FreelancerProfileFlowContract$Step.Website(null, ((FreelancerBizFeatureConfig.FreelancerProfileDestination.LaunchMode.WebsiteUrl) launchMode).f73206a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f74034q;
    }
}
