package d3g;

import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.location_picker.TravelExperienceLocationPickerScreenContract$InputData;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q2g.d;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperienceQuestionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelExperienceQuestionsScreen travelExperienceQuestionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperienceQuestionsScreen;
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
        Object next;
        e3g.b mapper;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.P;
        final h3g.a answer = obj3 instanceof h3g.a ? (h3g.a) obj3 : null;
        final int i = 0;
        final int i2 = 1;
        TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = this.v;
        if (answer != null) {
            TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = answer.f149114a;
            final com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
            bVar.getClass();
            Intrinsics.checkNotNullParameter(answer, "answer");
            TravelExperienceBookingQuestion travelExperienceBookingQuestion = travelExperiencesBookingQuestionAnswer.f92761a;
            TravelExperienceBookingQuestion travelExperienceBookingQuestion2 = travelExperiencesBookingQuestionAnswer.f92761a;
            if (com.revolut.feature.travel.experiences.api.models.experience.a.a(travelExperienceBookingQuestion)) {
                yji.l.g2(bVar, new PickerScreen(new PickerScreenContract$InputData(null, new TextClause(travelExperienceBookingQuestion2.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, null, "ExperienceCountryResidencePickerScreenInteractor", null, travelExperiencesBookingQuestionAnswer.f92762b, null, null, false, null, null, null, 134151161)), null, new Function1() { // from class: d3g.t
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        switch (i2) {
                            case 0:
                                q2g.d locationOutput = (q2g.d) obj4;
                                Intrinsics.checkNotNullParameter(locationOutput, "locationOutput");
                                boolean z = locationOutput instanceof q2g.e;
                                com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar2 = bVar;
                                h3g.a aVar2 = answer;
                                if (z) {
                                    bVar2.y2(new v(aVar2, locationOutput, 0), new u(aVar2, 2), new w(locationOutput, 0));
                                } else {
                                    if (!(locationOutput instanceof d.a)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    bVar2.y2(new x(aVar2, 0), new u(aVar2, 3), new d27.d0(16));
                                }
                                return Unit.f186387a;
                            default:
                                y7a.v countryOutput = (y7a.v) obj4;
                                Intrinsics.checkNotNullParameter(countryOutput, "countryOutput");
                                y7a.w wVar = countryOutput.f311454a;
                                c1g.c cVar = wVar instanceof c1g.c ? (c1g.c) wVar : null;
                                if (cVar != null) {
                                    h3g.a aVar3 = answer;
                                    bVar.y2(new z(aVar3, cVar, 0), new u(aVar3, 4), new a0(aVar3, cVar, 0));
                                }
                                return Unit.f186387a;
                        }
                    }
                }, 1);
            } else if (com.revolut.feature.travel.experiences.api.models.experience.a.c(travelExperienceBookingQuestion2)) {
                boolean zD = com.revolut.feature.travel.experiences.api.models.experience.a.d(travelExperienceBookingQuestion2);
                List list = answer.d;
                if (!list.isEmpty() && (list.size() != 1 || zD)) {
                    yji.l.g2(bVar, new TravelExperienceLocationPickerScreen(new TravelExperienceLocationPickerScreenContract$InputData(travelExperienceBookingQuestion2.f92789b, com.revolut.feature.travel.experiences.api.models.experience.a.d(travelExperienceBookingQuestion2), list, ((k) bVar.t2()).f111121b.f210459n)), null, new Function1() { // from class: d3g.t
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            switch (i) {
                                case 0:
                                    q2g.d locationOutput = (q2g.d) obj4;
                                    Intrinsics.checkNotNullParameter(locationOutput, "locationOutput");
                                    boolean z = locationOutput instanceof q2g.e;
                                    com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar2 = bVar;
                                    h3g.a aVar2 = answer;
                                    if (z) {
                                        bVar2.y2(new v(aVar2, locationOutput, 0), new u(aVar2, 2), new w(locationOutput, 0));
                                    } else {
                                        if (!(locationOutput instanceof d.a)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        bVar2.y2(new x(aVar2, 0), new u(aVar2, 3), new d27.d0(16));
                                    }
                                    return Unit.f186387a;
                                default:
                                    y7a.v countryOutput = (y7a.v) obj4;
                                    Intrinsics.checkNotNullParameter(countryOutput, "countryOutput");
                                    y7a.w wVar = countryOutput.f311454a;
                                    c1g.c cVar = wVar instanceof c1g.c ? (c1g.c) wVar : null;
                                    if (cVar != null) {
                                        h3g.a aVar3 = answer;
                                        bVar.y2(new z(aVar3, cVar, 0), new u(aVar3, 4), new a0(aVar3, cVar, 0));
                                    }
                                    return Unit.f186387a;
                            }
                        }
                    }, 1);
                }
            } else {
                e3g.a aVarK = gc0.c.k(answer);
                if (aVarK != null && (mapper = (e3g.b) bVar.f93126r.get(aVarK)) != null) {
                    Intrinsics.checkNotNullParameter(mapper, "mapper");
                    bVar.u = mapper.a(answer);
                    bVar.f93125q.x(new rp0.y(mapper.b(answer), new rp0.t(new TextClause(travelExperiencesBookingQuestionAnswer.f92761a.f92789b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
                    Unit unit = Unit.f186387a;
                }
            }
        } else {
            String str = model.f52580a;
            if (Intrinsics.f(str, "LANGUAGE_SELECTOR_ID")) {
                com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar2 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
                j60.a aVar2 = bVar2.f93125q;
                e3g.f fVar = bVar2.f93127s;
                List languages = ((k) bVar2.t2()).i;
                TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = ((k) bVar2.t2()).f111124h;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(languages, "languages");
                rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.experiences_additional_details_tour_language, null, null, 14), null, null, 30);
                List<TravelExperienceLanguage> list2 = languages;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                for (TravelExperienceLanguage travelExperienceLanguage : list2) {
                    arrayList.add(new SingleChoiceDelegate.Model(travelExperienceLanguage.f92823a, new TextClause(travelExperienceLanguage.f92824b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Intrinsics.f(travelExperienceLanguage.f92823a, travelExperienceSelectedLanguage != null ? travelExperienceSelectedLanguage.f92846a : null), null, travelExperienceLanguage, YearClass.CLASS_2008));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                aVar2.x(new rp0.y(arrayList, tVar, rp0.l.WINDOW, null, null, null, 1016));
            } else if (Intrinsics.f(str, "LANGUAGE_GUIDE_TYPE_SELECTOR_ID")) {
                com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar3 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
                Iterator it8 = ((k) bVar3.t2()).i.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    String str2 = ((TravelExperienceLanguage) next).f92823a;
                    TravelExperienceSelectedLanguage travelExperienceSelectedLanguage2 = ((k) bVar3.t2()).f111124h;
                    if (Intrinsics.f(str2, travelExperienceSelectedLanguage2 != null ? travelExperienceSelectedLanguage2.f92846a : null)) {
                        break;
                    }
                }
                TravelExperienceLanguage travelExperienceLanguage2 = (TravelExperienceLanguage) next;
                if (travelExperienceLanguage2 != null) {
                    j60.a aVar3 = bVar3.f93125q;
                    e3g.g gVar = bVar3.f93128t;
                    ArrayList<myf.v> guideTypes = travelExperienceLanguage2.f92825c;
                    TravelExperienceSelectedLanguage travelExperienceSelectedLanguage3 = ((k) bVar3.t2()).f111124h;
                    myf.v vVar = travelExperienceSelectedLanguage3 != null ? travelExperienceSelectedLanguage3.d : null;
                    gVar.getClass();
                    Intrinsics.checkNotNullParameter(guideTypes, "guideTypes");
                    rp0.t tVar2 = new rp0.t(new TextLocalisedClause(R$string.experiences_additional_details_guide_type_title, null, null, 14), null, null, 30);
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(guideTypes, 10));
                    for (myf.v vVar2 : guideTypes) {
                        arrayList2.add(new SingleChoiceDelegate.Model(vVar2.toString(), io3.h.t(vVar2), vVar2 == vVar, null, vVar2, YearClass.CLASS_2008));
                    }
                    yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                    aVar3.x(new rp0.y(arrayList2, tVar2, rp0.l.WINDOW, null, null, null, 1016));
                }
            }
        }
        return Unit.f186387a;
    }
}
