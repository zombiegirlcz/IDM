package com.revolut.feature.feedback.impl.ui.flow.one_click;

import com.revolut.feature.feedback.api.flow.OneClickFeedbackFlowContract$InputData;
import com.revolut.feature.feedback.impl.ui.flow.one_click.OneClickFeedbackFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import cp6.e;
import czi.c;
import gp6.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ni1.a;
import qji.b;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/feedback/impl/ui/flow/one_click/OneClickFeedbackFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcp6/e;", "Lyki/f;", "feature_feedback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OneClickFeedbackFlow extends ViewController<e> implements f {
    public final Object K;
    public final Object L;
    public final Object M;

    public OneClickFeedbackFlow(OneClickFeedbackFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new a(this, inputData, 20));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: np6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneClickFeedbackFlow f218150b;

            {
                this.f218150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (ap6.a) ((g) this.f218150b.K.getValue()).f145276b.get();
                    default:
                        OneClickFeedbackFlow oneClickFeedbackFlow = this.f218150b;
                        return c.d(0, 6, null, oneClickFeedbackFlow, (ap6.a) oneClickFeedbackFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: np6.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OneClickFeedbackFlow f218150b;

            {
                this.f218150b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (ap6.a) ((g) this.f218150b.K.getValue()).f145276b.get();
                    default:
                        OneClickFeedbackFlow oneClickFeedbackFlow = this.f218150b;
                        return c.d(0, 6, null, oneClickFeedbackFlow, (ap6.a) oneClickFeedbackFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ap6.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
