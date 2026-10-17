package md8;

import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import m2f.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ JuniorConsentRequestPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorConsentRequestPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w) create((PromptContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = (q) this.u.d();
        qVar.getClass();
        qVar.n2(new b0(qVar, new h(qVar, null), (Continuation) null), new whi.b(6));
        return Unit.f186387a;
    }
}
