package ec8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceDestination;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAllowancesListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JuniorAllowancesListScreen juniorAllowancesListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAllowancesListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar2 = (com.revolut.feature.junior_allowance.impl.ui.screen.list.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52373a;
        if (Intrinsics.f(str, "ERROR_STATE_ID")) {
            aVar2.f76851w.a();
        } else if (Intrinsics.f(str, "EMPTY_STATE_LIST_ID")) {
            h hVar = aVar2.o;
            aVar2.C1(new JuniorAllowanceDestination(hVar.f124465a, null, JuniorAllowanceLaunchMode.AsDestination.f76816a, hVar.f124466b));
        }
        return Unit.f186387a;
    }
}
