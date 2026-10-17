package zkk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_billing_picker.PlanBillingPickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PlanBillingPickerScreen f323065w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PlanBillingPickerScreen planBillingPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f323065w = planBillingPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f323065w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f323065w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f323065w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PlanBillingPickerScreen planBillingPickerScreen = this.f323065w;
        switch (i) {
            case 0:
                PlansDashboardLayout$PlanPageLayout$BillingOptionItem billingOption = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) planBillingPickerScreen.R2();
                tVar.getClass();
                Intrinsics.checkNotNullParameter(billingOption, "billingOption");
                tVar.H2(tVar.u, new ghk.s(billingOption, 1));
                break;
            case 1:
                PlansDashboardLayout$PlanPageLayout$BillingOptionItem billingOption2 = (PlansDashboardLayout$PlanPageLayout$BillingOptionItem) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar2 = (t) planBillingPickerScreen.R2();
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(billingOption2, "billingOption");
                tVar2.H2(tVar2.u, new ghk.s(billingOption2, 1));
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarD3 = planBillingPickerScreen.R2();
                Intrinsics.h(clickData);
                t tVar3 = (t) mVarD3;
                tVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                tVar3.n2(new zah.f(tVar3, clickData, null, 15), new whi.b(6));
                break;
        }
        return Unit.f186387a;
    }
}
