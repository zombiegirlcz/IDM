package od3;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(CashbackProductScreen cashbackProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g0 g0VarT2 = this.v.T2();
        Intrinsics.h(model);
        s0 s0Var = (s0) g0VarT2;
        j60.a aVar2 = s0Var.v;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "ID_SELECT_CURRENCY")) {
            j60.a.v(aVar2, true, null, 2);
            s0Var.n2(new l0(s0Var, model, null), new whi.b(6));
        } else if (Intrinsics.f(str, "ID_SEE_ALL_CASHBACK")) {
            j60.a.v(aVar2, true, null, 2);
            s0Var.v2(new p(new YourCashbackFlowContract$Step.Home(false)));
        }
        return Unit.f186387a;
    }
}
