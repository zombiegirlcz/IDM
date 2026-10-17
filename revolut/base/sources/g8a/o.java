package g8a;

import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BeneficiaryIdentificationType f141327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141328b;

    public o(BeneficiaryIdentificationType beneficiaryIdentificationType, String str) {
        this.f141327a = beneficiaryIdentificationType;
        this.f141328b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f141327a == oVar.f141327a && Intrinsics.f(this.f141328b, oVar.f141328b);
    }

    public final int hashCode() {
        BeneficiaryIdentificationType beneficiaryIdentificationType = this.f141327a;
        int iHashCode = (beneficiaryIdentificationType == null ? 0 : beneficiaryIdentificationType.hashCode()) * 31;
        String str = this.f141328b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
