package fva;

import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryIdentificationType f138395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f138396b;

    public f(BeneficiaryIdentificationType beneficiaryIdentificationType, String str) {
        this.f138395a = beneficiaryIdentificationType;
        this.f138396b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f138395a == fVar.f138395a && Intrinsics.f(this.f138396b, fVar.f138396b);
    }

    public final int hashCode() {
        BeneficiaryIdentificationType beneficiaryIdentificationType = this.f138395a;
        int iHashCode = (beneficiaryIdentificationType == null ? 0 : beneficiaryIdentificationType.hashCode()) * 31;
        String str = this.f138396b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
