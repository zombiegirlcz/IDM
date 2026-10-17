package cdh;

import com.revolut.feature.widgets.api.exception.WidgetNotAvailableException;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import te0.s;
import vkm.q;
import xzg.n0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function3 {
    public final /* synthetic */ String A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f23247w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f23248x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f23249y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Continuation continuation, j jVar, String str, String str2, int i) {
        super(3, continuation);
        this.u = i;
        this.f23249y = jVar;
        this.z = str;
        this.A = str2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                f fVar = new f(continuation, this.f23249y, this.z, this.A, 0);
                fVar.f23247w = flowCollector;
                fVar.f23248x = obj3;
                return fVar.invokeSuspend(Unit.f186387a);
            default:
                f fVar2 = new f(continuation, this.f23249y, this.z, this.A, 1);
                fVar2.f23247w = flowCollector;
                fVar2.f23248x = obj3;
                return fVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        r rVarC;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f23247w;
                    Continuation continuation = null;
                    if (!((Boolean) this.f23248x).booleanValue()) {
                        throw new WidgetNotAvailableException(null, 3);
                    }
                    j jVar = this.f23249y;
                    n nVar = jVar.e;
                    w0h.d assetType = jVar.f23258b.h();
                    nVar.getClass();
                    Intrinsics.checkNotNullParameter(assetType, "assetType");
                    String widgetId = this.z;
                    Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                    String strA = n.a(assetType, widgetId);
                    ne0.d dVar = nVar.f23264a;
                    te0.r rVar = (te0.r) dVar.get(strA);
                    s sVar = s.f270018a;
                    if (rVar == null || (rVarC = rVar.c(sVar)) == null) {
                        te0.r rVar2 = new te0.r(n0.GAINERS);
                        dVar.f(strA, rVar2);
                        rVarC = rVar2.c(sVar);
                    }
                    wkm.l lVarQ = q.Q(rd0.e.b(rVarC), new f(continuation, jVar, widgetId, this.A, 1));
                    this.f23247w = null;
                    this.f23248x = null;
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f23247w;
                    n0 filter = (n0) this.f23248x;
                    j jVar2 = this.f23249y;
                    b9k.f fVar = jVar2.f23259c;
                    w0h.d assetType2 = jVar2.f23258b.h();
                    Intrinsics.checkNotNullParameter(assetType2, "assetType");
                    Intrinsics.checkNotNullParameter(filter, "filter");
                    vkm.d dVarB = rd0.e.b(x9h.e.f303737a[filter.ordinal()] == 1 ? fVar.v(assetType2, n0.LOSERS, new x9h.a(fVar, 1), new x9h.b(fVar, 2), new x8i.h(9)) : fVar.v(assetType2, n0.GAINERS, new x9h.a(fVar, 0), new x9h.b(fVar, 1), new x8i.h(8)));
                    String str = this.z;
                    wkm.l lVarE = yoj.b.e(dVarB, new g(jVar2, str, filter), new h(jVar2, str, this.A, filter), new i(jVar2, str));
                    this.f23247w = null;
                    this.f23248x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, lVarE, this) == aVar2) {
                        return aVar2;
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
