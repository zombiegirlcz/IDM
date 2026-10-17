package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow;

import aii.q;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.LoanCancellationFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.LoanCancellationRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import u45.j;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/cancellation/flow/LoanCancellationRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanCancellationRootFlow extends ViewController<q> implements f {
    public final LoanCancellationFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public LoanCancellationRootFlow(LoanCancellationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: e65.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanCancellationRootFlow f122920b;

            {
                this.f122920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (a) ((u45.j) this.f122920b.M.getValue()).f277156g.get();
                    case 1:
                        LoanCancellationRootFlow loanCancellationRootFlow = this.f122920b;
                        phm.a aVar = (phm.a) ue0.e.j(loanCancellationRootFlow.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.di.LoanCancellationFlowInjector");
                        u45.h hVar = ((u45.h) objB).B;
                        LoanCancellationFlowContract$InputData loanCancellationFlowContract$InputData = loanCancellationRootFlow.K;
                        loanCancellationFlowContract$InputData.getClass();
                        return new u45.j(hVar, loanCancellationFlowContract$InputData);
                    default:
                        LoanCancellationRootFlow loanCancellationRootFlow2 = this.f122920b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanCancellationRootFlow2, (a) loanCancellationRootFlow2.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: e65.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanCancellationRootFlow f122920b;

            {
                this.f122920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (a) ((u45.j) this.f122920b.M.getValue()).f277156g.get();
                    case 1:
                        LoanCancellationRootFlow loanCancellationRootFlow = this.f122920b;
                        phm.a aVar = (phm.a) ue0.e.j(loanCancellationRootFlow.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.di.LoanCancellationFlowInjector");
                        u45.h hVar = ((u45.h) objB).B;
                        LoanCancellationFlowContract$InputData loanCancellationFlowContract$InputData = loanCancellationRootFlow.K;
                        loanCancellationFlowContract$InputData.getClass();
                        return new u45.j(hVar, loanCancellationFlowContract$InputData);
                    default:
                        LoanCancellationRootFlow loanCancellationRootFlow2 = this.f122920b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanCancellationRootFlow2, (a) loanCancellationRootFlow2.L.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: e65.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanCancellationRootFlow f122920b;

            {
                this.f122920b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (a) ((u45.j) this.f122920b.M.getValue()).f277156g.get();
                    case 1:
                        LoanCancellationRootFlow loanCancellationRootFlow = this.f122920b;
                        phm.a aVar = (phm.a) ue0.e.j(loanCancellationRootFlow.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation.flow.di.LoanCancellationFlowInjector");
                        u45.h hVar = ((u45.h) objB).B;
                        LoanCancellationFlowContract$InputData loanCancellationFlowContract$InputData = loanCancellationRootFlow.K;
                        loanCancellationFlowContract$InputData.getClass();
                        return new u45.j(hVar, loanCancellationFlowContract$InputData);
                    default:
                        LoanCancellationRootFlow loanCancellationRootFlow2 = this.f122920b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanCancellationRootFlow2, (a) loanCancellationRootFlow2.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (j) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (e65.a) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.O.getValue();
    }
}
