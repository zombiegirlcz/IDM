package mb9;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.onboarding.impl.onboarding.pep.PoliticallyExposedPersonScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ PoliticallyExposedPersonScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PoliticallyExposedPersonScreen politicallyExposedPersonScreen, Continuation continuation) {
        super(2, continuation);
        this.u = politicallyExposedPersonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        com.revolut.feature.onboarding.impl.onboarding.pep.a aVar2 = (com.revolut.feature.onboarding.impl.onboarding.pep.a) ((e) this.u.O.getValue());
        aVar2.getClass();
        aVar2.C2(new d(false));
        return Unit.f186387a;
    }
}
