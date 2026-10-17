package i2l;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.travel_status.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f158003w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f158004x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m0 f158005y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, m0 m0Var, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.f158005y = m0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                c0 c0Var = new c0(0, this.f158005y, continuation);
                c0Var.f158003w = flowCollector;
                c0Var.f158004x = obj3;
                return c0Var.invokeSuspend(Unit.f186387a);
            default:
                c0 c0Var2 = new c0(1, this.f158005y, continuation);
                c0Var2.f158003w = flowCollector;
                c0Var2.f158004x = obj3;
                return c0Var2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    FlowCollector flowCollector = this.f158003w;
                    String str = (String) this.f158004x;
                    Flow flowZ2 = str != null ? this.f158005y.u.Z2(new i7d.k(new TextLocalisedClause(R$string.travel_status_enrolled_get_help, null, null, 14), "travel_status_partner", zhm.u.c(new i7d.g(str)))) : new go.g(zhm.f0.f322471a, 2);
                    this.f158003w = null;
                    this.f158004x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, flowZ2, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f158003w;
                    Flow flowQ = vkm.q.q(nim.a.v(this.f158005y.f158032y.B(j0.f158021a), k0.f158022a));
                    this.f158003w = null;
                    this.f158004x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, flowQ, this) == aVar2) {
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
