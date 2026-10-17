package eig;

import android.net.Uri;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.impl.ui.screen.main.TravelMilesMainScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.BrowserCommand;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.z;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesMainScreen f126629w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelMilesMainScreen travelMilesMainScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f126629w = travelMilesMainScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f126629w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f126629w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            default:
                d dVar3 = new d(this.f126629w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((z) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesMainScreen travelMilesMainScreen = this.f126629w;
        switch (i) {
            case 0:
                um0 model = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarD3 = travelMilesMainScreen.R2();
                Intrinsics.h(model);
                com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) lVarD3;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                eVar.f94376x.b3(model);
                break;
            case 1:
                um0 model2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarD32 = travelMilesMainScreen.R2();
                Intrinsics.h(model2);
                com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) lVarD32;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                eVar2.f94376x.c3(model2);
                break;
            default:
                z clickData = (z) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarD33 = travelMilesMainScreen.R2();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.miles.impl.ui.screen.main.e eVar3 = (com.revolut.feature.travel.miles.impl.ui.screen.main.e) lVarD33;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f256227a, "AIRLINE_INFO_LEARN_MORE_ITEM_ID")) {
                    Object obj3 = clickData.f256228b;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.miles.api.model.TravelMilesAirline");
                    Uri uri2 = Uri.parse(((TravelMilesAirline) obj3).f);
                    Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                    eVar3.C1(new BridgeDestination(new BrowserCommand(uri2)));
                }
                break;
        }
        return Unit.f186387a;
    }
}
