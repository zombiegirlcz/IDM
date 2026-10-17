package yh3;

import aii.u;
import com.revolut.feature.checkout.api.navigation.ResumeCheckoutDestination;
import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlow;
import com.revolut.feature.checkout.impl.resume.flow.ResumeCheckoutFlowContract$InputData;
import com.revolut.feature.checkout.models.Checkout;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof ResumeCheckoutDestination)) {
            return null;
        }
        ResumeCheckoutDestination resumeCheckoutDestination = (ResumeCheckoutDestination) destination;
        Checkout checkout = resumeCheckoutDestination.f65828a;
        boolean z = resumeCheckoutDestination.f65829b;
        return new ResumeCheckoutFlow(new ResumeCheckoutFlowContract$InputData(resumeCheckoutDestination.d, checkout, resumeCheckoutDestination.f65830c, z));
    }
}
