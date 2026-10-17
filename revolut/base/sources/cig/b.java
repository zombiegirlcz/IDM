package cig;

import com.revolut.feature.travel.miles.impl.ui.screen.home.search.TravelMilesAirlinesHomeSearchScreen;
import ip0.dg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelMilesAirlinesHomeSearchScreen f24544w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24544w = travelMilesAirlinesHomeSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f24544w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            default:
                b bVar2 = new b(this.f24544w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((dg) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesAirlinesHomeSearchScreen travelMilesAirlinesHomeSearchScreen = this.f24544w;
        switch (i) {
            case 0:
                String input = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE3 = travelMilesAirlinesHomeSearchScreen.e3();
                Intrinsics.h(input);
                com.revolut.feature.travel.miles.impl.ui.screen.home.search.a aVar2 = (com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) gVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                aVar2.H2(aVar2.f94364s, new c86.c(input, 7));
                break;
            default:
                dg model = (dg) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE32 = travelMilesAirlinesHomeSearchScreen.e3();
                Intrinsics.h(model);
                com.revolut.feature.travel.miles.impl.ui.screen.home.search.a aVar4 = (com.revolut.feature.travel.miles.impl.ui.screen.home.search.a) gVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                aVar4.f94363r.a();
                break;
        }
        return Unit.f186387a;
    }
}
