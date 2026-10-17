package brh;

import aii.u;
import com.revolut.feature.wealth_protection.sso.animation.api.navigation.WealthProtectionSsoAnimationDestination;
import com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.WealthProtectionSsoAnimationFlow;
import com.revolut.feature.wealth_protection.sso.animation.impl.ui.flow.WealthProtectionSsoAnimationFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof WealthProtectionSsoAnimationDestination)) {
            return null;
        }
        WealthProtectionSsoAnimationDestination.InputData inputData = ((WealthProtectionSsoAnimationDestination) destination).f96289b;
        return new WealthProtectionSsoAnimationFlow(new WealthProtectionSsoAnimationFlowContract$InputData(inputData.f96290a, inputData.f96291b, inputData.f96292c));
    }
}
