package li8;

import aw0.n6;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.JuniorPersonalDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JuniorPersonalDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(JuniorPersonalDetailsScreen juniorPersonalDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = juniorPersonalDetailsScreen;
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
                return ((b) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JuniorPersonalDetailsScreen juniorPersonalDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) juniorPersonalDetailsScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar = (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c) juniorPersonalDetailsScreen.d();
                cVar.getClass();
                cVar.n2(new kze.h(cVar, null, 17), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
