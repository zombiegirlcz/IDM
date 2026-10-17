package bg2;

import aqd.n1;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.payments.api.mapper.PaymentPocketInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.m;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x f15081w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(x xVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f15081w = xVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                v vVar = new v(this.f15081w, continuation, 0);
                vVar.v = obj2;
                return vVar;
            case 1:
                v vVar2 = new v(this.f15081w, continuation, 1);
                vVar2.v = obj2;
                return vVar2;
            default:
                v vVar3 = new v(this.f15081w, continuation, 2);
                vVar3.v = ((yhm.m) obj2).f314193a;
                return vVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((v) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((v) create((PaymentPocketInfo) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((v) create(new yhm.m(((yhm.m) obj2).f314193a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        x xVar = this.f15081w;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.z, new n1(1, bool));
                break;
            case 1:
                PaymentPocketInfo paymentPocketInfo = (PaymentPocketInfo) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xVar.H2(xVar.z, new w(paymentPocketInfo, 0));
                break;
            default:
                Object obj3 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m.Companion companion = yhm.m.INSTANCE;
                if (!(obj3 instanceof yhm.n)) {
                    xVar.H2(xVar.z, new as1.t((ApmQuote) obj3, 1));
                }
                break;
        }
        return Unit.f186387a;
    }
}
