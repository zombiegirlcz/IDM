package q0c;

import cli.y;
import com.revolut.feature.rev_points.impl.ui.a;
import com.revolut.feature.rev_points.impl.ui.transactions.list.RevPointsTransactionsListScreenContract$InputData;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.e1;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.transactions.list.d f241247w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241247w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s sVar = new s(this.f241247w, continuation, 0);
                sVar.v = obj2;
                return sVar;
            case 1:
                s sVar2 = new s(this.f241247w, continuation, 1);
                sVar2.v = obj2;
                return sVar2;
            default:
                s sVar3 = new s(this.f241247w, continuation, 2);
                sVar3.v = obj2;
                return sVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((com.revolut.feature.rev_points.impl.ui.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        List list;
        boolean z;
        int i = this.u;
        com.revolut.feature.rev_points.impl.ui.transactions.list.d dVar = this.f241247w;
        switch (i) {
            case 0:
                y yVar = dVar.f83893w;
                com.revolut.feature.rev_points.impl.ui.a aVar = (com.revolut.feature.rev_points.impl.ui.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (aVar instanceof syb.b) {
                    lk0.h hVar = ((syb.b) aVar).f266646b;
                    if (hVar != null) {
                        dVar.f83895y.onNext(hVar);
                    }
                    dVar.H2(yVar, new q03.h(aVar, 6));
                } else {
                    if (!(aVar instanceof a.C0530a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    dVar.H2(yVar, new q09.a(11));
                }
                return Unit.f186387a;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lk0.g gVar = (lk0.g) pair.f186385a;
                k71.q qVar = (k71.q) pair.f186386b;
                List list2 = gVar.f196174a;
                if (!list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        a0.x(((lk0.e) it8.next()).f196171a, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(com.revolut.feature.rev_points.impl.ui.transactions.list.d.K2(((e1) it9.next()).f201358b));
                    }
                    l lVar = new l(new j(gVar), qVar, d0.U(arrayList2));
                    com.revolut.feature.rev_points.impl.ui.transactions.list.d.I2(dVar, (lk0.e) d0.m0(list2), com.revolut.feature.rev_points.impl.ui.transactions.list.d.J2(lVar), lVar);
                }
                return Unit.f186387a;
            default:
                RevPointsTransactionsListScreenContract$InputData revPointsTransactionsListScreenContract$InputData = dVar.o;
                u uVar = dVar.f83892t;
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                lk0.g pagedData = (lk0.g) rVar.f314201a;
                k71.q transactionsExtraData = (k71.q) rVar.f314202b;
                List months = (List) rVar.f314203c;
                List list3 = pagedData.f196174a;
                if (!list3.isEmpty()) {
                    if (dVar.f83894x && (!((z = (list = list3) instanceof Collection)) || !list.isEmpty())) {
                        Iterator it10 = list.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                if (((lk0.e) it10.next()).f196173c) {
                                    if (!z || !list.isEmpty()) {
                                        Iterator it11 = list.iterator();
                                        while (it11.hasNext()) {
                                            if (!((lk0.e) it11.next()).f196171a.isEmpty()) {
                                            }
                                        }
                                    }
                                    return Unit.f186387a;
                                }
                            }
                        }
                    }
                    List<lk0.e> list4 = list3;
                    if ((list4 instanceof Collection) && list4.isEmpty()) {
                        RevPointsTransactionPageParams params = revPointsTransactionsListScreenContract$InputData.f83876a;
                        uVar.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        uVar.f241251a.remove(params);
                        dVar.f83894x = false;
                        l lVar2 = new l(new i(pagedData), transactionsExtraData, months);
                        com.revolut.feature.rev_points.impl.ui.transactions.list.d.I2(dVar, (lk0.e) d0.m0(list3), com.revolut.feature.rev_points.impl.ui.transactions.list.d.J2(lVar2), lVar2);
                    } else {
                        for (lk0.e eVar : list4) {
                            if (eVar.f196173c || eVar.e != null || !eVar.f196171a.isEmpty()) {
                                RevPointsTransactionPageParams params2 = revPointsTransactionsListScreenContract$InputData.f83876a;
                                uVar.getClass();
                                Intrinsics.checkNotNullParameter(params2, "params");
                                Intrinsics.checkNotNullParameter(pagedData, "pagedData");
                                Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
                                Intrinsics.checkNotNullParameter(months, "months");
                                Iterator it12 = list4.iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        next = it12.next();
                                        if (!((lk0.e) next).f196171a.isEmpty()) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                lk0.e eVar2 = (lk0.e) next;
                                if (eVar2 != null) {
                                    uVar.f241251a.put(params2, new t(eVar2, transactionsExtraData, months));
                                }
                                dVar.f83894x = false;
                                l lVar22 = new l(new i(pagedData), transactionsExtraData, months);
                                com.revolut.feature.rev_points.impl.ui.transactions.list.d.I2(dVar, (lk0.e) d0.m0(list3), com.revolut.feature.rev_points.impl.ui.transactions.list.d.J2(lVar22), lVar22);
                            }
                        }
                        RevPointsTransactionPageParams params3 = revPointsTransactionsListScreenContract$InputData.f83876a;
                        uVar.getClass();
                        Intrinsics.checkNotNullParameter(params3, "params");
                        uVar.f241251a.remove(params3);
                        dVar.f83894x = false;
                        l lVar222 = new l(new i(pagedData), transactionsExtraData, months);
                        com.revolut.feature.rev_points.impl.ui.transactions.list.d.I2(dVar, (lk0.e) d0.m0(list3), com.revolut.feature.rev_points.impl.ui.transactions.list.d.J2(lVar222), lVar222);
                    }
                }
                return Unit.f186387a;
        }
    }
}
