package rm2;

import com.revolut.core.ui_kit.delegates.BackgroundSelectionDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$State;
import com.revolut.feature.pricingplans.models.family.FamilyPlanState;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import ip0.o2;
import ip0.pb0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.hc;
import tof.m3;
import tof.r2;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f255200a;

    public /* synthetic */ s(int i) {
        this.f255200a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        z3l.a aVar;
        List list;
        z3l.a aVar2;
        List list2;
        Object next;
        int i = this.f255200a;
        od0.i iVar = od0.i.f224256b;
        switch (i) {
            case 0:
                h update = (h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return h.a(update, null, null, false, em2.b.UPLOADED, 23);
            case 1:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayListP.add(new BackgroundSelectionDelegate.Model(a0.d.n("loading_stub_", i2), ShimmerImage.f60002a, false, o2.GRID, false, null, null, null, 8176));
                }
                return arrayListP;
            case 2:
                UpiTransferFlowContract$State update2 = (UpiTransferFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return UpiTransferFlowContract$State.a(update2, false, null, 2);
            case 3:
                UpiTransferFlowContract$State update3 = (UpiTransferFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return UpiTransferFlowContract$State.a(update3, true, null, 2);
            case 4:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ArrayList arrayList = new ArrayList(3);
                for (int i3 = 0; i3 < 3; i3++) {
                    arrayList.add(new pb0(a0.d.n("LOADING_STATE_ID", i3)));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new rmb.e(arrayList, null, false);
            case 5:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                pb0 pb0Var = new pb0("FIXED_TERM_RATE_UPGRADE_LOADING_ID");
                int i5 = R$attr.uikit_dp16;
                yp0.b.r(pb0Var, 0, 0, i5, i5, 3);
                return zhm.u.c(pb0Var);
            case 6:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                od0.i.Companion.getClass();
                return iVar;
            case 7:
                a3 it10 = (a3) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ibd.i iVar2 = it10.C;
                return Boolean.valueOf(iVar2 != null && ofm.q.t(iVar2));
            case 8:
                a3 it11 = (a3) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.valueOf(k71.k.P(it11));
            case 9:
                a3 it12 = (a3) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                ibd.i iVar3 = it12.C;
                return Boolean.valueOf(iVar3 != null && ofm.q.t(iVar3));
            case 10:
                a3 observeTransactionProperty = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty, "$this$observeTransactionProperty");
                return observeTransactionProperty.H1;
            case 11:
                Object f51903b = ((qv0.p) obj2).getF53564b();
                if (f51903b instanceof rmh.i) {
                    return (rmh.i) f51903b;
                }
                return null;
            case 12:
                Function0 it13 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return f0.f322471a;
            case 13:
                Throwable it14 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.TRUE;
            case 14:
                FamilyPlanState familyPlanState = (FamilyPlanState) obj2;
                Intrinsics.checkNotNullParameter(familyPlanState, "familyPlanState");
                if (familyPlanState instanceof FamilyPlanState.FamilyPlan) {
                    od0.h hVar = od0.i.Companion;
                    Boolean boolValueOf = Boolean.valueOf(((FamilyPlanState.FamilyPlan) familyPlanState).f81189a.f195207h);
                    hVar.getClass();
                    return od0.h.a(boolValueOf);
                }
                if (!(familyPlanState instanceof FamilyPlanState.PendingInvite) && !Intrinsics.f(familyPlanState, FamilyPlanState.Empty.f81188a)) {
                    throw new NoWhenBranchMatchedException();
                }
                od0.i.Companion.getClass();
                return iVar;
            case 15:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 16:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return iii.c.c(5);
            case 17:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new pb0("THEME_SWITCHER_ID");
            case 18:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                List list3 = it18;
                int iB = q0.b(zhm.w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list3) {
                    linkedHashMap.put(((lab.a) obj3).f193357a, obj3);
                }
                return linkedHashMap;
            case 19:
                List it19 = (List) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it19);
            case 20:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, it20, h0Var2);
                od0.i.Companion.getClass();
                return iVar;
            case 21:
                List it21 = (List) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return (SavingsAccountDetails) d0.b0(it21);
            case 22:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new djb.a((djb.j) rVar.f314202b, (djb.t) rVar.f314201a, (hzi.g) rVar.f314203c);
            case 23:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new djb.a((djb.j) pair.f186386b, (djb.t) pair.f186385a, hzi.f.f157194a);
            case 24:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj4 : transactions) {
                    LocalDate localDateI = oc.c.I(((a3) obj4).f272593h.getMillis());
                    Object objU = linkedHashMap2.get(localDateI);
                    if (objU == null) {
                        objU = h30.l.u(linkedHashMap2, localDateI);
                    }
                    ((List) objU).add(obj4);
                }
                return linkedHashMap2;
            case 25:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list4 = (List) pair2.f186385a;
                List list5 = (List) pair2.f186386b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it22 = list5.iterator();
                while (it22.hasNext()) {
                    m3 m3Var = ((a3) it22.next()).f272589e1;
                    if (m3Var != null && (aVar2 = m3Var.f272930b) != null && (list2 = aVar2.f319298a) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it23 = list2.iterator();
                        while (it23.hasNext()) {
                            String str = ((z3l.b) it23.next()).f319300a;
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        linkedHashSet.addAll(arrayList2);
                    }
                }
                Iterator it24 = list4.iterator();
                while (it24.hasNext()) {
                    m3 m3Var2 = ((a3) it24.next()).f272589e1;
                    if (m3Var2 != null && (aVar = m3Var2.f272930b) != null && (list = aVar.f319298a) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it25 = list.iterator();
                        while (it25.hasNext()) {
                            String str2 = ((z3l.b) it25.next()).f319300a;
                            if (str2 != null) {
                                arrayList3.add(str2);
                            }
                        }
                        linkedHashSet2.addAll(arrayList3);
                    }
                }
                if (linkedHashSet.isEmpty()) {
                    z = false;
                } else {
                    Iterator it26 = linkedHashSet.iterator();
                    while (it26.hasNext()) {
                        if (linkedHashSet2.contains((String) it26.next())) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                fo3.c it27 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return new hc(it27.f136801a, null);
            case 27:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return zhm.v.k(r2.f273022a, new hc(((fo3.c) pair3.f186385a).f136801a, null));
            case 28:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                List list6 = tradingAccounts.f105278a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : list6) {
                    if (Intrinsics.f(((TradingAccount) obj5).W(), TradingAccountType.MoneyMarketFunds.f105272a)) {
                        arrayList4.add(obj5);
                    }
                }
                Iterator it28 = arrayList4.iterator();
                while (true) {
                    if (it28.hasNext()) {
                        next = it28.next();
                        if (((TradingAccount) next).getD() != cfl.b.TERMINATED) {
                        }
                    } else {
                        next = null;
                    }
                }
                TradingAccount tradingAccount = (TradingAccount) next;
                cfl.b d = tradingAccount != null ? tradingAccount.getD() : null;
                TradingAccount tradingAccount2 = (TradingAccount) d0.d0(arrayList4);
                cfl.b d5 = tradingAccount2 != null ? tradingAccount2.getD() : null;
                od0.h hVar2 = od0.i.Companion;
                if (d == null) {
                    d = d5;
                }
                hVar2.getClass();
                return od0.h.a(d);
            default:
                List subaccounts = (List) obj2;
                Intrinsics.checkNotNullParameter(subaccounts, "subaccounts");
                List list7 = subaccounts;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list7, 10));
                Iterator it29 = list7.iterator();
                while (it29.hasNext()) {
                    arrayList5.add(new AnalyticsAccount.Personal.Subaccount(((Subaccount) it29.next()).getF88959a().f234881a));
                }
                return arrayList5;
        }
    }

    public /* synthetic */ s(cli.n nVar, int i) {
        this.f255200a = i;
    }
}
