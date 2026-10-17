package z32;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f319141w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f319141w = setting;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, this.f319141w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        RecipientPaymentsSettings.Setting setting = this.f319141w;
        com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar2 = this.v;
        u uVar = new u(aVar2, setting, null);
        this.u = 1;
        Object objP2 = aVar2.p2(this, uVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
