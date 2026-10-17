package qrb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {
    private p() {
    }

    public static q a(nel.n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        switch (o.f248704a[instrument.f214597c.ordinal()]) {
            case 1:
                return q.STOCK;
            case 2:
                return q.CFD;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
