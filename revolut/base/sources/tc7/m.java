package tc7;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f269753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f269754b;

    static {
        String[] elements = {"TotalSavingsSmall", "SavingsCashflowSmall", "SavingsSavedThisMonthSmall", "EarnedInterestSmall"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f269753a = kotlin.collections.d.y0(elements);
        String[] elements2 = {"VaultAutomationsList", "Goals"};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        f269754b = kotlin.collections.d.y0(elements2);
    }

    private m() {
    }
}
