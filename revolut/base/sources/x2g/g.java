package x2g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import d3g.a0;
import d3g.u;
import d3g.x;
import d3g.z;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q2g.d;
import rp0.t;
import rp0.y;
import y7a.v;
import y7a.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperiencesPickupDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperiencesPickupDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        e3g.b mapper;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.P;
        final h3g.a answer = obj3 instanceof h3g.a ? (h3g.a) obj3 : null;
        if (answer != null) {
            TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = answer.f149114a;
            final o oVar = (o) this.v.T2();
            oVar.getClass();
            Intrinsics.checkNotNullParameter(answer, "answer");
            TravelExperienceBookingQuestion travelExperienceBookingQuestion = travelExperiencesBookingQuestionAnswer.f92761a;
            TravelExperienceBookingQuestion travelExperienceBookingQuestion2 = travelExperiencesBookingQuestionAnswer.f92761a;
            final int i = 1;
            if (com.revolut.feature.travel.experiences.api.models.experience.a.a(travelExperienceBookingQuestion)) {
                PickerScreen pickerScreen = new PickerScreen(new PickerScreenContract$InputData(null, new TextClause(travelExperienceBookingQuestion2.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, null, "ExperienceCountryResidencePickerScreenInteractor", null, travelExperiencesBookingQuestionAnswer.f92762b, null, null, false, null, null, null, 134151161));
                final int i2 = 0;
                yji.l.g2(oVar, pickerScreen, null, new Function1() { // from class: x2g.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i2) {
                            case 0:
                                v countryOutput = (v) obj4;
                                Intrinsics.checkNotNullParameter(countryOutput, "countryOutput");
                                w wVar = countryOutput.f311454a;
                                c1g.c cVar = wVar instanceof c1g.c ? (c1g.c) wVar : null;
                                if (cVar != null) {
                                    h3g.a aVar2 = answer;
                                    oVar.y2(new z(aVar2, cVar, 1), new u(aVar2, 7), new a0(aVar2, cVar, 1));
                                }
                                return Unit.f186387a;
                            default:
                                q2g.d locationOutput = (q2g.d) obj4;
                                Intrinsics.checkNotNullParameter(locationOutput, "locationOutput");
                                boolean z = locationOutput instanceof q2g.e;
                                o oVar2 = oVar;
                                h3g.a aVar3 = answer;
                                if (z) {
                                    oVar2.y2(new d3g.v(aVar3, locationOutput, 1), new u(aVar3, 5), new d3g.w(locationOutput, 1));
                                } else {
                                    if (!(locationOutput instanceof d.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    oVar2.y2(new x(aVar3, 1), new u(aVar3, 6), new x29.a(2));
                                }
                                return Unit.f186387a;
                        }
                    }
                }, 1);
            } else if (com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion2)) {
                boolean zD = com.revolut.feature.travel.experiences.api.models.experience.a.d(travelExperienceBookingQuestion2);
                List list = answer.d;
                if (!list.isEmpty() && (list.size() != 1 || zD)) {
                    yji.l.g2(oVar, new TravelExperienceLocationPickerScreen(new TravelExperienceLocationPickerScreenContract$InputData(travelExperienceBookingQuestion2.f92789b, com.revolut.feature.travel.experiences.api.models.experience.a.d(travelExperienceBookingQuestion2), list, ((j) oVar.t2()).f302555a.f210459n)), null, new Function1() { // from class: x2g.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i) {
                                case 0:
                                    v countryOutput = (v) obj4;
                                    Intrinsics.checkNotNullParameter(countryOutput, "countryOutput");
                                    w wVar = countryOutput.f311454a;
                                    c1g.c cVar = wVar instanceof c1g.c ? (c1g.c) wVar : null;
                                    if (cVar != null) {
                                        h3g.a aVar2 = answer;
                                        oVar.y2(new z(aVar2, cVar, 1), new u(aVar2, 7), new a0(aVar2, cVar, 1));
                                    }
                                    return Unit.f186387a;
                                default:
                                    q2g.d locationOutput = (q2g.d) obj4;
                                    Intrinsics.checkNotNullParameter(locationOutput, "locationOutput");
                                    boolean z = locationOutput instanceof q2g.e;
                                    o oVar2 = oVar;
                                    h3g.a aVar3 = answer;
                                    if (z) {
                                        oVar2.y2(new d3g.v(aVar3, locationOutput, 1), new u(aVar3, 5), new d3g.w(locationOutput, 1));
                                    } else {
                                        if (!(locationOutput instanceof d.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        oVar2.y2(new x(aVar3, 1), new u(aVar3, 6), new x29.a(2));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                }
            } else {
                e3g.a aVarK = gc0.c.k(answer);
                if (aVarK != null && (mapper = (e3g.b) oVar.f302567s.get(aVarK)) != null) {
                    Intrinsics.checkNotNullParameter(mapper, "mapper");
                    oVar.u = mapper.a(answer);
                    oVar.f302566r.x(new y(mapper.b(answer), new t(new TextClause(travelExperiencesBookingQuestionAnswer.f92761a.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
                    Unit unit = Unit.f186387a;
                }
            }
        }
        return Unit.f186387a;
    }
}
