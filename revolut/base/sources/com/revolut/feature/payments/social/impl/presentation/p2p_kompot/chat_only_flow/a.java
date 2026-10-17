package com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.chat_only_flow.PeerToPeerChatOnlyFlowContract$Step;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((sz9.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        sz9.a aVar = (sz9.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.v;
        FlowStep flowStepD = cVar.f79749r.d();
        PeerToPeerChatOnlyFlowContract$Step.ChatScreen chatScreen = flowStepD instanceof PeerToPeerChatOnlyFlowContract$Step.ChatScreen ? (PeerToPeerChatOnlyFlowContract$Step.ChatScreen) flowStepD : null;
        if (chatScreen == null) {
            return Unit.f186387a;
        }
        if (!Intrinsics.f(chatScreen.d, aVar.f266781a)) {
            yki.i iVar = cVar.f79749r;
            NavBarWithContainerBackground navBarWithContainerBackground = aVar.f266781a;
            zm3.a contact = chatScreen.f79741a;
            TransferMoneyPocket transferMoneyPocket = chatScreen.f79742b;
            boolean z = chatScreen.f79743c;
            Intrinsics.checkNotNullParameter(contact, "contact");
            h.s2(iVar, new PeerToPeerChatOnlyFlowContract$Step.ChatScreen(contact, transferMoneyPocket, z, navBarWithContainerBackground), false, TransitionAnimation.REPLACE.f98394a, true);
        }
        return Unit.f186387a;
    }
}
