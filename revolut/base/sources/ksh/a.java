package ksh;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.widgets.api.navigation.WidgetAdditionFlowDestination;
import com.revolut.feature.widgets.api.navigation.WidgetCustomisationFlowDestination;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlow;
import com.revolut.feature.widgets.impl.ui.flow.customisation.WidgetCustomisationFlowContact$InputData;
import com.revolut.feature.widgets.impl.ui.flow.selection.WidgetSelectionFlow;
import com.revolut.feature.widgets.impl.ui.flow.selection.WidgetSelectionFlowContact$InputData;
import esh.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof b)) {
            return null;
        }
        b bVar = (b) descriptor;
        return bVar.a(new WidgetSelectionFlow(new WidgetSelectionFlowContact$InputData(bVar.b(), bVar.d(), bVar.c())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof WidgetAdditionFlowDestination) {
            WidgetAdditionFlowDestination.InputData inputData = (WidgetAdditionFlowDestination.InputData) ((WidgetAdditionFlowDestination) destination).f98300a;
            return new WidgetSelectionFlow(new WidgetSelectionFlowContact$InputData(inputData.getF96350a(), inputData.getF96351b(), esh.a.ADD_WIDGET));
        }
        if (!(destination instanceof WidgetCustomisationFlowDestination)) {
            return null;
        }
        WidgetCustomisationFlowDestination widgetCustomisationFlowDestination = (WidgetCustomisationFlowDestination) destination;
        return new WidgetCustomisationFlow(new WidgetCustomisationFlowContact$InputData(widgetCustomisationFlowDestination.f96352b, widgetCustomisationFlowDestination.f96353c, widgetCustomisationFlowDestination.d, widgetCustomisationFlowDestination.e, widgetCustomisationFlowDestination.f));
    }
}
