package z32;

import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final class u extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientPaymentsSettings.Setting f319140w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar, RecipientPaymentsSettings.Setting setting, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
        this.f319140w = setting;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.v, this.f319140w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
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
        RecipientPaymentsSettings.Setting setting = this.f319140w;
        com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar2 = this.v;
        t tVar = new t(aVar2, setting, null);
        this.u = 1;
        Object objB = pu7.a.B(aVar2.k, "onSwitchClicked", tVar, this);
        return objB == aVar ? aVar : objB;
    }
}
