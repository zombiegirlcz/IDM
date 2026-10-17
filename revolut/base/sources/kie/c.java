package kie;

import amh.w;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import gim.i;
import hy1.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import l71.a;
import vge.x;
import vkm.q;
import xjg.l;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function3 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f184223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f184224x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ProductAccountDescriptor$Value f184225y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, ProductAccountDescriptor$Value productAccountDescriptor$Value, g gVar) {
        super(3, continuation);
        this.f184225y = productAccountDescriptor$Value;
        this.z = gVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c cVar = new c(continuation, this.z, this.f184225y);
                cVar.f184223w = flowCollector;
                cVar.f184224x = obj3;
                return cVar.invokeSuspend(Unit.f186387a);
            default:
                c cVar2 = new c(continuation, this.f184225y, this.z);
                cVar2.f184223w = flowCollector;
                cVar2.f184224x = obj3;
                return cVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    FlowCollector flowCollector = this.f184223w;
                    if (((l71.d) this.f184224x).b().equals(a.h0.f192478a)) {
                        g gVar2 = this.z;
                        gVar = new w(q.Q(gVar2.o.h(), new c((Continuation) null, this.f184225y, gVar2)), 16);
                    } else {
                        gVar = new go.g(f0.f322471a, 2);
                    }
                    this.f184223w = null;
                    this.f184224x = null;
                    this.v = 1;
                    if (q.u(flowCollector, gVar, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f184223w;
                    l lVar = (l) this.f184224x;
                    ProductAccountDescriptor$Value productAccountDescriptor$Value = this.f184225y;
                    ProductId f89727a = productAccountDescriptor$Value.getF89727a();
                    ProductId productId = ProductId.SUBACCOUNT;
                    g gVar3 = this.z;
                    Flow b0Var = f89727a == productId ? new b0(mo3.a.g(nim.a.v(((x) gVar3.f184228l).e(productAccountDescriptor$Value), new kh4.b(15)), null, new kd8.f(23), 1), gVar3, lVar, 12) : new go.g(g.Z2(gVar3, g.b3(gVar3, lVar)), 2);
                    this.f184223w = null;
                    this.f184224x = null;
                    this.v = 1;
                    if (q.u(flowCollector2, b0Var, this) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, g gVar, ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        super(3, continuation);
        this.z = gVar;
        this.f184225y = productAccountDescriptor$Value;
    }
}
