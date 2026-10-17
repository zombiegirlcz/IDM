package wgb;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryPromotionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SalaryPromotionController salaryPromotionController, Continuation continuation) {
        super(2, continuation);
        this.v = salaryPromotionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        Object obj3 = model.e;
        com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) iVarE3;
        bVar.getClass();
        String strJ2 = com.revolut.feature.retail.salary_account.impl.salary_promotion.b.J2(obj3);
        if (strJ2 != null) {
            Continuation continuation = null;
            bVar.n2(new vq5.w(bVar, continuation, strJ2, continuation, 28), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
