package nsc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.feature.sca_prompt.impl.trusted_entities.TrustedEntitiesScreen;
import com.revolut.feature.sca_prompt.impl.trusted_entities.TrustedEntitiesScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TrustedEntitiesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TrustedEntitiesScreen trustedEntitiesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = trustedEntitiesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.sca_prompt.impl.trusted_entities.a aVar2 = (com.revolut.feature.sca_prompt.impl.trusted_entities.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        RecipientPaymentsSettings recipientPaymentsSettings = obj3 instanceof RecipientPaymentsSettings ? (RecipientPaymentsSettings) obj3 : null;
        if (recipientPaymentsSettings != null && a.a(recipientPaymentsSettings)) {
            oki.h.v2(aVar2.f85354t, new TrustedEntitiesScreenContract$ModalStep.Remove(recipientPaymentsSettings), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
