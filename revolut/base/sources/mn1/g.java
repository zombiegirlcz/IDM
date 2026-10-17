package mn1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.boleto.impl.screen.review.BoletoTransferReviewScreen;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BoletoTransferReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BoletoTransferReviewScreen boletoTransferReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = boletoTransferReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Boolean bool;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53228a, "ID_HIDE_SHOW_BOLETO_TAG")) {
            b0 b0VarE3 = this.v.R2();
            String str = ((BillSearchBoletoResult) b0VarE3.o.f207340b.getValue()).f61436n;
            if (str != null && (bool = ((h) ((j2) b0VarE3.f207334w.f22677a).getValue()).f207338g) != null) {
                b0VarE3.l2(new l10.m(b0VarE3, bool.booleanValue(), str, (Continuation) null, 3), new yi5.b(26));
            }
        }
        return Unit.f186387a;
    }
}
