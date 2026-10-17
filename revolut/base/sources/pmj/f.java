package pmj;

import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimCoverage.Regional f237599a;

    public f(EsimCoverage.Regional coverage) {
        Intrinsics.checkNotNullParameter(coverage, "coverage");
        this.f237599a = coverage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f237599a, ((f) obj2).f237599a);
    }

    public final int hashCode() {
        return this.f237599a.hashCode();
    }
}
