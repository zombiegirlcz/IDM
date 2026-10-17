package b8f;

import com.revolut.feature.robo.api.model.RiskMetrics;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntro;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TemplateIntro f13234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RiskMetrics f13235b;

    public i(TemplateIntro templateIntro, RiskMetrics riskMetrics) {
        Intrinsics.checkNotNullParameter(templateIntro, "templateIntro");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        this.f13234a = templateIntro;
        this.f13235b = riskMetrics;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f13234a, iVar.f13234a) && Intrinsics.f(this.f13235b, iVar.f13235b);
    }

    public final int hashCode() {
        return this.f13235b.hashCode() + (this.f13234a.hashCode() * 31);
    }
}
