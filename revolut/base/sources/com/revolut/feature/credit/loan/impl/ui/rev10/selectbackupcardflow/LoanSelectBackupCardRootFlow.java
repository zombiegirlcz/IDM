package com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow;

import aii.q;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardFlowContract$InputData;
import com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.LoanSelectBackupCardRootFlow;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import u45.h;
import u45.h0;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/loan/impl/ui/rev10/selectbackupcardflow/LoanSelectBackupCardRootFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoanSelectBackupCardRootFlow extends ViewController<q> implements f {
    public final LoanSelectBackupCardFlowContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final Object O;

    public LoanSelectBackupCardRootFlow(LoanSelectBackupCardFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: r85.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectBackupCardRootFlow f252374b;

            {
                this.f252374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (a) ((h0) this.f252374b.M.getValue()).f277146b.get();
                    case 1:
                        LoanSelectBackupCardRootFlow loanSelectBackupCardRootFlow = this.f252374b;
                        phm.a aVar = (phm.a) ue0.e.j(loanSelectBackupCardRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.di.LoanSelectBackupCardFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanSelectBackupCardFlowContract$InputData loanSelectBackupCardFlowContract$InputData = loanSelectBackupCardRootFlow.K;
                        loanSelectBackupCardFlowContract$InputData.getClass();
                        return new h0(hVar, loanSelectBackupCardFlowContract$InputData);
                    default:
                        LoanSelectBackupCardRootFlow loanSelectBackupCardRootFlow2 = this.f252374b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanSelectBackupCardRootFlow2, (a) loanSelectBackupCardRootFlow2.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: r85.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectBackupCardRootFlow f252374b;

            {
                this.f252374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (a) ((h0) this.f252374b.M.getValue()).f277146b.get();
                    case 1:
                        LoanSelectBackupCardRootFlow loanSelectBackupCardRootFlow = this.f252374b;
                        phm.a aVar = (phm.a) ue0.e.j(loanSelectBackupCardRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.di.LoanSelectBackupCardFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanSelectBackupCardFlowContract$InputData loanSelectBackupCardFlowContract$InputData = loanSelectBackupCardRootFlow.K;
                        loanSelectBackupCardFlowContract$InputData.getClass();
                        return new h0(hVar, loanSelectBackupCardFlowContract$InputData);
                    default:
                        LoanSelectBackupCardRootFlow loanSelectBackupCardRootFlow2 = this.f252374b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanSelectBackupCardRootFlow2, (a) loanSelectBackupCardRootFlow2.L.getValue());
                }
            }
        });
        this.N = R$layout.screen_transparent;
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: r85.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LoanSelectBackupCardRootFlow f252374b;

            {
                this.f252374b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (a) ((h0) this.f252374b.M.getValue()).f277146b.get();
                    case 1:
                        LoanSelectBackupCardRootFlow loanSelectBackupCardRootFlow = this.f252374b;
                        phm.a aVar = (phm.a) ue0.e.j(loanSelectBackupCardRootFlow.m2()).a().get(h.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", h.class, " is not found"));
                        }
                        Object objB = aVar2.b();
                        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.credit.loan.impl.ui.rev10.selectbackupcardflow.di.LoanSelectBackupCardFlowInjector");
                        h hVar = ((h) objB).B;
                        LoanSelectBackupCardFlowContract$InputData loanSelectBackupCardFlowContract$InputData = loanSelectBackupCardRootFlow.K;
                        loanSelectBackupCardFlowContract$InputData.getClass();
                        return new h0(hVar, loanSelectBackupCardFlowContract$InputData);
                    default:
                        LoanSelectBackupCardRootFlow loanSelectBackupCardRootFlow2 = this.f252374b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, loanSelectBackupCardRootFlow2, (a) loanSelectBackupCardRootFlow2.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (r85.a) this.L.getValue();
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
