package z2g;

import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.TravelExperiencesPriceBreakdownScreenContract$ModalStep;
import com.revolut.feature.travel.experiences.models.TravelExperiencesPointsOption;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import ip0.y7;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesPriceBreakdownScreen f319070w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelExperiencesPriceBreakdownScreen travelExperiencesPriceBreakdownScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f319070w = travelExperiencesPriceBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f319070w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f319070w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((y7) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesPriceBreakdownScreen travelExperiencesPriceBreakdownScreen = this.f319070w;
        switch (i) {
            case 0:
                y7 model = (y7) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = (e) travelExperiencesPriceBreakdownScreen.R.getValue();
                Intrinsics.h(model);
                com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a aVar2 = (com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a) eVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (Intrinsics.f(model.f167259a, "REV_POINTS_DISCOUNT_ITEM_ID")) {
                    Object obj3 = model.f;
                    TravelExperiencesPointsOption travelExperiencesPointsOption = obj3 instanceof TravelExperiencesPointsOption ? (TravelExperiencesPointsOption) obj3 : null;
                    if (travelExperiencesPointsOption != null) {
                        h.v2(aVar2.f93111q, new TravelExperiencesPriceBreakdownScreenContract$ModalStep.Discount(travelExperiencesPointsOption), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar2 = (e) travelExperiencesPriceBreakdownScreen.R.getValue();
                Intrinsics.h(clickData);
                com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a aVar4 = (com.revolut.feature.travel.experiences.impl.ui.screen.price_breakdown.a) eVar2;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj4 = clickData.d;
                if (obj4 instanceof x6c.a) {
                    aVar4.C1(new ExternalDestination.Browser(((x6c.a) obj4).f303062a, null));
                }
                break;
        }
        return Unit.f186387a;
    }
}
