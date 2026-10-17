package akf;

import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a1 {
    public static final String a(tof.a aVar) {
        tof.b bVar;
        String str;
        tof.c cVar = aVar.f272572a;
        String str2 = aVar.f272573b;
        return ((cVar != tof.c.SAVINGS && cVar != tof.c.JOINT_SAVINGS && cVar != tof.c.JUNIOR_SAVINGS) || (bVar = aVar.f272574c) == null || (str = bVar.f272634a) == null) ? str2 : str;
    }

    public static final StartUpPocket b(io3.l lVar, tof.a aVar, xi0.b bVar) {
        String strA = a(aVar);
        switch (z0.f5926a[aVar.f272572a.ordinal()]) {
            case 1:
                if (lVar == io3.l.REVX_FIAT) {
                    if (strA != null) {
                        return new StartUpPocket.RevXFiatAccount(strA);
                    }
                    return null;
                }
                if (cp5.d.z(bVar)) {
                    if (strA != null) {
                        return new StartUpPocket.CryptoCurrencyAccount(strA);
                    }
                    return null;
                }
                if (cp5.d.y(bVar)) {
                    if (strA != null) {
                        return new StartUpPocket.CommodityAccount(strA);
                    }
                    return null;
                }
                if (strA != null) {
                    return new StartUpPocket.FiatCurrencyAccount(strA);
                }
                return null;
            case 2:
                if (strA != null) {
                    return new StartUpPocket.ProAccount(strA);
                }
                return null;
            case 3:
                if (strA != null) {
                    return new StartUpPocket.ProVaultAccount(strA);
                }
                return null;
            case 4:
            case 5:
                if (strA != null) {
                    return new StartUpPocket.VaultAccount(strA);
                }
                return null;
            case 6:
                if (strA != null) {
                    return new StartUpPocket.SavingsAccount(strA);
                }
                return null;
            case 7:
                if (strA != null) {
                    return new StartUpPocket.JointAccount(strA);
                }
                return null;
            case 8:
                if (strA != null) {
                    return new StartUpPocket.JointVaultAccount(strA);
                }
                return null;
            case 9:
                if (strA != null) {
                    return new StartUpPocket.JointSavingsAccount(strA);
                }
                return null;
            case 10:
                return StartUpPocket.RevPointsPocket.f104862a;
            case 11:
                if (strA != null) {
                    return new StartUpPocket.CreditCardAccount(strA);
                }
                return null;
            case 12:
                if (strA != null) {
                    return new StartUpPocket.FiatCurrencyJuniorAccount(strA);
                }
                return null;
            case 13:
                if (strA != null) {
                    return new StartUpPocket.JuniorVaultAccount(strA);
                }
                return null;
            case 14:
                if (strA != null) {
                    return new StartUpPocket.JuniorSavingsAccount(strA);
                }
                return null;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                if (strA != null) {
                    return new StartUpPocket.InvestCashHolding(strA);
                }
                return null;
            case 20:
                if (strA != null) {
                    return new StartUpPocket.RevXFiatAccount(strA);
                }
                return null;
            case 21:
            case 22:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
