package lqd;

import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import dj0.d;
import h30.l;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import otd.f;
import pyd.c;
import xi0.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final double a(d dVar, d total) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(total, "total");
        if (total.k()) {
            return 0.0d;
        }
        double d = (dVar.f115082a / total.f115082a) * ((double) 100);
        if (d == 0.0d || d == 100.0d) {
            return d;
        }
        if (d < 1.0d) {
            return 1.0d;
        }
        if (d <= 99.0d || d >= 100.0d) {
            return d;
        }
        return 99.0d;
    }

    public static final qqd.a b(IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue, d dVar, List list) {
        SavingsProduct savingsProduct;
        Object next;
        d dVar2;
        d dVarB;
        d dVarB2;
        IncomeSorterDestinationInfo incomeSorterDestinationInfo = incomeSorterHomeContract$DestinationValue.f87825a;
        if (!(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Investment) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.JointPocket) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PersonalCurrencyPocket) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.RoboPortfolio) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.SubaccountPocket) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.PeerToPeerTransfer) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.BankTransfer) && !(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Crypto)) {
            if (!(incomeSorterDestinationInfo instanceof IncomeSorterDestinationInfo.Savings)) {
                throw new NoWhenBranchMatchedException();
            }
            SavingsAccountDetails savingsAccountDetails = ((IncomeSorterDestinationInfo.Savings) incomeSorterDestinationInfo).f87489a;
            SavingsProductData savingsProductData = savingsAccountDetails.f86462c;
            if (savingsProductData != null && (savingsProduct = savingsProductData.f86683a) != null) {
                Iterator it8 = savingsProduct.f86623l.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (next instanceof SavingsProduct.Limit.MaxCurrentBalanceLimit) {
                        break;
                    }
                }
                SavingsProduct.Limit.MaxCurrentBalanceLimit maxCurrentBalanceLimit = (SavingsProduct.Limit.MaxCurrentBalanceLimit) next;
                if (maxCurrentBalanceLimit != null && (dVar2 = maxCurrentBalanceLimit.f86655a) != null && (dVarB = f.b(dVar2, list, dVar.f115083b)) != null && (dVarB2 = f.b(savingsAccountDetails.f86460a.c(), list, dVar.f115083b)) != null) {
                    return new qqd.a(dVarB, c.O(dVarB2, dVar));
                }
            }
        }
        return null;
    }

    public static final boolean c(IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue) {
        Intrinsics.checkNotNullParameter(incomeSorterHomeContract$DestinationValue, "<this>");
        return incomeSorterHomeContract$DestinationValue.f87825a.getE() == zld.a.PENDING;
    }

    public static final boolean d(String currencyCode, b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        return l.D(b.Companion, currencyCode);
    }
}
