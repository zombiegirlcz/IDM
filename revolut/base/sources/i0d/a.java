package i0d;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.semi_independent_activation.api.navigation.SemiIndependentActivationDestination;
import com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlow;
import com.revolut.feature.semi_independent_activation.impl.ui.activation.SemiIndependentActivationFlowContract$InputData;
import dki.g;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f157350a;

    public a(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f157350a = deeplinkGateways;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SemiIndependentActivationDestination.InvitationDetails) {
            return new SemiIndependentActivationFlow(new SemiIndependentActivationFlowContract$InputData(((SemiIndependentActivationDestination.InvitationDetails) destination).f85969a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f157350a;
    }
}
