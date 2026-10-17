package i8d;

import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import com.revolut.feature.shared.help_centre.impl.faq.screens.feedback.SharedEditFaqFeedbackScreen;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedEditFaqFeedbackScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SharedEditFaqFeedbackScreen sharedEditFaqFeedbackScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedEditFaqFeedbackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((SuggestionsBarDelegate.Suggestion) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SuggestionsBarDelegate.Suggestion suggestion = (SuggestionsBarDelegate.Suggestion) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.f86252a0.getValue();
        Object obj3 = suggestion.f53496h;
        cji.d dVar = eVar.f159509s;
        if (obj3 instanceof kg0.b) {
            FeedbackTag feedbackTag = ((kg0.b) obj3).f183896a;
            boolean zContains = ((Set) dVar.a()).contains(feedbackTag);
            Set setH1 = d0.h1((Set) dVar.a());
            if (zContains) {
                setH1.remove(feedbackTag);
            } else {
                setH1.add(feedbackTag);
            }
            dVar.d(setH1);
        }
        return Unit.f186387a;
    }
}
