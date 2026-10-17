package j6f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.models.ClosureStatusItemParcel;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ m u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Continuation continuation) {
        super(2, continuation);
        this.u = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((ClosureStatusItemParcel.LearnMore) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVar = (t) this.u.f171749g;
        tVar.getClass();
        tVar.o.getClass();
        yji.n.P2(tVar, new ActionsBottomSheetController(h7f.f.a()), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
