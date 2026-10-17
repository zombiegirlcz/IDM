package ec6;

import com.revolut.core.backend_flow.api.navigation.BackendFlowDestination;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.donations.impl.ui.kompot.screen.overview.tab.charities.CharitiesTabScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CharitiesTabScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CharitiesTabScreen charitiesTabScreen, Continuation continuation) {
        super(2, continuation);
        this.v = charitiesTabScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(model.f53228a, "SUGGEST_CHARITY_LIST_ID")) {
            m mVar = (m) this.v.T2();
            mVar.getClass();
            mVar.C1(new BackendFlowDestination(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "b3efced5-7f3d-4cc0-9b80-e76e0a5c2b3d", null, null, 6)));
        }
        return Unit.f186387a;
    }
}
