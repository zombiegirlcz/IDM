package wm7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import do3.n;
import efm.k;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Survey.Licence f298617w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.a aVar, Survey.Licence licence, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f298617w = licence;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f298617w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.licence.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            k kVarC = aVar2.f75461t.d.c();
            this.u = 1;
            obj2 = nim.a.i(kVarC, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n nVar = (n) obj2;
        Integer numA = nVar != null ? zl7.c.a(nVar) : null;
        Survey.Licence licence = this.f298617w;
        if (numA != null && !zl7.c.b(licence.f75328b, numA.intValue())) {
            return aVar2.X1(vl7.a.a(14, new TextLocalisedClause(R$string.car_insurance_question_license_duration_invalid_age, null, null, 14), null, null));
        }
        aVar2.G2(new c(licence));
        return Unit.f186387a;
    }
}
