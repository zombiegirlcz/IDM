package khk;

import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_selection.switch_to_individual.SwitchToIndividualPromptControllerModelExtension;
import e4m.e;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import phk.k;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public abstract class d implements e {
    public static Set a(k modelExtension, bgk.a termsWorkflowExtension, SwitchToIndividualPromptControllerModelExtension switchToIndividualExtension, wmk.b planDowngradeOfferReminderControllerModelExtension, aok.a planValueOfferReminderControllerModelExtension, wfk.a globalPlansExtension) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(modelExtension, "modelExtension");
        Intrinsics.checkNotNullParameter(termsWorkflowExtension, "termsWorkflowExtension");
        Intrinsics.checkNotNullParameter(switchToIndividualExtension, "switchToIndividualExtension");
        Intrinsics.checkNotNullParameter(planDowngradeOfferReminderControllerModelExtension, "planDowngradeOfferReminderControllerModelExtension");
        Intrinsics.checkNotNullParameter(planValueOfferReminderControllerModelExtension, "planValueOfferReminderControllerModelExtension");
        Intrinsics.checkNotNullParameter(globalPlansExtension, "globalPlansExtension");
        n[] elements = {modelExtension, termsWorkflowExtension, switchToIndividualExtension, planDowngradeOfferReminderControllerModelExtension, planValueOfferReminderControllerModelExtension, globalPlansExtension};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setY0 = kotlin.collections.d.y0(elements);
        s.k(setY0);
        return setY0;
    }
}
