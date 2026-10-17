package rnj;

import dcl.m0;
import dee.x;
import dfj.n;
import dfj.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f255711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f255712x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u f255713y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, u uVar, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f255713y = uVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                h hVar = new h(0, this.f255713y, continuation);
                hVar.f255711w = flowCollector;
                hVar.f255712x = obj3;
                return hVar.invokeSuspend(Unit.f186387a);
            default:
                h hVar2 = new h(1, this.f255713y, continuation);
                hVar2.f255711w = flowCollector;
                hVar2.f255712x = obj3;
                return hVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        w4l.i loadingStrategy = w4l.i.f294643c;
        u uVar = this.f255713y;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f255711w;
                    String esimProfileId = (String) this.f255712x;
                    n nVar = u.Companion;
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(esimProfileId, "esimProfileId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    akg.n nVarV = nim.a.v(u0.i(uVar.f114116c.b(loadingStrategy), uVar.d.b(loadingStrategy), nim.a.v(uVar.f.a(loadingStrategy), new x(4))), new m0(uVar, esimProfileId, 14));
                    this.f255711w = null;
                    this.f255712x = null;
                    this.v = 1;
                    if (q.u(flowCollector, nVarV, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f255711w;
                    String id10 = (String) this.f255712x;
                    n nVar2 = u.Companion;
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    dfj.m0 m0VarE = uVar.f114114a.e(id10, loadingStrategy);
                    this.f255711w = null;
                    this.f255712x = null;
                    this.v = 1;
                    q.w(flowCollector2);
                    Object objCollect = m0VarE.collect(new dc0.c(flowCollector2, uVar, i2), this);
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect != aVar2) {
                        objCollect = Unit.f186387a;
                    }
                    if (objCollect == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
