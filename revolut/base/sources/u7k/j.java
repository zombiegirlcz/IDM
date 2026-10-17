package u7k;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkNotActiveException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function3 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f277963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f277964x;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        j jVar = new j(3, (Continuation) obj4);
        jVar.f277963w = (FlowCollector) obj2;
        jVar.f277964x = (Data) obj3;
        return jVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        FlowCollector flowCollector = this.f277963w;
        Data data = this.f277964x;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.v;
        if (i2 == 0) {
            yhm.o.b(obj2);
            boolean z = data.getError() instanceof PaymentLinkNotActiveException;
            if (z) {
                data = new Data(null, data.getError(), false, 5, null);
            }
            this.f277963w = null;
            this.f277964x = null;
            this.u = z ? 1 : 0;
            this.v = 1;
            if (flowCollector.emit(data, this) == obj3) {
                return obj3;
            }
            i = z ? 1 : 0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.u;
            yhm.o.b(obj2);
        }
        return Boolean.valueOf(i == 0);
    }
}
