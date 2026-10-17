package l27;

import ble.o1;
import dp4.y0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l10.m;
import vdl.c1;
import vkm.q;
import vkm.v1;
import vvh.l;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f191690w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f191691x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f191692y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i2, Object obj2, Continuation continuation) {
        super(3, continuation);
        this.u = i2;
        this.z = obj2;
        this.f191692y = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                g gVar = new g(this.f191692y, 0, (i) this.z, continuation);
                gVar.f191690w = flowCollector;
                gVar.f191691x = obj3;
                return gVar.invokeSuspend(Unit.f186387a);
            case 1:
                g gVar2 = new g(this.f191692y, 1, (s28.f) this.z, continuation);
                gVar2.f191690w = flowCollector;
                gVar2.f191691x = obj3;
                return gVar2.invokeSuspend(Unit.f186387a);
            default:
                g gVar3 = new g(this.f191692y, 2, (l) this.z, continuation);
                gVar3.f191690w = flowCollector;
                gVar3.f191691x = obj3;
                return gVar3.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f191690w;
                    v1 v1Var = new v1(new y0(this.f191692y, (Continuation) null, (i) this.z));
                    this.f191690w = null;
                    this.f191691x = null;
                    this.v = 1;
                    if (q.u(flowCollector, v1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                s28.f fVar = (s28.f) this.z;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector2 = this.f191690w;
                    boolean zBooleanValue = ((Boolean) this.f191691x).booleanValue();
                    Continuation continuation = null;
                    int i3 = this.f191692y;
                    wkm.l lVarQ = zBooleanValue ? q.Q(boh.f.e(fVar.f259260a.y0(v.k(x08.c.REV_INSIGHT, x08.c.PRICE_ALERT), s28.h.f, null), new s28.e(fVar, i3, 1)), new o1(3, continuation, fVar.b(i3))) : fVar.c(i3);
                    this.f191690w = null;
                    this.f191691x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, lVarQ, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                l lVar = (l) this.z;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector3 = this.f191690w;
                    String str = (String) ((Map) this.f191691x).get("pocketId");
                    int i6 = this.f191692y;
                    Flow gVar = str == null ? new go.g(l.c(lVar, i6), 2) : str.equals("PocketsSummary") ? q.Q(q.q(new vvh.e(mo3.a.g(new v1(new m(lVar, false, (Continuation) null)), null, new vv7.l(2), 1), 0)), new c1((Continuation) null, lVar, 24)) : new v1(new vvh.k(i6, str, null, lVar));
                    this.f191690w = null;
                    this.f191691x = null;
                    this.v = 1;
                    if (q.u(flowCollector3, gVar, this) == aVar3) {
                        return aVar3;
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
