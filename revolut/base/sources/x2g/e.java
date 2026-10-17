package x2g;

import aw0.f4;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import ip0.a10;
import ip0.c10;
import ip0.cl0;
import java.time.LocalTime;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesPickupDetailsScreen f302554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f302554w = travelExperiencesPickupDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f302554w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f302554w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f302554w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen = this.f302554w;
        switch (i) {
            case 0:
                f4 focusData = (f4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarH3 = travelExperiencesPickupDetailsScreen.T2();
                Intrinsics.h(focusData);
                o oVar = (o) lVarH3;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                oVar.x2(new wwa.a(oVar, focusData, 21));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a10 model = (a10) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                o oVar2 = (o) travelExperiencesPickupDetailsScreen.T2();
                oVar2.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = ((c10) model.f163364b.get(iIntValue)).f163673b;
                h3g.a aVar3 = obj3 instanceof h3g.a ? (h3g.a) obj3 : null;
                if (aVar3 != null) {
                    oVar2.u = aVar3;
                }
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cl0 model2 = (cl0) pair2.f186385a;
                LocalTime time = (LocalTime) pair2.f186386b;
                o oVar3 = (o) travelExperiencesPickupDetailsScreen.T2();
                b1g.c cVar = oVar3.f302568t;
                Intrinsics.checkNotNullParameter(model2, "model");
                Intrinsics.checkNotNullParameter(time, "time");
                Object obj4 = model2.d;
                h3g.a aVar5 = obj4 instanceof h3g.a ? (h3g.a) obj4 : null;
                if (aVar5 != null) {
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(time, "time");
                    String str = time.format(cVar.d);
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    oVar3.u = h3g.a.a(aVar5, TravelExperiencesBookingQuestionAnswer.a(aVar5.f149114a, str, null, 29), new TextClause(cVar.c(time), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
                }
                break;
        }
        return Unit.f186387a;
    }
}
