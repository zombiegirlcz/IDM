package ulf;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static d a(a3 transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        String str = transaction.f272624y.f273143a;
        tof.a aVar = transaction.R0;
        tof.c cVar = aVar != null ? aVar.f272572a : null;
        switch (cVar == null ? -1 : e.f280969a[cVar.ordinal()]) {
            case -1:
            case 1:
            case 2:
                return new d(new StartUpPocket.FiatCurrencyAccount(str), k1j.a.POCKETS);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
                return new d(new StartUpPocket.RevXFiatAccount(str), k1j.a.REVOLUT_X_FIAT);
            case 4:
                return new d(new StartUpPocket.ProAccount(str), k1j.a.PRO);
            case 5:
                return new d(new StartUpPocket.ProVaultAccount(str), k1j.a.PRO_VAULTS);
            case 6:
            case 7:
                return new d(new StartUpPocket.VaultAccount(str), k1j.a.VAULTS);
            case 8:
                return new d(new StartUpPocket.SavingsAccount(str), k1j.a.SAVINGS);
            case 9:
            case 10:
                return new d(new StartUpPocket.JointAccount(str), k1j.a.JOINT_ACCOUNT);
            case 11:
                return new d(new StartUpPocket.JointVaultAccount(str), k1j.a.JOINT_VAULTS);
            case 12:
                return new d(new StartUpPocket.JointSavingsAccount(str), k1j.a.JOINT_SAVINGS);
            case 13:
                return new d(StartUpPocket.RevPointsPocket.f104862a, k1j.a.REV_POINTS_POCKETS);
            case 14:
                return new d(new StartUpPocket.CreditCardAccount(str), k1j.a.CREDIT_CARDS);
            case 15:
                return new d(new StartUpPocket.FiatCurrencyJuniorAccount(str), k1j.a.YOUTH_POCKETS);
            case 16:
                return new d(new StartUpPocket.JuniorVaultAccount(str), k1j.a.YOUTH_VAULTS);
            case 17:
                return new d(new StartUpPocket.JuniorSavingsAccount(str), k1j.a.YOUTH_SAVINGS);
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return null;
        }
    }
}
