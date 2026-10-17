package m6i;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 {
    public static k1j.a a(ibd.b accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        switch (j0.f203173a[accountType.ordinal()]) {
            case 1:
                return k1j.a.POCKETS;
            case 2:
            case 3:
                return k1j.a.VAULTS;
            case 4:
                return k1j.a.VAULTS;
            case 5:
                return k1j.a.SAVINGS;
            case 6:
                return k1j.a.JOINT_ACCOUNT;
            case 7:
                return k1j.a.JOINT_VAULTS;
            case 8:
                return k1j.a.JOINT_SAVINGS;
            case 9:
                return k1j.a.YOUTH_POCKETS;
            case 10:
                return k1j.a.YOUTH_VAULTS;
            case 11:
                return k1j.a.YOUTH_SAVINGS;
            case 12:
                return k1j.a.PRO;
            case 13:
                return k1j.a.PRO_VAULTS;
            case 14:
                throw new IllegalStateException("UNKNOWN pocket type is not supported in rescheduling");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
