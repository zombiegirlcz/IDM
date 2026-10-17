package com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow;

import a0.d;
import aii.q;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.LoanDocumentsFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.LoanDocumentsFlowController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import u45.h;
import u45.r;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/documents/flow/LoanDocumentsFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanDocumentsFlowController extends ViewController<q> implements f {
    public final LoanDocumentsFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public LoanDocumentsFlowController(LoanDocumentsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: t65.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanDocumentsFlowController f268253b;

            {
                this.f268253b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LoanDocumentsFlowController loanDocumentsFlowController = this.f268253b;
                        phm.a aVar = (phm.a) e.j(loanDocumentsFlowController.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.di.LoanDocumentsFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanDocumentsFlowContract$InputData loanDocumentsFlowContract$InputData = loanDocumentsFlowController.K;
                        loanDocumentsFlowContract$InputData.getClass();
                        return new r(hVar, loanDocumentsFlowContract$InputData);
                    case 1:
                        return (a) ((r) this.f268253b.M.getValue()).d.get();
                    default:
                        LoanDocumentsFlowController loanDocumentsFlowController2 = this.f268253b;
                        return c.d(R$id.screen_transparent_container, 4, null, loanDocumentsFlowController2, (a) loanDocumentsFlowController2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: t65.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanDocumentsFlowController f268253b;

            {
                this.f268253b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LoanDocumentsFlowController loanDocumentsFlowController = this.f268253b;
                        phm.a aVar = (phm.a) e.j(loanDocumentsFlowController.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.di.LoanDocumentsFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanDocumentsFlowContract$InputData loanDocumentsFlowContract$InputData = loanDocumentsFlowController.K;
                        loanDocumentsFlowContract$InputData.getClass();
                        return new r(hVar, loanDocumentsFlowContract$InputData);
                    case 1:
                        return (a) ((r) this.f268253b.M.getValue()).d.get();
                    default:
                        LoanDocumentsFlowController loanDocumentsFlowController2 = this.f268253b;
                        return c.d(R$id.screen_transparent_container, 4, null, loanDocumentsFlowController2, (a) loanDocumentsFlowController2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: t65.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanDocumentsFlowController f268253b;

            {
                this.f268253b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LoanDocumentsFlowController loanDocumentsFlowController = this.f268253b;
                        phm.a aVar = (phm.a) e.j(loanDocumentsFlowController.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.documents.flow.di.LoanDocumentsFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanDocumentsFlowContract$InputData loanDocumentsFlowContract$InputData = loanDocumentsFlowController.K;
                        loanDocumentsFlowContract$InputData.getClass();
                        return new r(hVar, loanDocumentsFlowContract$InputData);
                    case 1:
                        return (a) ((r) this.f268253b.M.getValue()).d.get();
                    default:
                        LoanDocumentsFlowController loanDocumentsFlowController2 = this.f268253b;
                        return c.d(R$id.screen_transparent_container, 4, null, loanDocumentsFlowController2, (a) loanDocumentsFlowController2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (r) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (r) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (t65.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
