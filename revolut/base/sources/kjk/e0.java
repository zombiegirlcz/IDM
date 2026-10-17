package kjk;

import bjk.f2;
import bjk.g2;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubScreenHeader;
import com.revolut.retail.feature.pricing_plans.ui.api.models.StudentHubScreenConfig;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f184430w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184430w = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f184430w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(this.f184430w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(this.f184430w, continuation, 2);
                e0Var3.v = obj2;
                return e0Var3;
            default:
                e0 e0Var4 = new e0(this.f184430w, continuation, 3);
                e0Var4.v = obj2;
                return e0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        f0 f0Var = this.f184430w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bjk.l lVar = (bjk.l) wp5.y.t(bjk.l.class, f0Var.f184434b, j6.a.q("plans_benefits_suggestions_", str));
                if (lVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(lVar, "<this>");
                g2.d.s highlightedBenefits = lVar.getHighlightedBenefits();
                return new ggk.k(highlightedBenefits != null ? mjk.r.i(highlightedBenefits) : null);
            case 1:
                b0 b0Var = (b0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bjk.m mVar = (bjk.m) wp5.y.t(bjk.m.class, f0Var.f184434b, b0Var.a());
                if (mVar != null) {
                    return mjk.b.a(mVar);
                }
                return null;
            case 2:
                String str2 = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f2 f2Var = (f2) wp5.y.t(f2.class, f0Var.f184434b, f0.d(str2));
                if (f2Var != null) {
                    return mjk.o.a(f2Var);
                }
                return null;
            default:
                String str3 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ljk.q entity = (ljk.q) wp5.y.t(ljk.q.class, f0Var.f184434b, j6.a.q("student_hub_screen_config_", str3));
                if (entity == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(entity, "entity");
                PlanHubScreenHeader.Standard standardE = mjk.i.e(entity.getHeader());
                ArrayList arrayListZ = zhm.d0.Z(entity.getContent());
                ArrayList arrayList = new ArrayList();
                Iterator it8 = arrayListZ.iterator();
                while (it8.hasNext()) {
                    PlanScreenElementView planScreenElementViewI = mjk.z.i((ljk.d) it8.next());
                    if (planScreenElementViewI != null) {
                        arrayList.add(planScreenElementViewI);
                    }
                }
                return new StudentHubScreenConfig(standardE, arrayList);
        }
    }
}
