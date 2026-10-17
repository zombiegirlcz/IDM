package xnd;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.api.AnalyticsAccount;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.c2;
import vkm.d2;
import vkm.t1;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pzi.a f307392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f307393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f307394c;

    public f(pzi.a budgetOverviewInteractor, wsg.n walletInteractor, s analyticsWidgetCacheProvider) {
        Intrinsics.checkNotNullParameter(budgetOverviewInteractor, "budgetOverviewInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(analyticsWidgetCacheProvider, "analyticsWidgetCacheProvider");
        this.f307392a = budgetOverviewInteractor;
        this.f307393b = walletInteractor;
        this.f307394c = analyticsWidgetCacheProvider;
    }

    public final Flow a(AnalyticsAccountsSelection accountsSelection) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        aim.e eVarB = zhm.u.b();
        Set f99208a = accountsSelection.getF99208a();
        if (!(f99208a instanceof Collection) || !f99208a.isEmpty()) {
            Iterator it8 = f99208a.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((AnalyticsAccount) it8.next()) instanceof AnalyticsAccount.Personal) {
                    eVarB.add(AccountId.Personal.f51414a);
                    break;
                }
            }
        }
        Set f99208a2 = accountsSelection.getF99208a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : f99208a2) {
            if (obj2 instanceof AnalyticsAccount.Joint) {
                arrayList.add(obj2);
            }
        }
        AnalyticsAccount.Joint joint = (AnalyticsAccount.Joint) zhm.d0.d0(arrayList);
        if (joint != null) {
            eVarB.add(joint.getF99182a());
        }
        Set setI1 = zhm.d0.i1(zhm.u.a(eVarB));
        if (setI1.isEmpty()) {
            flowV = new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2);
        } else {
            Set<AccountId> set = setI1;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(set, 10));
            for (AccountId accountId : set) {
                o oVar = new o(accountId);
                s sVar = this.f307394c;
                ConcurrentHashMap concurrentHashMap = sVar.f307446b;
                Object obj3 = concurrentHashMap.get(oVar);
                if (obj3 == null) {
                    vkm.y yVar = new vkm.y(new wda.l(2, 10, null), nim.a.A(nim.a.v(zh9.u0.m(rd0.e.e(new wvl.b(rd0.e.b(((grj.f) this.f307392a).a(accountId)), 29), zhm.h0.f322473a, new v77.c(3, 11, null)), rd0.e.b(this.f307393b.J(accountId, w4l.h.f294642c))), new atg.q(accountId, 7)), new xlj.h(16)));
                    zkm.d dVar = sVar.f307445a;
                    d2.Companion.getClass();
                    t1 t1VarM = vkm.q.M(yVar, dVar, c2.f290009c, 1);
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(oVar, t1VarM);
                    obj3 = objPutIfAbsent == null ? t1VarM : objPutIfAbsent;
                }
                arrayList2.add((Flow) obj3);
            }
            flowV = nim.a.v(zh9.u0.k(arrayList2), new xlj.h(15));
        }
        return vkm.q.q(flowV);
    }
}
