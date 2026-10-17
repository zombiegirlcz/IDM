package ybl;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f312386a;

    public g(Map groupsToState) {
        Intrinsics.checkNotNullParameter(groupsToState, "groupsToState");
        this.f312386a = groupsToState;
    }

    public final boolean a(List groups) {
        Intrinsics.checkNotNullParameter(groups, "groups");
        TradingAccountType.Gia accountType = TradingAccountType.Gia.f105270a;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        List list = groups;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (c((cfl.p) it8.next(), accountType)) {
                return true;
            }
        }
        return false;
    }

    public final Set b(cfl.p group, Set productCodes, Set requiredProductStates) {
        Set setC;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(productCodes, "productCodes");
        TradingAccountType.Gia accountType = TradingAccountType.Gia.f105270a;
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(requiredProductStates, "requiredProductStates");
        h hVar = (h) this.f312386a.get(group);
        return (hVar == null || (setC = hVar.c(productCodes, accountType, requiredProductStates)) == null) ? h0.f322473a : setC;
    }

    public final boolean c(cfl.p group, TradingAccountType accountType) {
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        h hVar = (h) this.f312386a.get(group);
        if (hVar != null) {
            return hVar.d(accountType);
        }
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f312386a, ((g) obj2).f312386a);
    }

    public final int hashCode() {
        return this.f312386a.hashCode();
    }
}
