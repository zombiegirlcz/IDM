package tc7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f269758a;

    static {
        String[] elements = {"TransfersMedium", "TransfersSmall", "RevPointsSmall", "NearbyRewardsMedium", "ATMSmall", "ATMMedium", "CashbackLarge", "SavingsSmall"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f269758a = kotlin.collections.d.y0(elements);
    }

    private p() {
    }
}
