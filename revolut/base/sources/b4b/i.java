package b4b;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.retail.cfd.impl.screens.common.ExpiryDate;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormController;
import com.revolut.feature.retail.cfd.impl.screens.order.v2.CfdOrderFormControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CfdOrderFormController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CfdOrderFormController cfdOrderFormController, Continuation continuation) {
        super(2, continuation);
        this.v = cfdOrderFormController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ZonedDateTime zonedDateTime;
        LocalDate localDate;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarK3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar2 = (com.revolut.feature.retail.cfd.impl.screens.order.v2.a) qVarK3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51787l;
        if (Intrinsics.f(model.f51781a, "LIMIT_STOP_PRICE_ID")) {
            oki.h.v2(aVar2.K, new CfdOrderFormControllerContract$ModalStep.TargetPrice(((n) ((j2) aVar2.J.f22677a).getValue()).f12227a.f82170b, true, true), ModalDestination.Style.POPUP.f98311a);
        } else if (obj3 instanceof o) {
            ExpiryDate expiryDate = ((o) obj3).f12235a;
            if (expiryDate != null) {
                aVar2.K2(expiryDate);
            }
        } else if ((obj3 instanceof y3b.e) && (zonedDateTime = ((y3b.e) obj3).f310689a.f82207b) != null && (localDate = zonedDateTime.toLocalDate()) != null) {
            aVar2.J2(localDate);
        }
        return Unit.f186387a;
    }
}
