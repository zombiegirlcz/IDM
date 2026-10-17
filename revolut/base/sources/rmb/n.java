package rmb;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import cxe.u;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import rlh.d0;
import rm2.s;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f255227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f255228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ q f255229y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Continuation continuation, q qVar) {
        super(3, continuation);
        this.u = i;
        this.f255229y = qVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                n nVar = new n(0, continuation, this.f255229y);
                nVar.f255227w = flowCollector;
                nVar.f255228x = obj3;
                return nVar.invokeSuspend(Unit.f186387a);
            default:
                n nVar2 = new n(1, continuation, this.f255229y);
                nVar2.f255227w = flowCollector;
                nVar2.f255228x = obj3;
                return nVar2.invokeSuspend(Unit.f186387a);
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
                    FlowCollector flowCollector = this.f255227w;
                    w4l.k kVar = (w4l.k) this.f255228x;
                    q qVar = this.f255229y;
                    akg.n nVarV = nim.a.v(u0.i(ijb.a.a(qVar.o, null, null, null, kVar, 7), rd0.e.b(qVar.f255231p.J(AccountId.Personal.f51414a, kVar)), rd0.e.b(qVar.f255232q.q())), new d0(qVar, 6));
                    this.f255227w = null;
                    this.f255228x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector, nVarV, this) == aVar) {
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
                    FlowCollector flowCollector2 = this.f255227w;
                    u uVarA = nim.a.A(this.f255229y.f255233r.u(((SavingsProductData) this.f255228x).f86683a.f86617a, w4l.h.f294642c), new s(6));
                    this.f255227w = null;
                    this.f255228x = null;
                    this.v = 1;
                    if (vkm.q.u(flowCollector2, uVarA, this) == aVar2) {
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
