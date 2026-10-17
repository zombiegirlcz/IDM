package uac;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlowContract$InputData;
import java.util.Set;
import u45.v;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TrackingFlowContract$InputData f278583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f278584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f278585c = this;
    public final e4m.e d = e4m.b.b(new v(this, 13));

    public i(f fVar, TrackingFlowContract$InputData.OrderDetails orderDetails) {
        this.f278584b = fVar;
        this.f278583a = orderDetails;
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
