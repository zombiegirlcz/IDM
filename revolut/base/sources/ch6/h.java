package ch6;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ CreateMandateScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CreateMandateScreen createMandateScreen, Continuation continuation) {
        super(2, continuation);
        this.u = createMandateScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.external_accounts.impl.mandate.create_mandate.b bVar = (com.revolut.feature.external_accounts.impl.mandate.create_mandate.b) this.u.R2();
        Object value = ((j2) bVar.f72449y.f22677a).getValue();
        i iVar = value instanceof i ? (i) value : null;
        if (iVar != null) {
            oki.h.v2(bVar.z, new CreateMandateScreenContract$ModalStep.LimitsStep(iVar.f24130b, iVar.f24131c), ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
