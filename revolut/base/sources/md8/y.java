package md8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_consent.impl.ui.screen.JuniorConsentRequestPromptScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ JuniorConsentRequestPromptScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(JuniorConsentRequestPromptScreen juniorConsentRequestPromptScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorConsentRequestPromptScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        ((q) this.u.d()).f204520w.a();
        return Unit.f186387a;
    }
}
