package gh8;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.junior_graduation.impl.ui.screen.identification.JuniorIdentificationScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ JuniorIdentificationScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(JuniorIdentificationScreen juniorIdentificationScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorIdentificationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PromptMarketingContentDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.junior_graduation.impl.ui.screen.identification.a aVar2 = (com.revolut.feature.junior_graduation.impl.ui.screen.identification.a) ((i) this.u.N.getValue());
        aVar2.getClass();
        aVar2.l2(new l(aVar2, null, 0), new yi5.b(26));
        return Unit.f186387a;
    }
}
