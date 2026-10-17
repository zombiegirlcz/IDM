package eic;

import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.feature.rewards.impl.ui.concierge.screen.details.ConciergeAlbertineDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConciergeAlbertineDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ConciergeAlbertineDetailsScreen conciergeAlbertineDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = conciergeAlbertineDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RectangularButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RectangularButtonDelegate.Model model = (RectangularButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.d();
        t tVar = (t) rVarE3;
        tVar.I2(model.f, model.f53150a);
        return Unit.f186387a;
    }
}
