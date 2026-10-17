package com.revolut.sso.impl.ui.manual_review;

import android.app.Activity;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.R$id;
import com.revolut.sso.impl.R$layout;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlow;
import com.revolut.sso.impl.ui.manual_review.ManualReviewFlowContract$Step;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ljl.b0;
import mnl.f;
import te0.w;
import xki.e;
import yki.c;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/manual_review/ManualReviewFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmnl/f;", "Lyki/f;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManualReviewFlow extends ViewController<f> implements yki.f {
    public final Object K;
    public final Object L;
    public final int M;
    public final Object N;

    public ManualReviewFlow(ManualReviewFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: mnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualReviewFlow f207516b;

            {
                this.f207516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        ManualReviewFlow manualReviewFlow = this.f207516b;
                        return czi.c.d(R$id.manualReviewFlow_container, 4, null, manualReviewFlow, (b) manualReviewFlow.N.getValue());
                    default:
                        return (b) ((b0) this.f207516b.L.getValue()).f195886j.get();
                }
            }
        });
        this.L = w.y0(new mhd.b(this, inputData, 8));
        this.M = R$layout.flow_manual_review;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mnl.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManualReviewFlow f207516b;

            {
                this.f207516b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        ManualReviewFlow manualReviewFlow = this.f207516b;
                        return czi.c.d(R$id.manualReviewFlow_container, 4, null, manualReviewFlow, (b) manualReviewFlow.N.getValue());
                    default:
                        return (b) ((b0) this.f207516b.L.getValue()).f195886j.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        b bVar = (b) ((mnl.b) this.N.getValue());
        ManualReviewFlowContract$Step manualReviewFlowContract$Step = (ManualReviewFlowContract$Step) bVar.f106587w.d();
        if (manualReviewFlowContract$Step instanceof ManualReviewFlowContract$Step.ReviewAwaiting) {
            ((Activity) bVar.u.f190729b).finishAffinity();
            return true;
        }
        if ((manualReviewFlowContract$Step instanceof ManualReviewFlowContract$Step.AuthCancellation) || (manualReviewFlowContract$Step instanceof ManualReviewFlowContract$Step.ReviewPassed) || (manualReviewFlowContract$Step instanceof ManualReviewFlowContract$Step.ReviewRejected) || manualReviewFlowContract$Step == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (b0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (mnl.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.K.getValue();
    }
}
