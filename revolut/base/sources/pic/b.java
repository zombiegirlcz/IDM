package pic;

import com.revolut.feature.rewards.api.model.rewards.RewardAvailabilityInOutlet;
import com.revolut.feature.rewards.api.model.rewards.RewardOutlet;
import ggc.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static ArrayList a(RewardOutlet outlet) {
        Object next;
        Intrinsics.checkNotNullParameter(outlet, "outlet");
        ggc.e[] eVarArrValues = ggc.e.values();
        ArrayList arrayList = new ArrayList();
        for (ggc.e eVar : eVarArrValues) {
            Iterator it8 = outlet.e.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (((RewardAvailabilityInOutlet) next).f84836a.contains(eVar.getCode())) {
                    break;
                }
            }
            RewardAvailabilityInOutlet rewardAvailabilityInOutlet = (RewardAvailabilityInOutlet) next;
            n nVar = rewardAvailabilityInOutlet != null ? new n(eVar, rewardAvailabilityInOutlet.f84837b) : null;
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }
}
