package pf7;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.checklist_challenges.api.models.ChecklistChallenge;
import com.revolut.kompot.bridge.navigation.KompotFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import e93.v;
import gc0.c;
import grl.k9;
import h93.l0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import re7.d;
import re7.e;
import re7.f;
import re7.g;
import re7.j;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lg3.a f235503a;

    public b(lg3.a checklistChallengesInteractor) {
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        this.f235503a = checklistChallengesInteractor;
    }

    public final FeatureCommand a(g state) {
        Intrinsics.checkNotNullParameter(state, "state");
        f fVar = state.f253536b;
        j jVar = state.f253535a;
        if (fVar instanceof d) {
            ChecklistChallenge checklistChallenge = ((d) fVar).f253533a;
            k9 k9Var = k9.Cards;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            KompotFeatureConfig kompotFeatureConfigD = ((pg3.b) this.f235503a).d(checklistChallenge, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var));
            if (kompotFeatureConfigD != null) {
                return c.f(kompotFeatureConfigD);
            }
            return null;
        }
        if (!(fVar instanceof e)) {
            throw new NoWhenBranchMatchedException();
        }
        b93.e eVar = b93.e.PHYSICAL;
        String str = jVar.f253539b;
        v vVar = v.DEEPLINK_PHYSICAL;
        l0 l0Var = l0.DEBIT;
        return c.f(new CardDesignFeatureConfig(eVar, AccountId.Personal.f51414a, null, new b93.b(jVar.f253538a), null, false, null, false, false, null, null, null, null, vVar, str, null, null, null, l0Var, null, null, false, false, null, 528089066));
    }
}
