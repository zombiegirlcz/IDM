package bwb;

import b8d.a0;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.impl.data.network.exception.PendingPurchaseResponseException;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import hmf.b0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import vkm.q;
import vkm.v1;
import zhm.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f19293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f19294x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.u = i2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                k kVar = new k(3, 0, (Continuation) obj4);
                kVar.f19293w = flowCollector;
                kVar.f19294x = obj3;
                return kVar.invokeSuspend(Unit.f186387a);
            case 1:
                k kVar2 = new k(3, 1, (Continuation) obj4);
                kVar2.f19293w = flowCollector;
                kVar2.f19294x = obj3;
                return kVar2.invokeSuspend(Unit.f186387a);
            case 2:
                k kVar3 = new k(3, 2, (Continuation) obj4);
                kVar3.f19293w = flowCollector;
                kVar3.f19294x = obj3;
                return kVar3.invokeSuspend(Unit.f186387a);
            case 3:
                k kVar4 = new k(3, 3, (Continuation) obj4);
                kVar4.f19293w = flowCollector;
                kVar4.f19294x = obj3;
                return kVar4.invokeSuspend(Unit.f186387a);
            case 4:
                k kVar5 = new k(3, 4, (Continuation) obj4);
                kVar5.f19293w = flowCollector;
                kVar5.f19294x = obj3;
                return kVar5.invokeSuspend(Unit.f186387a);
            case 5:
                k kVar6 = new k(this.f19294x, (Continuation) obj4);
                kVar6.f19293w = flowCollector;
                return kVar6.invokeSuspend(Unit.f186387a);
            case 6:
                k kVar7 = new k(3, 6, (Continuation) obj4);
                kVar7.f19293w = flowCollector;
                kVar7.f19294x = obj3;
                return kVar7.invokeSuspend(Unit.f186387a);
            case 7:
                k kVar8 = new k(3, 7, (Continuation) obj4);
                kVar8.f19293w = flowCollector;
                kVar8.f19294x = obj3;
                return kVar8.invokeSuspend(Unit.f186387a);
            case 8:
                k kVar9 = new k(3, 8, (Continuation) obj4);
                kVar9.f19293w = flowCollector;
                kVar9.f19294x = obj3;
                return kVar9.invokeSuspend(Unit.f186387a);
            case 9:
                k kVar10 = new k(3, 9, (Continuation) obj4);
                kVar10.f19293w = flowCollector;
                kVar10.f19294x = obj3;
                return kVar10.invokeSuspend(Unit.f186387a);
            case 10:
                k kVar11 = new k(3, 10, (Continuation) obj4);
                kVar11.f19293w = flowCollector;
                kVar11.f19294x = obj3;
                return kVar11.invokeSuspend(Unit.f186387a);
            case 11:
                k kVar12 = new k(3, 11, (Continuation) obj4);
                kVar12.f19293w = flowCollector;
                kVar12.f19294x = obj3;
                return kVar12.invokeSuspend(Unit.f186387a);
            case 12:
                k kVar13 = new k(3, 12, (Continuation) obj4);
                kVar13.f19293w = flowCollector;
                kVar13.f19294x = obj3;
                return kVar13.invokeSuspend(Unit.f186387a);
            case 13:
                k kVar14 = new k(3, 13, (Continuation) obj4);
                kVar14.f19293w = flowCollector;
                kVar14.f19294x = obj3;
                return kVar14.invokeSuspend(Unit.f186387a);
            case 14:
                k kVar15 = new k(3, 14, (Continuation) obj4);
                kVar15.f19293w = flowCollector;
                kVar15.f19294x = obj3;
                return kVar15.invokeSuspend(Unit.f186387a);
            case 15:
                k kVar16 = new k(3, 15, (Continuation) obj4);
                kVar16.f19293w = flowCollector;
                kVar16.f19294x = obj3;
                return kVar16.invokeSuspend(Unit.f186387a);
            case 16:
                k kVar17 = new k(3, 16, (Continuation) obj4);
                kVar17.f19293w = flowCollector;
                kVar17.f19294x = obj3;
                return kVar17.invokeSuspend(Unit.f186387a);
            case 17:
                k kVar18 = new k(3, 17, (Continuation) obj4);
                kVar18.f19293w = flowCollector;
                kVar18.f19294x = obj3;
                return kVar18.invokeSuspend(Unit.f186387a);
            default:
                k kVar19 = new k(3, 18, (Continuation) obj4);
                kVar19.f19293w = flowCollector;
                kVar19.f19294x = obj3;
                return kVar19.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f19293w;
                    UserVoucherDetails userVoucherDetails = (UserVoucherDetails) this.f19294x;
                    int i2 = i.f19291a[userVoucherDetails.f83630l.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        throw new PendingPurchaseResponseException();
                    }
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    q.w(flowCollector);
                    Object objEmit = flowCollector.emit(userVoucherDetails, this);
                    if (objEmit != aVar) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit != aVar) {
                        objEmit = Unit.f186387a;
                    }
                    if (objEmit == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f19293w;
                    Flow flowB = ((b0) this.f19294x).b();
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, flowB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f19293w;
                    Flow flowE = ((b0) this.f19294x).e();
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, flowE, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f19293w;
                    Flow flowD = ((b0) this.f19294x).d();
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector4, flowD, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f19293w;
                    Flow flowA = ((b0) this.f19294x).a();
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector5, flowA, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                FlowCollector flowCollector6 = this.f19293w;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    Data dataP = zi0.c.P(this.f19294x, false, null, 3);
                    this.f19293w = null;
                    this.v = 1;
                    if (flowCollector6.emit(dataP, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f19293w;
                    Flow[] flowArr = (Flow[]) d0.d1((List) this.f19294x).toArray(new Flow[0]);
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    q.w(flowCollector7);
                    Object objG = e0.g(this, new ag1.i(flowArr, 29), new ag1.j(3, 24, null), new god.k(flowCollector7, 13), flowArr);
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != obj3) {
                        objG = Unit.f186387a;
                    }
                    if (objG != obj3) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f19293w;
                    Flow flow = (Flow) this.f19294x;
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector8, flow, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f19293w;
                    Data data = (Data) this.f19294x;
                    v1 v1VarH = ta6.a.H(0L, 1L, TimeUnit.MINUTES);
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    q.w(flowCollector9);
                    Object objCollect = v1VarH.collect(new a0(flowCollector9, data, 9), this);
                    if (objCollect != aVar8) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar8) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = this.f19293w;
                    ku1.h hVar = (ku1.h) this.f19294x;
                    io3.d dVar = (io3.d) hVar.f189610c.getContent();
                    c02.j jVar = hVar.f189608a;
                    Flow gVar = (jVar == null || dVar == null) ? vkm.i.f290039a : new go.g(new Pair(jVar, dVar.f163145a), 2);
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector10, gVar, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = this.f19293w;
                    Flow flow2 = (Flow) this.f19294x;
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector11, flow2, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = this.f19293w;
                    Flow flow3 = (Flow) this.f19294x;
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector12, flow3, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = this.f19293w;
                    Flow flow4 = (Flow) this.f19294x;
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector13, flow4, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 13:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i96 = this.v;
                if (i96 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = this.f19293w;
                    Data data2 = (Data) this.f19294x;
                    v1 v1VarS = (((puj.h) data2.getContent()) == null && !data2.getLoading() && data2.getError() == null) ? org.bouncycastle.jcajce.provider.digest.a.s(3, null) : new v1(new osk.m(data2, null, 6));
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector14, v1VarS, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i96 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 14:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i99 = this.v;
                if (i99 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector15 = this.f19293w;
                    Flow flow5 = (Flow) this.f19294x;
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector15, flow5, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i99 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i100 = this.v;
                if (i100 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector16 = this.f19293w;
                    Flow flow6 = (Flow) this.f19294x;
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector16, flow6, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i100 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 16:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i101 = this.v;
                if (i101 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector17 = this.f19293w;
                    qwf.o oVar = (qwf.o) this.f19294x;
                    ivf.g gVar2 = (ivf.g) oVar.f249920h.getContent();
                    qwf.p pVar = (qwf.p) oVar.f249919g.getContent();
                    TransitTicketRevPointOption transitTicketRevPointOption = pVar != null ? pVar.f249923b : null;
                    Flow gVar3 = (gVar2 == null && transitTicketRevPointOption == null) ? vkm.i.f290039a : new go.g(new Pair(gVar2, transitTicketRevPointOption), 2);
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector17, gVar3, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i101 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 17:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i102 = this.v;
                if (i102 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector18 = this.f19293w;
                    List list = (List) this.f19294x;
                    Flow gVar4 = list.isEmpty() ? new go.g(zi0.c.P(r0.g(), false, null, 3), 2) : new uf0.b((Flow[]) d0.d1(list).toArray(new Flow[0]), 10);
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector18, gVar4, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i102 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                int i103 = this.v;
                if (i103 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector19 = this.f19293w;
                    v1 v1Var = new v1(new wca.i(((kotlin.time.b) this.f19294x).f187924a, null));
                    this.f19293w = null;
                    this.f19294x = null;
                    this.v = 1;
                    if (q.u(flowCollector19, v1Var, this) == aVar18) {
                        return aVar18;
                    }
                } else {
                    if (i103 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Object obj2, Continuation continuation) {
        super(3, continuation);
        this.u = 5;
        this.f19294x = obj2;
    }
}
