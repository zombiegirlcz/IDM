package oug;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating_feedback.AccountClosureFeatureRatingFeedbackScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountClosureFeatureRatingFeedbackScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AccountClosureFeatureRatingFeedbackScreen accountClosureFeatureRatingFeedbackScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountClosureFeatureRatingFeedbackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        Intrinsics.h(textData);
        j jVar = (j) hVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(textData, "textData");
        if (Intrinsics.f(textData.f52597a, "FEATURES_FEEDBACK_REASON_COMMENT")) {
            jVar.H2(jVar.f229878p, new ak8.i(textData, 17));
        }
        return Unit.f186387a;
    }
}
