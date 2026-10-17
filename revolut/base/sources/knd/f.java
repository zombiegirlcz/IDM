package knd;

import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f {
    public static final String a(String str, AnalyticsAccount analyticsAccount) {
        if (analyticsAccount instanceof AnalyticsAccount.Joint) {
            return ((AnalyticsAccount.Joint) analyticsAccount).getF99182a().f51412a;
        }
        if ((analyticsAccount instanceof AnalyticsAccount.Pro) || (analyticsAccount instanceof AnalyticsAccount.Savings) || (analyticsAccount instanceof AnalyticsAccount.Junior) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Personal)) {
            return str;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Set b(Iterable iterable, String userId) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(userId, "userId");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = iterable.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(a(userId, (AnalyticsAccount) it8.next()));
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet = null;
        }
        return linkedHashSet == null ? zhm.y0.b(userId) : linkedHashSet;
    }
}
