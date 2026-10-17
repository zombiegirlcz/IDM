package ifa;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$ForcePostActivationAfterSignUp;
import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$PostActivationRequestFlag;
import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$PostActivationSteps;
import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$PostActivationVirtualCardThemeSelection;
import com.revolut.feature.post_activation.api.navigation.PostActivationFlowDescriptor;
import com.revolut.feature.post_activation.impl.ui.flow.PostActivationFlow;
import com.revolut.feature.post_activation.impl.ui.flow.PostActivationFlowContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof PostActivationFlowDescriptor)) {
            return null;
        }
        PostActivationFlowDescriptor postActivationFlowDescriptor = (PostActivationFlowDescriptor) descriptor;
        return postActivationFlowDescriptor.a(new PostActivationFlow(new PostActivationFlowContract$InputData(postActivationFlowDescriptor.f80934a)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(PostActivationApi$Toggles$PostActivationSteps.f80932c, PostActivationApi$Toggles$PostActivationRequestFlag.f80931c, PostActivationApi$Toggles$ForcePostActivationAfterSignUp.f80930c, PostActivationApi$Toggles$PostActivationVirtualCardThemeSelection.f80933c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PostActivationFlowDescriptor) {
            return new PostActivationFlow(new PostActivationFlowContract$InputData(((PostActivationFlowDescriptor) destination).f80934a));
        }
        return null;
    }
}
