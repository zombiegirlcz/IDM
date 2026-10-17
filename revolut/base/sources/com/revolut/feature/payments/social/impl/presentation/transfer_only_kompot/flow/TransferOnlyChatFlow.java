package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow;

import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlow;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kz9.e;
import oz9.d;
import te0.w;
import yki.f;
import yz9.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/flow/TransferOnlyChatFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkz9/e;", "Lyki/f;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOnlyChatFlow extends ViewController<e> implements f {
    public final TransferOnlyChatFlowContract$InputData K;
    public final c L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TransferOnlyChatFlow(TransferOnlyChatFlowContract$InputData inputData, c transactionForAnimationHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionForAnimationHolder, "transactionForAnimationHolder");
        this.K = inputData;
        this.L = transactionForAnimationHolder;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: n0a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatFlow f210974b;

            {
                this.f210974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransferOnlyChatFlow transferOnlyChatFlow = this.f210974b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferOnlyChatFlow, (b) transferOnlyChatFlow.P.getValue());
                    case 1:
                        TransferOnlyChatFlow transferOnlyChatFlow2 = this.f210974b;
                        phm.a aVar = (phm.a) ue0.e.j(transferOnlyChatFlow2.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatFlowContract$InputData transferOnlyChatFlowContract$InputData = transferOnlyChatFlow2.K;
                        transferOnlyChatFlowContract$InputData.getClass();
                        yz9.c cVar2 = transferOnlyChatFlow2.L;
                        cVar2.getClass();
                        return new oz9.d(cVar, transferOnlyChatFlow2, transferOnlyChatFlowContract$InputData, cVar2);
                    default:
                        return (b) ((oz9.d) this.f210974b.O.getValue()).f231156r.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: n0a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatFlow f210974b;

            {
                this.f210974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransferOnlyChatFlow transferOnlyChatFlow = this.f210974b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferOnlyChatFlow, (b) transferOnlyChatFlow.P.getValue());
                    case 1:
                        TransferOnlyChatFlow transferOnlyChatFlow2 = this.f210974b;
                        phm.a aVar = (phm.a) ue0.e.j(transferOnlyChatFlow2.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatFlowContract$InputData transferOnlyChatFlowContract$InputData = transferOnlyChatFlow2.K;
                        transferOnlyChatFlowContract$InputData.getClass();
                        yz9.c cVar2 = transferOnlyChatFlow2.L;
                        cVar2.getClass();
                        return new oz9.d(cVar, transferOnlyChatFlow2, transferOnlyChatFlowContract$InputData, cVar2);
                    default:
                        return (b) ((oz9.d) this.f210974b.O.getValue()).f231156r.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: n0a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatFlow f210974b;

            {
                this.f210974b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TransferOnlyChatFlow transferOnlyChatFlow = this.f210974b;
                        return czi.c.d(R$id.screen_transparent_container, 4, null, transferOnlyChatFlow, (b) transferOnlyChatFlow.P.getValue());
                    case 1:
                        TransferOnlyChatFlow transferOnlyChatFlow2 = this.f210974b;
                        phm.a aVar = (phm.a) ue0.e.j(transferOnlyChatFlow2.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatFlowContract$InputData transferOnlyChatFlowContract$InputData = transferOnlyChatFlow2.K;
                        transferOnlyChatFlowContract$InputData.getClass();
                        yz9.c cVar2 = transferOnlyChatFlow2.L;
                        cVar2.getClass();
                        return new oz9.d(cVar, transferOnlyChatFlow2, transferOnlyChatFlowContract$InputData, cVar2);
                    default:
                        return (b) ((oz9.d) this.f210974b.O.getValue()).f231156r.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (n0a.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getZ() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
