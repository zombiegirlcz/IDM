package com.revolut.retail.feature.impl.budgeting.ui.rev10.flow;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.flow.BudgetingFlow;
import czi.c;
import erj.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/impl/budgeting/ui/rev10/flow/BudgetingFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_budgeting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BudgetingFlow extends ViewController<q> implements f {
    public final Object K;
    public final int L;
    public final Object M;
    public final Object N;

    public BudgetingFlow(BudgetingFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: prj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetingFlow f239039b;

            {
                this.f239039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((i) this.f239039b.N.getValue()).d.get();
                    default:
                        int i2 = R$id.screen_transparent_container;
                        BudgetingFlow budgetingFlow = this.f239039b;
                        return c.d(i2, 4, null, budgetingFlow, (b) budgetingFlow.K.getValue());
                }
            }
        });
        this.L = R$layout.screen_transparent;
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: prj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BudgetingFlow f239039b;

            {
                this.f239039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((i) this.f239039b.N.getValue()).d.get();
                    default:
                        int i22 = R$id.screen_transparent_container;
                        BudgetingFlow budgetingFlow = this.f239039b;
                        return c.d(i22, 4, null, budgetingFlow, (b) budgetingFlow.K.getValue());
                }
            }
        });
        this.N = w.y0(new pe2.c(this, inputData, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (prj.b) this.K.getValue();
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
