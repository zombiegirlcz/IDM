package vhc;

import com.revolut.feature.rewards.api.navigation.ConciergeAlbertineRedeemDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f289459a = y0.b("partnerships/concierge-albertine/redeem");

    @Override // xii.b
    public final Set a() {
        return this.f289459a;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return ConciergeAlbertineRedeemDestination.f84888a;
    }
}
