package hzb;

import com.revolut.feature.rewards.api.RewardsApi$FeatureToggles$RentAndBills;
import grl.r2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.o0;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f157136w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f157137x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.earn.b f157138y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, com.revolut.feature.rev_points.impl.ui.earn.b bVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f157138y = bVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                x xVar = new x(0, this.f157138y, continuation);
                xVar.f157136w = flowCollector;
                xVar.f157137x = obj3;
                return xVar.invokeSuspend(Unit.f186387a);
            case 1:
                x xVar2 = new x(1, this.f157138y, continuation);
                xVar2.f157136w = flowCollector;
                xVar2.f157137x = obj3;
                return xVar2.invokeSuspend(Unit.f186387a);
            case 2:
                x xVar3 = new x(2, this.f157138y, continuation);
                xVar3.f157136w = flowCollector;
                xVar3.f157137x = obj3;
                return xVar3.invokeSuspend(Unit.f186387a);
            case 3:
                x xVar4 = new x(3, this.f157138y, continuation);
                xVar4.f157136w = flowCollector;
                xVar4.f157137x = obj3;
                return xVar4.invokeSuspend(Unit.f186387a);
            case 4:
                x xVar5 = new x(4, this.f157138y, continuation);
                xVar5.f157136w = flowCollector;
                xVar5.f157137x = obj3;
                return xVar5.invokeSuspend(Unit.f186387a);
            case 5:
                x xVar6 = new x(5, this.f157138y, continuation);
                xVar6.f157136w = flowCollector;
                xVar6.f157137x = obj3;
                return xVar6.invokeSuspend(Unit.f186387a);
            case 6:
                x xVar7 = new x(6, this.f157138y, continuation);
                xVar7.f157136w = flowCollector;
                xVar7.f157137x = obj3;
                return xVar7.invokeSuspend(Unit.f186387a);
            case 7:
                x xVar8 = new x(7, this.f157138y, continuation);
                xVar8.f157136w = flowCollector;
                xVar8.f157137x = obj3;
                return xVar8.invokeSuspend(Unit.f186387a);
            case 8:
                x xVar9 = new x(8, this.f157138y, continuation);
                xVar9.f157136w = flowCollector;
                xVar9.f157137x = obj3;
                return xVar9.invokeSuspend(Unit.f186387a);
            case 9:
                x xVar10 = new x(9, this.f157138y, continuation);
                xVar10.f157136w = flowCollector;
                xVar10.f157137x = obj3;
                return xVar10.invokeSuspend(Unit.f186387a);
            case 10:
                x xVar11 = new x(10, this.f157138y, continuation);
                xVar11.f157136w = flowCollector;
                xVar11.f157137x = obj3;
                return xVar11.invokeSuspend(Unit.f186387a);
            case 11:
                x xVar12 = new x(11, this.f157138y, continuation);
                xVar12.f157136w = flowCollector;
                xVar12.f157137x = obj3;
                return xVar12.invokeSuspend(Unit.f186387a);
            case 12:
                x xVar13 = new x(12, this.f157138y, continuation);
                xVar13.f157136w = flowCollector;
                xVar13.f157137x = obj3;
                return xVar13.invokeSuspend(Unit.f186387a);
            default:
                x xVar14 = new x(13, this.f157138y, continuation);
                xVar14.f157136w = flowCollector;
                xVar14.f157137x = obj3;
                return xVar14.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f157136w;
                    vkm.y yVarJ = this.f157138y.L.j(new md6.q(md6.p.REV_POINTS, true));
                    this.f157136w = null;
                    this.f157137x = null;
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
                    FlowCollector flowCollector2 = this.f157136w;
                    Flow flowE = ((om4.b) this.f157138y.P).e(r2.REV_POINTS_EARN_HUB);
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowE, this) == aVar2) {
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
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f157136w;
                    vkm.d dVarB = rd0.e.b(nyb.j.a(this.f157138y.B));
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, dVarB, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.rev_points.impl.ui.earn.b bVar = this.f157138y;
                wub.a aVar4 = bVar.H;
                eub.a aVar5 = bVar.A;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f157136w;
                    vkm.d dVarB2 = rd0.e.b(bVar.E.c());
                    vkm.d dVarB3 = rd0.e.b(((i9g.v) bVar.C).d());
                    nyb.b bVar2 = (nyb.b) aVar5;
                    go.g gVar = new go.g(Boolean.valueOf(bVar2.a("STAYS.earn_revpoint_on_paying_at_property") || bVar2.a("STAYS.earn_revpoint_on_paying_now")), 2);
                    vkm.d dVarB4 = rd0.e.b(((c1g.m) bVar.D).b());
                    vkm.d dVarE = ((nyb.b) aVar5).e();
                    vkm.d dVarD = ((nyb.b) aVar5).d();
                    go.g gVarI = zi0.c.i(Boolean.valueOf(aVar4.a()));
                    go.g gVarI2 = zi0.c.i(Boolean.valueOf(aVar4.b()));
                    go.g gVarI3 = zi0.c.i(Boolean.valueOf(((nyb.b) aVar5).a("REVPOINTS.earn_on_challenges")));
                    Flow flowB = bVar.J.b();
                    nyb.b bVar3 = (nyb.b) aVar5;
                    boolean zC = ((jte.d) bVar3.f220771a).c(RewardsApi$FeatureToggles$RentAndBills.f84764c);
                    vgc.a aVar7 = bVar3.d;
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vgc.e eVar = (vgc.e) aVar7.f288814a;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    j23.b bVarF = yh5.b.f(dVarB2, dVarB3, gVar, dVarB4, dVarE, dVarD, gVarI, gVarI2, gVarI3, flowB, nim.a.v(nim.a.v(boh.f.e(vkm.q.q(rd0.e.b(eVar.f288821b.v(loadingStrategy))), new v73.c(eVar, loadingStrategy, 23)), new vga.g(1)), new lph.c(zC, 25)));
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector4, bVarF, this) == aVar6) {
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
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f157136w;
                    vkm.d dVarB5 = rd0.e.b(this.f157138y.f83801r.q());
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, dVarB5, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector6 = this.f157136w;
                    vkm.d dVarB6 = rd0.e.b(this.f157138y.f83800q.c(true));
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector6, dVarB6, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 6:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector7 = this.f157136w;
                    com.revolut.feature.rev_points.impl.ui.earn.b bVar4 = this.f157138y;
                    Flow flowH = xam.a.h(new y(6, bVar4, null), vkm.q.q(bVar4.S.B(c0.f157092a)));
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector7, flowH, this) == aVar10) {
                        return aVar10;
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
                    FlowCollector flowCollector8 = this.f157136w;
                    wub.d dVar = (wub.d) this.f157138y.I;
                    dVar.getClass();
                    w4l.i loadingStrategy2 = w4l.i.f294643c;
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    tub.i iVar = dVar.f300098a;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(loadingStrategy2, "loadingStrategy");
                    cxe.u uVarP = n14.k.p(iVar.e.b(Unit.f186387a, loadingStrategy2), d0.f157094a);
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector8, uVarP, this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector9 = this.f157136w;
                    vkm.d dVarB7 = rd0.e.b(((byb.c) this.f157138y.v).Z2());
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector9, dVarB7, this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector10 = this.f157136w;
                    vkm.d dVarB8 = rd0.e.b(this.f157138y.f83803t.b(o0.ACTIVATION));
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector10, dVarB8, this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 10:
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector11 = this.f157136w;
                    vkm.d dVarB9 = this.f157138y.G.b(w4l.h.f294642c);
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector11, dVarB9, this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i59 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector12 = this.f157136w;
                    vkm.d dVarB10 = rd0.e.b(this.f157138y.u.o());
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector12, dVarB10, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector13 = this.f157136w;
                    Flow flowA = this.f157138y.N.a(f19.h.LOYALTY_EARN_HUB_TOP_BRANDS, (w4l.k) this.f157137x);
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector13, flowA, this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                int i92 = this.v;
                if (i92 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector14 = this.f157136w;
                    akg.n nVarJ = this.f157138y.M.j(w4l.h.f294642c);
                    this.f157136w = null;
                    this.f157137x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector14, nVarJ, this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i92 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
