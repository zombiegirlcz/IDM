package yic;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsConfigurations;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.home.RentAndBillsHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RentAndBillsHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RentAndBillsHomeScreen rentAndBillsHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rentAndBillsHomeScreen;
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        RentAndBillsConfigurations.Configuration configuration;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarE3 = this.v.R2();
        String listId = model.f53228a;
        x xVar = (x) rVarE3;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        RentAndBillsConfigurations rentAndBillsConfigurations = (RentAndBillsConfigurations) ((e) ((j2) xVar.v.f22677a).getValue()).f314279c.getContent();
        if (rentAndBillsConfigurations == null) {
            hx7.e.n(new IllegalStateException(j6.a.q("Configurations not loaded when link action clicked: ", listId)));
        } else if (Intrinsics.f(listId, "RENT_CATEGORY_CELL_ID")) {
            RentAndBillsConfigurations.Configuration configuration2 = rentAndBillsConfigurations.f84777a;
            if (configuration2 != null) {
                xVar.C2(new k(configuration2));
            }
        } else if (Intrinsics.f(listId, "BILLS_CATEGORY_CELL_ID") && (configuration = rentAndBillsConfigurations.f84778b) != null) {
            xVar.C2(new j(configuration));
        }
        return Unit.f186387a;
    }
}
