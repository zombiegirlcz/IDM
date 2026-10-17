package b4j;

import com.revolut.retail.feature.beneficiary.api.common.BeneficiaryRouteType;
import f5j.r;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12389b;

    public c(b bankStateProvider, k mobileWalletStateProvider) {
        Intrinsics.checkNotNullParameter(bankStateProvider, "bankStateProvider");
        Intrinsics.checkNotNullParameter(mobileWalletStateProvider, "mobileWalletStateProvider");
        this.f12388a = bankStateProvider;
        this.f12389b = mobileWalletStateProvider;
    }

    public final Object a(f5j.a aVar, p3j.a aVar2) {
        wi0.b bVarA;
        xi0.b bVarA2;
        wi0.b bVarA3;
        xi0.b bVarA4;
        r rVar = aVar.f132335l;
        String str = aVar.f132337n;
        Map mapG = aVar.u;
        if (rVar == r.MOBILE_WALLET) {
            String str2 = aVar.e;
            String str3 = aVar.f;
            String str4 = aVar.i;
            String strB = f5j.c.b(aVar);
            if (strB != null) {
                wi0.b.Companion.getClass();
                bVarA3 = wi0.a.a(strB);
            } else {
                bVarA3 = null;
            }
            if (str != null) {
                xi0.b.Companion.getClass();
                bVarA4 = xi0.a.a(str);
            } else {
                bVarA4 = null;
            }
            Map mapG2 = mapG == null ? r0.g() : mapG;
            String str5 = mapG != null ? (String) mapG.get("TRANSFER_VENDOR") : null;
            if (str5 != null) {
                return this.f12389b.a(str2, str3, str4, bVarA3, bVarA4, mapG2, new BeneficiaryRouteType.MobileWallet(str5), u2j.d.PERSONAL, aVar2);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        String str6 = aVar.f132333h;
        Pair pair = (str6 == null || str6.length() == 0) ? new Pair(u2j.d.PERSONAL, aVar.e) : new Pair(u2j.d.BUSINESS, str6);
        u2j.d dVar = (u2j.d) pair.f186385a;
        String str7 = (String) pair.f186386b;
        String str8 = aVar.f;
        String str9 = aVar.i;
        String strB2 = f5j.c.b(aVar);
        if (strB2 != null) {
            wi0.b.Companion.getClass();
            bVarA = wi0.a.a(strB2);
        } else {
            bVarA = null;
        }
        if (str != null) {
            xi0.b.Companion.getClass();
            bVarA2 = xi0.a.a(str);
        } else {
            bVarA2 = null;
        }
        if (mapG == null) {
            mapG = r0.g();
        }
        return this.f12388a.b(str7, str8, str9, bVarA, bVarA2, mapG, dVar, aVar2);
    }
}
