package com.revolut.feature.pay_bills_taxes.impl.ui.flow.form;

import com.revolut.feature.pay_bills_taxes.impl.ui.flow.form.FormFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import ef9.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lf9.h;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/flow/form/FormFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lef9/f;", "Lyki/f;", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FormFlow extends ViewController<f> implements yki.f {
    public final Object K;
    public final Object L;
    public final Object M;

    public FormFlow(FormFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new ywi.b(this, inputData, 24));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: zf9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormFlow f321913b;

            {
                this.f321913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((h) this.f321913b.K.getValue()).f.get();
                    default:
                        FormFlow formFlow = this.f321913b;
                        return c.d(0, 6, null, formFlow, (b) formFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: zf9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FormFlow f321913b;

            {
                this.f321913b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((h) this.f321913b.K.getValue()).f.get();
                    default:
                        FormFlow formFlow = this.f321913b;
                        return c.d(0, 6, null, formFlow, (b) formFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (zf9.b) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
