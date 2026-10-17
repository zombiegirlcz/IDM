package qtj;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.rewards_hub.RewardsHubApi$Toggles$RewardsHub;
import com.revolut.retail.feature.api.rewards_hub.navigation.RewardsHubDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements xii.b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f249163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f249164b;

    public f(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f249163a = featureToggleInteractor;
        this.f249164b = y0.b("rewards-hub");
    }

    @Override // xii.b
    public final Set a() {
        return this.f249164b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (((jte.d) this.f249163a).c(RewardsHubApi$Toggles$RewardsHub.f99247c)) {
            return RewardsHubDestination.f99255a;
        }
        return null;
    }
}
