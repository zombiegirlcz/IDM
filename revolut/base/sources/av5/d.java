package av5;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.crypto_investments.api.model.transaction_filter.CryptoTransactionFilter;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters_by_type.FiltersByTypeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FiltersByTypeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FiltersByTypeScreen filtersByTypeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = filtersByTypeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVarH3 = this.v.T2();
        Intrinsics.h(model);
        l lVar = (l) hVarH3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        CryptoTransactionFilter cryptoTransactionFilter = obj3 instanceof CryptoTransactionFilter ? (CryptoTransactionFilter) obj3 : null;
        if (cryptoTransactionFilter != null) {
            lVar.x2(new as9.a(lVar, cryptoTransactionFilter, 10));
        }
        return Unit.f186387a;
    }
}
