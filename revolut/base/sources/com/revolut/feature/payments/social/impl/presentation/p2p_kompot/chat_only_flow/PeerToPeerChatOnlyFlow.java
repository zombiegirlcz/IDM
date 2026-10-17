package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow;

import a0.d;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlow;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ue0.e;
import yki.f;
import zz9.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/chat_only_flow/PeerToPeerChatOnlyFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzz9/u;", "Lyki/f;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerChatOnlyFlow extends ViewController<u> implements f {
    public final PeerToPeerChatOnlyFlowContract$InputData K;
    public final yz9.c L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public PeerToPeerChatOnlyFlow(PeerToPeerChatOnlyFlowContract$InputData inputData, yz9.c transactionForAnimationHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionForAnimationHolder, "transactionForAnimationHolder");
        this.K = inputData;
        this.L = transactionForAnimationHolder;
        this.M = R$layout.screen_transparent;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: xz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatOnlyFlow f309910b;

            {
                this.f309910b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PeerToPeerChatOnlyFlow peerToPeerChatOnlyFlow = this.f309910b;
                        return c.d(R$id.screen_transparent_container, 4, null, peerToPeerChatOnlyFlow, (b) peerToPeerChatOnlyFlow.P.getValue());
                    case 1:
                        PeerToPeerChatOnlyFlow peerToPeerChatOnlyFlow2 = this.f309910b;
                        phm.a aVar = (phm.a) e.j(peerToPeerChatOnlyFlow2.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        PeerToPeerChatOnlyFlowContract$InputData peerToPeerChatOnlyFlowContract$InputData = peerToPeerChatOnlyFlow2.K;
                        peerToPeerChatOnlyFlowContract$InputData.getClass();
                        yz9.c cVar2 = peerToPeerChatOnlyFlow2.L;
                        cVar2.getClass();
                        return new oz9.b(cVar, peerToPeerChatOnlyFlowContract$InputData, cVar2);
                    default:
                        return (b) ((oz9.b) this.f309910b.O.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: xz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatOnlyFlow f309910b;

            {
                this.f309910b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PeerToPeerChatOnlyFlow peerToPeerChatOnlyFlow = this.f309910b;
                        return c.d(R$id.screen_transparent_container, 4, null, peerToPeerChatOnlyFlow, (b) peerToPeerChatOnlyFlow.P.getValue());
                    case 1:
                        PeerToPeerChatOnlyFlow peerToPeerChatOnlyFlow2 = this.f309910b;
                        phm.a aVar = (phm.a) e.j(peerToPeerChatOnlyFlow2.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        PeerToPeerChatOnlyFlowContract$InputData peerToPeerChatOnlyFlowContract$InputData = peerToPeerChatOnlyFlow2.K;
                        peerToPeerChatOnlyFlowContract$InputData.getClass();
                        yz9.c cVar2 = peerToPeerChatOnlyFlow2.L;
                        cVar2.getClass();
                        return new oz9.b(cVar, peerToPeerChatOnlyFlowContract$InputData, cVar2);
                    default:
                        return (b) ((oz9.b) this.f309910b.O.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: xz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatOnlyFlow f309910b;

            {
                this.f309910b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PeerToPeerChatOnlyFlow peerToPeerChatOnlyFlow = this.f309910b;
                        return c.d(R$id.screen_transparent_container, 4, null, peerToPeerChatOnlyFlow, (b) peerToPeerChatOnlyFlow.P.getValue());
                    case 1:
                        PeerToPeerChatOnlyFlow peerToPeerChatOnlyFlow2 = this.f309910b;
                        phm.a aVar = (phm.a) e.j(peerToPeerChatOnlyFlow2.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        PeerToPeerChatOnlyFlowContract$InputData peerToPeerChatOnlyFlowContract$InputData = peerToPeerChatOnlyFlow2.K;
                        peerToPeerChatOnlyFlowContract$InputData.getClass();
                        yz9.c cVar2 = peerToPeerChatOnlyFlow2.L;
                        cVar2.getClass();
                        return new oz9.b(cVar, peerToPeerChatOnlyFlowContract$InputData, cVar2);
                    default:
                        return (b) ((oz9.b) this.f309910b.O.getValue()).e.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (oz9.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (oz9.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (xz9.b) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
