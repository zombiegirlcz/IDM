package hui;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.AsftHomeScreenContract$ModalStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftHomeScreen f155679w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(AsftHomeScreen asftHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155679w = asftHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f155679w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            default:
                i iVar2 = new i(this.f155679w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AsftHomeScreen asftHomeScreen = this.f155679w;
        switch (i) {
            case 0:
                r passPayload = (r) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c) asftHomeScreen.e3();
                com.revolut.kompot.navigable.vc.modal.a aVar2 = cVar.C;
                Intrinsics.checkNotNullParameter(passPayload, "passPayload");
                boolean zF = Intrinsics.f(passPayload, p.f155688a);
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (zF) {
                    oki.h.v2(aVar2, AsftHomeScreenContract$ModalStep.PreparingPassInfo.f98833a, bottom_dialog);
                } else if (passPayload instanceof o) {
                    o oVar = (o) passPayload;
                    oki.h.v2(aVar2, new AsftHomeScreenContract$ModalStep.PassAvailableSoon(oVar.f155686a, oVar.f155687b), bottom_dialog);
                } else {
                    if (!(passPayload instanceof q)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C2(new m(((q) passPayload).f155689a));
                }
                return Unit.f186387a;
            default:
                String airportIataCode = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c cVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.home.c) asftHomeScreen.e3();
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(airportIataCode, "airportIataCode");
                cVar2.C2(new l(airportIataCode));
                return Unit.f186387a;
        }
    }
}
