package ijh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements Comparator {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }

        public static int a(String accountKey) {
            Intrinsics.checkNotNullParameter(accountKey, "accountKey");
            return (Intrinsics.f(accountKey, "SECURITIES") ? yhh.a.SECURITIES : Intrinsics.f(accountKey, "ISA") ? yhh.a.ISA : Intrinsics.f(accountKey, "SECURITIES_JOINT") ? yhh.a.SECURITIES_JOINT : Intrinsics.f(accountKey, "PEA") ? yhh.a.PEA : Intrinsics.f(accountKey, "ROBO") ? yhh.a.ROBO : Intrinsics.f(accountKey, "COMMODITIES") ? yhh.a.COMMODITIES : (Intrinsics.f(accountKey, "JISA") || a0.H(accountKey, "JISA_", false)) ? yhh.a.JISA : accountKey.equals("MARGIN") ? yhh.a.MARGIN : yhh.a.UNKNOWN).ordinal();
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer numValueOf;
        WealthAccount wealthAccount = (WealthAccount) obj2;
        WealthAccount wealthAccount2 = (WealthAccount) obj3;
        if (wealthAccount == null || wealthAccount2 == null) {
            numValueOf = null;
        } else {
            a aVar = Companion;
            String strC = jjh.b.c(wealthAccount);
            aVar.getClass();
            numValueOf = Integer.valueOf(Intrinsics.k(a.a(strC), a.a(jjh.b.c(wealthAccount2))));
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
