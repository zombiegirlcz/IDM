package amd;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f6353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExternalInstitution f6354b;

    public x(io3.d pocket, ExternalInstitution externalInstitution) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f6353a = pocket;
        this.f6354b = externalInstitution;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f6353a, xVar.f6353a) && Intrinsics.f(this.f6354b, xVar.f6354b);
    }

    public final int hashCode() {
        int iHashCode = this.f6353a.hashCode() * 31;
        ExternalInstitution externalInstitution = this.f6354b;
        return iHashCode + (externalInstitution == null ? 0 : externalInstitution.hashCode());
    }
}
