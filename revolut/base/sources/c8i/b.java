package c8i;

import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature_move_money.api.model.AccountSource;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5i.a f22173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f22174b;

    public b(w5i.a allowedBalancePickerGroupsProvider, gte.a featureToggleInteractor, h0 savingsAccountPairEligibilityChecker) {
        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountPairEligibilityChecker, "savingsAccountPairEligibilityChecker");
        this.f22173a = allowedBalancePickerGroupsProvider;
        this.f22174b = savingsAccountPairEligibilityChecker;
    }

    public static boolean a(AccountWrapper accountWrapper) {
        AccountSource accountSource = accountWrapper != null ? accountWrapper.d : null;
        AccountSource.JuniorSavingsSource juniorSavingsSource = accountSource instanceof AccountSource.JuniorSavingsSource ? (AccountSource.JuniorSavingsSource) accountSource : null;
        if (juniorSavingsSource == null) {
            return true;
        }
        return juniorSavingsSource.f97206a.e;
    }

    public final boolean b(SavingsAccountDetails account, AccountWrapper accountWrapper, x5i.d dVar) {
        boolean z;
        SavingsProduct savingsProduct;
        SavingsProduct savingsProduct2;
        SavingsProduct savingsProduct3;
        Object next;
        SavingsProduct savingsProduct4;
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(account, "account");
        if (accountWrapper != null) {
            j8l.a aVar = accountWrapper.f97224a;
            if (dVar != null) {
                pcd.s sVar = account.f86460a;
                SavingsProductData savingsProductData = account.f86462c;
                boolean zF = Intrinsics.f(sVar.getCurrency(), accountWrapper.getCurrency().f306286a);
                boolean zL = (savingsProductData == null || (savingsProduct4 = savingsProductData.f86683a) == null) ? true : x5d.b.l(savingsProduct4);
                if (savingsProductData == null || (savingsProduct3 = savingsProductData.f86683a) == null) {
                    z = true;
                } else {
                    Intrinsics.checkNotNullParameter(savingsProduct3, "<this>");
                    Intrinsics.checkNotNullParameter(savingsProduct3, "<this>");
                    Iterator it8 = savingsProduct3.f86629s.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it8.next();
                        if (((SavingsProduct.ProductRestriction) next).f86659a == com.revolut.feature.shared.savings.models.product.c.CROSS_CURRENCY_WITHDRAWAL_RESTRICTION) {
                            break;
                        }
                    }
                    SavingsProduct.ProductRestriction productRestriction = (SavingsProduct.ProductRestriction) next;
                    z = !(productRestriction != null && productRestriction.f86660b);
                }
                int i = g0.f22200a[dVar.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zL = z;
                }
                boolean zS = pw5.a.s(aVar);
                SavingsAccountDetails savingsAccountDetailsA = com.revolut.feature_move_money.api.model.b.a(accountWrapper);
                if (aVar != j8l.a.SAVINGS) {
                    if (!((jte.d) this.f22174b.f22201a).c(SavingsApi$Toggles.JointSavingsToSavingsTransfers.f83076c)) {
                        savingsAccountDetailsA = null;
                    }
                }
                boolean z3 = dVar == x5i.d.TARGET;
                pcd.a aVarA = opg.c.a(sVar);
                String str = aVarA != null ? aVarA.f234844g : null;
                boolean z4 = str == null || str.length() == 0;
                if (!z3 || z4) {
                    if (zS) {
                        if (savingsAccountDetailsA != null) {
                            SavingsProductData savingsProductData2 = savingsAccountDetailsA.f86462c;
                            boolean z6 = (savingsProductData2 == null || (savingsProduct2 = savingsProductData2.f86683a) == null || !x5d.b.m(savingsProduct2)) ? false : true;
                            boolean z11 = savingsAccountDetailsA.f86460a.i().f234843c != null;
                            boolean z12 = (savingsProductData == null || (savingsProduct = savingsProductData.f86683a) == null || !x5d.b.m(savingsProduct)) ? false : true;
                            boolean z29 = sVar.i().f234843c != null;
                            if (z12 && z29 && z6 && z11) {
                            }
                        }
                    }
                    if (zF || zL) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
