package qtj;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHub;
import com.revolut.retail.feature.api.rewards_hub.model.RewardsHubChallengeDetailsParams;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubDetailsDestination;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements xii.b {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f249165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f249166b;

    public h(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f249165a = featureToggleInteractor;
        this.f249166b = y0.b("rewards-hub/challenges/details");
    }

    @Override // xii.b
    public final Set a() {
        return this.f249166b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA = lg0.g.a("campaignId", linkedHashMap);
        if (strA == null) {
            return null;
        }
        String strA2 = lg0.g.a("userChallengeId", linkedHashMap);
        if (((jte.d) this.f249165a).c(RewardsHubApi$Toggles$RewardsHub.f99247c)) {
            return new RewardsHubDetailsDestination(new RewardsHubChallengeDetailsParams(strA, strA2));
        }
        return null;
    }
}
