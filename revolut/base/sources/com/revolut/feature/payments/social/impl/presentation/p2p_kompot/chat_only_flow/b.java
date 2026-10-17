package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlowContract$Step;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import om4.d0;
import q2a.f;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public final /* synthetic */ c A;
    public c u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public zm3.a f79744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public TransferMoneyPocket f79745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f79746y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.A = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.i iVar;
        boolean z;
        zm3.a aVar;
        TransferMoneyPocket transferMoneyPocket;
        c cVar;
        c cVar2 = this.A;
        ChatTransferRecipient.ContactRecipient contactRecipient = cVar2.f79748q;
        d0 d0Var = cVar2.f79747p;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.z;
        if (i == 0) {
            o.b(obj2);
            iVar = cVar2.f79749r;
            PeerToPeerChatOnlyFlowContract$InputData peerToPeerChatOnlyFlowContract$InputData = cVar2.o;
            zm3.a aVar3 = peerToPeerChatOnlyFlowContract$InputData.f79738a;
            TransferMoneyPocket transferMoneyPocket2 = peerToPeerChatOnlyFlowContract$InputData.f79739b;
            boolean z3 = peerToPeerChatOnlyFlowContract$InputData.f79740c;
            this.u = cVar2;
            this.v = iVar;
            this.f79744w = aVar3;
            this.f79745x = transferMoneyPocket2;
            this.f79746y = z3;
            this.z = 1;
            d0Var.getClass();
            Object objA = ((f) d0Var.f226551b).a(rz9.a.a(contactRecipient), this);
            if (objA == aVar2) {
                return aVar2;
            }
            z = z3;
            obj2 = objA;
            aVar = aVar3;
            transferMoneyPocket = transferMoneyPocket2;
            cVar = cVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.f79746y;
            transferMoneyPocket = this.f79745x;
            aVar = this.f79744w;
            iVar = this.v;
            cVar = this.u;
            o.b(obj2);
        }
        h.u2(cVar, iVar, new PeerToPeerChatOnlyFlowContract$Step.ChatScreen(aVar, transferMoneyPocket, z, (NavBarWithContainerBackground) obj2), null, 6);
        if (!cVar2.f226127l) {
            l.a1(cVar2, d0Var.e(contactRecipient), null, null, new a(cVar2, null), 3);
        }
        return Unit.f186387a;
    }
}
