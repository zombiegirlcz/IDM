package g72;

import aii.u;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoExternalEnrollmentFlowDestination;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoExternalEnrollmentFlowInputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowDestination;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowInputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoViaVerdeDestination;
import com.revolut.feature.apm.multibanco.impl.ui.MultibancoFlow;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlow;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$InputData;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.list.WithdrawalCodeListScreen;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.flow.ViaVerdeFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof v62.c) {
            v62.c cVar = (v62.c) descriptor;
            return cVar.a(new MultibancoFlow(cVar.f286315a));
        }
        if (descriptor instanceof v62.b) {
            return ((v62.b) descriptor).a(new WithdrawalCodeListScreen());
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof MultibancoFlowDestination) {
            return new MultibancoFlow((MultibancoFlowInputData) ((MultibancoFlowDestination) destination).f98300a);
        }
        if (destination instanceof MultibancoExternalEnrollmentFlowDestination) {
            MultibancoExternalEnrollmentFlowInputData multibancoExternalEnrollmentFlowInputData = (MultibancoExternalEnrollmentFlowInputData) ((MultibancoExternalEnrollmentFlowDestination) destination).f98300a;
            return new MultibancoExternalEnrollmentFlow(new MultibancoExternalEnrollmentFlowContract$InputData(multibancoExternalEnrollmentFlowInputData.f62543a, multibancoExternalEnrollmentFlowInputData.f62544b));
        }
        if (destination instanceof MultibancoViaVerdeDestination) {
            return new ViaVerdeFlow();
        }
        return null;
    }
}
