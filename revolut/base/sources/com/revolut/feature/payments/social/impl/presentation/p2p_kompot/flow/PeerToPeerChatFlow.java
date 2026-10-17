package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow;

import aii.q;
import android.view.View;
import com.revolut.feature.payments.social.impl.R$id;
import com.revolut.feature.payments.social.impl.R$layout;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import h01.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import r70.c;
import te0.w;
import vc.s;
import xki.e;
import yki.f;
import ywi.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/p2p_kompot/flow/PeerToPeerChatFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PeerToPeerChatFlow extends ViewController<q> implements f {
    public final int K;
    public final Object L;
    public final Object M;
    public final Object N;

    public PeerToPeerChatFlow(PeerToPeerChatFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.flow_peer_to_peer_chat;
        this.L = w.y0(new b(this, inputData, 4));
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: yz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatFlow f318054b;

            {
                this.f318054b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (b) ((oz9.a) this.f318054b.L.getValue()).e.get();
                    default:
                        PeerToPeerChatFlow peerToPeerChatFlow = this.f318054b;
                        return czi.c.d(R$id.chatFlow_rootController, 4, null, peerToPeerChatFlow, (b) peerToPeerChatFlow.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: yz9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PeerToPeerChatFlow f318054b;

            {
                this.f318054b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (b) ((oz9.a) this.f318054b.L.getValue()).e.get();
                    default:
                        PeerToPeerChatFlow peerToPeerChatFlow = this.f318054b;
                        return czi.c.d(R$id.chatFlow_rootController, 4, null, peerToPeerChatFlow, (b) peerToPeerChatFlow.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (oz9.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (oz9.a) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (yz9.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout = (TransferToChatTransitionFlowContainerLayout) view.findViewById(R$id.chatFlow_rootController);
        ?? r06 = this.L;
        transferToChatTransitionFlowContainerLayout.setSensitiveDataManager((g) ((oz9.a) r06.getValue()).f.get());
        c cVarA = ((oz9.a) r06.getValue()).f231123b.f231141t.A();
        s.j(cVarA);
        transferToChatTransitionFlowContainerLayout.setHapticEngine(cVarA);
        transferToChatTransitionFlowContainerLayout.setP2pChatBubbleAnimationTimeout(400L);
        transferToChatTransitionFlowContainerLayout.setTransitionConfig(new dyl.f(com.revolut.ui_kit.payments.R$id.transferFlow_rootController, com.revolut.ui_kit.payments.R$id.chatScreen_rootContainer, com.revolut.ui_kit.payments.R$id.chatScreen_recyclerView, new dyl.a()));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
