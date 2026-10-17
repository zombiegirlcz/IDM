package nf7;

import com.revolut.feature.incentive_reward.api.navigation.RedeemRewardDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lg0.e;
import lg0.g;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f214875a = y0.b("incentives/campaigns/{campaignId}/redeem-reward");

    @Override // xii.b
    public final Set a() {
        return this.f214875a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        String strA;
        ze7.a aVar;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        String str = (String) deeplink.f195040b.get("campaignId");
        if (str != null && (strA = g.a("type", deeplink.f195041c)) != null) {
            ze7.a[] aVarArrValues = ze7.a.values();
            int length = aVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    aVar = null;
                    break;
                }
                aVar = aVarArrValues[i];
                if (a0.z(aVar.name(), strA, true)) {
                    break;
                }
                i++;
            }
            if (aVar != null) {
                return new RedeemRewardDestination(str, aVar);
            }
        }
        return null;
    }
}
