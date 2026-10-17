package nf7;

import com.revolut.feature.incentive_reward.api.navigation.IncentiveRewardFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lg0.e;
import lg0.g;
import zhm.q0;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f214872a = y0.b("incentives/available");

    @Override // xii.b
    public final Set a() {
        return this.f214872a;
    }

    @Override // xii.b
    public final ParcelableDestination e(e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String strA = g.a((String) entry.getKey(), linkedHashMap);
            if (strA == null) {
                strA = "";
            }
            linkedHashMap2.put(key, strA);
        }
        return new IncentiveRewardFeatureConfig.SelectionDestination(false, true, linkedHashMap2, null, null);
    }
}
