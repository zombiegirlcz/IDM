package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferEntryFlow;
import d2k.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import p2k.d0;
import p2k.h;
import p2k.n;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/entry_flow/BankTransferEntryFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld2k/f;", "Lyki/f;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferEntryFlow extends ViewController<f> implements yki.f {
    public final BankTransferFlowInputData K;
    public final i L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BankTransferEntryFlow(BankTransferFlowInputData inputData, i customBalancesFilterInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(customBalancesFilterInteractor, "customBalancesFilterInteractor");
        this.K = inputData;
        this.L = customBalancesFilterInteractor;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: k4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferEntryFlow f180928b;

            {
                this.f180928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BankTransferEntryFlow bankTransferEntryFlow = this.f180928b;
                        return czi.c.d(0, 6, null, bankTransferEntryFlow, (b) bankTransferEntryFlow.O.getValue());
                    case 1:
                        BankTransferEntryFlow bankTransferEntryFlow2 = this.f180928b;
                        phm.a aVar = (phm.a) ue0.e.j(bankTransferEntryFlow2.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferEntryFlow2.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferEntryFlow2.L;
                        iVar.getClass();
                        return new p2k.h(nVar, bankTransferFlowInputData, iVar);
                    default:
                        return (b) ((p2k.h) this.f180928b.N.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: k4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferEntryFlow f180928b;

            {
                this.f180928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BankTransferEntryFlow bankTransferEntryFlow = this.f180928b;
                        return czi.c.d(0, 6, null, bankTransferEntryFlow, (b) bankTransferEntryFlow.O.getValue());
                    case 1:
                        BankTransferEntryFlow bankTransferEntryFlow2 = this.f180928b;
                        phm.a aVar = (phm.a) ue0.e.j(bankTransferEntryFlow2.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferEntryFlow2.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferEntryFlow2.L;
                        iVar.getClass();
                        return new p2k.h(nVar, bankTransferFlowInputData, iVar);
                    default:
                        return (b) ((p2k.h) this.f180928b.N.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: k4k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferEntryFlow f180928b;

            {
                this.f180928b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BankTransferEntryFlow bankTransferEntryFlow = this.f180928b;
                        return czi.c.d(0, 6, null, bankTransferEntryFlow, (b) bankTransferEntryFlow.O.getValue());
                    case 1:
                        BankTransferEntryFlow bankTransferEntryFlow2 = this.f180928b;
                        phm.a aVar = (phm.a) ue0.e.j(bankTransferEntryFlow2.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferEntryFlow2.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferEntryFlow2.L;
                        iVar.getClass();
                        return new p2k.h(nVar, bankTransferFlowInputData, iVar);
                    default:
                        return (b) ((p2k.h) this.f180928b.N.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (h) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (k4k.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BankTransferEntryFlow(BankTransferFlowInputData.ReviewOnly reviewOnly) {
        this(reviewOnly, i.f224256b);
        i.Companion.getClass();
    }
}
