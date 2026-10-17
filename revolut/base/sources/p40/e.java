package p40;

import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.l0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ChatProfileScreen chatProfileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatProfileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RectangularButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RectangularButtonDelegate.Model model = (RectangularButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f53150a, "BUTTON_MORE");
        ChatProfileScreen chatProfileScreen = this.v;
        if (!zF) {
            ((com.revolut.chat.ui.chat_profile.profile_screen.b) chatProfileScreen.R2()).I2(model.f53150a);
        } else if (!chatProfileScreen.W.isEmpty()) {
            ((l0) chatProfileScreen.V.getValue()).e("BUTTON_MORE", zi0.c.d(chatProfileScreen.W), mw0.o.BELOW, mw0.m.f209296a);
        }
        return Unit.f186387a;
    }
}
