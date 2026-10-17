package com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any;

import a0.d;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.feature.revolutpay.impl.ui.flow.pay_with_any.PayWithAnyFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p7c.j;
import p7c.r;
import qji.b;
import te0.w;
import w6c.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/pay_with_any/PayWithAnyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lw6c/e;", "Lyki/f;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayWithAnyFlow extends ViewController<e> implements f {
    public final PayWithAnyControllerDescriptor$InputData K;
    public final int L;
    public final Integer M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PayWithAnyFlow(PayWithAnyControllerDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        this.M = inputData.f84434h ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: w8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithAnyFlow f295640b;

            {
                this.f295640b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PayWithAnyFlow payWithAnyFlow = this.f295640b;
                        phm.a aVar = (phm.a) ue0.e.j(payWithAnyFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = payWithAnyFlow.K;
                        payWithAnyControllerDescriptor$InputData.getClass();
                        return new j(rVar, payWithAnyFlow, payWithAnyControllerDescriptor$InputData);
                    case 1:
                        return (b) ((j) this.f295640b.N.getValue()).f233627g.get();
                    default:
                        PayWithAnyFlow payWithAnyFlow2 = this.f295640b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payWithAnyFlow2, (b) payWithAnyFlow2.O.getValue());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: w8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithAnyFlow f295640b;

            {
                this.f295640b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PayWithAnyFlow payWithAnyFlow = this.f295640b;
                        phm.a aVar = (phm.a) ue0.e.j(payWithAnyFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = payWithAnyFlow.K;
                        payWithAnyControllerDescriptor$InputData.getClass();
                        return new j(rVar, payWithAnyFlow, payWithAnyControllerDescriptor$InputData);
                    case 1:
                        return (b) ((j) this.f295640b.N.getValue()).f233627g.get();
                    default:
                        PayWithAnyFlow payWithAnyFlow2 = this.f295640b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payWithAnyFlow2, (b) payWithAnyFlow2.O.getValue());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: w8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayWithAnyFlow f295640b;

            {
                this.f295640b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PayWithAnyFlow payWithAnyFlow = this.f295640b;
                        phm.a aVar = (phm.a) ue0.e.j(payWithAnyFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData = payWithAnyFlow.K;
                        payWithAnyControllerDescriptor$InputData.getClass();
                        return new j(rVar, payWithAnyFlow, payWithAnyControllerDescriptor$InputData);
                    case 1:
                        return (b) ((j) this.f295640b.N.getValue()).f233627g.get();
                    default:
                        PayWithAnyFlow payWithAnyFlow2 = this.f295640b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, payWithAnyFlow2, (b) payWithAnyFlow2.O.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (w8c.b) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.P.getValue();
    }
}
