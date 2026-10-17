package z32;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f319139w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f319139w = setting;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f319139w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        RecipientPaymentsSettings.Setting setting = this.f319139w;
        com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            s sVar = new s(aVar2, setting, null);
            this.u = 1;
            if (do3.q.t(aVar2, sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.H2(aVar2.f62402q, new h3j.k(setting, 3));
        return Unit.f186387a;
    }
}
