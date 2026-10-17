package jxi;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungesHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AirportLoungesHomeScreen airportLoungesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarE3 = this.v.d();
        String id10 = model.f52708a;
        com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) vVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "ID_SAVED_LOUNGES_LABEL")) {
            cVar.C2(a.e.f99091a);
        } else if (Intrinsics.f(id10, "ID_PASS_ACTIVITY_SUBHEADER")) {
            cVar.C2(a.b.f99088a);
        }
        return Unit.f186387a;
    }
}
