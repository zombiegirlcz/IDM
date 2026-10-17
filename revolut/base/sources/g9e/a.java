package g9e;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import efm.r;
import java.util.Set;
import k8d.s;
import kce.c;
import kce.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.h;
import pcd.l;
import qua.z;
import wsg.n;
import ypg.p;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static r a(a aVar, RecurringPaymentFilter recurringPaymentFilter, RecurringPaymentAccount recurringPaymentAccount, int i) {
        r map;
        h filter;
        boolean z = (i & 1) == 0;
        q qVar = (q) aVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        z zVarA = pce.a.a(recurringPaymentAccount);
        n nVar = qVar.d;
        boolean z3 = recurringPaymentAccount instanceof RecurringPaymentAccount.Joint;
        if (z3) {
            RecurringPaymentAccount.Joint joint = (RecurringPaymentAccount.Joint) recurringPaymentAccount;
            map = nVar.x(new AccountId.Joint(joint.f89316a, joint.f89317b)).x();
            Intrinsics.checkNotNullExpressionValue(map, "toObservable(...)");
        } else {
            boolean zEquals = recurringPaymentAccount.equals(RecurringPaymentAccount.Personal.f89320a);
            AccountId.Personal personal = AccountId.Personal.f51414a;
            if (zEquals) {
                map = nVar.x(personal).x();
                Intrinsics.checkNotNullExpressionValue(map, "toObservable(...)");
            } else if (recurringPaymentAccount instanceof RecurringPaymentAccount.Pro) {
                map = nVar.x(personal).x();
                Intrinsics.checkNotNullExpressionValue(map, "toObservable(...)");
            } else {
                if (!(recurringPaymentAccount instanceof RecurringPaymentAccount.Junior)) {
                    throw new NoWhenBranchMatchedException();
                }
                map = m70.a.g(nVar.a0(((RecurringPaymentAccount.Junior) recurringPaymentAccount).f89318a, false), null, new s(16), 1).map(new c(new kcd.a(3), 0));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            }
        }
        if ((recurringPaymentAccount instanceof RecurringPaymentAccount.Personal) || z3) {
            filter = new h(0);
        } else if (recurringPaymentAccount instanceof RecurringPaymentAccount.Junior) {
            filter = new h(new l(((RecurringPaymentAccount.Junior) recurringPaymentAccount).f89318a));
        } else {
            if (!(recurringPaymentAccount instanceof RecurringPaymentAccount.Pro)) {
                throw new NoWhenBranchMatchedException();
            }
            filter = new h(0);
        }
        Intrinsics.checkNotNullParameter(filter, "filter");
        return qVar.f(qVar.i(zVarA, z, null, recurringPaymentFilter, true, false), map, ((p) qVar.f).f(w4l.h.f294642c, filter));
    }

    static r b(a aVar, b9e.b bVar, RecurringPaymentFilter recurringPaymentFilter, Set accountId, int i) {
        AccountId accountId2;
        if ((i & 2) != 0) {
            bVar = null;
        }
        b9e.b bVar2 = bVar;
        boolean z = (i & 16) == 0;
        q qVar = (q) aVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        AccountId accountId3 = AccountId.Personal.f51414a;
        if (!accountId.contains(accountId3) && (accountId2 = (AccountId) d0.c0(accountId)) != null) {
            accountId3 = accountId2;
        }
        r rVarH = qVar.h(bVar2, recurringPaymentFilter, accountId, true, z);
        r rVarX = qVar.d.x(accountId3).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        h filter = new h(0);
        Intrinsics.checkNotNullParameter(filter, "filter");
        return qVar.f(rVarH, rVarX, ((p) qVar.f).f(w4l.h.f294642c, filter));
    }

    static r c(a aVar, b9e.b bVar, RecurringPaymentFilter.And and, z recurringPaymentWalletFilter, int i) {
        if ((i & 4) != 0) {
            and = null;
        }
        q qVar = (q) aVar;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(recurringPaymentWalletFilter, "recurringPaymentWalletFilter");
        return qVar.i(recurringPaymentWalletFilter, false, bVar, and, true, false);
    }

    static r d(a aVar, RecurringPaymentFilter recurringPaymentFilter, AccountId accountId, int i) {
        if ((i & 4) != 0) {
            recurringPaymentFilter = null;
        }
        RecurringPaymentFilter recurringPaymentFilter2 = recurringPaymentFilter;
        if ((i & 8) != 0) {
            accountId = AccountId.Personal.f51414a;
        }
        boolean z = (i & 16) != 0;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return ((q) aVar).h(null, recurringPaymentFilter2, y0.b(accountId), z, false);
    }
}
