package d3g;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceLanguage;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelExperienceQuestionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelExperienceQuestionsScreen travelExperienceQuestionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelExperienceQuestionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.f;
        boolean z = obj3 instanceof h3g.a;
        TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = this.v;
        if (z) {
            h3g.a answer = (h3g.a) obj3;
            com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
            bVar.getClass();
            Intrinsics.checkNotNullParameter(answer, "answer");
            bVar.y2(new cvi.b(bVar, answer, 14), new u(answer, 0), new u(answer, 1));
            j60.a.v(bVar.f93125q, false, null, 3);
        } else if (obj3 instanceof TravelExperienceLanguage) {
            TravelExperienceLanguage language = (TravelExperienceLanguage) obj3;
            com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar2 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
            bVar2.getClass();
            Intrinsics.checkNotNullParameter(language, "language");
            String str = language.f92823a;
            TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = ((k) bVar2.t2()).f111124h;
            if (!Intrinsics.f(str, travelExperienceSelectedLanguage != null ? travelExperienceSelectedLanguage.f92846a : null)) {
                bVar2.x2(new d34.b(language, 2));
            }
            j60.a.v(bVar2.f93125q, false, null, 3);
        } else if (obj3 instanceof myf.v) {
            myf.v guideType = (myf.v) obj3;
            com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar3 = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.T2();
            bVar3.getClass();
            Intrinsics.checkNotNullParameter(guideType, "guideType");
            TravelExperienceSelectedLanguage travelExperienceSelectedLanguage2 = ((k) bVar3.t2()).f111124h;
            if (guideType != (travelExperienceSelectedLanguage2 != null ? travelExperienceSelectedLanguage2.d : null)) {
                bVar3.x2(new cui.v(bVar3, guideType, 26));
            }
            j60.a.v(bVar3.f93125q, false, null, 3);
        }
        return Unit.f186387a;
    }
}
