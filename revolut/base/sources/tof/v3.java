package tof;

import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v3 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BeneficiaryIdentificationType f273116c;
    public final String d;
    public final String e;

    public v3(String str, String str2, BeneficiaryIdentificationType beneficiaryIdentificationType, String str3, String str4) {
        this.f273114a = str;
        this.f273115b = str2;
        this.f273116c = beneficiaryIdentificationType;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj2;
        return Intrinsics.f(this.f273114a, v3Var.f273114a) && Intrinsics.f(this.f273115b, v3Var.f273115b) && this.f273116c == v3Var.f273116c && Intrinsics.f(this.d, v3Var.d) && Intrinsics.f(this.e, v3Var.e);
    }

    public final int hashCode() {
        String str = this.f273114a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f273115b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BeneficiaryIdentificationType beneficiaryIdentificationType = this.f273116c;
        int iHashCode3 = (iHashCode2 + (beneficiaryIdentificationType == null ? 0 : beneficiaryIdentificationType.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
