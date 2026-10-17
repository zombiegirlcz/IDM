package jjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;
import xzg.o0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b {
    public static final boolean a(WealthAccount wealthAccount) {
        Intrinsics.checkNotNullParameter(wealthAccount, "<this>");
        return wealthAccount.getF95255c() == o0.AVAILABLE;
    }

    public static final boolean b(WealthAccount wealthAccount) {
        Intrinsics.checkNotNullParameter(wealthAccount, "<this>");
        o0[] elements = {o0.ONBOARDING, o0.ACTIVE, o0.SUSPENDED, o0.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements).contains(wealthAccount.getF95255c());
    }

    public static final String c(WealthAccount wealthAccount) {
        Intrinsics.checkNotNullParameter(wealthAccount, "<this>");
        if (wealthAccount instanceof WealthAccount.Securities) {
            int i = a.f174952a[((WealthAccount.Securities) wealthAccount).f95239b.ordinal()];
            if (i == 1) {
                return "SECURITIES";
            }
            if (i == 2) {
                return "SECURITIES_JOINT";
            }
            throw new NoWhenBranchMatchedException();
        }
        if (wealthAccount instanceof WealthAccount.Robo) {
            return "ROBO";
        }
        if (wealthAccount instanceof WealthAccount.Commodities) {
            return "COMMODITIES";
        }
        if (wealthAccount instanceof WealthAccount.Margin) {
            return "MARGIN";
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Isa) {
            return "ISA";
        }
        if (wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.Pea) {
            return "PEA";
        }
        if (!(wealthAccount instanceof WealthAccount.TaxAdvantageWealthAccount.JIsa)) {
            throw new NoWhenBranchMatchedException();
        }
        String string = ((WealthAccount.TaxAdvantageWealthAccount.JIsa) wealthAccount).getF().f105175a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return w0.h(string);
    }
}
