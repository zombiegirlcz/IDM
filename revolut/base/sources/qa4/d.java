package qa4;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.email_verification.screen.check_email.CheckEmailInboxScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pwb.p;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CheckEmailInboxScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CheckEmailInboxScreen checkEmailInboxScreen, Continuation continuation) {
        super(2, continuation);
        this.u = checkEmailInboxScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) ((g) this.u.Q.getValue());
        kVar.getClass();
        kVar.l2(new p(kVar, null, 24), new yi5.b(26));
        return Unit.f186387a;
    }
}
