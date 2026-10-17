package gc4;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.how_it_works.HowItWorksScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ HowItWorksScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HowItWorksScreen howItWorksScreen, Continuation continuation) {
        super(2, continuation);
        this.u = howItWorksScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVarE3 = this.u.d();
        lVarE3.H2(lVarE3.f142334q, new gaf.l(6));
        lVarE3.n2(new k(lVarE3, null, 1), new g4k.e(lVarE3, 23));
        return Unit.f186387a;
    }
}
