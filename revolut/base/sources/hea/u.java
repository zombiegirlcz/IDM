package hea;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pockets.impl.details_v2.pocket_details.PocketDetailsScreenContract$InputData;
import java.util.Optional;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l71.a;
import vdl.c1;
import vkm.j2;
import vkm.s1;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class u extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f151665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f151666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a f151667y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f151667y = aVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                u uVar = new u(0, this.f151667y, continuation);
                uVar.f151665w = flowCollector;
                uVar.f151666x = obj3;
                return uVar.invokeSuspend(Unit.f186387a);
            case 1:
                u uVar2 = new u(1, this.f151667y, continuation);
                uVar2.f151665w = flowCollector;
                uVar2.f151666x = obj3;
                return uVar2.invokeSuspend(Unit.f186387a);
            case 2:
                u uVar3 = new u(2, this.f151667y, continuation);
                uVar3.f151665w = flowCollector;
                uVar3.f151666x = obj3;
                return uVar3.invokeSuspend(Unit.f186387a);
            case 3:
                u uVar4 = new u(3, this.f151667y, continuation);
                uVar4.f151665w = flowCollector;
                uVar4.f151666x = obj3;
                return uVar4.invokeSuspend(Unit.f186387a);
            default:
                u uVar5 = new u(4, this.f151667y, continuation);
                uVar5.f151665w = flowCollector;
                uVar5.f151666x = obj3;
                return uVar5.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Flow flowV;
        Flow flowI;
        int i = this.u;
        w4l.i iVar = w4l.i.f294643c;
        w4l.h hVar = w4l.h.f294642c;
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar = this.f151667y;
        Continuation continuation = null;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f151665w;
                    vkm.d dVarB = rd0.e.b(aVar.f80860r.b(((o) ((j2) aVar.U.f22677a).getValue()).i ? hVar : iVar, aVar.I2().f163146b, z92.f.l(aVar.I2()), aVar.I2().e, io3.i.INTERNAL, null, (wi0.b) this.f151666x));
                    this.f151665w = null;
                    this.f151666x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, dVarB, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f151665w;
                    Flow rVar = ((l71.d) this.f151666x).b().equals(a.h0.f192478a) ? new g48.r(aVar.N.h(), 7) : new go.g(c.f151625a, 2);
                    this.f151665w = null;
                    this.f151666x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, rVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector3 = this.f151665w;
                    vkm.y yVarJ = aVar.L.j((md6.a) this.f151666x);
                    this.f151665w = null;
                    this.f151666x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector3, yVarJ, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                cli.y yVar = aVar.U;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector4 = this.f151665w;
                    wkm.l lVarQ = vkm.q.Q(vkm.q.q(yVar.B(new he4.r(4))), new u(4, aVar, continuation));
                    wkm.l lVarQ2 = vkm.q.Q(vkm.q.q(yVar.B(new he4.r(2))), new u(0, aVar, continuation));
                    g2e.m0 m0Var = new g2e.m0(aVar, continuation, 16);
                    this.f151665w = null;
                    this.f151666x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector4);
                    Object objG = mif.e0.g(this, s1.f290118a, new c1((Function3) m0Var, continuation, 15), flowCollector4, new Flow[]{lVarQ, lVarQ2});
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG != fim.a.COROUTINE_SUSPENDED) {
                        objG = Unit.f186387a;
                    }
                    if (objG == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector5 = this.f151665w;
                    io3.d pocket = (io3.d) this.f151666x;
                    com.revolut.feature.pockets.impl.details_v2.pocket_actions.b bVar = aVar.v;
                    PocketDetailsScreenContract$InputData pocketDetailsScreenContract$InputData = aVar.o;
                    AccountId accountId = pocketDetailsScreenContract$InputData.f80846b;
                    boolean z = pocketDetailsScreenContract$InputData.f80847c;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(pocket, "pocket");
                    Intrinsics.checkNotNullParameter(accountId, "accountId");
                    if (accountId instanceof AccountId.Joint) {
                        flowV = nim.a.v(bVar.f80840c.f(((AccountId.Joint) accountId).f51412a), new gd8.j(12));
                    } else {
                        Optional optionalEmpty = Optional.empty();
                        Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
                        flowV = zi0.c.i(optionalEmpty);
                    }
                    vkm.d dVarB2 = rd0.e.b(nim.a.w(hng.g.b(((ang.b) bVar.d).f7765a), new gd8.j(13)));
                    vkm.d dVarB3 = rd0.e.b(nim.a.w(bVar.f80838a.J(accountId, hVar), new g58.h(pocket.f163147c, 10)));
                    if (pocket.e == io3.l.MERCHANT && pocket.f163149h == io3.i.INTERNAL) {
                        flowI = new g9j.q(((et6.g) bVar.e).d(iVar), 7);
                    } else {
                        Optional optionalEmpty2 = Optional.empty();
                        Intrinsics.checkNotNullExpressionValue(optionalEmpty2, "empty(...)");
                        flowI = zi0.c.i(optionalEmpty2);
                    }
                    t38.e eVarM = u0.m(u0.i(flowV, dVarB2, dVarB3), flowI);
                    int i22 = 2;
                    akg.n nVarV = nim.a.v(nim.a.u(new d4f.m(i22, 18, continuation), eVarM), new gae.a(bVar, z, i22));
                    this.f151665w = null;
                    this.f151666x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector5, nVarV, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
