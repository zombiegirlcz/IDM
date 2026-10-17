package b4b;

import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderFlowContract$State;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CfdOrderData f12214b;

    public /* synthetic */ c0(CfdOrderData cfdOrderData, int i) {
        this.f12213a = i;
        this.f12214b = cfdOrderData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f12213a) {
            case 0:
                return n.a((n) obj2, this.f12214b, null, null, null, null, null, null, null, null, false, null, null, 8190);
            default:
                String idempotencyKey = ((CfdOrderFlowContract$State) obj2).f82172a;
                Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
                return new CfdOrderFlowContract$State(idempotencyKey, this.f12214b);
        }
    }
}
