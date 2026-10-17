package apd;

import ahe.h0;
import com.revolut.feature.globe_resources.api.model.TripsMapBitmapConfig;
import com.revolut.retail.feature.api.trips.models.Trip;
import fmc.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.q;
import vkm.y;
import zhm.d0;
import zhm.w;
import zod.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f8171w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f8172x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ o f8173y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Continuation continuation, o oVar, int i) {
        super(3, continuation);
        this.u = i;
        this.f8173y = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                i iVar = new i(continuation, this.f8173y, 0);
                iVar.f8171w = flowCollector;
                iVar.f8172x = obj3;
                return iVar.invokeSuspend(Unit.f186387a);
            default:
                i iVar2 = new i(continuation, this.f8173y, 1);
                iVar2.f8171w = flowCollector;
                iVar2.f8172x = obj3;
                return iVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        TripsMapBitmapConfig.Style style;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f8171w;
                    Continuation continuation = null;
                    if (((Boolean) this.f8172x).booleanValue()) {
                        o oVar = this.f8173y;
                        gVar = new y(new a35.j(2, 4, null), rd0.e.e(mo3.a.g(nim.a.y(nim.a.A(q.Q(q.q(ta6.a.h(mo3.a.g(j0j.a.a(oVar.f8181a), null, j.f8174a, 1), oVar.f8182b.h(), mo3.a.g(oVar.f8183c.j(), null, k.f8175a, 1), new h0(4, 1, continuation))), new i(continuation, oVar, 1)), m.f8179a), n.f8180a), null, null, 3), zhm.h0.f322473a, new a35.k(3, 15, null)));
                    } else {
                        gVar = new go.g(q0.f324026a, 2);
                    }
                    this.f8171w = null;
                    this.f8172x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector2 = this.f8171w;
                    g gVar2 = (g) this.f8172x;
                    List list = gVar2.f8167a;
                    xjg.l lVar = gVar2.f8168b;
                    Set set = gVar2.f8169c;
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((Trip) it8.next()).d.f297794a);
                    }
                    List listU = d0.U(arrayList);
                    ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                    Iterator it9 = list2.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((Trip) it9.next()).d);
                    }
                    int iB = z.b(arrayList2, set);
                    ks0.n nVar = this.f8173y.d;
                    int i3 = h.f8170a[lVar.f306520a.f94562b.ordinal()];
                    if (i3 == 1) {
                        style = TripsMapBitmapConfig.Style.Dark.f74639a;
                    } else if (i3 == 2) {
                        style = TripsMapBitmapConfig.Style.Light.f74642a;
                    } else {
                        if (i3 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        style = lVar.f306521b ? TripsMapBitmapConfig.Style.Dark.f74639a : TripsMapBitmapConfig.Style.Light.f74642a;
                    }
                    akg.n nVarV = nim.a.v(nVar.c(new TripsMapBitmapConfig(listU, style, 32), w4l.h.f294642c), new l(listU, iB, list));
                    this.f8171w = null;
                    this.f8172x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, nVarV, this) == aVar2) {
                        return aVar2;
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
