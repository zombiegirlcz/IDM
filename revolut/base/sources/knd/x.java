package knd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.g9;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le3.x f186152a;

    public x(le3.x savingsAnalyticsTransactionFilterInteractor) {
        Intrinsics.checkNotNullParameter(savingsAnalyticsTransactionFilterInteractor, "savingsAnalyticsTransactionFilterInteractor");
        this.f186152a = savingsAnalyticsTransactionFilterInteractor;
    }

    public static g9 a(yld.d dVar) {
        switch (w.f186149a[dVar.ordinal()]) {
            case 1:
                return new g9(false);
            case 2:
                return new g9(true);
            case 3:
            case 4:
            case 5:
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
