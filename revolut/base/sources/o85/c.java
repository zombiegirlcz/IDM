package o85;

import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymenttype.LoanRepaymentTypeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q35.g0;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LoanRepaymentTypeController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LoanRepaymentTypeController loanRepaymentTypeController, Continuation continuation) {
        super(2, continuation);
        this.v = loanRepaymentTypeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProductSelectionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.N.getValue();
        yx4.a aVar2 = yx4.b.Companion;
        Intrinsics.h(model);
        aVar2.getClass();
        yx4.b click = yx4.a.a(model);
        m mVar = (m) fVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(click, "click");
        String str = click.f317544a;
        switch (str.hashCode()) {
            case 381253229:
                if (str.equals("REDUCE_AMOUNT_REPAYMENT_ITEM_ID")) {
                    mVar.I2(g0.AMOUNT_REDUCTION);
                }
                break;
            case 524985311:
                if (str.equals("EARLY_REPAYMENT_ITEM_ID")) {
                    mVar.I2(g0.EARLY_REPAYMENT);
                }
                break;
            case 1241115585:
                if (str.equals("REDUCE_TERM_REPAYMENT_ITEM_ID")) {
                    mVar.I2(g0.TERM_REDUCTION);
                }
                break;
            case 1413336701:
                if (str.equals("PARTIAL_REPAYMENT_ITEM_ID")) {
                    mVar.I2(null);
                }
                break;
            case 1957487659:
                if (str.equals("FULL_REPAYMENT_ITEM_ID")) {
                    mVar.n2(new l(mVar, null, 1), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
