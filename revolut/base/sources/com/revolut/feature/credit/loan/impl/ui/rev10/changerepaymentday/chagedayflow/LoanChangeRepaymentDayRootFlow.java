package com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow;

import aii.q;
import com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.chagedayflow.LoanChangeRepaymentDayRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nsh.e;
import te0.w;
import u45.l;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/changerepaymentday/chagedayflow/LoanChangeRepaymentDayRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanChangeRepaymentDayRootFlow extends ViewController<q> implements f {
    public final Object K;
    public final int L;
    public final Object M;
    public final Object N;

    public LoanChangeRepaymentDayRootFlow(LoanChangeRepaymentDayFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: o65.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanChangeRepaymentDayRootFlow f222522b;

            {
                this.f222522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (a) ((u45.l) this.f222522b.M.getValue()).e.get();
                    default:
                        LoanChangeRepaymentDayRootFlow loanChangeRepaymentDayRootFlow = this.f222522b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanChangeRepaymentDayRootFlow, (a) loanChangeRepaymentDayRootFlow.K.getValue());
                }
            }
        });
        this.L = R$layout.screen_transparent;
        this.M = w.y0(new e(this, inputData, 21));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: o65.p

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanChangeRepaymentDayRootFlow f222522b;

            {
                this.f222522b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (a) ((u45.l) this.f222522b.M.getValue()).e.get();
                    default:
                        LoanChangeRepaymentDayRootFlow loanChangeRepaymentDayRootFlow = this.f222522b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanChangeRepaymentDayRootFlow, (a) loanChangeRepaymentDayRootFlow.K.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (o65.a) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
