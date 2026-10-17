package com.revolut.feature.staking.impl.flow.stake.v2;

import com.revolut.feature.staking.api.StakingApi$FeatureToggles;
import com.revolut.feature.staking.api.model.StakingProduct;
import com.revolut.feature.staking.impl.flow.stake.v2.StakingControllerContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vnl.o;
import vud.b;
import yki.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final StakingControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f88135p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final th5.b f88136q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f88137r;

    public a(StakingControllerContract$InputData inputData, gte.a featureToggleInteractor, th5.b cryptoProductOnboardingModelExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoProductOnboardingModelExtension, "cryptoProductOnboardingModelExtension");
        this.o = inputData;
        this.f88135p = featureToggleInteractor;
        this.f88136q = cryptoProductOnboardingModelExtension;
        this.f88137r = d.a(this, new vh9.b(this, 28));
    }

    @Override // yki.j
    public final void M0() {
        FlowStep stakingDetails;
        FlowStep flowStep;
        StakingControllerContract$InputData stakingControllerContract$InputData = this.o;
        StakingProduct stakingProduct = stakingControllerContract$InputData.f88126b;
        if (((jte.d) this.f88135p).c(StakingApi$FeatureToggles.StakeBlocked.f88057c)) {
            flowStep = StakingControllerContract$Step.Blocked.f88128a;
        } else {
            xi0.b bVar = stakingProduct.d;
            xi0.b.Companion.getClass();
            if (Intrinsics.f(bVar, xi0.b.L)) {
                flowStep = StakingControllerContract$Step.MaticBlocked.f88132a;
            } else {
                if (stakingControllerContract$InputData.f88127c == null) {
                    stakingDetails = new StakingControllerContract$Step.StakingDetails(stakingControllerContract$InputData.f88126b);
                    if ((stakingDetails instanceof StakingControllerContract$Step.Stake) && !(stakingDetails instanceof StakingControllerContract$Step.StakingDetails)) {
                        h.t2(this, this.f88137r, stakingDetails, false, null, false, 12);
                        return;
                    } else {
                        l2(new o(this, stakingDetails, null, 8), new yi5.b(26));
                    }
                }
                flowStep = StakingControllerContract$Step.Stake.f88133a;
            }
        }
        stakingDetails = flowStep;
        if (stakingDetails instanceof StakingControllerContract$Step.Stake) {
        }
        l2(new o(this, stakingDetails, null, 8), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f88137r;
    }
}
