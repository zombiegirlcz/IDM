package e46;

import aah.g;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeBreakdown;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ChargeBreakdown chargeBreakdown;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.f51787l;
        d4i.b bVar = obj3 instanceof d4i.b ? (d4i.b) obj3 : null;
        if (bVar != null && (chargeBreakdown = bVar.f111323a) != null) {
            ((c76.a) this.v.e).Z2(chargeBreakdown);
        }
        return Unit.f186387a;
    }
}
