package rqd;

import com.google.gson.reflect.TypeToken;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import com.revolut.retail.feature.api.income_sorter.models.IncomeSorterExecution;
import iyg.b0;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.s9;
import yhm.o;
import zh9.u0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f256525w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256525w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f256525w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f256525w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((fo3.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.f256525w;
        switch (i) {
            case 0:
                fo3.c cVar = (fo3.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String walletId = cVar.f136801a;
                wzi.a aVar2 = gVar.f256526a;
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                jtj.k kVar = (jtj.k) ((etj.o) aVar2).f129439b;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(walletId, "walletId");
                vkm.d dVarB = kVar.f.b(walletId, w4l.i.f294643c);
                ue0.c cVar2 = kVar.f178518a;
                Type type = new TypeToken<List<? extends String>>() { // from class: com.revolut.retail.feature.impl.income_sorter.repository.IncomeSorterExecutionsRepositoryImpl$observePendingActionsExecutions$1
                }.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return xam.a.h(new f(gVar, null, 1), u0.m(nim.a.v(u0.m(dVarB, new b0(cVar2.C0("DISMISSED_EXECUTIONS_ACTIONS", type), 9)), new jtj.b(kVar, 0)), wzi.a.a(aVar2, walletId, null, hzi.b.ACTIVE, 2)));
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                List list3 = list2;
                int iB = q0.b(w.t(list3, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : list3) {
                    linkedHashMap.put(((IncomeSorter) obj3).f99160a, obj3);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    if (linkedHashMap.containsKey(((IncomeSorterExecution) obj4).f99239b)) {
                        arrayList.add(obj4);
                    }
                }
                if (arrayList.isEmpty()) {
                    return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((IncomeSorterExecution) it8.next()).d);
                }
                return nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(gVar.f256527b, new s9(d0.i1(arrayList2)), null, null, null, null, 30)), new e88.b(gVar, arrayList, list2));
        }
    }
}
