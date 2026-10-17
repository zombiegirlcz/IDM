package l1h;

import java.util.Set;
import zhm.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private a() {
    }

    public static Set a(boolean z, boolean z3, boolean z4, boolean z6) {
        k1j.a aVar = k1j.a.POCKETS;
        k1j.a aVar2 = k1j.a.VAULTS;
        k1j.a aVar3 = k1j.a.CRYPTO;
        k1j.a aVar4 = k1j.a.JOINT_ACCOUNT;
        k1j.a aVar5 = k1j.a.JOINT_VAULTS;
        k1j.a aVar6 = k1j.a.PRO;
        k1j.a aVar7 = k1j.a.COMMODITIES;
        if (!z) {
            aVar7 = null;
        }
        k1j.a aVar8 = k1j.a.TRADING_ACCOUNTS;
        if (!z4) {
            aVar8 = null;
        }
        return z0.i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, z6 ? k1j.a.JOINT_TRADING_ACCOUNTS : null, z3 ? k1j.a.SAVINGS : null);
    }

    public static Set b(boolean z, boolean z3, boolean z4) {
        k1j.a aVar = k1j.a.POCKETS;
        k1j.a aVar2 = k1j.a.VAULTS;
        k1j.a aVar3 = k1j.a.CRYPTO;
        k1j.a aVar4 = k1j.a.JOINT_ACCOUNT;
        k1j.a aVar5 = k1j.a.JOINT_VAULTS;
        k1j.a aVar6 = k1j.a.PRO;
        k1j.a aVar7 = k1j.a.CREDIT_CARDS;
        k1j.a aVar8 = k1j.a.COMMODITIES;
        if (!z) {
            aVar8 = null;
        }
        k1j.a aVar9 = k1j.a.TRADING_ACCOUNTS;
        if (!z3) {
            aVar9 = null;
        }
        return z0.i(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, z4 ? k1j.a.JOINT_TRADING_ACCOUNTS : null);
    }
}
