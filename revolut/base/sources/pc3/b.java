package pc3;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.ui.search.CashTopUpSearchLocationScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashTopUpSearchLocationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CashTopUpSearchLocationScreen cashTopUpSearchLocationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashTopUpSearchLocationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        if (obj3 instanceof CashTopUpLocationInfo) {
            g gVar = (g) this.v.Y.getValue();
            CashTopUpLocationInfo location = (CashTopUpLocationInfo) obj3;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(location, "location");
            gVar.v2(new e(location));
        }
        return Unit.f186387a;
    }
}
