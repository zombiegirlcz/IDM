package onk;

import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import com.revolut.retail.feature.pricing_plans.ui.api.models.StudentHubScreenConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub.StudentHubScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ StudentHubScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(StudentHubScreen studentHubScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = studentHubScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlanHubScreenHeader planHubScreenHeader;
        int i = this.u;
        StudentHubScreen studentHubScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                studentHubScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((h) studentHubScreen.f103637h0.getValue());
                StudentHubScreenConfig studentHubScreenConfig = (StudentHubScreenConfig) ((d) ((j2) lVar.f226965w.f22677a).getValue()).f226954a.getContent();
                if (studentHubScreenConfig != null && (planHubScreenHeader = studentHubScreenConfig.f102858a) != null) {
                    if (!(planHubScreenHeader instanceof PlanHubScreenHeader.Standard)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PlanHubScreenHeader.Standard standard = (PlanHubScreenHeader.Standard) planHubScreenHeader;
                    PlanHubScreenHeader.Standard.HeaderAction headerAction = standard.f102668h;
                    PlanScreenElementView.Action action = standard.d;
                    if (headerAction instanceof PlanHubScreenHeader.Standard.HeaderAction.RevPointsBadge) {
                        PlanScreenElementView.Action action2 = ((PlanHubScreenHeader.Standard.HeaderAction.RevPointsBadge) headerAction).f102687c;
                        if (action2 != null) {
                            lVar.J2(action2.f81005a);
                        }
                    } else {
                        if (headerAction != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (action != null) {
                            lVar.J2(action.f81005a);
                        }
                    }
                }
                return Unit.f186387a;
        }
    }
}
