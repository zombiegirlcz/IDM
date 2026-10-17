package jxi;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreenContract$ModalStep;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.WalletPassTarget;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AirportLoungesHomeScreen f179216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(AirportLoungesHomeScreen airportLoungesHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f179216w = airportLoungesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f179216w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f179216w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f179216w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((svi.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((WalletPassTarget) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AirportLoungesHomeScreen airportLoungesHomeScreen = this.f179216w;
        switch (i) {
            case 0:
                AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData data = (AirportLoungesHomeScreenContract$UnlimitedProfileSwitchData) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) airportLoungesHomeScreen.e3();
                cVar.getClass();
                Intrinsics.checkNotNullParameter(data, "data");
                oki.h.v2(cVar.H, new AirportLoungesHomeScreenContract$ModalStep.UnlimitedProfileSwitchBottomSheet(data), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                break;
            case 1:
                svi.b airportLounge = (svi.b) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar2 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) airportLoungesHomeScreen.e3();
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(airportLounge, "airportLounge");
                cVar2.C2(new t(airportLounge.f265874a, airportLounge.i));
                break;
            default:
                WalletPassTarget target = (WalletPassTarget) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c cVar3 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.c) airportLoungesHomeScreen.e3();
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(target, "target");
                cVar3.C2(new u(target));
                break;
        }
        return Unit.f186387a;
    }
}
