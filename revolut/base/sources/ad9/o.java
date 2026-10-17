package ad9;

import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.user_migration.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlaceOfBirthFlowOutputData.Success f3304w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.onboarding.impl.user_migration.e eVar, PlaceOfBirthFlowOutputData.Success success, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f3304w = success;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.v, this.f3304w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            PlaceOfBirthFlowOutputData.Success success = this.f3304w;
            com.revolut.feature.onboarding.impl.user_migration.e eVar = this.v;
            n nVar = new n(eVar, success, null);
            this.u = 1;
            if (eVar.p2(this, nVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
