package ei8;

import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e f126458w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PersonalDetailsForm f126459x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Map f126460y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar, PersonalDetailsForm personalDetailsForm, Map map, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f126458w = eVar;
        this.f126459x = personalDetailsForm;
        this.f126460y = map;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f126458w, this.f126459x, this.f126460y, continuation, 0);
            default:
                return new g(this.f126458w, this.f126459x, this.f126460y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    if (com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e.I2(this.f126458w, this.f126459x, this.f126460y, this) == aVar) {
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
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e eVar = this.f126458w;
                    g gVar = new g(eVar, this.f126459x, this.f126460y, null, 0);
                    this.v = 1;
                    if (u0.b0(eVar.X(), "CTA_BUTTON_TAG", gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
