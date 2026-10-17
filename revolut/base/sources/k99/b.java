package k99;

import aw0.n6;
import com.revolut.feature.onboarding.countries.restriction.impl.disclaimer.CountryOfResidenceRevolutXDisclaimerScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CountryOfResidenceRevolutXDisclaimerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CountryOfResidenceRevolutXDisclaimerScreen countryOfResidenceRevolutXDisclaimerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = countryOfResidenceRevolutXDisclaimerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CountryOfResidenceRevolutXDisclaimerScreen countryOfResidenceRevolutXDisclaimerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) countryOfResidenceRevolutXDisclaimerScreen.P.getValue()).C2(e.f182297a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((g) countryOfResidenceRevolutXDisclaimerScreen.P.getValue()).C2(d.f182296a);
                break;
        }
        return Unit.f186387a;
    }
}
