package jjb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private b() {
    }

    public static c a(SavingsProductData savingsProductData, cfl.b bVar) {
        Intrinsics.checkNotNullParameter(savingsProductData, "savingsProductData");
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        if (ocd.a.c(savingsProductData)) {
            return c.PAUSED;
        }
        Intrinsics.checkNotNullParameter(savingsProductData, "<this>");
        if (!ocd.a.d(savingsProductData)) {
            return c.NORMAL;
        }
        switch (bVar == null ? -1 : a.f174807a[bVar.ordinal()]) {
            case -1:
            case 4:
            case 5:
            case 6:
                return c.NORMAL;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return c.UNDER_REVIEW;
            case 2:
            case 3:
                return c.REJECTED;
        }
    }
}
