package hh6;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsMode;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreen;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ MandateDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MandateDetailsScreen mandateDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = mandateDetailsScreen;
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
        p pVar = (p) this.u.T2();
        jki.i iVarT2 = pVar.t2();
        i iVar = iVarT2 instanceof i ? (i) iVarT2 : null;
        if (iVar != null) {
            pVar.f2(new UpdateLimitsScreen(new UpdateLimitsScreenContract$InputData(UpdateLimitsMode.ReturnNewLimits.f72465a, iVar.f152260b, iVar.f152261c, null)), ModalDestination.Style.POPUP.f98311a, new hg4.a(pVar, 3));
        }
        return Unit.f186387a;
    }
}
