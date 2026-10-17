package vmh;

import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements Comparator {
    public static yfl.a a(f fVar) {
        switch (o.f290596a[fVar.ordinal()]) {
            case 1:
                return yfl.a.STOCKS;
            case 2:
                return yfl.a.STRATEGIES;
            case 3:
                return yfl.a.ETFS;
            case 4:
                return yfl.a.BONDS;
            case 5:
                return yfl.a.COMMODITIES;
            case 6:
                return yfl.a.CFD;
            case 7:
                return yfl.a.PRIVATE_MARKETS;
            case 8:
                return yfl.a.MUTUAL_FUNDS;
            case 9:
                return yfl.a.STRUCTURED_NOTES;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        f p0 = (f) obj2;
        f p17 = (f) obj3;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return Intrinsics.k(a(p0).a(), a(p17).a());
    }
}
