package xkd;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature.slot_manager.api.SlotManagerApi$Toggles;
import com.revolut.feature.slot_manager.api.model.prompt.SlotDefaultPrompt;
import com.revolut.feature.slot_manager.api.navigation.SlotChecklistDestination;
import com.revolut.feature.slot_manager.api.navigation.SlotManagerFeatureConfig;
import com.revolut.feature.slot_manager.impl.navigation.custom_rating.CustomRatingBottomSheetDestination;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.CustomRatingFlow;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.flow.CustomRatingFlowContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistController;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptController;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.SlotManagerPromptControllerContract$InputData;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow.SlotManagerPromptFlow;
import com.revolut.feature.slot_manager.impl.ui.screen.prompt.flow.SlotManagerPromptFlowContract$InputData;
import gc0.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f306660a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof jkd.a)) {
            return null;
        }
        jkd.a aVar = (jkd.a) descriptor;
        return aVar.a(new SlotChecklistController(new SlotChecklistControllerContract$InputData(aVar.c(), aVar.b())));
    }

    @Override // nte.a
    public final List e() {
        return SlotManagerApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SlotManagerFeatureConfig.PromptDestination) {
            SlotManagerFeatureConfig.PromptDestination promptDestination = (SlotManagerFeatureConfig.PromptDestination) destination;
            return promptDestination.getF87349a().getF87320b().getD() == SlotDefaultPrompt.LayoutType.MODAL_STORY ? new SlotManagerPromptFlow(new SlotManagerPromptFlowContract$InputData(promptDestination.getF87349a(), promptDestination.getF87350b())) : c.b(new SlotManagerPromptController(new SlotManagerPromptControllerContract$InputData(promptDestination.getF87349a(), promptDestination.getF87350b())), new v1c.c(8));
        }
        if (destination instanceof SlotChecklistDestination) {
            SlotChecklistDestination slotChecklistDestination = (SlotChecklistDestination) destination;
            return c.b(new SlotChecklistController(new SlotChecklistControllerContract$InputData(slotChecklistDestination.getF87345a(), slotChecklistDestination.getF87346b())), new v1c.c(9));
        }
        if (destination instanceof CustomRatingBottomSheetDestination) {
            return new CustomRatingFlow(new CustomRatingFlowContract$InputData(((CustomRatingBottomSheetDestination) destination).getF87352a()));
        }
        return null;
    }
}
