package d3g;

import aw0.f4;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
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
    public final /* synthetic */ TravelExperienceQuestionsScreen f111114w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelExperienceQuestionsScreen travelExperienceQuestionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f111114w = travelExperienceQuestionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f111114w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f111114w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f111114w, continuation, 2);
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
        TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = this.f111114w;
        switch (i) {
            case 0:
                f4 focusData = (f4) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n nVarI3 = travelExperienceQuestionsScreen.T2();
                Intrinsics.h(focusData);
                com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) nVarI3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(focusData, "focusData");
                bVar.x2(new cui.v(bVar, focusData, 27));
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj3 = ((c10) ((a10) pair.f186385a).f163364b.get(((Number) pair.f186386b).intValue())).f163673b;
                h3g.a answer = obj3 instanceof h3g.a ? (h3g.a) obj3 : null;
                if (answer != null) {
                    com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar2 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(answer, "answer");
                    bVar2.u = answer;
                }
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cl0 cl0Var = (cl0) pair2.f186385a;
                LocalTime time = (LocalTime) pair2.f186386b;
                Object obj4 = cl0Var.d;
                h3g.a answer2 = obj4 instanceof h3g.a ? (h3g.a) obj4 : null;
                if (answer2 != null) {
                    com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar3 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
                    bVar3.getClass();
                    Intrinsics.checkNotNullParameter(answer2, "answer");
                    Intrinsics.checkNotNullParameter(time, "time");
                    b1g.c cVar = bVar3.f93124p;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(time, "time");
                    String str = time.format(cVar.d);
                    Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                    bVar3.u = h3g.a.a(answer2, TravelExperiencesBookingQuestionAnswer.a(answer2.f149114a, str, null, 29), new TextClause(cVar.c(time), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, null, 12);
                }
                break;
        }
        return Unit.f186387a;
    }
}
