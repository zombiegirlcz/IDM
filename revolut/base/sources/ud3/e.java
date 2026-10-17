package ud3;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.feature.cashback.impl.ui.yourcashback.home.YourCashbackHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ YourCashbackHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(YourCashbackHomeScreen yourCashbackHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = yourCashbackHomeScreen;
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
        k kVarT2 = this.v.T2();
        Intrinsics.h(model);
        e0 e0Var = (e0) kVarT2;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "ID_TRANSACTIONS_HEADER")) {
            e0Var.n2(new c0(e0Var, null), new whi.b(6));
        } else if (Intrinsics.f(str, "ID_CASHBACK_BY_SOURCE_HEADER")) {
            e0Var.v2(new j(YourCashbackFlowContract$Step.SplitBySource.f65711a));
        }
        return Unit.f186387a;
    }
}
