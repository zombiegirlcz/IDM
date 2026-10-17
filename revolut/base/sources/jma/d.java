package jma;

import aii.u;
import com.revolut.feature.profile.impl.navigation.ChangeUserDetailsDestination$EmailChange;
import com.revolut.feature.profile.impl.navigation.ChangeUserDetailsDestination$NameChangeDocumentSubmission;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlow;
import com.revolut.feature.profile.impl.ui.details.email.VerifyEmailFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlow;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlowContract$InputData;
import com.revolut.feature.profile.impl.ui.details.flow.ChangeUserDetailsFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ChangeUserDetailsDestination$NameChangeDocumentSubmission) {
            return new ChangeUserDetailsFlow(new ChangeUserDetailsFlowContract$InputData(ChangeUserDetailsFlowContract$Step.NameChangeDocumentSubmission.f81401a));
        }
        if (destination instanceof ChangeUserDetailsDestination$EmailChange) {
            return new VerifyEmailFlow(new VerifyEmailFlowContract$InputData(((ChangeUserDetailsDestination$EmailChange) destination).getF81350a()));
        }
        return null;
    }
}
