package ejk;

import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import ej9.t;
import go.g;
import hha.s;
import hha.u;
import hha.x;
import hha.y;
import java.util.Collection;
import java.util.List;
import kj7.o;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final si7.a f126911a;

    public f(si7.a insuranceInteractor) {
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        this.f126911a = insuranceInteractor;
    }

    public final Flow a(hha.d plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Lazy lazy = s.f152339a;
        Intrinsics.checkNotNullParameter(plan, "<this>");
        u.Companion.getClass();
        if (!s.a(plan, u.G, u.R, u.Q)) {
            Intrinsics.checkNotNullParameter(plan, "<this>");
            List<x> list = plan.e;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (x xVar : list) {
                    u uVar = xVar.f152369a;
                    if (xVar.f152370b != y.ENABLED || !((List) s.f152339a.getValue()).contains(uVar)) {
                    }
                }
            }
            return new g(InsuranceDocumentsAvailability.Unavailable.f74931a, 2);
        }
        String planId = plan.f152287a;
        fj7.b bVar = (fj7.b) this.f126911a;
        Intrinsics.checkNotNullParameter(planId, "planId");
        o oVar = (o) bVar.f135546a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        return rd0.e.b(m70.a.g(nim.a.w(oVar.e.f(planId, false), new fj5.e(5)), null, new t(10), 1));
    }
}
