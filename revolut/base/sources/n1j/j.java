package n1j;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BalancePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(BalancePickerScreen balancePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = balancePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar = (com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) oVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        cVar.l2(new y(model, cVar, null), new yi5.b(26));
        return Unit.f186387a;
    }
}
