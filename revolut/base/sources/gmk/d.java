package gmk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreenContract$BottomSheetItemParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PlanSavingsAccountsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PlanSavingsAccountsScreen planSavingsAccountsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = planSavingsAccountsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.T.getValue();
        Object obj3 = model.u;
        com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.a) hVar;
        aVar2.getClass();
        if (obj3 instanceof PlanSavingsAccountsScreenContract$BottomSheetItemParcel.SavingsAccount) {
            String str = ((PlanSavingsAccountsScreenContract$BottomSheetItemParcel.SavingsAccount) obj3).f103544a;
            aVar2.C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.SAVINGS), null), null, null, 12)));
        }
        return Unit.f186387a;
    }
}
