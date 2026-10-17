package wm9;

import aii.r;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.payees.impl.ui.OwnerType;
import com.revolut.feature.payees.impl.ui.payees_overview.personal.PayeesOverviewScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PayeesOverviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PayeesOverviewScreen payeesOverviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = payeesOverviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVarD3 = this.v.d();
        String listId = model.f52708a;
        com.revolut.feature.payees.impl.ui.payees_overview.personal.a aVar2 = (com.revolut.feature.payees.impl.ui.payees_overview.personal.a) iVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        r aVar3 = Intrinsics.f(listId, "PAYEES_REQUIRE_AUTHENTICATION_SUBHEADER_ITEM_ID") ? rm9.b.f255212a : Intrinsics.f(listId, "PAYEES_BLOCKED_SUBHEADER_ITEM_ID") ? new rm9.a(OwnerType.CurrentUser.f78992a) : null;
        if (aVar3 != null) {
            aVar2.C2(aVar3);
        }
        return Unit.f186387a;
    }
}
