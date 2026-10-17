package com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow;

import com.revolut.feature.payments.who_to_transfer.api.who_to_transfer.navigation.ContactsSyncOnboardingDescriptor$LaunchMode;
import com.revolut.feature.payments.who_to_transfer.impl.onboarding_contact_sync.flow.OnboardingContactSyncFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import u3a.p;
import w3a.b;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(ContactsSyncOnboardingDescriptor$LaunchMode launchMode) {
        FlowStep notifyStep;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        if (Intrinsics.f(launchMode, ContactsSyncOnboardingDescriptor$LaunchMode.Onboarding.f80048a)) {
            notifyStep = new OnboardingContactSyncFlowContract$Step.PermissionStep(false);
        } else {
            if (!(launchMode instanceof ContactsSyncOnboardingDescriptor$LaunchMode.PostOnboarding)) {
                throw new NoWhenBranchMatchedException();
            }
            notifyStep = new OnboardingContactSyncFlowContract$Step.NotifyStep(Integer.valueOf(((ContactsSyncOnboardingDescriptor$LaunchMode.PostOnboarding) launchMode).f80049a), true, true);
        }
        this.o = d.a(this, notifyStep, f0.f322471a, new p(launchMode, this, 14));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
