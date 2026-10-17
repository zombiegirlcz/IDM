package tf2;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationSummary f270212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f270213b;

    public e(ApmPaymentAuthorisationSummary intentAuthorisationData, io3.d pocket) {
        Intrinsics.checkNotNullParameter(intentAuthorisationData, "intentAuthorisationData");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f270212a = intentAuthorisationData;
        this.f270213b = pocket;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f270212a, eVar.f270212a) && Intrinsics.f(this.f270213b, eVar.f270213b);
    }

    public final int hashCode() {
        return this.f270213b.hashCode() + (this.f270212a.hashCode() * 31);
    }
}
