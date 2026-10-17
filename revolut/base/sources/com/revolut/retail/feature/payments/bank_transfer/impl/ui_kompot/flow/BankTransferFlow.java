package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.flow.BankTransferFlow;
import d2k.f;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import p2k.d0;
import p2k.n;
import te0.w;
import ue0.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/flow/BankTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld2k/f;", "Lin0/g;", "Lyki/f;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferFlow extends ViewController<f> implements g, yki.f {
    public final BankTransferFlowInputData K;
    public final i L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BankTransferFlow(BankTransferFlowInputData inputData, i customBalancesFilterInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customBalancesFilterInteractor, "customBalancesFilterInteractor");
        this.K = inputData;
        this.L = customBalancesFilterInteractor;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: n4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferFlow f212463b;

            {
                this.f212463b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BankTransferFlow bankTransferFlow = this.f212463b;
                        phm.a aVar = (phm.a) e.j(bankTransferFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferFlow.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferFlow.L;
                        iVar.getClass();
                        return new p2k.i(nVar, bankTransferFlowInputData, iVar);
                    case 1:
                        return (b) ((p2k.i) this.f212463b.M.getValue()).f232367r.get();
                    default:
                        BankTransferFlow bankTransferFlow2 = this.f212463b;
                        return czi.c.d(0, 6, null, bankTransferFlow2, (b) bankTransferFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: n4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferFlow f212463b;

            {
                this.f212463b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BankTransferFlow bankTransferFlow = this.f212463b;
                        phm.a aVar = (phm.a) e.j(bankTransferFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferFlow.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferFlow.L;
                        iVar.getClass();
                        return new p2k.i(nVar, bankTransferFlowInputData, iVar);
                    case 1:
                        return (b) ((p2k.i) this.f212463b.M.getValue()).f232367r.get();
                    default:
                        BankTransferFlow bankTransferFlow2 = this.f212463b;
                        return czi.c.d(0, 6, null, bankTransferFlow2, (b) bankTransferFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: n4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferFlow f212463b;

            {
                this.f212463b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BankTransferFlow bankTransferFlow = this.f212463b;
                        phm.a aVar = (phm.a) e.j(bankTransferFlow.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferFlow.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferFlow.L;
                        iVar.getClass();
                        return new p2k.i(nVar, bankTransferFlowInputData, iVar);
                    case 1:
                        return (b) ((p2k.i) this.f212463b.M.getValue()).f232367r.get();
                    default:
                        BankTransferFlow bankTransferFlow2 = this.f212463b;
                        return czi.c.d(0, 6, null, bankTransferFlow2, (b) bankTransferFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p2k.i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (p2k.i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n4k.b) this.N.getValue();
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
