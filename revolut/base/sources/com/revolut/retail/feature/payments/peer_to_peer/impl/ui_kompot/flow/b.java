package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow;

import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerExtraConfiguration$DisableReference;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerTransferInputData;
import com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.flow.PeerToPeerTransferFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import qua.p;
import yhm.o;
import zhm.z0;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ PeerToPeerRecipient v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferFlowType f102346w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PeerToPeerTransferData f102347x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, PeerToPeerRecipient peerToPeerRecipient, TransferFlowType transferFlowType, PeerToPeerTransferData peerToPeerTransferData, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = peerToPeerRecipient;
        this.f102346w = transferFlowType;
        this.f102347x = peerToPeerTransferData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, this.f102346w, this.f102347x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        yki.a aVar2 = cVar.f102352t;
        p e = cVar.o.getE();
        PeerToPeerTransferInputData peerToPeerTransferInputData = cVar.o;
        h.t2(cVar, aVar2, new PeerToPeerTransferFlowContract$Step.Review(new PeerToPeerReviewScreenInputData(this.v, this.f102346w, this.f102347x, e, z0.i(peerToPeerTransferInputData.getF102294h() ? PeerToPeerReviewScreenInputData.AdditionalConfig.ContinueMode.f102275a : null, peerToPeerTransferInputData.getI().contains(PeerToPeerExtraConfiguration$DisableReference.f102268a) ? PeerToPeerReviewScreenInputData.AdditionalConfig.DisableReference.f102276a : null))), true, null, false, 12);
        return Unit.f186387a;
    }
}
