package z32;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.core.ui.impl.ui.recipients.details.ApmRecipientDetailsNewScreen;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ ApmRecipientDetailsNewScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ApmRecipientDetailsNewScreen apmRecipientDetailsNewScreen, Continuation continuation) {
        super(2, continuation);
        this.u = apmRecipientDetailsNewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a aVar2 = (com.revolut.feature.apm.core.ui.impl.ui.recipients.details.a) this.u.d();
        RecipientPaymentsSettings.Setting setting = ((a) ((j2) aVar2.f62402q.f22677a).getValue()).e;
        if (setting == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVar2.l2(new v(aVar2, RecipientPaymentsSettings.Setting.a(setting, new RecipientPaymentsSettings.Setting.Value.Binary(!setting.b())), null), new yi5.b(26));
        return Unit.f186387a;
    }
}
