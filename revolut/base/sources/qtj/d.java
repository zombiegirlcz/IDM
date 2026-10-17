package qtj;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHub;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubCollectionDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xii.b {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f249161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f249162b;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f249161a = featureToggleInteractor;
        this.f249162b = y0.b("rewards-hub/collections/{collectionId}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f249162b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        String str;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (!this.f249161a.a(RewardsHubApi$Toggles$RewardsHub.f99247c) && (str = (String) deeplink.f195040b.get("collectionId")) != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null) {
                return new RewardsHubCollectionDestination(str);
            }
        }
        return null;
    }
}
