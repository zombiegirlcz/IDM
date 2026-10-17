package com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails;

import aii.q;
import com.revolut.feature.credit.post_termination_plan.impl.ui.plandetails.PostTerminationPlanDetailsFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oa5.c;
import qji.b;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/post_termination_plan/impl/ui/plandetails/PostTerminationPlanDetailsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_credit_post_termination_plan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PostTerminationPlanDetailsFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PostTerminationPlanDetailsFlow(PostTerminationPlanDetailsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_transparent;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wa5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostTerminationPlanDetailsFlow f295820b;

            {
                this.f295820b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((oa5.c) this.f295820b.N.getValue()).f223540c.get();
                    default:
                        PostTerminationPlanDetailsFlow postTerminationPlanDetailsFlow = this.f295820b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, postTerminationPlanDetailsFlow, (b) postTerminationPlanDetailsFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wa5.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PostTerminationPlanDetailsFlow f295820b;

            {
                this.f295820b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((oa5.c) this.f295820b.N.getValue()).f223540c.get();
                    default:
                        PostTerminationPlanDetailsFlow postTerminationPlanDetailsFlow = this.f295820b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, postTerminationPlanDetailsFlow, (b) postTerminationPlanDetailsFlow.L.getValue());
                }
            }
        });
        this.N = w.y0(new w83.a(this, inputData, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (wa5.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
