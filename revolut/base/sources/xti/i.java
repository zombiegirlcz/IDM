package xti;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import vkm.q0;
import wkm.l;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f308828w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f308829x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f308830y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Continuation continuation, j jVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f308830y = jVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(continuation, this.f308830y, 0);
                iVar.f308828w = flowCollector;
                iVar.f308829x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(continuation, this.f308830y, 1);
                iVar2.f308828w = flowCollector;
                iVar2.f308829x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q0 q0VarY;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f308828w;
                    j jVar = this.f308830y;
                    l lVarQ = q.Q(q.q(jVar.f308833r.B(new xrl.a(20))), new i(null, jVar, 1));
                    this.f308828w = null;
                    this.f308829x = null;
                    this.v = 1;
                    if (q.u(flowCollector, lVarQ, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                j jVar2 = this.f308830y;
                mti.a aVar2 = jVar2.o;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f308828w;
                    String str = (String) this.f308829x;
                    boolean zW = d0.W(str);
                    boolean z = !zW;
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    if (z) {
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        pti.e eVar = aVar2.f208843a;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        q0VarY = com.revolut.data.database.models.openbanking.d.x("AsftAirportSearchScreenModel", "observeFilteredAirportsList", nim.a.v(com.revolut.data.database.models.openbanking.d.y("AsftAirportSearchScreenModel", "observeFullListOfAirports", eVar.d.b(Unit.f186387a, loadingStrategy)), new xpe.c(jVar2, str, 17)));
                    } else {
                        if (!zW) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        pti.e eVar2 = aVar2.f208843a;
                        eVar2.getClass();
                        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                        q0VarY = com.revolut.data.database.models.openbanking.d.y("AsftAirportSearchScreenModel", "observeFullListOfAirports", eVar2.d.b(Unit.f186387a, loadingStrategy));
                    }
                    this.f308828w = null;
                    this.f308829x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, q0VarY, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
