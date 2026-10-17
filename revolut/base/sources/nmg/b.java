package nmg;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.user.checklist.api.UserChecklistDestination;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlow;
import com.revolut.feature.user.checklist.impl.ui.flow.ChecklistFlowContract$ChecklistFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof UserChecklistDestination)) {
            return null;
        }
        UserChecklistDestination userChecklistDestination = (UserChecklistDestination) destination;
        return new ChecklistFlow(new ChecklistFlowContract$ChecklistFlowInputData(userChecklistDestination.f94597a, userChecklistDestination.f94598b, userChecklistDestination.f94599c));
    }
}
