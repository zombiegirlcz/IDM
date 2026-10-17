package s2g;

import com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOption;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.TravelExperiencesOptionsV2Screen;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$InputData;
import ip0.y7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesOptionsV2Screen f259310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TravelExperiencesOptionsV2Screen travelExperiencesOptionsV2Screen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259310w = travelExperiencesOptionsV2Screen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f259310w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f259310w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((y7) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((ip0.y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesOptionsV2Screen travelExperiencesOptionsV2Screen = this.f259310w;
        switch (i) {
            case 0:
                y7 model = (y7) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarH3 = travelExperiencesOptionsV2Screen.T2();
                Intrinsics.h(model);
                w wVar = (w) oVarH3;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.options.TravelExperiencesOption");
                TravelExperiencesOption travelExperiencesOption = (TravelExperiencesOption) obj3;
                wVar.v2(new m(new TravelExperiencesPriceBreakdownScreenContract$InputData(travelExperiencesOption.e, travelExperiencesOption.i, travelExperiencesOption.f92864j, null, null)));
                break;
            default:
                ip0.y clickData = (ip0.y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarH32 = travelExperiencesOptionsV2Screen.T2();
                Intrinsics.h(clickData);
                w wVar2 = (w) oVarH32;
                wVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.f167226b.f58324n;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2.OptionWithTimes");
                TravelExperienceOptionSelectionV2.OptionWithTimes optionWithTimes = (TravelExperienceOptionSelectionV2.OptionWithTimes) obj4;
                wVar2.x2(new ryd.i(optionWithTimes, 14));
                wVar2.l2(new v(wVar2, optionWithTimes, null), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
