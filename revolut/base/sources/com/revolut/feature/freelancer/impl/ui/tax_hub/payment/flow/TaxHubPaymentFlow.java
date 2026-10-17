package com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow;

import bt6.n;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlow;
import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.flow.TaxHubPaymentFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/payment/flow/TaxHubPaymentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ln37/c;", "Lyki/f;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubPaymentFlow extends ViewController<n37.c> implements f {
    public final TaxHubPaymentFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public TaxHubPaymentFlow(TaxHubPaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: n37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentFlow f211917b;

            {
                this.f211917b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TaxHubPaymentFlow taxHubPaymentFlow = this.f211917b;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubPaymentFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubPaymentFlowContract$InputData taxHubPaymentFlowContract$InputData = taxHubPaymentFlow.K;
                        taxHubPaymentFlowContract$InputData.getClass();
                        return new n(bVar, taxHubPaymentFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f211917b.L.getValue()).d.get();
                    default:
                        TaxHubPaymentFlow taxHubPaymentFlow2 = this.f211917b;
                        return czi.c.d(0, 6, null, taxHubPaymentFlow2, (b) taxHubPaymentFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: n37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentFlow f211917b;

            {
                this.f211917b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TaxHubPaymentFlow taxHubPaymentFlow = this.f211917b;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubPaymentFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubPaymentFlowContract$InputData taxHubPaymentFlowContract$InputData = taxHubPaymentFlow.K;
                        taxHubPaymentFlowContract$InputData.getClass();
                        return new n(bVar, taxHubPaymentFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f211917b.L.getValue()).d.get();
                    default:
                        TaxHubPaymentFlow taxHubPaymentFlow2 = this.f211917b;
                        return czi.c.d(0, 6, null, taxHubPaymentFlow2, (b) taxHubPaymentFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: n37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubPaymentFlow f211917b;

            {
                this.f211917b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TaxHubPaymentFlow taxHubPaymentFlow = this.f211917b;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubPaymentFlow.m2()).a().get(bt6.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", bt6.b.class, " is not found"));
                        }
                        bt6.b bVar = ((bt6.b) aVar2.b()).f18307t;
                        TaxHubPaymentFlowContract$InputData taxHubPaymentFlowContract$InputData = taxHubPaymentFlow.K;
                        taxHubPaymentFlowContract$InputData.getClass();
                        return new n(bVar, taxHubPaymentFlowContract$InputData);
                    case 1:
                        return (b) ((n) this.f211917b.L.getValue()).d.get();
                    default:
                        TaxHubPaymentFlow taxHubPaymentFlow2 = this.f211917b;
                        return czi.c.d(0, 6, null, taxHubPaymentFlow2, (b) taxHubPaymentFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (n37.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
