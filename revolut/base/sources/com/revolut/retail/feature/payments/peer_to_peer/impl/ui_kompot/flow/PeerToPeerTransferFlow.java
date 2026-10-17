package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.R$layout;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlow;
import com.revolut.ui_kit.payments.R$id;
import in0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s8k.j;
import te0.w;
import xki.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/flow/PeerToPeerTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ls8k/j;", "Lin0/g;", "Lyki/f;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerTransferFlow extends ViewController<j> implements g, f {
    public final Object K;
    public final Object L;
    public final Object M;

    public PeerToPeerTransferFlow(PeerToPeerTransferInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = w.y0(new eq8.b(this, inputData, 28));
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: f9k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerTransferFlow f132980b;

            {
                this.f132980b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((v8k.g) this.f132980b.K.getValue()).o.get();
                    default:
                        PeerToPeerTransferFlow peerToPeerTransferFlow = this.f132980b;
                        return czi.c.d(R$id.transferFlow_rootController, 4, null, peerToPeerTransferFlow, (b) peerToPeerTransferFlow.L.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: f9k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerTransferFlow f132980b;

            {
                this.f132980b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((v8k.g) this.f132980b.K.getValue()).o.get();
                    default:
                        PeerToPeerTransferFlow peerToPeerTransferFlow = this.f132980b;
                        return czi.c.d(R$id.transferFlow_rootController, 4, null, peerToPeerTransferFlow, (b) peerToPeerTransferFlow.L.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v8k.g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (v8k.g) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b e3() {
        return (f9k.b) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getM0() {
        return R$layout.peer_to_peer_transfer_flow;
    }

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
