package axi;

import com.revolut.feature.hyper_text.model.HyperTextTarget;
import com.revolut.feature.hyper_text.ui.HyperTextClickData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.revpay.CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import svi.i0;
import svi.o0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportLoungePassCheckoutScreen f10950w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f10950w = airportLoungePassCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f10950w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f10950w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f10950w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        AirportLoungePassCheckoutScreen airportLoungePassCheckoutScreen = this.f10950w;
        switch (i) {
            case 0:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE3 = airportLoungePassCheckoutScreen.d();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) nVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof HyperTextClickData) {
                    HyperTextTarget hyperTextTarget = ((HyperTextClickData) obj3).f74762a;
                    if (hyperTextTarget instanceof HyperTextTarget.Link) {
                        cVar.l2(new w(cVar, hyperTextTarget, null), new yi5.b(26));
                    }
                } else {
                    r6.b.D("Parcel must be HyperTextClickData");
                }
                break;
            case 1:
                CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData breakdownData = (CheckoutRevPayControllerExtensionContract$ExchangeBreakdownData) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar2 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) airportLoungePassCheckoutScreen.d();
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(breakdownData, "breakdownData");
                oki.h.v2(cVar2.E, new AirportLoungePassCheckoutScreenContract$ModalStep.ExchangeBreakdown(breakdownData), bottom_dialog);
                break;
            default:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarE32 = airportLoungePassCheckoutScreen.d();
                String id10 = aVar3.f275445a;
                com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c cVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.c) nVarE32;
                cli.y yVar = cVar3.D;
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "add_entries_clause_id")) {
                    o0 o0Var = (o0) ((l) ((j2) yVar.f22677a).getValue()).k.getContent();
                    if (o0Var == null) {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AirportLoungePassCheckoutScreenModel", "Can't launch entries modal controller: quotes is null", null, h0Var);
                    } else {
                        i0 i0Var = (i0) ((l) ((j2) yVar.f22677a).getValue()).f10953c.getContent();
                        if (i0Var == null) {
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "AirportLoungePassCheckoutScreenModel", "Can't launch entries modal controller: pricing is null", null, h0Var2);
                        } else {
                            oki.h.v2(cVar3.E, new AirportLoungePassCheckoutScreenContract$ModalStep.Entries(o0Var.f265959c, i0Var), bottom_dialog);
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
