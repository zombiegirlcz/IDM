package knd;

import aw0.l2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o0 {
    public static l2 a(yld.d screenType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        switch (n0.f186118a[screenType.ordinal()]) {
            case 1:
                return l2.GREATER_VALUE_RED;
            case 2:
            case 3:
            case 5:
            case 6:
                return l2.GREATER_VALUE_GREEN;
            case 4:
                throw new UnsupportedOperationException("Cashflow doesn't support performance comparison");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static boolean b(yld.d screenType) {
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        switch (n0.f186118a[screenType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return false;
            case 6:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
