package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.PeerToPeerAmountScreenContract$InputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlowContract$Step;
import gim.i;
import hrf.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ s8k.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerTransferInputData.NewTransfer f102345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, s8k.a aVar, PeerToPeerTransferInputData.NewTransfer newTransfer, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = aVar;
        this.f102345w = newTransfer;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, this.f102345w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        yki.a aVar2 = cVar.f102352t;
        f fVar = f.OUTGOING;
        s8k.a aVar3 = this.v;
        PeerToPeerRecipient peerToPeerRecipient = aVar3.f261054a;
        TransferFlowType transferFlowType = aVar3.f261055b;
        PeerToPeerTransferData peerToPeerTransferData = aVar3.f261056c;
        PeerToPeerTransferInputData.NewTransfer newTransfer = this.f102345w;
        h.t2(cVar, aVar2, new PeerToPeerTransferFlowContract$Step.Amount(new PeerToPeerAmountScreenContract$InputData.WithTransferData(peerToPeerRecipient, fVar, transferFlowType, newTransfer.e, newTransfer.f102285l, cVar.L2(), newTransfer.f102283h, newTransfer.f102288p, newTransfer.i, peerToPeerTransferData, null, false, newTransfer.f102287n, 5128)), false, TransitionAnimation.SLIDE_START_TO_END.f98396a, false, 8);
        return Unit.f186387a;
    }
}
