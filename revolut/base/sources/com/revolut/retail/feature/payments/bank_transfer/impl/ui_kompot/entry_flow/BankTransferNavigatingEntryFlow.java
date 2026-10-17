package com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.ui_kompot.entry_flow.BankTransferNavigatingEntryFlow;
import d2k.f;
import k4k.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import p2k.d0;
import p2k.j;
import p2k.n;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/ui_kompot/entry_flow/BankTransferNavigatingEntryFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld2k/f;", "Lyki/f;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BankTransferNavigatingEntryFlow extends ViewController<f> implements yki.f {
    public final BankTransferFlowInputData K;
    public final i L;
    public final Object M;
    public final Object N;
    public final Object O;

    public BankTransferNavigatingEntryFlow(BankTransferFlowInputData inputData) {
        i.Companion.getClass();
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        i customBalancesFilterInteractor = i.f224256b;
        Intrinsics.checkNotNullParameter(customBalancesFilterInteractor, "customBalancesFilterInteractor");
        this.K = inputData;
        this.L = customBalancesFilterInteractor;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: k4k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferNavigatingEntryFlow f180937b;

            {
                this.f180937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow = this.f180937b;
                        return czi.c.d(0, 6, null, bankTransferNavigatingEntryFlow, (g) bankTransferNavigatingEntryFlow.O.getValue());
                    case 1:
                        BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow2 = this.f180937b;
                        phm.a aVar = (phm.a) ue0.e.j(bankTransferNavigatingEntryFlow2.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferNavigatingEntryFlow2.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferNavigatingEntryFlow2.L;
                        iVar.getClass();
                        return new j(nVar, bankTransferFlowInputData, iVar);
                    default:
                        return (g) ((j) this.f180937b.N.getValue()).f232373c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: k4k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferNavigatingEntryFlow f180937b;

            {
                this.f180937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow = this.f180937b;
                        return czi.c.d(0, 6, null, bankTransferNavigatingEntryFlow, (g) bankTransferNavigatingEntryFlow.O.getValue());
                    case 1:
                        BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow2 = this.f180937b;
                        phm.a aVar = (phm.a) ue0.e.j(bankTransferNavigatingEntryFlow2.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferNavigatingEntryFlow2.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferNavigatingEntryFlow2.L;
                        iVar.getClass();
                        return new j(nVar, bankTransferFlowInputData, iVar);
                    default:
                        return (g) ((j) this.f180937b.N.getValue()).f232373c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: k4k.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BankTransferNavigatingEntryFlow f180937b;

            {
                this.f180937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow = this.f180937b;
                        return czi.c.d(0, 6, null, bankTransferNavigatingEntryFlow, (g) bankTransferNavigatingEntryFlow.O.getValue());
                    case 1:
                        BankTransferNavigatingEntryFlow bankTransferNavigatingEntryFlow2 = this.f180937b;
                        phm.a aVar = (phm.a) ue0.e.j(bankTransferNavigatingEntryFlow2.m2()).a().get(d0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d0.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).f232406h0;
                        BankTransferFlowInputData bankTransferFlowInputData = bankTransferNavigatingEntryFlow2.K;
                        bankTransferFlowInputData.getClass();
                        i iVar = bankTransferNavigatingEntryFlow2.L;
                        iVar.getClass();
                        return new j(nVar, bankTransferFlowInputData, iVar);
                    default:
                        return (g) ((j) this.f180937b.N.getValue()).f232373c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (j) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
