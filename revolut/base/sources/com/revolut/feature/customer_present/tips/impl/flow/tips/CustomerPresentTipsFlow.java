package com.revolut.feature.customer_present.tips.impl.flow.tips;

import c06.d;
import com.revolut.feature.customer_present.tips.api.navigation.CustomerPresentTipsFlowDescriptor$InputData;
import com.revolut.feature.customer_present.tips.impl.flow.tips.CustomerPresentTipsFlow;
import com.revolut.kompot.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.b;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/customer_present/tips/impl/flow/tips/CustomerPresentTipsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyz5/a;", "Lyki/f;", "feature_customer_present_tips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomerPresentTipsFlow extends ViewController<yz5.a> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CustomerPresentTipsFlow(CustomerPresentTipsFlowDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.base_flow_container;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: d06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomerPresentTipsFlow f110322b;

            {
                this.f110322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CustomerPresentTipsFlow customerPresentTipsFlow = this.f110322b;
                        return c.d(0, 6, null, customerPresentTipsFlow, (b) customerPresentTipsFlow.M.getValue());
                    default:
                        return (b) ((d) this.f110322b.N.getValue()).f20177b.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: d06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomerPresentTipsFlow f110322b;

            {
                this.f110322b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CustomerPresentTipsFlow customerPresentTipsFlow = this.f110322b;
                        return c.d(0, 6, null, customerPresentTipsFlow, (b) customerPresentTipsFlow.M.getValue());
                    default:
                        return (b) ((d) this.f110322b.N.getValue()).f20177b.get();
                }
            }
        });
        this.N = w.y0(new b(this, inputData, 6));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (d06.b) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.L.getValue();
    }
}
