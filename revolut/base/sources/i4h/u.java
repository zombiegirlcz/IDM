package i4h;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f158489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f158490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p0 f158491y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, p0 p0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f158491y = p0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f158491y, continuation);
                uVar.f158489w = flowCollector;
                uVar.f158490x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            case 1:
                u uVar2 = new u(1, this.f158491y, continuation);
                uVar2.f158489w = flowCollector;
                uVar2.f158490x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
            case 2:
                u uVar3 = new u(2, this.f158491y, continuation);
                uVar3.f158489w = flowCollector;
                uVar3.f158490x = obj3;
                return uVar3.invokeSuspend(Unit.f186387a);
            case 3:
                u uVar4 = new u(3, this.f158491y, continuation);
                uVar4.f158489w = flowCollector;
                uVar4.f158490x = obj3;
                return uVar4.invokeSuspend(Unit.f186387a);
            case 4:
                u uVar5 = new u(4, this.f158491y, continuation);
                uVar5.f158489w = flowCollector;
                uVar5.f158490x = obj3;
                return uVar5.invokeSuspend(Unit.f186387a);
            default:
                u uVar6 = new u(5, this.f158491y, continuation);
                uVar6.f158489w = flowCollector;
                uVar6.f158490x = obj3;
                return uVar6.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow flowB;
        Flow gVar;
        Flow flowQ;
        Flow gVar2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f158489w;
                    int i2 = r.f158481b[((i4l.a) this.f158490x).ordinal()];
                    Continuation continuation = null;
                    if (i2 == 1) {
                        flowB = vkm.i.f290039a;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        p0 p0Var = this.f158491y;
                        Flow flowH = xam.a.h(new i13.d(p0Var, continuation, 14), p0Var.e3(new o(p0Var, 3)));
                        kotlin.coroutines.g gVar3 = kotlin.coroutines.g.f186406a;
                        efm.r rVarC = rd0.e.c(flowH, gVar3);
                        efm.r rVarSwitchMap = te0.w.l(rd0.e.c(p0Var.e3(new o(p0Var, 4)), gVar3), rd0.e.c(p0Var.f158478y.B(new q(1)), gVar3)).switchMap(new i31.e(26, new o(p0Var, 5)));
                        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                        efm.r map = te0.w.l(rVarC, rVarSwitchMap).map(new i31.e(25, new q(p0Var, 0)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        flowB = rd0.e.b(map);
                    }
                    this.f158489w = null;
                    this.f158490x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowB, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f158489w;
                    nel.z instrumentType = (nel.z) this.f158490x;
                    b4h.e eVar = this.f158491y.f158469m;
                    eVar.getClass();
                    Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
                    if (io3.h.i(instrumentType) || io3.h.l(instrumentType) || io3.h.o(instrumentType)) {
                        gVar = new go.g(i4l.a.LINE, 2);
                    } else if (b4h.e.f12378b.contains(instrumentType)) {
                        t3h.e eVar2 = eVar.f12380a;
                        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
                        gVar = new qij.s(eVar2.f267784a.C0("CHART_TYPE_KEY", String.class), 18);
                    } else {
                        gVar = ta6.a.j(b4h.e.f12379c);
                    }
                    this.f158489w = null;
                    this.f158490x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, gVar, this) == aVar2) {
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
                    FlowCollector flowCollector3 = this.f158489w;
                    int i6 = r.f158481b[((i4l.a) this.f158490x).ordinal()];
                    Continuation continuation2 = null;
                    if (i6 == 1) {
                        p0 p0Var2 = this.f158491y;
                        flowQ = vkm.q.Q(p0Var2.e3(new o(p0Var2, 2)), new u(5, p0Var2, continuation2));
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flowQ = vkm.i.f290039a;
                    }
                    this.f158489w = null;
                    this.f158490x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowQ, this) == aVar3) {
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
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f158489w;
                    nel.z instrumentType2 = (nel.z) this.f158490x;
                    b4h.e eVar3 = this.f158491y.f158469m;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(instrumentType2, "instrumentType");
                    if (io3.h.i(instrumentType2)) {
                        t3h.e eVar4 = eVar3.f12380a;
                        Intrinsics.checkNotNullParameter(instrumentType2, "instrumentType");
                        gVar2 = new t38.e(eVar4.f267784a.C0("CHART_VALUE_TYPE_KEY", String.class), 1, eVar4, instrumentType2);
                    } else {
                        gVar2 = (io3.h.l(instrumentType2) || io3.h.o(instrumentType2) || b4h.e.f12378b.contains(instrumentType2)) ? new go.g(eel.i.PRICE, 2) : ta6.a.j(b4h.e.f12379c);
                    }
                    this.f158489w = null;
                    this.f158490x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, gVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f158489w;
                    nel.n nVar = (nel.n) this.f158490x;
                    akg.n nVarV = nim.a.v(this.f158491y.f158476w.a(zhm.u.c(nVar.k.a()), w4l.h.f294642c), new ghk.x(nVar, 8));
                    this.f158489w = null;
                    this.f158490x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, nVarV, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f158489w;
                    nel.n nVar2 = (nel.n) this.f158490x;
                    p0 p0Var3 = this.f158491y;
                    wkm.l lVarQ = vkm.q.Q(p0Var3.f158478y.B(i0.f158455a), new t(null, p0Var3, nVar2, 1));
                    this.f158489w = null;
                    this.f158490x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, lVarQ, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
