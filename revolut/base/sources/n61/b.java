package n61;

import com.revolut.domain.models.beneficiary.BankBeneficiaryParams$IdentityType;
import com.revolut.domain.models.beneficiary.BeneficiaryVerification;
import com.revolut.feature.address.models.Address;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BankBeneficiaryParams$IdentityType f212668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f212669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f212670c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f212671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f212672h;
    public final Address i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f212673j;
    public final BeneficiaryVerification k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f212674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f212675m;

    public b(BankBeneficiaryParams$IdentityType bankBeneficiaryParams$IdentityType, String str, String str2, String str3, String str4, String str5, Map map, String str6, Address address, String str7, BeneficiaryVerification beneficiaryVerification, String str8, String str9) {
        this.f212668a = bankBeneficiaryParams$IdentityType;
        this.f212669b = str;
        this.f212670c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f212671g = map;
        this.f212672h = str6;
        this.i = address;
        this.f212673j = str7;
        this.k = beneficiaryVerification;
        this.f212674l = str8;
        this.f212675m = str9;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f212668a == bVar.f212668a && Intrinsics.f(this.f212669b, bVar.f212669b) && Intrinsics.f(this.f212670c, bVar.f212670c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f212671g, bVar.f212671g) && Intrinsics.f(this.f212672h, bVar.f212672h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f212673j, bVar.f212673j) && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f212674l, bVar.f212674l) && Intrinsics.f(this.f212675m, bVar.f212675m);
    }

    public final int hashCode() {
        BankBeneficiaryParams$IdentityType bankBeneficiaryParams$IdentityType = this.f212668a;
        int iHashCode = (bankBeneficiaryParams$IdentityType == null ? 0 : bankBeneficiaryParams$IdentityType.hashCode()) * 31;
        String str = this.f212669b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f212670c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 29791;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map map = this.f212671g;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.f212672h;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Address address = this.i;
        int iHashCode9 = (iHashCode8 + (address == null ? 0 : address.hashCode())) * 961;
        String str7 = this.f212673j;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BeneficiaryVerification beneficiaryVerification = this.k;
        int iHashCode11 = (iHashCode10 + (beneficiaryVerification == null ? 0 : beneficiaryVerification.hashCode())) * 31;
        String str8 = this.f212674l;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f212675m;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, Map map, Address address, int i) {
        this(null, str, str2, str3, str4, str5, map, null, (i & 1024) != 0 ? null : address, (i & 4096) == 0 ? "CHEQUE" : null, null, null, null);
    }
}
