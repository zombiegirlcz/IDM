package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow;

import a0.d;
import aii.q;
import android.view.View;
import com.revolut.feature.payments.social.impl.R$id;
import com.revolut.feature.payments.social.impl.R$layout;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlow;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.ui_kit.payments.transition.TransferToChatTransitionFlowContainerLayout;
import h01.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qji.b;
import r70.c;
import te0.w;
import ue0.e;
import vc.s;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/social/impl/presentation/transfer_only_kompot/transfer_with_chat_flow/TransferOnlyChatToTransferFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_payments_social_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransferOnlyChatToTransferFlow extends ViewController<q> implements f {
    public final TransferOnlyChatToTransferFlowContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;

    public TransferOnlyChatToTransferFlow(TransferOnlyChatToTransferFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_transfer_only_chat_to_transfer;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: t0a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatToTransferFlow f266965b;

            {
                this.f266965b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        TransferOnlyChatToTransferFlow transferOnlyChatToTransferFlow = this.f266965b;
                        phm.a aVar = (phm.a) e.j(transferOnlyChatToTransferFlow.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatToTransferFlowContract$InputData transferOnlyChatToTransferFlowContract$InputData = transferOnlyChatToTransferFlow.K;
                        transferOnlyChatToTransferFlowContract$InputData.getClass();
                        return new oz9.f(cVar, transferOnlyChatToTransferFlowContract$InputData);
                    case 1:
                        return (b) ((oz9.f) this.f266965b.M.getValue()).d.get();
                    default:
                        TransferOnlyChatToTransferFlow transferOnlyChatToTransferFlow2 = this.f266965b;
                        return czi.c.d(R$id.transferOnlyChatToTransferFlow_rootController, 4, null, transferOnlyChatToTransferFlow2, (b) transferOnlyChatToTransferFlow2.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: t0a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatToTransferFlow f266965b;

            {
                this.f266965b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        TransferOnlyChatToTransferFlow transferOnlyChatToTransferFlow = this.f266965b;
                        phm.a aVar = (phm.a) e.j(transferOnlyChatToTransferFlow.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatToTransferFlowContract$InputData transferOnlyChatToTransferFlowContract$InputData = transferOnlyChatToTransferFlow.K;
                        transferOnlyChatToTransferFlowContract$InputData.getClass();
                        return new oz9.f(cVar, transferOnlyChatToTransferFlowContract$InputData);
                    case 1:
                        return (b) ((oz9.f) this.f266965b.M.getValue()).d.get();
                    default:
                        TransferOnlyChatToTransferFlow transferOnlyChatToTransferFlow2 = this.f266965b;
                        return czi.c.d(R$id.transferOnlyChatToTransferFlow_rootController, 4, null, transferOnlyChatToTransferFlow2, (b) transferOnlyChatToTransferFlow2.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: t0a.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransferOnlyChatToTransferFlow f266965b;

            {
                this.f266965b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        TransferOnlyChatToTransferFlow transferOnlyChatToTransferFlow = this.f266965b;
                        phm.a aVar = (phm.a) e.j(transferOnlyChatToTransferFlow.m2()).a().get(oz9.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", oz9.c.class, " is not found"));
                        }
                        oz9.c cVar = ((oz9.c) aVar2.b()).R;
                        TransferOnlyChatToTransferFlowContract$InputData transferOnlyChatToTransferFlowContract$InputData = transferOnlyChatToTransferFlow.K;
                        transferOnlyChatToTransferFlowContract$InputData.getClass();
                        return new oz9.f(cVar, transferOnlyChatToTransferFlowContract$InputData);
                    case 1:
                        return (b) ((oz9.f) this.f266965b.M.getValue()).d.get();
                    default:
                        TransferOnlyChatToTransferFlow transferOnlyChatToTransferFlow2 = this.f266965b;
                        return czi.c.d(R$id.transferOnlyChatToTransferFlow_rootController, 4, null, transferOnlyChatToTransferFlow2, (b) transferOnlyChatToTransferFlow2.N.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (oz9.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (oz9.f) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (t0a.b) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TransferToChatTransitionFlowContainerLayout transferToChatTransitionFlowContainerLayout = (TransferToChatTransitionFlowContainerLayout) view.findViewById(R$id.transferOnlyChatToTransferFlow_rootController);
        ?? r06 = this.M;
        transferToChatTransitionFlowContainerLayout.setSensitiveDataManager((g) ((oz9.f) r06.getValue()).e.get());
        c cVarA = ((oz9.f) r06.getValue()).f231173b.f231141t.A();
        s.j(cVarA);
        transferToChatTransitionFlowContainerLayout.setHapticEngine(cVarA);
        transferToChatTransitionFlowContainerLayout.setP2pChatBubbleAnimationTimeout(400L);
        transferToChatTransitionFlowContainerLayout.setTransitionConfig(new dyl.f(com.revolut.kompot.R$id.container, R$id.transferOnlyScreen_chatContentContainer, R$id.transferOnlyScreen_recyclerView, new dyl.d(com.revolut.ui_kit.payments.R$id.transferScreenReview_recyclerView)));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
