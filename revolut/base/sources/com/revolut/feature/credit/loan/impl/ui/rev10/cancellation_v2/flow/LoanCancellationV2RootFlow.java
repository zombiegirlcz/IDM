package com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow;

import aii.q;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2FlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.LoanCancellationV2RootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import te0.w;
import u45.k;
import uki.c;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/cancellation_v2/flow/LoanCancellationV2RootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Luki/c;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanCancellationV2RootFlow extends ViewController<q> implements c {
    public final LoanCancellationV2FlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public LoanCancellationV2RootFlow(LoanCancellationV2FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_transparent;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: k65.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanCancellationV2RootFlow f181645b;

            {
                this.f181645b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LoanCancellationV2RootFlow loanCancellationV2RootFlow = this.f181645b;
                        phm.a aVar = (phm.a) ue0.e.j(loanCancellationV2RootFlow.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.di.LoanCancellationV2FlowInjector");
                        u45.h hVar = ((u45.h) objB).B;
                        LoanCancellationV2FlowContract$InputData loanCancellationV2FlowContract$InputData = loanCancellationV2RootFlow.K;
                        loanCancellationV2FlowContract$InputData.getClass();
                        return new k(hVar, loanCancellationV2FlowContract$InputData);
                    case 1:
                        return (a) ((k) this.f181645b.M.getValue()).f277163g.get();
                    default:
                        LoanCancellationV2RootFlow loanCancellationV2RootFlow2 = this.f181645b;
                        return czi.c.a(R$id.screen_transparent_container, (a) loanCancellationV2RootFlow2.N.getValue(), loanCancellationV2RootFlow2);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: k65.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanCancellationV2RootFlow f181645b;

            {
                this.f181645b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LoanCancellationV2RootFlow loanCancellationV2RootFlow = this.f181645b;
                        phm.a aVar = (phm.a) ue0.e.j(loanCancellationV2RootFlow.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.di.LoanCancellationV2FlowInjector");
                        u45.h hVar = ((u45.h) objB).B;
                        LoanCancellationV2FlowContract$InputData loanCancellationV2FlowContract$InputData = loanCancellationV2RootFlow.K;
                        loanCancellationV2FlowContract$InputData.getClass();
                        return new k(hVar, loanCancellationV2FlowContract$InputData);
                    case 1:
                        return (a) ((k) this.f181645b.M.getValue()).f277163g.get();
                    default:
                        LoanCancellationV2RootFlow loanCancellationV2RootFlow2 = this.f181645b;
                        return czi.c.a(R$id.screen_transparent_container, (a) loanCancellationV2RootFlow2.N.getValue(), loanCancellationV2RootFlow2);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: k65.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanCancellationV2RootFlow f181645b;

            {
                this.f181645b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LoanCancellationV2RootFlow loanCancellationV2RootFlow = this.f181645b;
                        phm.a aVar = (phm.a) ue0.e.j(loanCancellationV2RootFlow.m2()).a().get(u45.h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", u45.h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.di.LoanCancellationV2FlowInjector");
                        u45.h hVar = ((u45.h) objB).B;
                        LoanCancellationV2FlowContract$InputData loanCancellationV2FlowContract$InputData = loanCancellationV2RootFlow.K;
                        loanCancellationV2FlowContract$InputData.getClass();
                        return new k(hVar, loanCancellationV2FlowContract$InputData);
                    case 1:
                        return (a) ((k) this.f181645b.M.getValue()).f277163g.get();
                    default:
                        LoanCancellationV2RootFlow loanCancellationV2RootFlow2 = this.f181645b;
                        return czi.c.a(R$id.screen_transparent_container, (a) loanCancellationV2RootFlow2.N.getValue(), loanCancellationV2RootFlow2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (k) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k65.a) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (uki.a) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (uki.a) this.O.getValue();
    }
}
