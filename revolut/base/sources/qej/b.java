package qej;

import android.telephony.SubscriptionInfo;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((SubscriptionInfo) obj2).getSimSlotIndex()), Integer.valueOf(((SubscriptionInfo) obj3).getSimSlotIndex()));
    }
}
