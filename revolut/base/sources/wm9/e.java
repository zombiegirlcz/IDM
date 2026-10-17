package wm9;

import aii.r;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.payees.impl.ui.payees_overview.personal.PayeesOverviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayeesOverviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PayeesOverviewScreen payeesOverviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payeesOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarD3 = this.v.d();
        String listId = model.f52613a;
        com.revolut.feature.payees.impl.ui.payees_overview.personal.a aVar2 = (com.revolut.feature.payees.impl.ui.payees_overview.personal.a) iVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        r rVar = Intrinsics.f(listId, "PAYEES_REQUIRES_AUTHENTICATION_SEE_ALL_ITEM_ID") ? rm9.d.f255214a : Intrinsics.f(listId, "PAYEES_BLOCKED_SEE_ALL_ITEM_ID") ? rm9.c.f255213a : null;
        if (rVar != null) {
            aVar2.C2(rVar);
        }
        return Unit.f186387a;
    }
}
