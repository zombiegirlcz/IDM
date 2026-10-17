package vhc;

import com.revolut.feature.rewards.api.RewardsApi$FeatureToggles$RentAndBills;
import com.revolut.feature.rewards.api.navigation.RentAndBillsRevPointsEarnedDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements xii.b {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f289461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f289462b;

    public d(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289461a = featureToggleInteractor;
        this.f289462b = y0.b("rent-and-bills/rev-points-earned/{loyaltyTransactionId}");
    }

    @Override // xii.b
    public final Set a() {
        return this.f289462b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        String str;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (this.f289461a.a(RewardsApi$FeatureToggles$RentAndBills.f84764c) || (str = (String) deeplink.f195040b.get("loyaltyTransactionId")) == null) {
            return null;
        }
        return new RentAndBillsRevPointsEarnedDestination(str);
    }
}
