package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload;

import aii.q;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.info_preload.PeerToPeerInfoPreloadFlow;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import v8k.e;
import yki.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/info_preload/PeerToPeerInfoPreloadFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerInfoPreloadFlow extends ViewController<q> implements f {
    public final Object K;
    public final int L;
    public final Object M;
    public final Object N;

    public PeerToPeerInfoPreloadFlow(PeerToPeerInfoPreloadFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: h9k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerInfoPreloadFlow f150340b;

            {
                this.f150340b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PeerToPeerInfoPreloadFlow peerToPeerInfoPreloadFlow = this.f150340b;
                        return c.d(R$id.screen_transparent_container, 4, null, peerToPeerInfoPreloadFlow, (b) peerToPeerInfoPreloadFlow.N.getValue());
                    default:
                        return (b) ((e) this.f150340b.M.getValue()).f286834c.get();
                }
            }
        });
        this.L = R$layout.screen_transparent;
        this.M = w.y0(new h1k.a(this, inputData, 11));
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: h9k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerInfoPreloadFlow f150340b;

            {
                this.f150340b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PeerToPeerInfoPreloadFlow peerToPeerInfoPreloadFlow = this.f150340b;
                        return c.d(R$id.screen_transparent_container, 4, null, peerToPeerInfoPreloadFlow, (b) peerToPeerInfoPreloadFlow.N.getValue());
                    default:
                        return (b) ((e) this.f150340b.M.getValue()).f286834c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (e) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (h9k.b) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.K.getValue();
    }
}
