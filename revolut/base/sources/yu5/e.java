package yu5;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.crypto_investments.impl.ui.screens.transaction_filter.filters.FiltersScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FiltersScreen filtersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = filtersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarH3 = this.v.T2();
        Intrinsics.h(model);
        n nVar = (n) kVarH3;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "LIST_ID_TRANSACTION_TYPE_SUBHEADER")) {
            nVar.v2(new i(av5.i.TRANSACTION_TYPE, ((g) nVar.t2()).f316886a));
        } else if (Intrinsics.f(str, "LIST_ID_CURRENCY_SUBHEADER")) {
            nVar.v2(new i(av5.i.CURRENCY, ((g) nVar.t2()).f316886a));
        }
        return Unit.f186387a;
    }
}
