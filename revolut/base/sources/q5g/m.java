package q5g;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.checkout.TravelFlightsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.flights.models.domain.booking.BookingPreview;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelFlightsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(TravelFlightsCheckoutScreen travelFlightsCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelFlightsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.v, continuation, 0);
            case 1:
                return new m(this.v, continuation, 1);
            default:
                return new m(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelFlightsCheckoutScreen travelFlightsCheckoutScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                travelFlightsCheckoutScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                KProperty[] kPropertyArr = TravelFlightsCheckoutScreen.f93295b0;
                travelFlightsCheckoutScreen.d3().d.setCollapsed(false, true);
                ScreenContentRecyclerView travelFlightsCheckoutScreenRecyclerView = travelFlightsCheckoutScreen.d3().f21258c;
                Intrinsics.checkNotNullExpressionValue(travelFlightsCheckoutScreenRecyclerView, "travelFlightsCheckoutScreenRecyclerView");
                travelFlightsCheckoutScreen.getClass();
                RecyclerView.LayoutManager layoutManager = travelFlightsCheckoutScreenRecyclerView.getLayoutManager();
                int itemCount = layoutManager != null ? layoutManager.getItemCount() : -1;
                if (itemCount > 0) {
                    tw0.x.a(travelFlightsCheckoutScreenRecyclerView, itemCount - 1);
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.flights.impl.ui.screen.checkout.b bVar = (com.revolut.feature.travel.flights.impl.ui.screen.checkout.b) travelFlightsCheckoutScreen.R2();
                cli.y yVar = bVar.B;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                if (((s) j2Var.getValue()).f242390h) {
                    Data data = ((s) j2Var2.getValue()).f242388c;
                    Data data2 = ((s) j2Var2.getValue()).f;
                    BookingPreview bookingPreview = (BookingPreview) data.getContent();
                    BookingPreview bookingPreview2 = (bookingPreview == null || data.getLoading() || data.getError() != null) ? null : bookingPreview;
                    Object content = data2.getContent();
                    u uVar = content instanceof u ? (u) content : null;
                    if (uVar == null || data2.getLoading() || data2.getError() != null) {
                        uVar = null;
                    }
                    PaymentMethod.Pocket pocket = uVar != null ? uVar.f242392a : null;
                    if (bVar.A || bookingPreview2 == null || pocket == null) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "TravelFlightsCheckoutScreenModel", "Pay tapped during price-change reload, or without a loaded booking preview or selected pocket", null, h0Var);
                    } else if (uVar.f242393b) {
                        bVar.l2(new i0(pocket, bVar, bookingPreview2, ((s) j2Var2.getValue()).d, null), new g0(1, 0, com.revolut.feature.travel.flights.impl.ui.screen.checkout.b.class, bVar, "handleError", "handleError(Ljava/lang/Throwable;)Z"));
                    } else {
                        dj0.d dVar = (dj0.d) ((s) j2Var2.getValue()).e.getContent();
                        if (dVar == null) {
                            zhm.h0 h0Var2 = zhm.h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "TravelFlightsCheckoutScreenModel", "Insufficient funds detected, but calculated total price is not loaded", null, h0Var2);
                        } else {
                            oki.h.v2(bVar.C, new TravelFlightsCheckoutScreenContract$ModalStep.PocketSelection(dVar), ModalDestination.Style.POPUP.f98311a);
                        }
                    }
                } else {
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "TravelFlightsCheckoutScreenModel", "Pay tapped before accepting terms and conditions", null, h0Var3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
