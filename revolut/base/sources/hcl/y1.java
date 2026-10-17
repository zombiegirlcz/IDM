package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Lhcl/y1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "prospectusUrl", "b", "kidUrl", "c", "monthlyReportUrl", "e", "quarterlyReportUrl", "f", "semiannualReportUrl", "annualReportUrl", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("prospectusUrl")
    private final String prospectusUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("kidUrl")
    private final String kidUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlyReportUrl")
    private final String monthlyReportUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("quarterlyReportUrl")
    private final String quarterlyReportUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("semiannualReportUrl")
    private final String semiannualReportUrl;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("annualReportUrl")
    private final String annualReportUrl;

    public y1(String str, String str2, String str3, String str4, String str5, String str6) {
        this.prospectusUrl = str;
        this.kidUrl = str2;
        this.monthlyReportUrl = str3;
        this.quarterlyReportUrl = str4;
        this.semiannualReportUrl = str5;
        this.annualReportUrl = str6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAnnualReportUrl() {
        return this.annualReportUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKidUrl() {
        return this.kidUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getMonthlyReportUrl() {
        return this.monthlyReportUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getProspectusUrl() {
        return this.prospectusUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getQuarterlyReportUrl() {
        return this.quarterlyReportUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj2;
        return Intrinsics.f(this.prospectusUrl, y1Var.prospectusUrl) && Intrinsics.f(this.kidUrl, y1Var.kidUrl) && Intrinsics.f(this.monthlyReportUrl, y1Var.monthlyReportUrl) && Intrinsics.f(this.quarterlyReportUrl, y1Var.quarterlyReportUrl) && Intrinsics.f(this.semiannualReportUrl, y1Var.semiannualReportUrl) && Intrinsics.f(this.annualReportUrl, y1Var.annualReportUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSemiannualReportUrl() {
        return this.semiannualReportUrl;
    }

    public final int hashCode() {
        String str = this.prospectusUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.kidUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.monthlyReportUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quarterlyReportUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.semiannualReportUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.annualReportUrl;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
