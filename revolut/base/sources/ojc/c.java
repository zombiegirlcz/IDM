package ojc;

import ibd.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final com.revolut.feature.rewards.api.model.rent_and_bills.b a(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        int i = b.f225753a[hVar.ordinal()];
        return (i == 1 || i == 2) ? com.revolut.feature.rewards.api.model.rent_and_bills.b.STANDING_ORDER : i != 3 ? com.revolut.feature.rewards.api.model.rent_and_bills.b.UNKNOWN : com.revolut.feature.rewards.api.model.rent_and_bills.b.DIRECT_DEBIT;
    }
}
