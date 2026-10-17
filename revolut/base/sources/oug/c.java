package oug;

import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating_feedback.AccountClosureFeatureRatingFeedbackScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountClosureFeatureRatingFeedbackScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AccountClosureFeatureRatingFeedbackScreen accountClosureFeatureRatingFeedbackScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountClosureFeatureRatingFeedbackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountClosureFeatureRatingFeedbackScreen accountClosureFeatureRatingFeedbackScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((j) ((h) accountClosureFeatureRatingFeedbackScreen.Q.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVar = (j) ((h) accountClosureFeatureRatingFeedbackScreen.Q.getValue());
                jVar.C2(new f(jVar.o.f94951a, ((e) ((j2) jVar.f229878p.f22677a).getValue()).f229872b));
                break;
        }
        return Unit.f186387a;
    }
}
