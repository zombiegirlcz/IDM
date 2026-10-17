package ftk;

import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import et6.u1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f138030w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f138031x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f138032y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Continuation continuation, d dVar, String str, int i) {
        super(3, continuation);
        this.u = i;
        this.f138032y = dVar;
        this.z = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                b bVar = new b(continuation, this.f138032y, this.z, 0);
                bVar.f138030w = flowCollector;
                bVar.f138031x = obj3;
                return bVar.invokeSuspend(Unit.f186387a);
            default:
                b bVar2 = new b(continuation, this.f138032y, this.z, 1);
                bVar2.f138030w = flowCollector;
                bVar2.f138031x = obj3;
                return bVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        Flow gVar2;
        int i = this.u;
        String str = this.z;
        d dVar = this.f138032y;
        Continuation continuation = null;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f138030w;
                    if (((Boolean) this.f138031x).booleanValue()) {
                        qrk.c cVar = dVar.f138034a;
                        qrk.c cVar2 = dVar.f138034a;
                        w4l.i iVar = w4l.i.f294643c;
                        gVar = new u1(yh5.b.h(cVar.b(str, iVar), cVar2.a(str, iVar), cVar2.c(str, iVar), c8g.a.D(((ael.k) dVar.f138035b).o(str, iVar)), dVar.f138036c.w0()), dVar, 12);
                    } else {
                        gVar = new go.g(g.f138040a, 2);
                    }
                    this.f138030w = null;
                    this.f138031x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f138030w;
                    if (((Boolean) this.f138031x).booleanValue()) {
                        ybl.k kVar = dVar.d;
                        TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
                        Intrinsics.checkNotNullParameter(elements, "elements");
                        gVar2 = q.Q(mo3.a.g(com.revolut.data.database.models.openbanking.d.x("SuggestionProviderImpl", "observeEligibleWidgetState", ybl.k.f(kVar, kotlin.collections.d.y0(elements), 4)), null, new fq7.j(15), 1), new b(continuation, dVar, str, 0));
                    } else {
                        gVar2 = new go.g(f.f138039a, 2);
                    }
                    this.f138030w = null;
                    this.f138031x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, gVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
