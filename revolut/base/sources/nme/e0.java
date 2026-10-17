package nme;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.v1;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f217297w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f217298x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.lifestyle.impl.ui.screen.f f217299y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f217299y = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(0, this.f217299y, continuation);
                e0Var.f217297w = flowCollector;
                e0Var.f217298x = obj3;
                return e0Var.invokeSuspend(Unit.f186387a);
            case 1:
                e0 e0Var2 = new e0(1, this.f217299y, continuation);
                e0Var2.f217297w = flowCollector;
                e0Var2.f217298x = obj3;
                return e0Var2.invokeSuspend(Unit.f186387a);
            case 2:
                e0 e0Var3 = new e0(2, this.f217299y, continuation);
                e0Var3.f217297w = flowCollector;
                e0Var3.f217298x = obj3;
                return e0Var3.invokeSuspend(Unit.f186387a);
            case 3:
                e0 e0Var4 = new e0(3, this.f217299y, continuation);
                e0Var4.f217297w = flowCollector;
                e0Var4.f217298x = obj3;
                return e0Var4.invokeSuspend(Unit.f186387a);
            case 4:
                e0 e0Var5 = new e0(4, this.f217299y, continuation);
                e0Var5.f217297w = flowCollector;
                e0Var5.f217298x = obj3;
                return e0Var5.invokeSuspend(Unit.f186387a);
            case 5:
                e0 e0Var6 = new e0(5, this.f217299y, continuation);
                e0Var6.f217297w = flowCollector;
                e0Var6.f217298x = obj3;
                return e0Var6.invokeSuspend(Unit.f186387a);
            case 6:
                e0 e0Var7 = new e0(6, this.f217299y, continuation);
                e0Var7.f217297w = flowCollector;
                e0Var7.f217298x = obj3;
                return e0Var7.invokeSuspend(Unit.f186387a);
            case 7:
                e0 e0Var8 = new e0(7, this.f217299y, continuation);
                e0Var8.f217297w = flowCollector;
                e0Var8.f217298x = obj3;
                return e0Var8.invokeSuspend(Unit.f186387a);
            case 8:
                e0 e0Var9 = new e0(8, this.f217299y, continuation);
                e0Var9.f217297w = flowCollector;
                e0Var9.f217298x = obj3;
                return e0Var9.invokeSuspend(Unit.f186387a);
            default:
                e0 e0Var10 = new e0(9, this.f217299y, continuation);
                e0Var10.f217297w = flowCollector;
                e0Var10.f217298x = obj3;
                return e0Var10.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f217297w;
                    vkm.y yVarJ = this.f217299y.S.j(new md6.q(md6.p.DISCOVER_ALL_TYPES, ((Data) this.f217298x).getContent() instanceof x19.b));
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, yVarJ, this) == aVar) {
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
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f217297w;
                    u29.m mVar = this.f217299y.f89946p;
                    y29.a aVar3 = mVar.f276575b;
                    aVar3.getClass();
                    Continuation continuation = null;
                    wkm.l lVarQ = vkm.q.Q(new v1(new y20.a1(aVar3, continuation, 2)), new tik.b(continuation, mVar, 17));
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, lVarQ, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f217297w;
                    Flow flowE = ((gld.f0) this.f217299y.v).f144638l.e();
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, flowE, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f217297w;
                    vkm.d dVarB = rd0.e.b(((byb.c) this.f217299y.L).Z2());
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, dVarB, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f217297w;
                    com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = this.f217299y;
                    Flow flowE2 = boh.f.e(a.a.k(vkm.q.q(fVar.g0.B(m0.f217307a)), n0.f217308a), new o0(fVar, 0));
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, flowE2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f217297w;
                    com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar2 = this.f217299y;
                    Flow flowE3 = boh.f.e(a.a.k(vkm.q.q(fVar2.g0.B(p0.f217311a)), q0.f217312a), new o0(fVar2, 1));
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, flowE3, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f217297w;
                    com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar3 = this.f217299y;
                    Flow flowE4 = boh.f.e(a.a.k(vkm.q.q(fVar3.g0.B(r0.f217313a)), s0.f217314a), new o0(fVar3, 2));
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, flowE4, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector8 = this.f217297w;
                    com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar4 = this.f217299y;
                    Flow flowE5 = boh.f.e(a.a.k(vkm.q.q(fVar4.g0.B(v0.f217317a)), w0.f217318a), new o0(fVar4, 3));
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, flowE5, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f217297w;
                    ((Boolean) this.f217298x).getClass();
                    Flow flowA = this.f217299y.f89947q.a(f19.h.LOYALTY_HOME_MEDIA_HEADER, w4l.h.f294642c);
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, flowA, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = this.f217297w;
                    com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar5 = this.f217299y;
                    vkm.y yVarD = rd0.e.d(c6d.b.i(a.a.k(vkm.q.q(fVar5.g0.B(x0.f217319a)), y0.f217321a), new o0(fVar5, 4)), zhm.h0.f322473a);
                    this.f217297w = null;
                    this.f217298x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, yVarD, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
