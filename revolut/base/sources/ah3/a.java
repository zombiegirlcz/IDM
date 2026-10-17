package ah3;

import aii.p;
import aii.u;
import com.revolut.feature.checklist_challenges.api.navigation.ChecklistCollectionDestination;
import com.revolut.feature.checklist_challenges_ui.impl.navigation.ChecklistStepDetailsDestination;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreen;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.ChecklistCollectionScreenContract$InputData;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreen;
import com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_step_details.ChecklistStepDetailsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4878a = 0;

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ChecklistStepDetailsDestination) {
            ChecklistStepDetailsDestination checklistStepDetailsDestination = (ChecklistStepDetailsDestination) destination;
            return gc0.c.b(new ChecklistStepDetailsScreen(new ChecklistStepDetailsScreenContract$InputData(checklistStepDetailsDestination.f65810a, checklistStepDetailsDestination.f65811b)), new aab.b(2));
        }
        if (!(destination instanceof ChecklistCollectionDestination)) {
            return null;
        }
        ChecklistCollectionDestination checklistCollectionDestination = (ChecklistCollectionDestination) destination;
        return gc0.c.b(new ChecklistCollectionScreen(new ChecklistCollectionScreenContract$InputData(checklistCollectionDestination.f65808a, checklistCollectionDestination.f65809b)), new aab.b(3));
    }
}
