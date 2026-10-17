package wgb;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryPromotionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SalaryPromotionController salaryPromotionController, Continuation continuation) {
        super(2, continuation);
        this.v = salaryPromotionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        Object obj3 = model.u;
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
