package csj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.set_category_budgets.SetCategoryBudgetsScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import tof.i3;
import zhm.d0;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f108494b;

    public /* synthetic */ p(u uVar, int i) {
        this.f108493a = i;
        this.f108494b = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LinkedHashMap linkedHashMap;
        uzi.b bVar;
        dj0.d dVarX;
        Object next;
        int i;
        int i2 = this.f108493a;
        u uVar = this.f108494b;
        switch (i2) {
            case 0:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                List transactionCategories = (List) kVar.f288454a;
                uzi.b budgetingCycle = (uzi.b) kVar.f288455b;
                Map spentAmounts = (Map) kVar.f288456c;
                List budgets = (List) kVar.d;
                asj.r sharedState = (asj.r) kVar.e;
                r10.w wVar = uVar.v;
                g gVar = (g) ((i) uVar.t2()).f108482a.getContent();
                Intrinsics.h(budgets);
                dj0.d dVar = ((SetCategoryBudgetsScreenContract$InputData) wVar.f250865a).f101555a;
                Intrinsics.checkNotNullParameter(transactionCategories, "transactionCategories");
                Intrinsics.checkNotNullParameter(budgets, "budgets");
                Intrinsics.checkNotNullParameter(spentAmounts, "spentAmounts");
                Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                Intrinsics.checkNotNullParameter(sharedState, "sharedState");
                List list = gVar != null ? gVar.f108480b : null;
                List<qzi.a> list2 = budgets;
                int iB = q0.b(zhm.w.t(list2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                for (qzi.a aVar : list2) {
                    linkedHashMap2.put(aVar.d, Long.valueOf(aVar.f250648c.f115082a));
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    if (((Number) entry.getValue()).longValue() != 0) {
                        linkedHashMap3.put(entry.getKey(), entry.getValue());
                    }
                }
                if (list != null) {
                    List<CategoryBudgetEditingInfo> list3 = list;
                    int iB2 = q0.b(zhm.w.t(list3, 10));
                    linkedHashMap = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                    for (CategoryBudgetEditingInfo categoryBudgetEditingInfo : list3) {
                        linkedHashMap.put(v13.d.t(categoryBudgetEditingInfo.f101547a), Long.valueOf(categoryBudgetEditingInfo.f101549c.f115082a));
                    }
                } else {
                    linkedHashMap = linkedHashMap3;
                }
                List list4 = transactionCategories;
                ArrayList arrayList = new ArrayList(zhm.w.t(list4, 10));
                Iterator it8 = list4.iterator();
                while (it8.hasNext()) {
                    i3 i3Var = (i3) it8.next();
                    String strT = v13.d.t(i3Var);
                    Long l2 = (Long) linkedHashMap3.get(strT);
                    xi0.b bVar2 = dVar.f115083b;
                    dj0.d dVarX2 = r10.w.x(l2, bVar2);
                    Iterator it9 = it8;
                    asj.f fVar = sharedState.f8948a;
                    uzi.b bVar3 = budgetingCycle;
                    if (fVar instanceof asj.d) {
                        Iterator it10 = ((asj.d) fVar).f8936a.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                next = it10.next();
                                Iterator it11 = it10;
                                if (!Intrinsics.f(v13.d.t(((CategoryBudgetEditingInfo) next).f101547a), strT)) {
                                    it10 = it11;
                                }
                            } else {
                                next = null;
                            }
                        }
                        CategoryBudgetEditingInfo categoryBudgetEditingInfo2 = (CategoryBudgetEditingInfo) next;
                        if (categoryBudgetEditingInfo2 == null || (dVarX = categoryBudgetEditingInfo2.f101549c) == null) {
                            dVarX = r10.w.x((Long) linkedHashMap.get(strT), bVar2);
                        }
                    } else {
                        if (!(fVar instanceof asj.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        dVarX = r10.w.x((Long) linkedHashMap.get(strT), bVar2);
                    }
                    arrayList.add(new CategoryBudgetEditingInfo(i3Var, dVarX2, dVarX, r10.w.x((Long) spentAmounts.get(strT), bVar2)));
                    it8 = it9;
                    budgetingCycle = bVar3;
                }
                uzi.b bVar4 = budgetingCycle;
                List listP0 = d0.P0(arrayList, cim.b.a(new cs.a(3), new cs.a(4), new cp7.k(wVar, 17)));
                asj.i iVar = sharedState.f8949b;
                if (iVar instanceof asj.g) {
                    dVar = ((asj.g) iVar).f8938a;
                } else if (!(iVar instanceof asj.h)) {
                    throw new NoWhenBranchMatchedException();
                }
                asj.c cVar = sharedState.f8950c;
                if (cVar instanceof asj.a) {
                    bVar = ((asj.a) cVar).f8934a;
                } else {
                    if (!(cVar instanceof asj.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = bVar4;
                }
                return new i(new Data(new g(dVar, listP0, bVar), null, false, 6, null));
            default:
                uzi.b analyticsCycle = (uzi.b) obj2;
                Intrinsics.checkNotNullParameter(analyticsCycle, "analyticsCycle");
                int i3 = r.f108495a[analyticsCycle.f284679a.ordinal()];
                if (i3 == 1) {
                    i = 30;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 7;
                }
                mrj.a aVar2 = uVar.f108502t;
                DateTime dateTimeMinusDays = DateTime.now().minusDays(i);
                Intrinsics.checkNotNullExpressionValue(dateTimeMinusDays, "minusDays(...)");
                DateTime dateTimeNow = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
                return ((mrj.c) aVar2).a(dateTimeMinusDays, dateTimeNow, uVar.z.f101557c).x();
        }
    }
}
