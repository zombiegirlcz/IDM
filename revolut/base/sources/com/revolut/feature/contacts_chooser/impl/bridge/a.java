package com.revolut.feature.contacts_chooser.impl.bridge;

import aii.u;
import com.revolut.feature.contacts_chooser.api.navigation.ContactsChooserFeatureConfig;
import com.revolut.feature.contacts_chooser.impl.bridge.ContactsChooserFlowContract$Step;
import com.revolut.kompot.FeatureFlowStep;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nhi.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends ohi.b {
    @Override // ohi.b
    public final com.revolut.kompot.navigable.a a(FeatureFlowStep featureFlowStep, g flowModel) {
        ContactsChooserFlowContract$Step step = (ContactsChooserFlowContract$Step) featureFlowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (step instanceof ContactsChooserFlowContract$Step.Chooser) {
            return new ContactsChooserFlow(((ContactsChooserFlowContract$Step.Chooser) step).getF66083a());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ohi.b
    public final c c(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof ContactsChooserFeatureConfig.ContactChooserScreenBridgeDestination) {
            return new c(new ContactsChooserFlowContract$Step.Chooser(new ContactsChooserFlowContract$InputData(((ContactsChooserFeatureConfig.ContactChooserScreenBridgeDestination) destination).f66061a)));
        }
        return null;
    }
}
