package wgb;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.SalaryPromotionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SalaryPromotionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SalaryPromotionController salaryPromotionController, Continuation continuation) {
        super(2, continuation);
        this.v = salaryPromotionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVarE3 = this.v.R2();
        String listId = model.f52373a;
        com.revolut.feature.retail.salary_account.impl.salary_promotion.b bVar = (com.revolut.feature.retail.salary_account.impl.salary_promotion.b) iVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "NO_CONNECTION_ERROR_ITEM_LIST_ID")) {
            throw new IllegalStateException(a10.b.s("Unknown listId:", listId, "!"));
        }
        z1 z1Var = bVar.v;
        Boolean bool = (Boolean) d0.d0(z1Var.d());
        z1Var.k(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        return Unit.f186387a;
    }
}
