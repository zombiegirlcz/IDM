package edk;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.plan_rewards.api.navigation.PlanRewardsRevealDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import xck.o;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f125033a = y0.b("plan-rewards/milestone/reveal");

    @Override // xii.b
    public final Set a() {
        return this.f125033a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new PlanRewardsRevealDestination(o.MILESTONE, null);
    }
}
