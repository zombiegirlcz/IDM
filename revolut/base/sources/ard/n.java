package ard;

import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionContract$SelectionMode;
import com.revolut.feature.spending_analytics.impl.ui.rev10.select.SelectTransactionController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.a3;
import vkm.j2;
import zhm.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SelectTransactionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(SelectTransactionController selectTransactionController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = selectTransactionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.v, continuation, 0);
            case 1:
                return new n(this.v, continuation, 1);
            default:
                return new n(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        List list2;
        int i = this.u;
        SelectTransactionController selectTransactionController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar2 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) selectTransactionController.d();
                lk0.g gVar = aVar2.D;
                lk0.e eVar = (gVar == null || (list = gVar.f196174a) == null) ? null : (lk0.e) zhm.d0.d0(list);
                if ((eVar != null ? eVar.e : null) == null) {
                    aVar2.l2(new w(aVar2, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar4 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) selectTransactionController.d();
                a aVar5 = (a) ((j2) aVar4.f87897x.f22677a).getValue();
                SelectTransactionContract$SelectionMode selectTransactionContract$SelectionMode = aVar4.o.f87884c;
                if (selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Single) {
                    a3 a3Var = (a3) zhm.d0.c0(aVar5.f8634b);
                    if (a3Var != null) {
                        aVar4.C2(new g(a3Var));
                    }
                } else {
                    if (!(selectTransactionContract$SelectionMode instanceof SelectTransactionContract$SelectionMode.Multiple)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Map map = aVar4.A;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (!((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set setKeySet = linkedHashMap.keySet();
                    Map map2 = aVar4.A;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry2 : map2.entrySet()) {
                        if (((Boolean) entry2.getValue()).booleanValue()) {
                            linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    LinkedHashSet linkedHashSetL = a1.l(a1.k(aVar4.M2(aVar5.e) ? aVar4.B : zhm.h0.f322473a, setKeySet), linkedHashMap2.keySet());
                    Set set = aVar4.B;
                    Set setK = a1.k(linkedHashSetL, set);
                    ArrayList arrayList = new ArrayList(zhm.w.t(setK, 10));
                    Iterator it8 = setK.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(new j((String) it8.next(), i.SELECTED));
                    }
                    Set setK2 = a1.k(set, linkedHashSetL);
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(setK2, 10));
                    Iterator it9 = setK2.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(new j((String) it9.next(), i.DESELECTED));
                    }
                    ArrayList arrayListE0 = zhm.d0.E0(arrayList2, arrayList);
                    aVar4.C2(aVar5.d ? new c(arrayListE0) : linkedHashSetL.isEmpty() ? new d(arrayListE0) : new e(arrayListE0));
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.select.a aVar7 = (com.revolut.feature.spending_analytics.impl.ui.rev10.select.a) selectTransactionController.d();
                lk0.g gVar2 = aVar7.D;
                lk0.e eVar2 = (gVar2 == null || (list2 = gVar2.f196174a) == null) ? null : (lk0.e) zhm.d0.o0(list2);
                if ((eVar2 != null ? eVar2.e : null) == null) {
                    aVar7.l2(new v(aVar7, null), new yi5.b(26));
                }
                return Unit.f186387a;
        }
    }
}
