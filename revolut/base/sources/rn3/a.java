package rn3;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.cooldown_checker.api.CoolDownCheckerDestination;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.CooldownCheckerFlow;
import com.revolut.feature.cooldown_checker.impl.flow.cooldown_checker.CooldownCheckerFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CoolDownCheckerDestination)) {
            return null;
        }
        CoolDownCheckerDestination coolDownCheckerDestination = (CoolDownCheckerDestination) destination;
        return new CooldownCheckerFlow(new CooldownCheckerFlowContract$InputData(coolDownCheckerDestination.getF66096b(), coolDownCheckerDestination.getF66097c()));
    }
}
