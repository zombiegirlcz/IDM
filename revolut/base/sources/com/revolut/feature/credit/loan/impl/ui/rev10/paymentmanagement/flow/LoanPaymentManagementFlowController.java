package com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow;

import a0.d;
import aii.q;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.LoanPaymentManagementFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.LoanPaymentManagementFlowController;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import u45.h;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/paymentmanagement/flow/LoanPaymentManagementFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanPaymentManagementFlowController extends ViewController<q> implements f {
    public final LoanPaymentManagementFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public LoanPaymentManagementFlowController(LoanPaymentManagementFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: i75.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPaymentManagementFlowController f159189b;

            {
                this.f159189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LoanPaymentManagementFlowController loanPaymentManagementFlowController = this.f159189b;
                        phm.a aVar = (phm.a) e.j(loanPaymentManagementFlowController.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.di.LoanPaymentManagementFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanPaymentManagementFlowContract$InputData loanPaymentManagementFlowContract$InputData = loanPaymentManagementFlowController.K;
                        loanPaymentManagementFlowContract$InputData.getClass();
                        return new u45.w(hVar, loanPaymentManagementFlowContract$InputData);
                    case 1:
                        return (b) ((u45.w) this.f159189b.L.getValue()).d.get();
                    default:
                        LoanPaymentManagementFlowController loanPaymentManagementFlowController2 = this.f159189b;
                        return czi.c.d(0, 6, null, loanPaymentManagementFlowController2, (b) loanPaymentManagementFlowController2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: i75.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPaymentManagementFlowController f159189b;

            {
                this.f159189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LoanPaymentManagementFlowController loanPaymentManagementFlowController = this.f159189b;
                        phm.a aVar = (phm.a) e.j(loanPaymentManagementFlowController.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.di.LoanPaymentManagementFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanPaymentManagementFlowContract$InputData loanPaymentManagementFlowContract$InputData = loanPaymentManagementFlowController.K;
                        loanPaymentManagementFlowContract$InputData.getClass();
                        return new u45.w(hVar, loanPaymentManagementFlowContract$InputData);
                    case 1:
                        return (b) ((u45.w) this.f159189b.L.getValue()).d.get();
                    default:
                        LoanPaymentManagementFlowController loanPaymentManagementFlowController2 = this.f159189b;
                        return czi.c.d(0, 6, null, loanPaymentManagementFlowController2, (b) loanPaymentManagementFlowController2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: i75.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanPaymentManagementFlowController f159189b;

            {
                this.f159189b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LoanPaymentManagementFlowController loanPaymentManagementFlowController = this.f159189b;
                        phm.a aVar = (phm.a) e.j(loanPaymentManagementFlowController.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.flow.di.LoanPaymentManagementFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanPaymentManagementFlowContract$InputData loanPaymentManagementFlowContract$InputData = loanPaymentManagementFlowController.K;
                        loanPaymentManagementFlowContract$InputData.getClass();
                        return new u45.w(hVar, loanPaymentManagementFlowContract$InputData);
                    case 1:
                        return (b) ((u45.w) this.f159189b.L.getValue()).d.get();
                    default:
                        LoanPaymentManagementFlowController loanPaymentManagementFlowController2 = this.f159189b;
                        return czi.c.d(0, 6, null, loanPaymentManagementFlowController2, (b) loanPaymentManagementFlowController2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u45.w) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (u45.w) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i75.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
