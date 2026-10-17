package qwd;

import ard.b0;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.LegacyOrderQuoteParams;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import mif.e0;
import vdl.c1;
import vkm.s1;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f249875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f249876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.staking.impl.stake.v2.b f249877y;
    public final /* synthetic */ io3.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Continuation continuation, com.revolut.feature.staking.impl.stake.v2.b bVar, io3.d dVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f249877y = bVar;
        this.z = dVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                r rVar = new r(continuation, this.f249877y, this.z, 0);
                rVar.f249875w = flowCollector;
                rVar.f249876x = obj3;
                return rVar.invokeSuspend(Unit.f186387a);
            default:
                r rVar2 = new r(continuation, this.f249877y, this.z, 1);
                rVar2.f249875w = flowCollector;
                rVar2.f249876x = obj3;
                return rVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f249875w;
                    xi0.b bVar = (xi0.b) this.f249876x;
                    Intrinsics.h(bVar);
                    com.revolut.feature.staking.impl.stake.v2.b bVar2 = this.f249877y;
                    xi0.b bVar3 = bVar2.o.f88138a.d;
                    vkm.d dVarB = rd0.e.b(m70.a.g(bVar2.f88150q.d(zhm.v.k(new Pair(bVar3, bVar), new Pair(bVar, bVar3)), n9l.b.SEC_3), null, null, 3));
                    vkm.d dVarB2 = rd0.e.b(bVar2.J);
                    i0e.p pVar = new i0e.p(bVar2, this.z, bVar3, null, 2);
                    this.f249875w = null;
                    this.f249876x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector);
                    Object objG = e0.g(this, s1.f290118a, new c1((Function3) pVar, (Continuation) null, 15), flowCollector, new Flow[]{dVarB2, dVarB});
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
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f249875w;
                    dj0.d dVar = (dj0.d) this.f249876x;
                    io3.d dVar2 = this.z;
                    xi0.b bVarL = z92.f.l(dVar2);
                    Intrinsics.h(dVar);
                    com.revolut.feature.staking.impl.stake.v2.b bVar4 = this.f249877y;
                    xi0.b bVar5 = bVar4.o.f88138a.d;
                    boolean zF = Intrinsics.f(dVar.f115083b, bVar5);
                    vkm.f fVarS = o7.b.s(bVar4.z, new LegacyOrderQuoteParams(new Asset(cp5.d.z(bVarL) ? f8l.c.CRYPTO : f8l.c.FIAT, bVarL.f306286a, bVarL), new Asset(cp5.d.z(bVar5) ? f8l.c.CRYPTO : f8l.c.FIAT, bVar5.f306286a, bVar5), f8l.e.MARKET, pyd.c.x(dVar), zF ? f8l.b.TO : f8l.b.FROM, zF ? f8l.b.TO : f8l.b.FROM, null, false, null, null, null, null, null, null, 15360));
                    this.f249875w = null;
                    this.f249876x = null;
                    this.v = 1;
                    vkm.q.w(flowCollector2);
                    Object objCollect = fVarS.collect(new b0(flowCollector2, bVar4, dVar, dVar2, 21), this);
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
