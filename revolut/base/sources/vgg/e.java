package vgg;

import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesAirlineDetailsScreen f289160w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f289160w = travelMilesAirlineDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f289160w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f289160w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hfg.e eVar;
        int i = this.u;
        TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen = this.f289160w;
        switch (i) {
            case 0:
                String menuId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE3 = travelMilesAirlineDetailsScreen.d();
                Intrinsics.h(menuId);
                com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) tVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (menuId.equals("NAV_BAR_ACTION_ID_REV_POINTS")) {
                    oki.h.v2(bVar.f94278x, TravelMilesAirlineDetailsScreenContract$ModalStep.RevPointsBottomSheet.f94269a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                break;
            default:
                ty0.a model = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarE32 = travelMilesAirlineDetailsScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) tVarE32;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f275445a, "PARTNER_WEBSITE_ID") && (eVar = (hfg.e) ((j) ((j2) bVar2.f94277w.f22677a).getValue()).f289161a.getContent()) != null) {
                    bVar2.C1(new ExternalDestination.Browser(eVar.f, null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
