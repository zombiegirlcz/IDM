package p40;

import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import v30.w;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChatProfileScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ChatProfileScreen chatProfileScreen, Continuation continuation) {
        super(2, continuation);
        this.v = chatProfileScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.u;
        w wVar = obj3 instanceof w ? (w) obj3 : null;
        if (wVar != null) {
            ((com.revolut.chat.ui.chat_profile.profile_screen.b) this.v.R2()).J2(wVar);
        }
        return Unit.f186387a;
    }
}
