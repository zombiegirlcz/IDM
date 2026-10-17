package zkk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ PlanBillingPickerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PlanBillingPickerScreen planBillingPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = planBillingPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVar = (t) this.u.R2();
        PlansDashboardLayout$PlanPageLayout$BillingOptionItem plansDashboardLayout$PlanPageLayout$BillingOptionItem = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) ((j) ((j2) tVar.u.f22677a).getValue()).f323070b.getContent();
        if (plansDashboardLayout$PlanPageLayout$BillingOptionItem == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PlanBillingPickerScreenModel", "unable to find selected billing option", null, h0Var);
        } else {
            i iVar = (i) ((j) ((j2) tVar.u.f22677a).getValue()).f323069a.getContent();
            if (iVar == null || (str = iVar.f323066a) == null) {
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "PlanBillingPickerScreenModel", "unable to find resolved plan id", null, h0Var2);
            } else {
                tVar.C2(new k(str, plansDashboardLayout$PlanPageLayout$BillingOptionItem));
            }
        }
        return Unit.f186387a;
    }
}
