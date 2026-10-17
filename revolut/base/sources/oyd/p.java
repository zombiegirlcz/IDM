package oyd;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0010"}, d2 = {"Loyd/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "phone", "b", "companyInfo", "c", "cryptoInfo", "d", "legalInfo", "customersNumber", "retail_feature_statements_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("support.phone.number")
    @NotNull
    private final String phone;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("company.info")
    @NotNull
    private final String companyInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("crypto.info")
    private final String cryptoInfo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("legal.info")
    @NotNull
    private final String legalInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("statistics.total.customers")
    private final String customersNumber;

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
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.phone, pVar.phone) && Intrinsics.f(this.companyInfo, pVar.companyInfo) && Intrinsics.f(this.cryptoInfo, pVar.cryptoInfo) && Intrinsics.f(this.legalInfo, pVar.legalInfo) && Intrinsics.f(this.customersNumber, pVar.customersNumber);
    }

    public final int hashCode() {
        int iC = p.a.c(this.phone.hashCode() * 31, 31, this.companyInfo);
        String str = this.cryptoInfo;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.legalInfo);
        String str2 = this.customersNumber;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }
}
