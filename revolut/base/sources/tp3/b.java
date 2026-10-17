package tp3;

import a0.d;
import ft3.d1;
import hx7.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import yoj.c;
import yoj.f;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    public static final boolean a(f fVar, d1 productClassification) throws Throwable {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        c cVarB = b(productClassification);
        if (cVarB != null) {
            return l.q(fVar, cVarB);
        }
        int i = a.f273258a[productClassification.f137810a.ordinal()];
        y.B((i == 1 || i == 2) ? d.r(c(productClassification), " doesn't have toggles, avoid using isCreditFeatureEnabled") : d.r(c(productClassification), " is defined in ProductCatalogue. Please use toProductCatalogueFeatureName"));
        return false;
    }

    public static final c b(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        switch (a.f273258a[d1Var.f137810a.ordinal()]) {
            case 1:
            case 2:
                return null;
            case 3:
                return c.CREDIT_CARD_APPLICATION;
            case 4:
                gt3.f fVar = d1Var.f137811b;
                return fVar == gt3.d.REFINANCING ? c.REFINANCING_LOAN : (fVar == null || fVar == gt3.d.LOAN) ? c.LOAN_APPLICATION : c.LOAN_APPLICATION;
            case 5:
                return c.PAY_LATER_APPLICATION;
            case 6:
                return c.CREDIT_CARD_LIMIT_INCREASE;
            case 7:
                return c.MORTGAGE;
            case 8:
                return c.REFINANCING_MORTGAGE;
            case 9:
                return c.FTC_FORBEARANCE;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return null;
            case 17:
                return c.OVERDRAFT_APPLICATION;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String c(d1 d1Var) {
        return "ProductClassification(productType=" + d1Var.f137810a + ", productSubtype=" + d1Var.f137811b + ")";
    }
}
