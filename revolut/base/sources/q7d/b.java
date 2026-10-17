package q7d;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.shared.help_centre.api.faq.FaqEntriesScreenDestination;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlow;
import com.revolut.feature.shared.help_centre.impl.faq.flow.SharedFaqLazyFlow;
import com.revolut.feature.shared.help_centre.impl.faq.flow.SharedFaqLazyFlowContract$InputData;
import com.revolut.feature.shared.help_centre.impl.faq.screens.faq_entries.FaqEntriesScreen;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlow;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$InputData;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$StartPoint;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof com.revolut.feature.shared.help_centre.api.faq.a)) {
            return null;
        }
        com.revolut.feature.shared.help_centre.api.faq.a aVar = (com.revolut.feature.shared.help_centre.api.faq.a) descriptor;
        SharedFaqDestination.StartPoint.FaqExplicit faqExplicitB = aVar.b();
        return aVar.a(new SharedFaqLazyFlow(new SharedFaqLazyFlowContract$InputData(faqExplicitB.getF86123a(), faqExplicitB.getD())));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        HelpFlowContract$StartPoint helpFlowContract$StartPoint;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SharedHelpDestination) {
            SharedHelpDestination.InputData inputData = ((SharedHelpDestination) destination).f86144b;
            SharedHelpDestination.StartPoint f86146a = inputData.getF86146a();
            if (Intrinsics.f(f86146a, SharedHelpDestination.StartPoint.HelpWithCard.f86149a)) {
                helpFlowContract$StartPoint = HelpFlowContract$StartPoint.HelpWithCard.f86375a;
            } else if (Intrinsics.f(f86146a, SharedHelpDestination.StartPoint.Home.f86150a)) {
                helpFlowContract$StartPoint = HelpFlowContract$StartPoint.Home.f86376a;
            } else {
                if (!Intrinsics.f(f86146a, SharedHelpDestination.StartPoint.ViewCardPin.f86151a)) {
                    throw new NoWhenBranchMatchedException();
                }
                helpFlowContract$StartPoint = HelpFlowContract$StartPoint.ViewCardPin.f86377a;
            }
            return new HelpFlow(new HelpFlowContract$InputData(helpFlowContract$StartPoint, inputData.getF86147b(), inputData.getF86148c()));
        }
        if (!(destination instanceof SharedFaqDestination)) {
            if (destination instanceof FaqEntriesScreenDestination) {
                return new FaqEntriesScreen(((FaqEntriesScreenDestination) destination).getF86103b());
            }
            return null;
        }
        SharedFaqDestination sharedFaqDestination = (SharedFaqDestination) destination;
        SharedFaqDestination.StartPoint startPoint = sharedFaqDestination.f86106b;
        if (!(startPoint instanceof SharedFaqDestination.StartPoint.FaqExplicit)) {
            return new FaqFlow((SharedFaqDestination.InputData) sharedFaqDestination.f98300a);
        }
        SharedFaqDestination.StartPoint.FaqExplicit faqExplicit = (SharedFaqDestination.StartPoint.FaqExplicit) startPoint;
        return new SharedFaqLazyFlow(new SharedFaqLazyFlowContract$InputData(faqExplicit.getF86123a(), faqExplicit.getD()));
    }
}
