package od3;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CashbackProductScreen cashbackProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g0 g0VarT2 = this.v.T2();
        Intrinsics.h(model);
        s0 s0Var = (s0) g0VarT2;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52708a, "ID_TRANSACTIONS_HEADER")) {
            s0Var.n2(new m0(s0Var, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
