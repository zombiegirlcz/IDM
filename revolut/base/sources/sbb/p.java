package sbb;

import android.os.Parcelable;
import com.revolut.feature.retail.main_screen.container.models.action_payload.ChecklistPayload;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.user.checklist.api.UserChecklistContentType;
import com.revolut.feature.user.checklist.api.UserChecklistDestination;
import com.revolut.feature.user.checklist.api.UserChecklistSource;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class p extends yji.n implements etb.a {
    @Override // etb.a
    public final void E(MainScreenContainerActionData actionData) {
        UserChecklistDestination userChecklistDestination;
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        Parcelable parcelable = actionData.f83422b;
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ChecklistPayload checklistPayload = (ChecklistPayload) parcelable;
        boolean zEquals = checklistPayload.equals(ChecklistPayload.AdoptionJourneyDeeplinkAction.f82755a);
        UserChecklistSource.Other other = UserChecklistSource.Other.f94600a;
        if (zEquals) {
            userChecklistDestination = new UserChecklistDestination(other, UserChecklistContentType.AdoptionJourney.f94595a, false);
        } else {
            if (!(checklistPayload instanceof ChecklistPayload.FincrimeChecklist)) {
                throw new NoWhenBranchMatchedException();
            }
            userChecklistDestination = new UserChecklistDestination(other, UserChecklistContentType.FincrimeChecklist.f94596a, ((ChecklistPayload.FincrimeChecklist) checklistPayload).f82756a);
        }
        A2(u0.b(new FeatureCommand(new KompotOverlayFeatureConfig(userChecklistDestination, yhi.b.SOLID, (Integer) null, 12))));
    }

    @Override // etb.a
    public final boolean i2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        return actionData.f83422b instanceof ChecklistPayload;
    }
}
