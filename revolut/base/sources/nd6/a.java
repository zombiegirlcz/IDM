package nd6;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.esim.instructions.navigation.EsimInstructionsDestination;
import com.revolut.feature.esim.instructions.ui.flow.instructions.EsimInstructionsFlow;
import com.revolut.feature.esim.instructions.ui.flow.instructions.EsimInstructionsFlowContract$InputData;
import com.revolut.feature.esim.instructions.ui.screen.instructions.EsimInstructionsScreen;
import kotlin.jvm.internal.Intrinsics;
import sd6.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof b)) {
            return null;
        }
        b bVar = (b) descriptor;
        return bVar.a(new EsimInstructionsScreen(bVar.f261828a));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof EsimInstructionsDestination)) {
            return null;
        }
        EsimInstructionsDestination esimInstructionsDestination = (EsimInstructionsDestination) destination;
        return new EsimInstructionsFlow(new EsimInstructionsFlowContract$InputData(esimInstructionsDestination.f72118a, esimInstructionsDestination.f72119b));
    }
}
