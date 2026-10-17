package qu2;

import aii.u;
import com.revolut.feature.card.terminate.api.navigation.CardTerminateDestination;
import com.revolut.feature.card.terminate.impl.ui.flow.CardTerminateFlow;
import com.revolut.feature.card.terminate.impl.ui.flow.CardTerminateFlowContract$InputData;
import dki.g;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import su2.b;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof CardTerminateDestination)) {
            return null;
        }
        CardTerminateDestination cardTerminateDestination = (CardTerminateDestination) destination;
        String f64381a = cardTerminateDestination.getF64380b().getF64381a();
        Map f64382b = cardTerminateDestination.getF64380b().getF64382b();
        return new CardTerminateFlow(new CardTerminateFlowContract$InputData(f64381a, Intrinsics.f(f64382b != null ? (String) f64382b.get("reason") : null, "ATO") ? b.ATO : b.OTHER));
    }
}
