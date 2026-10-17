package com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking;

import a0.d;
import aii.q;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlow;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import uac.i;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/flow/tracking/TrackingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingFlow extends ViewController<q> implements f {
    public final TrackingFlowContract$InputData.OrderDetails K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TrackingFlow(TrackingFlowContract$InputData.OrderDetails inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ibc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingFlow f160144b;

            {
                this.f160144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TrackingFlow trackingFlow = this.f160144b;
                        phm.a aVar = (phm.a) e.j(trackingFlow.m2()).a().get(uac.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", uac.f.class, " is not found"));
                        }
                        uac.f fVar = ((uac.f) aVar2.b()).f278578m;
                        TrackingFlowContract$InputData.OrderDetails orderDetails = trackingFlow.K;
                        orderDetails.getClass();
                        return new i(fVar, orderDetails);
                    case 1:
                        return (b) ((i) this.f160144b.L.getValue()).d.get();
                    default:
                        TrackingFlow trackingFlow2 = this.f160144b;
                        return c.d(0, 6, null, trackingFlow2, (b) trackingFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ibc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingFlow f160144b;

            {
                this.f160144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TrackingFlow trackingFlow = this.f160144b;
                        phm.a aVar = (phm.a) e.j(trackingFlow.m2()).a().get(uac.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", uac.f.class, " is not found"));
                        }
                        uac.f fVar = ((uac.f) aVar2.b()).f278578m;
                        TrackingFlowContract$InputData.OrderDetails orderDetails = trackingFlow.K;
                        orderDetails.getClass();
                        return new i(fVar, orderDetails);
                    case 1:
                        return (b) ((i) this.f160144b.L.getValue()).d.get();
                    default:
                        TrackingFlow trackingFlow2 = this.f160144b;
                        return c.d(0, 6, null, trackingFlow2, (b) trackingFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ibc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TrackingFlow f160144b;

            {
                this.f160144b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TrackingFlow trackingFlow = this.f160144b;
                        phm.a aVar = (phm.a) e.j(trackingFlow.m2()).a().get(uac.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", uac.f.class, " is not found"));
                        }
                        uac.f fVar = ((uac.f) aVar2.b()).f278578m;
                        TrackingFlowContract$InputData.OrderDetails orderDetails = trackingFlow.K;
                        orderDetails.getClass();
                        return new i(fVar, orderDetails);
                    case 1:
                        return (b) ((i) this.f160144b.L.getValue()).d.get();
                    default:
                        TrackingFlow trackingFlow2 = this.f160144b;
                        return c.d(0, 6, null, trackingFlow2, (b) trackingFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (i) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ibc.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
