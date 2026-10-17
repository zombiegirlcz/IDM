package lrk;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {
    public static String a(trk.a assetType) {
        String id10;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        int i = c.f199525a[assetType.ordinal()];
        if (i == 1) {
            id10 = "INSTRUMENT_STATS_EQUITY_KEY_STATS";
        } else if (i == 2) {
            id10 = "INSTRUMENT_STATS_ETF_KEY_STATS";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            id10 = "INSTRUMENT_STATS_BOND_KEY_STATS";
        }
        Intrinsics.checkNotNullParameter(id10, "id");
        return id10;
    }
}
