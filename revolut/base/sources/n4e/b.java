package n4e;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.structured_note.details.api.navigation.PayoutScenarioDestination;
import com.revolut.feature.structured_note.details.api.ui.note_details.NoteDetailsContract$NoteDetailsScreenConfig;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowController;
import com.revolut.feature.structured_note.details.impl.ui.note_details.NoteDetailsFlowControllerContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_issuer.AboutIssuerScreenContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.about_note.AboutNoteScreenContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.note_insights.NoteInsightsScreenContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreen;
import com.revolut.feature.structured_note.details.impl.ui.screens.payout_scenario.PayoutScenarioScreenContract$InputData;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowContract$Destination;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.PerformanceTrackerFlowController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof l4e.a)) {
            super.c(descriptor);
            return null;
        }
        l4e.a aVar = (l4e.a) descriptor;
        NoteDetailsContract$NoteDetailsScreenConfig noteDetailsContract$NoteDetailsScreenConfig = aVar.f192105a;
        return aVar.a(new NoteDetailsFlowController(new NoteDetailsFlowControllerContract$InputData(noteDetailsContract$NoteDetailsScreenConfig.f88860a, noteDetailsContract$NoteDetailsScreenConfig.f88861b)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AboutIssuerScreenContract$Destination) {
            return new AboutIssuerScreen(((AboutIssuerScreenContract$Destination) destination).f88877a);
        }
        if (destination instanceof AboutNoteScreenContract$Destination) {
            return new AboutNoteScreen(((AboutNoteScreenContract$Destination) destination).f88879a);
        }
        if (destination instanceof NoteInsightsScreenContract$Destination) {
            return new NoteInsightsScreen(((NoteInsightsScreenContract$Destination) destination).f88888a);
        }
        if (destination instanceof PayoutScenarioDestination) {
            return new PayoutScenarioScreen(new PayoutScenarioScreenContract$InputData(((PayoutScenarioDestination) destination).f88858a));
        }
        if (destination instanceof PerformanceTrackerFlowContract$Destination) {
            return new PerformanceTrackerFlowController(((PerformanceTrackerFlowContract$Destination) destination).f88904a);
        }
        return null;
    }
}
