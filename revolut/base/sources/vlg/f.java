package vlg;

import com.revolut.feature.us_send_checks.api.model.beneficiary.SendChecksBeneficiaryParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SendChecksBeneficiaryParams f290435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f290436b;

    public f(SendChecksBeneficiaryParams beneficiaryParams, co3.a aVar) {
        Intrinsics.checkNotNullParameter(beneficiaryParams, "beneficiaryParams");
        this.f290435a = beneficiaryParams;
        this.f290436b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f290435a, fVar.f290435a) && Intrinsics.f(this.f290436b, fVar.f290436b);
    }

    public final int hashCode() {
        int iHashCode = this.f290435a.hashCode() * 31;
        co3.a aVar = this.f290436b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}
