package hp3;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.corporate_events.impl.ui.screen.home.CorporateEventsHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CorporateEventsHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CorporateEventsHomeScreen corporateEventsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = corporateEventsHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.corporate_events.impl.ui.screen.home.b bVar = (com.revolut.feature.corporate_events.impl.ui.screen.home.b) nVarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "EMPTY_STATE_CLEAR_FILTERS_ID")) {
            bVar.A.onNext(((m) ((j2) bVar.f66146x.f22677a).getValue()).f154414b);
        } else if (Intrinsics.f(str, "ERROR_STATE_ID")) {
            bVar.f66147y.onNext(new Object());
        }
        return Unit.f186387a;
    }
}
