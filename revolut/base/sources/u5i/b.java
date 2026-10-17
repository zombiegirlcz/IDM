package u5i;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import fva.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final StartUpPocket a(k kVar, String accountId) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        switch (a.f277454a[kVar.ordinal()]) {
            case 1:
                return new StartUpPocket.SavingsAccount(accountId);
            case 2:
            case 3:
                return new StartUpPocket.VaultAccount(accountId);
            case 4:
                return new StartUpPocket.ProVaultAccount(accountId);
            case 5:
                return new StartUpPocket.JuniorVaultAccount(accountId);
            case 6:
                return new StartUpPocket.JointVaultAccount(accountId);
            case 7:
                return new StartUpPocket.JuniorSavingsAccount(accountId);
            case 8:
                return new StartUpPocket.JointSavingsAccount(accountId);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
