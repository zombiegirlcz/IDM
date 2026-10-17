package rz6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.freelancer.common.models.FreelancerAccountOnboardingState;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.c0;
import nii.h0;
import nii.j0;
import nii.u1;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static j0 a(FreelancerAccountOnboardingState state) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = state instanceof FreelancerAccountOnboardingState.Onboarded;
        TextLocalisedClause textLocalisedClause2 = null;
        if (z) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_onboarding_result_success_title, null, null, 14);
        } else {
            if (!(state instanceof FreelancerAccountOnboardingState.Pending) && !(state instanceof FreelancerAccountOnboardingState.NotOnboarded)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_onboarding_result_pending_title, null, null, 14);
        }
        if (!z) {
            if (!(state instanceof FreelancerAccountOnboardingState.Pending) && !(state instanceof FreelancerAccountOnboardingState.NotOnboarded)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_onboarding_result_pending_subtitle, null, null, 14);
        }
        return new j0((Clause) textLocalisedClause, (Clause) textLocalisedClause2, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092);
    }

    public static c0 b() {
        return new c0(new TextLocalisedClause(R$string.freelancer_onboarding_in_progress_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_onboarding_in_progress_subtitle, null, null, 14), null, false, null, false, false, null, 1916);
    }
}
