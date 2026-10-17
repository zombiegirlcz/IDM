package cb1;

import aii.u;
import com.revolut.feature.acquiring.card_reader.order.api.navigation.CardReaderOrderFlowDestination;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.flow.CardReaderOrderFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (Intrinsics.f(destination, CardReaderOrderFlowDestination.f60589a)) {
            return new CardReaderOrderFlow();
        }
        return null;
    }
}
