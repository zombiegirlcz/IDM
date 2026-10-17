package ec8;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreen;
import com.revolut.feature.junior_allowance.impl.ui.screen.list.JuniorAllowancesListScreenContract$ModalStep;
import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAllowancesListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(JuniorAllowancesListScreen juniorAllowancesListScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAllowancesListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.junior_allowance.impl.ui.screen.list.a aVar2 = (com.revolut.feature.junior_allowance.impl.ui.screen.list.a) iVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof nb8.b) {
            if (((jte.d) aVar2.f76850t).c(JuniorCoreApi$Toggles.YouthHorizontalPagerInRetail.f76897c)) {
                nb8.b bVar = (nb8.b) obj3;
                oki.h.v2(aVar2.v, new JuniorAllowancesListScreenContract$ModalStep.AllowancePager(aVar2.o.f124465a, bVar.f214006a, bVar.f214010h.f214013a), ModalDestination.Style.FullscreenPaged.f98310a);
            } else {
                nb8.b bVar2 = (nb8.b) obj3;
                String str = bVar2.f214010h.f214013a;
                do3.n nVar = (do3.n) ((g) ((j2) aVar2.u.f22677a).getValue()).f124462a.getContent();
                aVar2.C1(u0.c(new SubscriptionsDetailsFeatureConfig(bVar2.f214006a, false, Intrinsics.f(str, nVar != null ? nVar.f116408a : null) ? f9e.b.REGULAR : f9e.b.JUNIOR_ALLOWANCE_EXTERNAL, 2)));
            }
        }
        return Unit.f186387a;
    }
}
