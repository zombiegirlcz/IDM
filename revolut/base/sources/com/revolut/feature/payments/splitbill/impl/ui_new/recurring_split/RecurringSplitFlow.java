package com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split;

import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/recurring_split/RecurringSplitFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lyki/f;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringSplitFlow extends ViewController<Object> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public RecurringSplitFlow(RecurringSplitFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new y1a.a(this, inputData, 0));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: y1a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringSplitFlow f310352b;

            {
                this.f310352b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (c) ((j1a.d) this.f310352b.K.getValue()).d.get();
                    default:
                        RecurringSplitFlow recurringSplitFlow = this.f310352b;
                        return czi.c.d(0, 6, null, recurringSplitFlow, (c) recurringSplitFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: y1a.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringSplitFlow f310352b;

            {
                this.f310352b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (c) ((j1a.d) this.f310352b.K.getValue()).d.get();
                    default:
                        RecurringSplitFlow recurringSplitFlow = this.f310352b;
                        return czi.c.d(0, 6, null, recurringSplitFlow, (c) recurringSplitFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (j1a.d) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j1a.d) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (y1a.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
