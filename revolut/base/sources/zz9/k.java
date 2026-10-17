package zz9;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PeerToPeerChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PeerToPeerChatScreen peerToPeerChatScreen, Continuation continuation) {
        super(2, continuation);
        this.v = peerToPeerChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarF3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53531a, "CHAT_PRIVACY_DISCLAIMER_LIST_ID")) {
            e0a.w wVar = (e0a.w) dVar.f79783w;
            wVar.f121529m.x(((ou9.c) wVar.f121534s).b());
        }
        return Unit.f186387a;
    }
}
