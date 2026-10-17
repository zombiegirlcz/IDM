package njk;

import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import go.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n33.r0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements mf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cha.c f216600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f216601b;

    public f(cha.c studentPlanInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f216600a = studentPlanInteractor;
        this.f216601b = featureToggleInteractor;
    }

    @Override // mf1.a
    public final Flow a() {
        if (!((jte.d) this.f216601b).c(PricingPlansApi$Toggles.StudentPlans.f81004c)) {
            return new g(null, 2);
        }
        return rd0.e.e(new r0(mo3.a.g(cha.c.a(this.f216600a), null, new nij.d(23), 1), 4), h0.f322473a, new n28.b(3, 11, null));
    }

    @Override // mf1.a
    public final String b() {
        return null;
    }
}
