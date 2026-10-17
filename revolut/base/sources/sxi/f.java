package sxi;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.lounge_details.AirportLoungeDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AirportLoungeDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AirportLoungeDetailsScreen airportLoungeDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = airportLoungeDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarI3 = this.v.T2();
        String itemId = model.f52708a;
        q qVar = (q) lVarI3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, "ID_AMENITIES_SEE_ALL_ACTION")) {
            qVar.v2(new j(qVar.f266517r.f99106a));
        }
        return Unit.f186387a;
    }
}
