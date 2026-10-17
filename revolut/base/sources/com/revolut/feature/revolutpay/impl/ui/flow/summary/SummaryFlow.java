package com.revolut.feature.revolutpay.impl.ui.flow.summary;

import a0.d;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$InputData;
import com.revolut.feature.revolutpay.api.domain.models.order.RevolutPayOrderSummaryContract$OutputData;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlow;
import com.revolut.feature.revolutpay.impl.ui.flow.summary.SummaryFlowContract$PaymentResult;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p7c.r;
import p7c.x;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/ui/flow/summary/SummaryFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/revolutpay/api/domain/models/order/RevolutPayOrderSummaryContract$OutputData;", "Lyki/f;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryFlow extends ViewController<RevolutPayOrderSummaryContract$OutputData> implements f {
    public final RevolutPayOrderSummaryContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public SummaryFlow(RevolutPayOrderSummaryContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$style.UiKitTheme_Transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: z8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryFlow f320067b;

            {
                this.f320067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        SummaryFlow summaryFlow = this.f320067b;
                        phm.a aVar = (phm.a) e.j(summaryFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = summaryFlow.K;
                        revolutPayOrderSummaryContract$InputData.getClass();
                        return new x(rVar, revolutPayOrderSummaryContract$InputData);
                    case 1:
                        return (b) ((x) this.f320067b.M.getValue()).d.get();
                    default:
                        SummaryFlow summaryFlow2 = this.f320067b;
                        return czi.c.d(0, 6, null, summaryFlow2, (b) summaryFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: z8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryFlow f320067b;

            {
                this.f320067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        SummaryFlow summaryFlow = this.f320067b;
                        phm.a aVar = (phm.a) e.j(summaryFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = summaryFlow.K;
                        revolutPayOrderSummaryContract$InputData.getClass();
                        return new x(rVar, revolutPayOrderSummaryContract$InputData);
                    case 1:
                        return (b) ((x) this.f320067b.M.getValue()).d.get();
                    default:
                        SummaryFlow summaryFlow2 = this.f320067b;
                        return czi.c.d(0, 6, null, summaryFlow2, (b) summaryFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: z8c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SummaryFlow f320067b;

            {
                this.f320067b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        SummaryFlow summaryFlow = this.f320067b;
                        phm.a aVar = (phm.a) e.j(summaryFlow.m2()).a().get(r.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", r.class, " is not found"));
                        }
                        r rVar = ((r) aVar2.b()).D;
                        RevolutPayOrderSummaryContract$InputData revolutPayOrderSummaryContract$InputData = summaryFlow.K;
                        revolutPayOrderSummaryContract$InputData.getClass();
                        return new x(rVar, revolutPayOrderSummaryContract$InputData);
                    case 1:
                        return (b) ((x) this.f320067b.M.getValue()).d.get();
                    default:
                        SummaryFlow summaryFlow2 = this.f320067b;
                        return czi.c.d(0, 6, null, summaryFlow2, (b) summaryFlow2.N.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.L);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) ((z8c.b) this.N.getValue())).J2(SummaryFlowContract$PaymentResult.DropOff.f84482a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (x) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (z8c.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
