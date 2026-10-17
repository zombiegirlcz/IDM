package com.revolut.feature.subscriptions.impl.flow;

import c9f.c;
import cae.b;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.subscriptions.impl.flow.SubscriptionsFlowContract$Step;
import com.revolut.feature.subscriptions.impl.label.SubscriptionLabelScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f89193p;

    public a(SubscriptionsFlowDestination.InputData inputData, gte.a featureToggleInteractor) {
        FlowStep editSubscriptionFrequency;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = featureToggleInteractor;
        SubscriptionsFlowDestination.StartType startType = inputData.f89147a;
        if (startType instanceof SubscriptionsFlowDestination.StartType.ChangeSubscriptionLabel) {
            editSubscriptionFrequency = new SubscriptionsFlowContract$Step.LabelSubscription(new SubscriptionLabelScreenContract$InputData(((SubscriptionsFlowDestination.StartType.ChangeSubscriptionLabel) startType).f89150a, 20));
        } else if (startType instanceof SubscriptionsFlowDestination.StartType.CardSubscriptionList) {
            SubscriptionsFlowDestination.StartType.CardSubscriptionList cardSubscriptionList = (SubscriptionsFlowDestination.StartType.CardSubscriptionList) startType;
            editSubscriptionFrequency = new SubscriptionsFlowContract$Step.CardSubscriptionList(cardSubscriptionList.f89148a, cardSubscriptionList.f89149b);
        } else if (startType instanceof SubscriptionsFlowDestination.StartType.SubscriptionDetails) {
            SubscriptionsFlowDestination.StartType.SubscriptionDetails subscriptionDetails = (SubscriptionsFlowDestination.StartType.SubscriptionDetails) startType;
            editSubscriptionFrequency = new SubscriptionsFlowContract$Step.SubscriptionDetails(subscriptionDetails.f89154c, subscriptionDetails.f89152a, subscriptionDetails.f89153b);
        } else {
            if (!(startType instanceof SubscriptionsFlowDestination.StartType.EditSubscriptionFrequency)) {
                throw new NoWhenBranchMatchedException();
            }
            editSubscriptionFrequency = new SubscriptionsFlowContract$Step.EditSubscriptionFrequency(((SubscriptionsFlowDestination.StartType.EditSubscriptionFrequency) startType).f89151a);
        }
        this.f89193p = d.a(this, editSubscriptionFrequency, f0.f322471a, new c(this, 5));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f89193p;
    }
}
