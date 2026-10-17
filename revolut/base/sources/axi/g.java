package axi;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ AirportLoungePassCheckoutScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.u = airportLoungePassCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = AirportLoungePassCheckoutScreen.W;
        AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen = this.u;
        airportLoungePassCheckoutScreen.d3().f174552c.setExpanded(false, true);
        RecyclerView.LayoutManager layoutManager = airportLoungePassCheckoutScreen.d3().d.getLayoutManager();
        Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        airportLoungePassCheckoutScreen.d3().d.smoothScrollToPosition(((LinearLayoutManager) layoutManager).getItemCount() - 1);
        return Unit.f186387a;
    }
}
