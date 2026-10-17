package ybl;

import cfl.v;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f312388b;

    public h(List createdAccountsSupportingGroup, List availableToOnboardAccountsSupportingGroup) {
        Intrinsics.checkNotNullParameter(createdAccountsSupportingGroup, "createdAccountsSupportingGroup");
        Intrinsics.checkNotNullParameter(availableToOnboardAccountsSupportingGroup, "availableToOnboardAccountsSupportingGroup");
        this.f312387a = createdAccountsSupportingGroup;
        this.f312388b = availableToOnboardAccountsSupportingGroup;
    }

    public static ArrayList b(List list, Set set, Set set2) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next2 = it8.next();
            TradingProductCode tradingProductCode = (TradingProductCode) next2;
            Set set3 = set2;
            Iterator it9 = list.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    next = null;
                    break;
                }
                next = it9.next();
                if (Intrinsics.f(((TradingProduct) next).f105281b, tradingProductCode)) {
                    break;
                }
            }
            TradingProduct tradingProduct = (TradingProduct) next;
            if (d0.T(set3, tradingProduct != null ? tradingProduct.f105282c : null)) {
                arrayList.add(next2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final boolean a(Set productCodes, String portfolioId, Function1 predicate) {
        Object next;
        Object next2;
        v vVar;
        Intrinsics.checkNotNullParameter(productCodes, "productCodes");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!productCodes.isEmpty()) {
            Iterator it8 = this.f312387a.iterator();
            loop0: while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                List listJ = ((TradingAccount) next).J();
                if (!(listJ instanceof Collection) || !listJ.isEmpty()) {
                    Iterator it9 = listJ.iterator();
                    while (it9.hasNext()) {
                        if (Intrinsics.f(((TradingAccount.Portfolio) it9.next()).f105210a.toString(), portfolioId)) {
                            break loop0;
                        }
                    }
                }
            }
            TradingAccount tradingAccount = (TradingAccount) next;
            if (tradingAccount != null) {
                Set<TradingProductCode> set = productCodes;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                for (TradingProductCode tradingProductCode : set) {
                    Iterator it10 = tradingAccount.c0().iterator();
                    while (true) {
                        if (!it10.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it10.next();
                        if (Intrinsics.f(((TradingProduct) next2).f105281b, tradingProductCode)) {
                            break;
                        }
                    }
                    TradingProduct tradingProduct = (TradingProduct) next2;
                    if (!((tradingProduct == null || (vVar = tradingProduct.f105282c) == null) ? false : ((Boolean) predicate.invoke(vVar)).booleanValue())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Set c(Set productCodes, TradingAccountType accountType, Set requiredProductStates) {
        ArrayList arrayList;
        ArrayList arrayListB;
        Intrinsics.checkNotNullParameter(productCodes, "productCodes");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(requiredProductStates, "requiredProductStates");
        if (productCodes.isEmpty()) {
            return h0.f322473a;
        }
        Iterator it8 = this.f312387a.iterator();
        while (true) {
            arrayList = null;
            if (!it8.hasNext()) {
                arrayListB = null;
                break;
            }
            TradingAccount tradingAccount = (TradingAccount) it8.next();
            arrayListB = Intrinsics.f(tradingAccount.W(), accountType) ? b(tradingAccount.c0(), productCodes, requiredProductStates) : null;
            if (arrayListB != null) {
                break;
            }
        }
        if (arrayListB != null && !arrayListB.isEmpty()) {
            return d0.i1(arrayListB);
        }
        Iterator it9 = this.f312388b.iterator();
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) it9.next();
            ArrayList arrayListB2 = Intrinsics.f(tradingAccountAvailableToOnboard.d, accountType) ? b(tradingAccountAvailableToOnboard.f, productCodes, requiredProductStates) : null;
            if (arrayListB2 != null) {
                arrayList = arrayListB2;
                break;
            }
        }
        return (arrayList == null || arrayList.isEmpty()) ? h0.f322473a : d0.i1(arrayList);
    }

    public final boolean d(TradingAccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        List list = this.f312387a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (Intrinsics.f(((TradingAccount) it8.next()).W(), accountType)) {
                    return true;
                }
            }
        }
        List list2 = this.f312388b;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            if (Intrinsics.f(((TradingAccountAvailableToOnboard) it9.next()).d, accountType)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f312387a, hVar.f312387a) && Intrinsics.f(this.f312388b, hVar.f312388b);
    }

    public final int hashCode() {
        return this.f312388b.hashCode() + (this.f312387a.hashCode() * 31);
    }
}
