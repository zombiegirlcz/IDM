package com.revolut.feature.semi_independent_onboarding.impl.ui.invitation;

import com.revolut.feature.semi_independent_onboarding.api.model.GuardianInvitationResult;
import com.revolut.feature.semi_independent_onboarding.api.navigation.SemiIndependentInvitationContract$InputData;
import com.revolut.feature.semi_independent_onboarding.impl.ui.invitation.SemiIndependentOnboardingInvitationFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import g1d.b;
import i1d.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import v0d.b;
import v0d.c;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements b {
    public final o7.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SemiIndependentInvitationContract$InputData f85998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f85999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i1d.a f86000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f86001s;

    public a(o7.b semiIndependentActivationInteractor, SemiIndependentInvitationContract$InputData inputData, d guardianInvitationResultExtension, i1d.a promptInputDataProvider) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(semiIndependentActivationInteractor, "semiIndependentActivationInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(guardianInvitationResultExtension, "guardianInvitationResultExtension");
        Intrinsics.checkNotNullParameter(promptInputDataProvider, "promptInputDataProvider");
        this.o = semiIndependentActivationInteractor;
        this.f85998p = inputData;
        this.f85999q = guardianInvitationResultExtension;
        this.f86000r = promptInputDataProvider;
        int i = g1d.d.f139576b[inputData.f85983a.ordinal()];
        if (i == 1) {
            flowStep = SemiIndependentOnboardingInvitationFlowContract$Step.ContactChooser.f85996a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = SemiIndependentOnboardingInvitationFlowContract$Step.AddParentStartingPrompt.f85995a;
        }
        this.f86001s = cp5.d.a(this, flowStep, f0.f322471a, new fv1.a(this, 19));
    }

    public final void I2() {
        int i = g1d.d.f139575a[this.f85998p.f85984b.ordinal()];
        if (i == 1) {
            C2(b.a.f284791a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(this.f86001s);
        }
    }

    public final void J2(GuardianInvitationResult guardianInvitationResult) {
        int i = g1d.d.f139575a[this.f85998p.f85984b.ordinal()];
        if (i == 1) {
            C2(new c(guardianInvitationResult));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.D2(this.f86001s);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f86001s;
    }
}
