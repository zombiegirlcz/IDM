package ep7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility.EligibilityScreen;
import com.youTransactor.uCube.rpc.Constants;
import kl7.n0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EligibilityScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EligibilityScreen eligibilityScreen, Continuation continuation) {
        super(2, continuation);
        this.v = eligibilityScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Z.getValue();
        String listId = model.f53228a;
        Object obj3 = model.u;
        k kVar = (k) hVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj3 == n0.CONVICTIONS) {
            tl7.f.R(kVar.f128102p, R$string.car_insurance_eligibility_questions_hint_convictions_title, R$string.car_insurance_eligibility_questions_hint_convictions_description, v.k(new TextLocalisedClause(R$string.car_insurance_eligibility_questions_hint_convictions_description_website1, null, new Click(30, (Integer) null, (Object) null, "HINT_CONVICTIONS_WEBSITE_ITEM", false), 10), new TextLocalisedClause(R$string.car_insurance_eligibility_questions_hint_convictions_description_website2, null, new Click(30, (Integer) null, (Object) null, "HINT_CONVICTIONS_WEBSITE_ITEM", false), 10)), null, null, new ei8.d(kVar, 27), null, null, Constants.TAG_EMV_L2_CHECKSUM);
        }
        return Unit.f186387a;
    }
}
