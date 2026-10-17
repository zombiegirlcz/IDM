package uyd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0010"}, d2 = {"Luyd/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "phone", "b", "companyInfo", "c", "cryptoInfo", "d", "legalInfo", "customersNumber", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("phone")
    @NotNull
    private final String phone;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("companyInfo")
    @NotNull
    private final String companyInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cryptoInfo")
    private final String cryptoInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("legalInfo")
    private final String legalInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("customersNumber")
    private final String customersNumber;

    public s(String phone, String companyInfo, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(companyInfo, "companyInfo");
        this.phone = phone;
        this.companyInfo = companyInfo;
        this.cryptoInfo = str;
        this.legalInfo = str2;
        this.customersNumber = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCompanyInfo() {
        return this.companyInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCryptoInfo() {
        return this.cryptoInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCustomersNumber() {
        return this.customersNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLegalInfo() {
        return this.legalInfo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.phone, sVar.phone) && Intrinsics.f(this.companyInfo, sVar.companyInfo) && Intrinsics.f(this.cryptoInfo, sVar.cryptoInfo) && Intrinsics.f(this.legalInfo, sVar.legalInfo) && Intrinsics.f(this.customersNumber, sVar.customersNumber);
    }

    public final int hashCode() {
        int iC = p.a.c(this.phone.hashCode() * 31, 31, this.companyInfo);
        String str = this.cryptoInfo;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.legalInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customersNumber;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
