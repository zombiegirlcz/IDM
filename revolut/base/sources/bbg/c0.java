package bbg;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.TravelHotelsAmendmentConfirmationScreenContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.WorkflowName;
import et6.u1;
import java.time.Instant;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import oqk.g0;
import pkf.h2;
import q97.g3;
import tof.a3;
import vkm.v1;
import wf0.z0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f14274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f14275x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f14276y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Continuation continuation, Object obj2, boolean z, int i) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
        this.f14276y = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(continuation, (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) this.z, this.f14276y, 0);
                c0Var.f14274w = flowCollector;
                c0Var.f14275x = obj3;
                return c0Var.invokeSuspend(Unit.f186387a);
            case 1:
                c0 c0Var2 = new c0(continuation, (eg0.h) this.z, this.f14276y, 1);
                c0Var2.f14274w = flowCollector;
                c0Var2.f14275x = obj3;
                return c0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                c0 c0Var3 = new c0(continuation, (fg0.k) this.z, this.f14276y, 2);
                c0Var3.f14274w = flowCollector;
                c0Var3.f14275x = obj3;
                return c0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                c0 c0Var4 = new c0(continuation, (r10.q) this.z, this.f14276y, 3);
                c0Var4.f14274w = flowCollector;
                c0Var4.f14275x = obj3;
                return c0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                c0 c0Var5 = new c0(continuation, (jhe.t) this.z, this.f14276y, 4);
                c0Var5.f14274w = flowCollector;
                c0Var5.f14275x = obj3;
                return c0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                c0 c0Var6 = new c0(continuation, this.f14276y, (h2) this.z, 5);
                c0Var6.f14274w = flowCollector;
                c0Var6.f14275x = obj3;
                return c0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                c0 c0Var7 = new c0(continuation, (qt8.d) this.z, this.f14276y, 6);
                c0Var7.f14274w = flowCollector;
                c0Var7.f14275x = obj3;
                return c0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                c0 c0Var8 = new c0(continuation, (vge.x) this.z, this.f14276y, 7);
                c0Var8.f14274w = flowCollector;
                c0Var8.f14275x = obj3;
                return c0Var8.invokeSuspend(Unit.f186387a);
            default:
                c0 c0Var9 = new c0(continuation, this.f14276y, (wid.c) this.z, 8);
                c0Var9.f14274w = flowCollector;
                c0Var9.f14275x = obj3;
                return c0Var9.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Data data;
        Flow gVar;
        String str;
        Flow u1Var;
        Flow gVar2;
        Flow gVar3;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f14274w;
                    Data data2 = (Data) this.f14275x;
                    rei.g gVar4 = (rei.g) data2.getContent();
                    if (gVar4 == null || (str = gVar4.f.f98005a) == null) {
                        try {
                            Object content = data2.getContent();
                            if (content != null) {
                            }
                            data = new Data(null, data2.getError(), data2.getLoading());
                        } catch (Throwable th10) {
                            data = new Data(null, th10, data2.getLoading());
                        }
                        gVar = new go.g(data, 2);
                    } else {
                        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) this.z;
                        Boolean bool = Boolean.FALSE;
                        TravelHotelsAmendmentConfirmationScreenContract$InputData travelHotelsAmendmentConfirmationScreenContract$InputData = aVar2.o;
                        gVar = rd0.e.b(ue0.e.p(aVar2.f93829s.a(new yfi.a(str, bool, travelHotelsAmendmentConfirmationScreenContract$InputData.f93815b, travelHotelsAmendmentConfirmationScreenContract$InputData.f93816c, null), this.f14276y), h0.f322473a));
                    }
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objCollect = gVar.collect(new b8d.a0(flowCollector, data2, 1), this);
                    fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                    if (objCollect != aVar3) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar3) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                    break;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                eg0.h hVar = (eg0.h) this.z;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f14274w;
                    zf0.c cVar = (zf0.c) this.f14275x;
                    x4l.c cVar2 = hVar.f125521j;
                    Intrinsics.h(cVar);
                    vkm.d dVarB = cVar2.b(cVar, this.f14276y ? w4l.i.f294643c : w4l.h.f294642c);
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, dVarB, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fg0.k kVar = (fg0.k) this.z;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f14274w;
                    zf0.c cVar3 = (zf0.c) this.f14275x;
                    x4l.c cVar4 = kVar.f134880g;
                    Intrinsics.h(cVar3);
                    vkm.d dVarB2 = cVar4.b(cVar3, this.f14276y ? w4l.i.f294643c : w4l.h.f294642c);
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f14274w;
                    k7d.b bVar = (k7d.b) ((od0.i) this.f14275x).f224257a;
                    if (bVar == null) {
                        od0.i.Companion.getClass();
                        u1Var = new go.g(od0.i.f224256b, 2);
                    } else {
                        r10.q qVar = (r10.q) this.z;
                        ig0.a params = bVar.f182033c;
                        hg0.p pVar = (hg0.p) qVar.f250850c;
                        Intrinsics.checkNotNullParameter(params, "params");
                        z0 z0Var = pVar.f152063a;
                        z0Var.getClass();
                        Intrinsics.checkNotNullParameter(params, "params");
                        u1Var = new u1(rd0.e.b(m70.a.g(z0Var.f296950g.f(params, this.f14276y), null, null, 3)), bVar, 27);
                    }
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, u1Var, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f14274w;
                    vkm.d dVarB3 = rd0.e.b(((g0) ((jhe.t) this.z).f174235b).d((Data) this.f14275x, this.f14276y));
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f14274w;
                    a3 a3Var = (a3) this.f14275x;
                    Continuation continuation = null;
                    if (this.f14276y || a3Var.J == null) {
                        gVar2 = new go.g(zhm.f0.f322471a, 2);
                    } else {
                        h2 h2Var = (h2) this.z;
                        gVar2 = rd0.e.e(mo3.a.g(nim.a.u(new of6.d(h2Var, null), u0.m(nim.a.v(rd0.e.b(hng.g.b(((ang.b) h2Var.f237068m).f7765a)), new pj9.n(10)), nim.a.v(h2Var.o.a(w4l.h.f294642c), new pj9.n(11)))), null, null, 3), h0.f322473a, new otd.a(3, 7, continuation));
                    }
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, gVar2, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f14274w;
                    if (ngm.n.p(((yt8.c) this.f14275x).f316662a)) {
                        jvh.a aVar10 = ((qt8.d) this.z).f249020c;
                        WorkflowName.INSTANCE.getClass();
                        gVar3 = new g3(mo3.a.g(aVar10.e(WorkflowName.f105665b, this.f14276y), null, null, 3), 2);
                    } else {
                        gVar3 = new go.g(au8.a.NOT_ELIGIBLE, 2);
                    }
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, gVar3, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f14274w;
                    vkm.d dVarB4 = rd0.e.b(((g0) ((vge.x) this.z).i).d((Data) this.f14275x, this.f14276y));
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, dVarB4, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f14274w;
                    Instant instant = (Instant) this.f14275x;
                    Flow v1Var = instant == null ? vkm.i.f290039a : new v1(new ack.o(this.f14276y, (wid.c) this.z, instant, (Continuation) null, 29));
                    this.f14274w = null;
                    this.f14275x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, v1Var, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Continuation continuation, boolean z, Object obj2, int i) {
        super(3, continuation);
        this.u = i;
        this.f14276y = z;
        this.z = obj2;
    }
}
