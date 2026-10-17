package l4j;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.route_selector.RouteSelectorController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RouteSelectorController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RouteSelectorController routeSelectorController, Continuation continuation) {
        super(2, continuation);
        this.v = routeSelectorController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.v.S;
        Intrinsics.h(model);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        if (obj3 instanceof BeneficiaryRouteDetails) {
            dVar.C2(new b((BeneficiaryRouteDetails) obj3));
        }
        return Unit.f186387a;
    }
}
