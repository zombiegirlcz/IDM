package rnd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.api.AnalyticsAccount;
import h6e.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ y v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Continuation continuation) {
        super(2, continuation);
        this.v = yVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.v, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (iVar.f224257a == null) {
            return zi0.c.i(zhm.f0.f322471a);
        }
        final AccountId.Joint accountId = l38.a.c((n38.a) iVar.c());
        AnalyticsAccount.Joint.All all2 = new AnalyticsAccount.Joint.All(accountId);
        y yVar = this.v;
        le3.f fVar = (le3.f) yVar.i;
        final int i = 0;
        vkm.y yVarY = cj9.c.y(nim.a.v(new t38.e(fVar.h(f.d.f149639a), 24, fVar.d.k(), new gsd.d(3, 4, null)), new Function1() { // from class: rnd.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                List subaccounts = (List) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(subaccounts, "subaccounts");
                        List list = subaccounts;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new AnalyticsAccount.Joint.Subaccount(accountId, ((Subaccount) it8.next()).getF88959a().f234881a));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(subaccounts, "pockets");
                        List list2 = subaccounts;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(new AnalyticsAccount.Joint.CurrencyPocket(accountId, ((io3.d) it9.next()).f163145a));
                        }
                        return arrayList2;
                    default:
                        Intrinsics.checkNotNullParameter(subaccounts, "savingsAccounts");
                        aim.e eVarB = zhm.u.b();
                        Iterator it10 = subaccounts.iterator();
                        while (true) {
                            boolean zHasNext = it10.hasNext();
                            AccountId.Joint joint = accountId;
                            if (!zHasNext) {
                                if (!subaccounts.isEmpty()) {
                                    eVarB.add(new AnalyticsAccount.Savings.JointAll(joint));
                                }
                                return zhm.u.a(eVarB);
                            }
                            eVarB.add(new AnalyticsAccount.Savings.JointIndividual(joint, ((SavingsAccountDetails) ((npg.a) it10.next()).f218206b).f86460a.f234881a));
                        }
                        break;
                }
            }
        }));
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        final int i2 = 1;
        vkm.y yVarY2 = cj9.c.y(nim.a.v(fVar.f(io3.l.CURRENT, io3.i.INTERNAL, accountId), new Function1() { // from class: rnd.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                List subaccounts = (List) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(subaccounts, "subaccounts");
                        List list = subaccounts;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new AnalyticsAccount.Joint.Subaccount(accountId, ((Subaccount) it8.next()).getF88959a().f234881a));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(subaccounts, "pockets");
                        List list2 = subaccounts;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(new AnalyticsAccount.Joint.CurrencyPocket(accountId, ((io3.d) it9.next()).f163145a));
                        }
                        return arrayList2;
                    default:
                        Intrinsics.checkNotNullParameter(subaccounts, "savingsAccounts");
                        aim.e eVarB = zhm.u.b();
                        Iterator it10 = subaccounts.iterator();
                        while (true) {
                            boolean zHasNext = it10.hasNext();
                            AccountId.Joint joint = accountId;
                            if (!zHasNext) {
                                if (!subaccounts.isEmpty()) {
                                    eVarB.add(new AnalyticsAccount.Savings.JointAll(joint));
                                }
                                return zhm.u.a(eVarB);
                            }
                            eVarB.add(new AnalyticsAccount.Savings.JointIndividual(joint, ((SavingsAccountDetails) ((npg.a) it10.next()).f218206b).f86460a.f234881a));
                        }
                        break;
                }
            }
        }));
        v0 v0Var = yVar.f;
        final int i3 = 2;
        return nim.a.v(zh9.u0.i(yVarY, yVarY2, cj9.c.y(nim.a.v(xam.a.h(new o0(v0Var, null), toh.d.g(v0Var.f255640a, null, 3)), new Function1() { // from class: rnd.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                List subaccounts = (List) obj3;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(subaccounts, "subaccounts");
                        List list = subaccounts;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        Iterator it8 = list.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(new AnalyticsAccount.Joint.Subaccount(accountId, ((Subaccount) it8.next()).getF88959a().f234881a));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(subaccounts, "pockets");
                        List list2 = subaccounts;
                        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            arrayList2.add(new AnalyticsAccount.Joint.CurrencyPocket(accountId, ((io3.d) it9.next()).f163145a));
                        }
                        return arrayList2;
                    default:
                        Intrinsics.checkNotNullParameter(subaccounts, "savingsAccounts");
                        aim.e eVarB = zhm.u.b();
                        Iterator it10 = subaccounts.iterator();
                        while (true) {
                            boolean zHasNext = it10.hasNext();
                            AccountId.Joint joint = accountId;
                            if (!zHasNext) {
                                if (!subaccounts.isEmpty()) {
                                    eVarB.add(new AnalyticsAccount.Savings.JointAll(joint));
                                }
                                return zhm.u.a(eVarB);
                            }
                            eVarB.add(new AnalyticsAccount.Savings.JointIndividual(joint, ((SavingsAccountDetails) ((npg.a) it10.next()).f218206b).f86460a.f234881a));
                        }
                        break;
                }
            }
        }))), new rlh.d0(all2, 9));
    }
}
