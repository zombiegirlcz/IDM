package atk;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.bottom_sheet.investment_notice.InvestmentNoticeBottomSheet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes12.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ l u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, Continuation continuation) {
        super(1, continuation);
        this.u = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n.P2(this.u, new InvestmentNoticeBottomSheet(), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        return Unit.f186387a;
    }
}
