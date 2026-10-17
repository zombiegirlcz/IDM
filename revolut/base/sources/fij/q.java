package fij;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCoverage.Regional f135454a;

    public q(EsimCoverage.Regional coverage) {
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f135454a = coverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f135454a, ((q) obj2).f135454a);
    }

    public final int hashCode() {
        return this.f135454a.hashCode();
    }
}
