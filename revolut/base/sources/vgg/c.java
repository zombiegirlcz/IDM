package vgg;

import com.revolut.feature.rev_points.giftcards.api.navigation.descriptor.RevPointsGiftcardsPurchaseController$InputData;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelMilesAirlineDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelMilesAirlineDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) travelMilesAirlineDetailsScreen.d()).B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) travelMilesAirlineDetailsScreen.d();
                hfg.e eVar = (hfg.e) ((j) ((j2) bVar.f94277w.f22677a).getValue()).f289161a.getContent();
                if (eVar != null) {
                    List list = eVar.k;
                    if (list.size() == 1) {
                        int i2 = x.f289181b[((hfg.b0) d0.b0(list)).ordinal()];
                        if (i2 == 1) {
                            bVar.J2();
                        } else if (i2 == 2) {
                            String str = eVar.f151825g;
                            if (str != null) {
                                bVar.C1(new ExternalDestination.Browser(str, null));
                            }
                        } else if (i2 == 3) {
                            String str2 = eVar.f151830n;
                            if (str2 != null) {
                                oki.h.v2(bVar.f94278x, new TravelMilesAirlineDetailsScreenContract$ModalStep.RevPointsGiftcardsPurchase(new RevPointsGiftcardsPurchaseController$InputData(str2)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                            } else {
                                bVar.X1(com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b.I2());
                            }
                        } else {
                            if (i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar.X1(com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b.I2());
                        }
                    } else {
                        bVar.J2();
                    }
                }
                return Unit.f186387a;
        }
    }
}
