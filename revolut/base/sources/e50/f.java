package e50;

import com.revolut.chat.ui.inbox.InboxScreen;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ InboxScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InboxScreen inboxScreen, Continuation continuation) {
        super(2, continuation);
        this.u = inboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((ep6.n) this.u.f51163a0.getValue()).A1();
        return Unit.f186387a;
    }
}
