package h2j;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow.SavingsDisclaimersFlow;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreen;
import com.revolut.retail.feature.balance.picker.impl.new_picker.dual.DualChooserScreenContract$Step;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DualChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DualChooserScreen dualChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = dualChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        k kVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a aVar2 = (com.revolut.retail.feature.balance.picker.impl.new_picker.dual.a) kVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52715m;
        if (obj3 instanceof j1j.e) {
            aVar2.l2(new r(aVar2, obj3, null), new yi5.b(26));
        } else if (obj3 instanceof j1j.c) {
            aVar2.f99536x.getClass();
            SavingsDisclaimersFlow savingsDisclaimersFlowA = z1j.a.a((j1j.c) obj3);
            if (savingsDisclaimersFlowA != null) {
                yji.l.j2(aVar2, savingsDisclaimersFlowA, null, null, 3);
            } else {
                y.B("Couldn't get savings disclaimers flow");
            }
        } else if (obj3 instanceof j1j.a) {
            oki.h.v2(aVar2.D, DualChooserScreenContract$Step.ExcludedLockedBalances.f99528a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
