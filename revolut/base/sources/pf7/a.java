package pf7;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import gc0.c;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg3.a f235502a;

    public a(lg3.a checklistChallengesInteractor) {
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        this.f235502a = checklistChallengesInteractor;
    }

    public final FeatureCommand a(re7.a state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ChecklistChallenge checklistChallenge = state.f253531b;
        k9 k9Var = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        KompotFeatureConfig kompotFeatureConfigD = ((pg3.b) this.f235502a).d(checklistChallenge, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
        if (kompotFeatureConfigD != null) {
            return c.f(kompotFeatureConfigD);
        }
        return null;
    }
}
