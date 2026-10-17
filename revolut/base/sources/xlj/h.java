package xlj;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_core.models.configuration.Links;
import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreen;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.spending_analytics.impl.ui.budget.models.InsufficientCompletedIntervalsException;
import com.revolut.feature.subaccount.api.models.Subaccount;
import do3.n;
import do3.q;
import hha.s;
import hha.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import xmc.o;
import xnd.m0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zmc.l;
import zmc.m;
import zod.r0;
import zod.w;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f307027a;

    public /* synthetic */ h(int i) {
        this.f307027a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        w wVar;
        qzi.i iVar;
        int i = this.f307027a;
        od0.i iVar2 = od0.i.f224256b;
        switch (i) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return d0.E0(i.a("loadingItem3"), d0.E0(i.a("loadingItem2"), i.a("loadingItem1")));
            case 1:
                List plans = (List) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                List<hha.d> list = plans;
                if ((list instanceof Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    for (hha.d dVar : list) {
                        u.Companion.getClass();
                        if (s.h(dVar, u.z)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 3:
                Data data = (Data) obj2;
                Throwable error = data.getError();
                if (error != null && data.getContent() == null && !data.getLoading()) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "PlanDashboardFeatureListProviderImpl", null, error, h0Var);
                }
                return Unit.f186387a;
            case 4:
                InputChecklistDelegate.Model it10 = (InputChecklistDelegate.Model) obj2;
                KProperty[] kPropertyArr = AgreementsScreen.f85128b0;
                Intrinsics.checkNotNullParameter(it10, "it");
                Object obj3 = it10.i;
                if (obj3 instanceof m) {
                    return (m) obj3;
                }
                return null;
            case 5:
                ty0.a it11 = (ty0.a) obj2;
                KProperty[] kPropertyArr2 = AgreementsScreen.f85128b0;
                Intrinsics.checkNotNullParameter(it11, "it");
                Object obj4 = it11.d;
                if (obj4 instanceof l) {
                    return (l) obj4;
                }
                return null;
            case 6:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return o.f307146a;
            case 7:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (error2 instanceof InsufficientCompletedIntervalsException) {
                    return xmd.h0.f307173a;
                }
                throw error2;
            case 8:
                SavingsProductData productData = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(productData, "productData");
                Intrinsics.checkNotNullParameter(productData, "<this>");
                return Boolean.valueOf(ocd.a.b(productData) && ocd.a.a(productData));
            case 9:
                n it13 = (n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return q.y(it13);
            case 10:
                rnd.g it14 = (rnd.g) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it14);
            case 11:
                Subaccount subaccount = (Subaccount) obj2;
                Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                return new rnd.f(subaccount);
            case 12:
                Subaccount subaccount2 = (Subaccount) obj2;
                Intrinsics.checkNotNullParameter(subaccount2, "subaccount");
                return new rnd.f(subaccount2);
            case 13:
                io3.d pocket = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(pocket, "pocket");
                xi0.a aVar = xi0.b.Companion;
                String str = pocket.f163147c;
                aVar.getClass();
                return new rnd.b(xi0.a.a(str));
            case 14:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                od0.i.Companion.getClass();
                return iVar2;
            case 15:
                List budgetings = (List) obj2;
                Intrinsics.checkNotNullParameter(budgetings, "budgetings");
                ArrayList arrayList = new ArrayList();
                Iterator it16 = budgetings.iterator();
                while (it16.hasNext()) {
                    ynd.i iVar3 = (ynd.i) ((od0.i) it16.next()).f224257a;
                    if (iVar3 != null) {
                        arrayList.add(iVar3);
                    }
                }
                return arrayList;
            case 16:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                od0.i.Companion.getClass();
                return iVar2;
            case 17:
                List budgetings2 = (List) obj2;
                Intrinsics.checkNotNullParameter(budgetings2, "budgetings");
                if (budgetings2.isEmpty()) {
                    return new go.g(f0.f322471a, 2);
                }
                List<ynd.i> list2 = budgetings2;
                ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
                for (ynd.i iVar4 : list2) {
                    if ((iVar4 != null ? iVar4.f315455a : null) != null) {
                        zod.e eVar = new zod.e(iVar4);
                        AccountId accountId = iVar4.f315456b;
                        if (accountId instanceof AccountId.Joint) {
                            iVar = qzi.i.Joint;
                        } else {
                            if (!accountId.equals(AccountId.Personal.f51414a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iVar = qzi.i.Personal;
                        }
                        wVar = new w(iVar4.f315455a, iVar, eVar);
                    } else {
                        wVar = null;
                    }
                    od0.i.Companion.getClass();
                    arrayList2.add(new go.g(od0.h.a(wVar), 2));
                }
                return new uf0.b((Flow[]) d0.d1(arrayList2).toArray(new Flow[0]), 15);
            case 18:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return d0.F0((r0) pair.f186386b, (List) pair.f186385a);
            case 19:
                n it18 = (n) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f116408a;
            case 20:
                SavingsAccountDetails it19 = (SavingsAccountDetails) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f86460a.f;
            case 21:
                uib.a config = (uib.a) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return config.f280366a;
            case 22:
                Throwable it20 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return uib.c.SAVINGS;
            case 23:
                Throwable it21 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                od0.i.Companion.getClass();
                return iVar2;
            case 24:
                ynd.h entry = (ynd.h) obj2;
                Intrinsics.checkNotNullParameter(entry, "entry");
                od0.i.Companion.getClass();
                return od0.h.a(entry);
            case 25:
                List<ynd.i> budgetings3 = (List) obj2;
                Intrinsics.checkNotNullParameter(budgetings3, "budgetings");
                od0.h hVar = od0.i.Companion;
                ArrayList arrayList3 = new ArrayList();
                for (ynd.i iVar5 : budgetings3) {
                    AccountId accountId2 = iVar5.f315456b;
                    if (iVar5.f315455a != null) {
                        accountId2 = null;
                    }
                    if (accountId2 != null) {
                        arrayList3.add(accountId2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList3 = null;
                }
                m0 m0Var = arrayList3 != null ? new m0(arrayList3) : null;
                hVar.getClass();
                return od0.h.a(m0Var);
            case 26:
                return xni.d.f307510a;
            case 27:
                return xni.c.f307509a;
            case 28:
                Links it22 = (Links) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                String str2 = it22.f76908c;
                if (str2 != null) {
                    return str2;
                }
                throw new IllegalStateException("Deposit terms are null for the US user");
            default:
                Data it23 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return new xo8.i((List) it23.getContent());
        }
    }

    public /* synthetic */ h(Object obj2, int i) {
        this.f307027a = i;
    }
}
