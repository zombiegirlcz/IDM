package nf7;

import com.revolut.feature.incentive_reward.api.navigation.LotteryEnrollmentDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f214874a = y0.b("incentives/lotteries/enrollment");

    @Override // xii.b
    public final Set a() {
        return this.f214874a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String strA = g.a("code", deeplink.f195041c);
        if (strA == null) {
            return null;
        }
        return new LotteryEnrollmentDestination(strA);
    }
}
