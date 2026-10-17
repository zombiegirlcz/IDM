package d7j;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class c1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f111983w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f111984x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(int i, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f111984x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c1 c1Var = new c1(0, this.f111984x, continuation);
                c1Var.f111983w = obj2;
                return c1Var;
            case 1:
                c1 c1Var2 = new c1(1, this.f111984x, continuation);
                c1Var2.f111983w = obj2;
                return c1Var2;
            default:
                c1 c1Var3 = new c1(2, this.f111984x, continuation);
                c1Var3.f111983w = obj2;
                return c1Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c1) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c1) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c1) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                Map map = (Map) this.f111983w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = this.f111984x;
                    d3i.k kVar = new d3i.k(gVar, map, 17);
                    this.f111983w = null;
                    this.v = 1;
                    if (gVar.P2(this, kVar) == aVar) {
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
                Pair pair = (Pair) this.f111983w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar2 = this.f111984x;
                    d3i.k kVar2 = new d3i.k(gVar2, pair, 18);
                    this.f111983w = null;
                    this.v = 1;
                    if (gVar2.P2(this, kVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                String str = (String) this.f111983w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar3 = this.f111984x;
                    d3i.k kVar3 = new d3i.k(gVar3, str, 19);
                    this.f111983w = null;
                    this.v = 1;
                    if (gVar3.P2(this, kVar3) == aVar3) {
                        return aVar3;
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
