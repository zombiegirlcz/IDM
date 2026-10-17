package mug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedback;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackChoice;
import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackDetails;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.AccountClosureFeatureRatingScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AccountClosureFeatureRatingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = accountClosureFeatureRatingScreen;
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

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AccountClosureFeatureRatingScreen accountClosureFeatureRatingScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a) accountClosureFeatureRatingScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a aVar3 = (com.revolut.feature.wealth.account_closure.impl.ui.screens.feature_rating.a) accountClosureFeatureRatingScreen.e3();
                aVar3.C2(new f(new AccountClosureFeedback(AccountClosureFeedbackChoice.FeaturesDontWork.f94862b, new AccountClosureFeedbackDetails(null, ((e) ((j2) aVar3.f94950q.f22677a).getValue()).f209027b))));
                break;
        }
        return Unit.f186387a;
    }
}
