package ghk;

import android.app.Activity;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.core.ui.activity.CustomTheme;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.PlanPagerFlow;
import ggk.h1;
import ggk.i0;
import ggk.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ PlanPagerFlow u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PlanPagerFlow planPagerFlow, Continuation continuation) {
        super(2, continuation);
        this.u = planPagerFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        i0 i0Var;
        l0 l0Var;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        KProperty[] kPropertyArr = PlanPagerFlow.U;
        PlanPagerFlow planPagerFlow = this.u;
        if (((Boolean) planPagerFlow.S.getValue()).booleanValue() && planPagerFlow.K.f103049h) {
            Activity activityM2 = planPagerFlow.m2();
            BaseDelegatesActivity baseDelegatesActivity = activityM2 instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activityM2 : null;
            if (baseDelegatesActivity != null) {
                CustomTheme.INSTANCE.getClass();
                baseDelegatesActivity.T0(CustomTheme.Companion.a(AnimatedBackgroundType.DEFAULT.f51471a), false);
            }
        }
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d dVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager.d) planPagerFlow.R2();
        h1 h1Var = (h1) ((j) ((j2) dVar.D.f22677a).getValue()).f143962g.getContent();
        if (h1Var != null && (i0Var = h1Var.f143728c) != null && (l0Var = i0Var.f143729a) != null) {
            dVar.M2(l0Var.B());
        }
        return Unit.f186387a;
    }
}
