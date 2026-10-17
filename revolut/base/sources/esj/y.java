package esj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.models.CategoryBudgetEditingInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f128992b;

    public /* synthetic */ y(c0 c0Var, int i) {
        this.f128991a = i;
        this.f128992b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        long j2;
        Throwable th10;
        int i;
        int i2;
        dj0.d dVar;
        dj0.d dVar2;
        int i3;
        switch (this.f128991a) {
            case 0:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                uzi.b budgetingCycle = (uzi.b) kVar.f288454a;
                List budgets = (List) kVar.f288455b;
                Map lastSpendingsCategories = (Map) kVar.f288456c;
                asj.r sharedState = (asj.r) kVar.d;
                xi0.b baseCurrency = (xi0.b) kVar.e;
                c0 c0Var = this.f128992b;
                a aVar = c0Var.v;
                Intrinsics.h(budgets);
                aVar.getClass();
                String str = a.f128954a;
                Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
                Intrinsics.checkNotNullParameter(budgets, "budgets");
                Intrinsics.checkNotNullParameter(lastSpendingsCategories, "lastSpendingsCategories");
                Intrinsics.checkNotNullParameter(sharedState, "sharedState");
                Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
                List<qzi.a> list = budgets;
                int iB = q0.b(zhm.w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (qzi.a aVar2 : list) {
                    linkedHashMap.put(aVar2.d, Long.valueOf(aVar2.f250648c.f115082a));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it8 = linkedHashMap.entrySet().iterator();
                while (true) {
                    long j3 = 0;
                    if (!it8.hasNext()) {
                        asj.f fVar = sharedState.f8948a;
                        if (fVar instanceof asj.d) {
                            List list2 = ((asj.d) fVar).f8936a;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                j2 = 0;
                                i2 = 0;
                                th10 = null;
                            } else {
                                Iterator it9 = list2.iterator();
                                i = 0;
                                while (it9.hasNext()) {
                                    long j5 = j3;
                                    if (((CategoryBudgetEditingInfo) it9.next()).f101549c.f(dj0.d.e) && (i = i + 1) < 0) {
                                        zhm.v.r();
                                        throw null;
                                    }
                                    j3 = j5;
                                }
                                j2 = j3;
                                th10 = null;
                                i2 = i;
                            }
                        } else {
                            j2 = 0;
                            th10 = null;
                            if (!(fVar instanceof asj.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                if (!Intrinsics.f((String) entry.getKey(), str)) {
                                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (linkedHashMap3.isEmpty()) {
                                i2 = 0;
                            } else {
                                Iterator it10 = linkedHashMap3.entrySet().iterator();
                                i = 0;
                                while (it10.hasNext()) {
                                    if (((Number) ((Map.Entry) it10.next()).getValue()).longValue() != 0) {
                                        i++;
                                    }
                                }
                                i2 = i;
                            }
                        }
                        asj.f fVar2 = sharedState.f8948a;
                        if (fVar2 instanceof asj.d) {
                            List list3 = ((asj.d) fVar2).f8936a;
                            dj0.d.Companion.getClass();
                            dj0.d dVarO = dj0.d.e;
                            int i5 = 0;
                            for (Object obj3 : list3) {
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    zhm.v.s();
                                    throw th10;
                                }
                                dVarO = i5 == 0 ? ((CategoryBudgetEditingInfo) obj3).f101549c : pyd.c.O(dVarO, ((CategoryBudgetEditingInfo) obj3).f101549c);
                                i5 = i6;
                            }
                            dVar = dVarO;
                        } else {
                            if (!(fVar2 instanceof asj.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj4 : list) {
                                if (!Intrinsics.f(((qzi.a) obj4).d, str)) {
                                    arrayList.add(obj4);
                                }
                            }
                            dj0.d.Companion.getClass();
                            dj0.d dVarO2 = dj0.d.e;
                            int i21 = 0;
                            for (Object obj5 : arrayList) {
                                int i22 = i21 + 1;
                                if (i21 < 0) {
                                    zhm.v.s();
                                    throw th10;
                                }
                                dVarO2 = i21 == 0 ? ((qzi.a) obj5).f250648c : pyd.c.O(dVarO2, ((qzi.a) obj5).f250648c);
                                i21 = i22;
                            }
                            dVar = dVarO2;
                        }
                        Long l2 = (Long) linkedHashMap2.get(str);
                        dj0.d dVar3 = new dj0.d(l2 != null ? l2.longValue() : j2, baseCurrency);
                        Long l3 = (Long) lastSpendingsCategories.get(str);
                        dj0.d dVar4 = new dj0.d(l3 != null ? l3.longValue() : j2, baseCurrency);
                        asj.i iVar = sharedState.f8949b;
                        if (iVar instanceof asj.g) {
                            dVar2 = ((asj.g) iVar).f8938a;
                        } else {
                            if (!(iVar instanceof asj.h)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dVar2 = dVar3;
                        }
                        asj.c cVar = sharedState.f8950c;
                        if (cVar instanceof asj.a) {
                            budgetingCycle = ((asj.a) cVar).f8934a;
                        } else if (!(cVar instanceof asj.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return new o(new Data(new w(budgetingCycle, i2, dVar, dVar3, dVar4, dVar2), null, false, 6, null), ((o) c0Var.t2()).f128977a.getContent() == null);
                    }
                    Map.Entry entry2 = (Map.Entry) it8.next();
                    if (((Number) entry2.getValue()).longValue() != 0) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                break;
            default:
                uzi.b cycle = (uzi.b) obj2;
                Intrinsics.checkNotNullParameter(cycle, "cycle");
                int i32 = a0.f128955a[cycle.f284679a.ordinal()];
                if (i32 == 1) {
                    i3 = 30;
                } else {
                    if (i32 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i3 = 7;
                }
                c0 c0Var2 = this.f128992b;
                mrj.a aVar3 = c0Var2.f128960r;
                DateTime dateTimeMinusDays = DateTime.now().minusDays(i3);
                Intrinsics.checkNotNullExpressionValue(dateTimeMinusDays, "minusDays(...)");
                DateTime dateTimeNow = DateTime.now();
                Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
                return ((mrj.c) aVar3).a(dateTimeMinusDays, dateTimeNow, c0Var2.z.f101563b).x();
        }
    }
}
