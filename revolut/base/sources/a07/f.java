package a07;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143c;
    public final String d;
    public final FreelancerTaxProfile e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f145h;

    public f(String str, String str2, String str3, String str4, FreelancerTaxProfile freelancerTaxProfile, String str5, String str6, Data tradingNameChangeEnabled) {
        Intrinsics.checkNotNullParameter(tradingNameChangeEnabled, "tradingNameChangeEnabled");
        this.f141a = str;
        this.f142b = str2;
        this.f143c = str3;
        this.d = str4;
        this.e = freelancerTaxProfile;
        this.f = str5;
        this.f144g = str6;
        this.f145h = tradingNameChangeEnabled;
    }

    public static f a(f fVar, FreelancerTaxProfile freelancerTaxProfile, Data data, int i) {
        String str = fVar.f141a;
        String str2 = fVar.f142b;
        String str3 = fVar.f143c;
        String str4 = fVar.d;
        if ((i & 16) != 0) {
            freelancerTaxProfile = fVar.e;
        }
        FreelancerTaxProfile freelancerTaxProfile2 = freelancerTaxProfile;
        String str5 = fVar.f;
        String str6 = fVar.f144g;
        if ((i & 128) != 0) {
            data = fVar.f145h;
        }
        Data tradingNameChangeEnabled = data;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(tradingNameChangeEnabled, "tradingNameChangeEnabled");
        return new f(str, str2, str3, str4, freelancerTaxProfile2, str5, str6, tradingNameChangeEnabled);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f141a, fVar.f141a) && Intrinsics.f(this.f142b, fVar.f142b) && Intrinsics.f(this.f143c, fVar.f143c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f144g, fVar.f144g) && Intrinsics.f(this.f145h, fVar.f145h);
    }

    public final int hashCode() {
        String str = this.f141a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f142b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f143c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        FreelancerTaxProfile freelancerTaxProfile = this.e;
        int iHashCode5 = (iHashCode4 + (freelancerTaxProfile == null ? 0 : freelancerTaxProfile.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f144g;
        return this.f145h.hashCode() + ((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31);
    }
}
