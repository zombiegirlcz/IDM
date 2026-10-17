package x82;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import knd.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tb4.t;
import te0.w;
import tof.r9;
import vkm.v1;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f303271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f303272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a f303273y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f303273y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(0, this.f303273y, continuation);
                nVar.f303271w = flowCollector;
                nVar.f303272x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            case 1:
                n nVar2 = new n(1, this.f303273y, continuation);
                nVar2.f303271w = flowCollector;
                nVar2.f303272x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
            default:
                n nVar3 = new n(2, this.f303273y, continuation);
                nVar3.f303271w = flowCollector;
                nVar3.f303272x = obj3;
                return nVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        Flow flowB;
        Flow pVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f303271w;
                    com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar2 = this.f303273y;
                    t tVar = aVar2.f62636p;
                    MultibancoCodeDetailsInputData multibancoCodeDetailsInputData = aVar2.o;
                    if (multibancoCodeDetailsInputData instanceof MultibancoCodeDetailsInputData.ByCode) {
                        str = ((MultibancoCodeDetailsInputData.ByCode) multibancoCodeDetailsInputData).f62539a.f61951a;
                    } else {
                        if (!(multibancoCodeDetailsInputData instanceof MultibancoCodeDetailsInputData.ById)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((MultibancoCodeDetailsInputData.ById) multibancoCodeDetailsInputData).f62540a;
                    }
                    String id10 = str;
                    tVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    l72.i iVar = (l72.i) tVar.f269456b;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    a72.m mVar = (a72.m) iVar.f192514a;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    g0 g0Var = new g0(qe0.o.c(mVar.i, id10, a72.m.f1761j, null, 28), new ie6.q(2, 19, null), 1);
                    this.f303271w = null;
                    this.f303272x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, g0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f303271w;
                    MultibancoWithdrawalCode multibancoWithdrawalCode = (MultibancoWithdrawalCode) this.f303272x;
                    t tVar2 = this.f303273y.f62636p;
                    String str2 = multibancoWithdrawalCode.f61956j;
                    if (str2 == null) {
                        tVar2.getClass();
                        flowB = new go.g(new Data(null, null, false, 7, null), 2);
                    } else {
                        flowB = rd0.e.b(whf.b.a((whf.b) tVar2.f269457c, w.h(new r9(str2)), null, 1, null, 10));
                    }
                    this.f303271w = null;
                    this.f303272x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f303271w;
                    MultibancoWithdrawalCode multibancoWithdrawalCode2 = (MultibancoWithdrawalCode) this.f303272x;
                    Continuation continuation = null;
                    if (c92.a.a(multibancoWithdrawalCode2)) {
                        com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.a aVar5 = this.f303273y;
                        y62.b bVar = aVar5.f62637q;
                        long jA = multibancoWithdrawalCode2.a();
                        bVar.getClass();
                        pVar = new vkm.t(new v1(new jvf.e(jA, bVar, continuation, 2)), new wa7.j(aVar5, continuation, 8));
                    } else {
                        pVar = new v0f.p(new Long[0], 8);
                    }
                    this.f303271w = null;
                    this.f303272x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, pVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
