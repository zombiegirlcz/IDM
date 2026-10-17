package u95;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreen;
import com.revolut.feature.credit.overdraft.impl.ui.details.OverdraftDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OverdraftDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OverdraftDetailsScreen overdraftDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = overdraftDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarD3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.credit.overdraft.impl.ui.details.a aVar2 = (com.revolut.feature.credit.overdraft.impl.ui.details.a) iVarD3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f53228a, "ID_OVERDRAFT_HEADER")) {
            oki.h.v2(aVar2.f70644s, OverdraftDetailsScreenContract$ModalStep.SpendInfo.f70640a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
