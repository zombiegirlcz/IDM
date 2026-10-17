package com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment;

import aii.q;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlow;
import com.revolut.feature.pay_with_smile.impl.ui.flow.enrollment.PayWithSmileEnrollmentFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import tl9.g;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_with_smile/impl/ui/flow/enrollment/PayWithSmileEnrollmentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_pay_with_smile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayWithSmileEnrollmentFlow extends ViewController<q> implements f {
    public final PayWithSmileEnrollmentFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public PayWithSmileEnrollmentFlow(PayWithSmileEnrollmentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: bm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileEnrollmentFlow f16769b;

            {
                this.f16769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PayWithSmileEnrollmentFlow payWithSmileEnrollmentFlow = this.f16769b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payWithSmileEnrollmentFlow, (b) payWithSmileEnrollmentFlow.O.getValue());
                    case 1:
                        PayWithSmileEnrollmentFlow payWithSmileEnrollmentFlow2 = this.f16769b;
                        phm.a aVar = (phm.a) ue0.e.j(payWithSmileEnrollmentFlow2.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((g) aVar2.b())).k;
                        PayWithSmileEnrollmentFlowContract$InputData payWithSmileEnrollmentFlowContract$InputData = payWithSmileEnrollmentFlow2.K;
                        payWithSmileEnrollmentFlowContract$InputData.getClass();
                        return new tl9.e(cVar, payWithSmileEnrollmentFlowContract$InputData);
                    default:
                        return (b) ((tl9.e) this.f16769b.N.getValue()).f272037b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: bm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileEnrollmentFlow f16769b;

            {
                this.f16769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PayWithSmileEnrollmentFlow payWithSmileEnrollmentFlow = this.f16769b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payWithSmileEnrollmentFlow, (b) payWithSmileEnrollmentFlow.O.getValue());
                    case 1:
                        PayWithSmileEnrollmentFlow payWithSmileEnrollmentFlow2 = this.f16769b;
                        phm.a aVar = (phm.a) ue0.e.j(payWithSmileEnrollmentFlow2.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((g) aVar2.b())).k;
                        PayWithSmileEnrollmentFlowContract$InputData payWithSmileEnrollmentFlowContract$InputData = payWithSmileEnrollmentFlow2.K;
                        payWithSmileEnrollmentFlowContract$InputData.getClass();
                        return new tl9.e(cVar, payWithSmileEnrollmentFlowContract$InputData);
                    default:
                        return (b) ((tl9.e) this.f16769b.N.getValue()).f272037b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: bm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithSmileEnrollmentFlow f16769b;

            {
                this.f16769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PayWithSmileEnrollmentFlow payWithSmileEnrollmentFlow = this.f16769b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payWithSmileEnrollmentFlow, (b) payWithSmileEnrollmentFlow.O.getValue());
                    case 1:
                        PayWithSmileEnrollmentFlow payWithSmileEnrollmentFlow2 = this.f16769b;
                        phm.a aVar = (phm.a) ue0.e.j(payWithSmileEnrollmentFlow2.m2()).a().get(g.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", g.class, " is not found"));
                        }
                        tl9.c cVar = ((tl9.c) ((g) aVar2.b())).k;
                        PayWithSmileEnrollmentFlowContract$InputData payWithSmileEnrollmentFlowContract$InputData = payWithSmileEnrollmentFlow2.K;
                        payWithSmileEnrollmentFlowContract$InputData.getClass();
                        return new tl9.e(cVar, payWithSmileEnrollmentFlowContract$InputData);
                    default:
                        return (b) ((tl9.e) this.f16769b.N.getValue()).f272037b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (tl9.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (tl9.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bm9.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
