package dfj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dej.m f114148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimCoverage f114149b;

    public x1(dej.m planType, EsimCoverage coverage) {
        Intrinsics.checkNotNullParameter(planType, "planType");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f114148a = planType;
        this.f114149b = coverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj2;
        return this.f114148a == x1Var.f114148a && Intrinsics.f(this.f114149b, x1Var.f114149b);
    }

    public final int hashCode() {
        return this.f114149b.hashCode() + (this.f114148a.hashCode() * 31);
    }
}
