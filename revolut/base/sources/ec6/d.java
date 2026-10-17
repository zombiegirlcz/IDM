package ec6;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.CharitiesTabScreen;
import e8e.w;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ CharitiesTabScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CharitiesTabScreen charitiesTabScreen, Continuation continuation) {
        super(2, continuation);
        this.u = charitiesTabScreen;
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
        m mVar = (m) this.u.T2();
        mVar.getClass();
        mVar.n2(new w(mVar, (Continuation) null, 8), new whi.b(6));
        return Unit.f186387a;
    }
}
