package kmc;

import com.revolut.feature.robo.impl.ui.flow.onboarding.OnboardingFlowContract$Step;
import com.revolut.feature.wealth.models.robo.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnboardingFlowContract$Step f185768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Template f185769b;

    public m(OnboardingFlowContract$Step step, Template template) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f185768a = step;
        this.f185769b = template;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f185768a == mVar.f185768a && Intrinsics.f(this.f185769b, mVar.f185769b);
    }

    public final int hashCode() {
        int iHashCode = this.f185768a.hashCode() * 31;
        Template template = this.f185769b;
        return iHashCode + (template == null ? 0 : template.hashCode());
    }
}
