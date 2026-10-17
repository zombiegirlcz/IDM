package w72;

import com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            l72.e eVar = jVar.o;
            this.u = 1;
            obj2 = eVar.f192508a.a(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        MultibancoRegistrationStatus.NotRegistered notRegistered = obj2 instanceof MultibancoRegistrationStatus.NotRegistered ? (MultibancoRegistrationStatus.NotRegistered) obj2 : null;
        if (notRegistered == null) {
            throw new IllegalStateException("Received no Multibanco card but user is not unregistered");
        }
        jVar.C2(new e(notRegistered.getTerms()));
        return Unit.f186387a;
    }
}
