package ei8;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e f126455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsForm f126456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f126457y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar, PersonalDetailsForm personalDetailsForm, Map map, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f126455w = eVar;
        this.f126456x = personalDetailsForm;
        this.f126457y = map;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f126455w, this.f126456x, this.f126457y, continuation, 0);
            default:
                return new f(this.f126455w, this.f126456x, this.f126457y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    Map map = this.f126457y;
                    com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar = this.f126455w;
                    com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.d dVar = new com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.d(eVar, this.f126456x, map, null);
                    this.v = 1;
                    if (u0.b0(eVar.X(), "PERSONAL_DETAILS_CONFIRMATION_ACTION_BUTTON_TAG", dVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar2 = this.f126455w;
                g gVar = new g(eVar2, this.f126456x, this.f126457y, null, 1);
                this.v = 1;
                Object objB = pu7.a.B(eVar2.k, "routeAfterTermsConfirmation", gVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
