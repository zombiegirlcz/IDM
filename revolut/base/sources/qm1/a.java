package qm1;

import aii.u;
import com.revolut.feature.apm.bills.boleto.api.BoletoFeatureConfig;
import com.revolut.feature.apm.bills.boleto.api.navigation.BoletoFinderOnboardingDestination;
import com.revolut.feature.apm.bills.boleto.impl.finder.flow.BoletoFinderFlow;
import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.BoletoFinderOnboardingFlow;
import com.revolut.feature.apm.bills.boleto.impl.finder.onboarding.BoletoFinderOnboardingFlowContract$InputData;
import com.revolut.feature.apm.bills.boleto.impl.flow.BoletoTransferFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof pm1.b) {
            pm1.b bVar = (pm1.b) descriptor;
            return bVar.a(new BoletoFinderOnboardingFlow(new BoletoFinderOnboardingFlowContract$InputData(bVar.f237443a)));
        }
        if (!(descriptor instanceof pm1.e)) {
            return null;
        }
        pm1.e eVar = (pm1.e) descriptor;
        return eVar.a(new BoletoFinderFlow(new vm1.c(eVar)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof BoletoFeatureConfig.Destination.BoletoPaymentDestination) {
            return new BoletoTransferFlow(new fn1.c(((BoletoFeatureConfig.Destination.BoletoPaymentDestination) destination).f61163a));
        }
        if (destination instanceof BoletoFinderOnboardingDestination) {
            return new BoletoFinderOnboardingFlow(new BoletoFinderOnboardingFlowContract$InputData(((BoletoFinderOnboardingDestination) destination).f61166b.f61167a));
        }
        return null;
    }
}
