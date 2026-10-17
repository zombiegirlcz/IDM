package dfj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import java.time.Period;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dej.m f113949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3 f113950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Period f113951c;
    public final EsimCoverage d;

    public e3(dej.m planType, d3 allowanceBytes, Period duration, EsimCoverage coverage) {
        Intrinsics.checkNotNullParameter(planType, "planType");
        Intrinsics.checkNotNullParameter(allowanceBytes, "allowanceBytes");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f113949a = planType;
        this.f113950b = allowanceBytes;
        this.f113951c = duration;
        this.d = coverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj2;
        return this.f113949a == e3Var.f113949a && Intrinsics.f(this.f113950b, e3Var.f113950b) && Intrinsics.f(this.f113951c, e3Var.f113951c) && Intrinsics.f(this.d, e3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f113951c.hashCode() + ((this.f113950b.hashCode() + (this.f113949a.hashCode() * 31)) * 31)) * 31);
    }
}
