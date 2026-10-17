package edk;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.plan_rewards.api.navigation.MilestoneRewardsListDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f125032a = y0.b("plan-rewards/milestone/list");

    @Override // xii.b
    public final Set a() {
        return this.f125032a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return MilestoneRewardsListDestination.f102536a;
    }
}
