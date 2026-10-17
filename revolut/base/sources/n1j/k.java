package n1j;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreen;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreenContract$ModalStep;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlow;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BalancePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(BalancePickerScreen balancePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = balancePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.k3();
        Intrinsics.h(model);
        com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar = (com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) oVarE3;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        if (obj3 instanceof j1j.e) {
            cVar.l2(new a0(cVar, obj3, null), new yi5.b(26));
        } else if (obj3 instanceof j1j.c) {
            cVar.f99512w.getClass();
            SavingsDisclaimersFlow savingsDisclaimersFlowA = z1j.a.a((j1j.c) obj3);
            if (savingsDisclaimersFlowA != null) {
                yji.l.j2(cVar, savingsDisclaimersFlowA, null, null, 3);
            } else {
                wp5.y.B("Couldn't get savings disclaimers flow");
            }
        } else if (obj3 instanceof j1j.a) {
            oki.h.v2(cVar.F, BalancePickerScreenContract$ModalStep.ExcludedLockedBalances.f99499a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
