package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow;

import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.flow.PeerToPeerChatFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.ui_kit.payments.R$id;
import com.revolut.ui_kit.payments.transition.TransferToChatTransition;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import y8k.e;
import yz9.b;
import yz9.c;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PeerToPeerChatFlowContract$InputData f79759p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f79760q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f79761r;

    public a(e transferFlowProvider, PeerToPeerChatFlowContract$InputData inputData, c transactionForAnimationHolder) {
        Intrinsics.checkNotNullParameter(transferFlowProvider, "transferFlowProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionForAnimationHolder, "transactionForAnimationHolder");
        this.o = transferFlowProvider;
        this.f79759p = inputData;
        this.f79760q = transactionForAnimationHolder;
        this.f79761r = d.a(this, new PeerToPeerChatFlowContract$Step.ChatScreen(inputData.f79750a, inputData.f79751b, inputData.f79752c), f0.f322471a, new yz4.b(this, 1));
    }

    public final void I2(String str) {
        yki.a aVar = this.f79761r;
        h.r2(aVar);
        TransitionAnimation transferToChatTransition = str != null ? new TransferToChatTransition(R$id.chatFlow_rootController, str) : TransitionAnimation.SLIDE_END_TO_START.f98395a;
        PeerToPeerChatFlowContract$InputData peerToPeerChatFlowContract$InputData = this.f79759p;
        h.t2(this, aVar, new PeerToPeerChatFlowContract$Step.ChatScreen(peerToPeerChatFlowContract$InputData.f79750a, peerToPeerChatFlowContract$InputData.f79751b, false), false, transferToChatTransition, false, 8);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79761r;
    }
}
