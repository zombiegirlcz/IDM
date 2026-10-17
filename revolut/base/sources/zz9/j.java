package zz9;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PeerToPeerChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PeerToPeerChatScreen peerToPeerChatScreen, Continuation continuation) {
        super(2, continuation);
        this.v = peerToPeerChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        x xVarF3 = this.v.R2();
        com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d dVar = (com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.d) xVarF3;
        dVar.I2(model.i, model.f52613a);
        return Unit.f186387a;
    }
}
