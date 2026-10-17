package e42;

import c12.d0;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.apm.core.models.recipients.ApmRecipientSettingsValue;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ApmRecipient f122377w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b bVar, ApmRecipient apmRecipient, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f122377w = apmRecipient;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f122377w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ApmRecipientSettingsValue f62271b = bVar.o.getF62271b();
            if (!(f62271b instanceof ApmRecipientSettingsValue.BlockIncomingMoneyRequests)) {
                throw new NoWhenBranchMatchedException();
            }
            this.u = 1;
            obj2 = com.revolut.feature.apm.core.ui.impl.ui.recipients.settings_dialog.b.I2(bVar, this.f122377w, (ApmRecipientSettingsValue.BlockIncomingMoneyRequests) f62271b, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        bVar.C2(new d0((ApmRecipient) obj2));
        return Unit.f186387a;
    }
}
