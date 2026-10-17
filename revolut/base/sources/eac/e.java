package eac;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.revolutpay.management.impl.ui.management.home.RevolutPayManagementHomeController;
import com.revolut.feature.revolutpay.promoted_merchants.api.navigation.PromotedMerchantsDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevolutPayManagementHomeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevolutPayManagementHomeController revolutPayManagementHomeController, Continuation continuation) {
        super(2, continuation);
        this.v = revolutPayManagementHomeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        String listId = model.f52708a;
        com.revolut.feature.revolutpay.management.impl.ui.management.home.a aVar2 = (com.revolut.feature.revolutpay.management.impl.ui.management.home.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_SECTION_SHOPS")) {
            o oVar = (o) ((h) ((j2) aVar2.A.f22677a).getValue()).f124166b.getContent();
            if (oVar instanceof m) {
                z = true;
            } else {
                if (!(oVar instanceof n) && oVar != null) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            aVar2.C1(new PromotedMerchantsDestination(new PromotedMerchantsDestination.InputData(true, true, z, false)));
        }
        return Unit.f186387a;
    }
}
