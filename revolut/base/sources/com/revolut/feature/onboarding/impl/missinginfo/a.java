package com.revolut.feature.onboarding.impl.missinginfo;

import aii.u;
import com.revolut.feature.onboarding.api.missinginfo.MissingInfoDestination;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoFlowContract$Step;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        MissingInfoFlowContract$Step occupationChooser;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof MissingInfoDestination)) {
            return null;
        }
        MissingInfoDestination missingInfoDestination = (MissingInfoDestination) destination;
        if (missingInfoDestination instanceof MissingInfoDestination.PurposeOfAccount) {
            occupationChooser = new MissingInfoFlowContract$Step.PurposeOfAccount(((MissingInfoDestination.PurposeOfAccount) destination).getF78175a());
        } else {
            if (!(missingInfoDestination instanceof MissingInfoDestination.OccupationChooser)) {
                throw new NoWhenBranchMatchedException();
            }
            occupationChooser = new MissingInfoFlowContract$Step.OccupationChooser(((MissingInfoDestination.OccupationChooser) destination).getF78174a());
        }
        return new MissingInfoFlow(new MissingInfoFlowContract$InputData(occupationChooser));
    }
}
