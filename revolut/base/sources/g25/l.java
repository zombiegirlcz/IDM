package g25;

import com.revolut.core.ui_kit_resources.R$drawable;
import ft3.j1;
import ft3.z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements j {
    public static int c(j1 j1Var, z0 z0Var) {
        switch (k.f139898c[j1Var.ordinal()]) {
            case 1:
                return (z0Var == null ? -1 : k.f139897b[z0Var.ordinal()]) == 1 ? R$drawable.uikit_icn_24_refinancing_card : R$drawable.uikit_icn_24_credit_card;
            case 2:
                return R$drawable.uikit_icn_24_credit_card;
            case 3:
                return R$drawable.uikit_icn_24_credit_card;
            case 4:
                return R$drawable.uikit_icn_24_time_and_money;
            case 5:
                return R$drawable.uikit_icn_24_credit;
            case 6:
                return R$drawable.uikit_icn_24_mortgage;
            case 7:
                return R$drawable.uikit_icn_24_refinancing_home;
            case 8:
                return R$drawable.uikit_icn_24_overdraft;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                throw new IllegalStateException(("Credit application for product type: " + j1Var + " should not be presented in account switcher").toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int b(fs3.b entryPointType) {
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        switch (k.f139896a[entryPointType.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return c(j1.FIXED_TERM_CREDIT, null);
            case 4:
                return c(j1.MORTGAGE, null);
            case 5:
                return c(j1.REFINANCING_MORTGAGE, null);
            case 6:
            case 7:
            case 8:
                return c(j1.CREDIT_CARD, null);
            case 9:
                return c(j1.CREDIT_CARD, z0.BALANCE_TRANSFER);
            case 10:
                return c(j1.BUY_NOW_PAY_LATER, null);
            case 11:
                return c(j1.OVERDRAFT, null);
            case 12:
                throw new IllegalStateException("CREDIT_HEALTH is not a credit application product; getIconResId should not be invoked for it");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
