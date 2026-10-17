package at7;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_credit.api.navigation.InsuranceCreditNavigationDestination;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlow;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlowContract$InputData;
import com.revolut.feature.insurance_credit.impl.ui.flow.InsuranceCreditFlowContract$Step;
import dki.g;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements ohi.a, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f9015a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f9015a = deeplinkGateways;
    }

    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof InsuranceCreditNavigationDestination)) {
            return null;
        }
        InsuranceCreditNavigationDestination insuranceCreditNavigationDestination = (InsuranceCreditNavigationDestination) destination;
        return new InsuranceCreditFlow(new InsuranceCreditFlowContract$InputData(insuranceCreditNavigationDestination.f75731a, insuranceCreditNavigationDestination.f75732b, Intrinsics.f(insuranceCreditNavigationDestination.f75733c, "documents") ? InsuranceCreditFlowContract$Step.Documents.f75813a : InsuranceCreditFlowContract$Step.Details.f75812a));
    }

    @Override // aii.p
    public final Set h() {
        return this.f9015a;
    }
}
