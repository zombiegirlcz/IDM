package d3g;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ TravelExperienceQuestionsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelExperienceQuestionsScreen travelExperienceQuestionsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelExperienceQuestionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) this.u.T2();
        h3g.a aVar2 = bVar.u;
        if (aVar2 != null) {
            bVar.y2(new cvi.b(bVar, aVar2, 14), new u(aVar2, 0), new u(aVar2, 1));
        }
        j60.a.v(bVar.f93125q, false, null, 3);
        return Unit.f186387a;
    }
}
