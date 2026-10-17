package mkk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.FamilyPlanManagementScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FamilyPlanManagementScreen f206478w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FamilyPlanManagementScreen familyPlanManagementScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206478w = familyPlanManagementScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f206478w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f206478w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(obj2, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FamilyPlanManagementScreen familyPlanManagementScreen = this.f206478w;
        switch (i) {
            case 0:
                Object obj3 = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = familyPlanManagementScreen.e3();
                Intrinsics.h(obj3);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) iVarE3).I2(obj3);
                break;
            default:
                Object obj4 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE32 = familyPlanManagementScreen.e3();
                Intrinsics.h(obj4);
                ((com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.b) iVarE32).I2(obj4);
                break;
        }
        return Unit.f186387a;
    }
}
