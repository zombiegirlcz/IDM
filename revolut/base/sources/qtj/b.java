package qtj;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHub;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubChallengeHistoryDestination;
import d0j.m;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements xii.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f249159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f249160b;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f249159a = featureToggleInteractor;
        this.f249160b = y0.b("rewards-hub/challenge-list");
    }

    @Override // xii.b
    public final Set a() {
        return this.f249160b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        String strA;
        Object next;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.f249159a.a(RewardsHubApi$Toggles$RewardsHub.f99247c) && (strA = lg0.g.a("type", deeplink.f195041c)) != null) {
            Iterator<E> it8 = m.a().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((m) next).b(), strA)) {
                    break;
                }
            }
            m mVar = (m) next;
            if (mVar != null) {
                return new RewardsHubChallengeHistoryDestination(mVar);
            }
        }
        return null;
    }
}
