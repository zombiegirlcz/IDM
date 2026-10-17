package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow;

import com.revolut.feature.payments.social.impl.R$id;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.transfer_with_chat_flow.TransferOnlyChatToTransferFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.ui_kit.payments.transition.TransferToChatTransition;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import t0a.b;
import yz9.c;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final TransferOnlyChatToTransferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q0a.b f79809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f79810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f79811r;

    public a(TransferOnlyChatToTransferFlowContract$InputData inputData, q0a.b navigationProvider, c transactionForAnimationHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(transactionForAnimationHolder, "transactionForAnimationHolder");
        this.o = inputData;
        this.f79809p = navigationProvider;
        this.f79810q = transactionForAnimationHolder;
        this.f79811r = d.a(this, new TransferOnlyChatToTransferFlowContract$Step.ChatScreen(inputData.f79803a), f0.f322471a, new suf.a(this, 15));
    }

    public final void I2(String str) {
        yki.a aVar = this.f79811r;
        h.r2(aVar);
        h.t2(this, aVar, new TransferOnlyChatToTransferFlowContract$Step.ChatScreen(this.o.f79803a), false, str != null ? new TransferToChatTransition(R$id.transferOnlyChatToTransferFlow_rootController, str) : TransitionAnimation.SLIDE_END_TO_START.f98395a, false, 8);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79811r;
    }
}
