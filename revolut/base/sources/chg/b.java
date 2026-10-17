package chg;

import com.revolut.feature.travel.miles.impl.ui.screen.airlines.search.TravelMilesAirlinesSearchScreen;
import ip0.dg;
import ip0.um0;
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
    public final /* synthetic */ TravelMilesAirlinesSearchScreen f24223w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24223w = travelMilesAirlinesSearchScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                b bVar = new b(this.f24223w, continuation, 0);
                bVar.v = obj2;
                return bVar;
            case 1:
                b bVar2 = new b(this.f24223w, continuation, 1);
                bVar2.v = obj2;
                return bVar2;
            case 2:
                b bVar3 = new b(this.f24223w, continuation, 2);
                bVar3.v = obj2;
                return bVar3;
            default:
                b bVar4 = new b(this.f24223w, continuation, 3);
                bVar4.v = obj2;
                return bVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((b) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelMilesAirlinesSearchScreen travelMilesAirlinesSearchScreen = this.f24223w;
        switch (i) {
            case 0:
                String input = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE3 = travelMilesAirlinesSearchScreen.R2();
                Intrinsics.h(input);
                j jVar = (j) gVarE3;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                jVar.H2(jVar.f24231s, new c86.c(input, 5));
                break;
            case 1:
                dg model = (dg) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE32 = travelMilesAirlinesSearchScreen.R2();
                Intrinsics.h(model);
                j jVar2 = (j) gVarE32;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f163888a, "ERROR_ITEM_ID")) {
                    jVar2.I2();
                }
                break;
            case 2:
                um0 model2 = (um0) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE33 = travelMilesAirlinesSearchScreen.R2();
                Intrinsics.h(model2);
                j jVar3 = (j) gVarE33;
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                jVar3.f24229q.b3(model2);
                break;
            default:
                um0 model3 = (um0) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarE34 = travelMilesAirlinesSearchScreen.R2();
                Intrinsics.h(model3);
                j jVar4 = (j) gVarE34;
                jVar4.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                jVar4.f24229q.c3(model3);
                break;
        }
        return Unit.f186387a;
    }
}
