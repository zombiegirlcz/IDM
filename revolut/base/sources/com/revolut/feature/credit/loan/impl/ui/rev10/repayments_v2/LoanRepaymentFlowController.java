package com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2;

import aii.q;
import com.revolut.feature.credit.loan.impl.ui.rev10.repayments_v2.LoanRepaymentFlowController;
import com.revolut.kompot.R$id;
import com.revolut.kompot.navigable.vc.ViewController;
import cvi.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import u45.c0;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/repayments_v2/LoanRepaymentFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanRepaymentFlowController extends ViewController<q> implements c {
    public final Object K;
    public final Object L;
    public final Object M;

    public LoanRepaymentFlowController(LoanRepaymentFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: d85.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentFlowController f112129b;

            {
                this.f112129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LoanRepaymentFlowController loanRepaymentFlowController = this.f112129b;
                        return czi.c.a(R$id.container, (a) loanRepaymentFlowController.M.getValue(), loanRepaymentFlowController);
                    default:
                        return (a) ((c0) this.f112129b.L.getValue()).d.get();
                }
            }
        });
        this.L = w.y0(new b(this, inputData, 19));
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: d85.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanRepaymentFlowController f112129b;

            {
                this.f112129b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LoanRepaymentFlowController loanRepaymentFlowController = this.f112129b;
                        return czi.c.a(R$id.container, (a) loanRepaymentFlowController.M.getValue(), loanRepaymentFlowController);
                    default:
                        return (a) ((c0) this.f112129b.L.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (c0) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (d85.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.K.getValue();
    }
}
