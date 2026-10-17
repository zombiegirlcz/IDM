package tw7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ InsuranceHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InsuranceHomeScreen insuranceHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = insuranceHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.insurance_home.impl.ui.screen.home.a aVar2 = (com.revolut.feature.insurance_home.impl.ui.screen.home.a) this.u.R2();
        aVar2.getClass();
        aVar2.n2(new l(aVar2, null, 1), new whi.b(6));
        return Unit.f186387a;
    }
}
