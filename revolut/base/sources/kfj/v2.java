package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0014"}, d2 = {"Lkfj/v2;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "iccId", "b", "d", "lpa", "c", "e", "matchingCode", "f", "qrCode", "g", "smdp", "installationType", "installationUrl", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("iccId")
    @NotNull
    private final String iccId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lpa")
    @NotNull
    private final String lpa;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("matchingCode")
    @NotNull
    private final String matchingCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("qrCode")
    private final String qrCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("smdp")
    @NotNull
    private final String smdp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("installationType")
    private final String installationType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("installationUrl")
    private final String installationUrl;

    public v2(String iccId, String lpa2, String matchingCode, String str, String smdp, String str2, String str3) {
        Intrinsics.checkNotNullParameter(iccId, "iccId");
        Intrinsics.checkNotNullParameter(lpa2, "lpa");
        Intrinsics.checkNotNullParameter(matchingCode, "matchingCode");
        Intrinsics.checkNotNullParameter(smdp, "smdp");
        this.iccId = iccId;
        this.lpa = lpa2;
        this.matchingCode = matchingCode;
        this.qrCode = str;
        this.smdp = smdp;
        this.installationType = str2;
        this.installationUrl = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getIccId() {
        return this.iccId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInstallationType() {
        return this.installationType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getInstallationUrl() {
        return this.installationUrl;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLpa() {
        return this.lpa;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMatchingCode() {
        return this.matchingCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj2;
        return Intrinsics.f(this.iccId, v2Var.iccId) && Intrinsics.f(this.lpa, v2Var.lpa) && Intrinsics.f(this.matchingCode, v2Var.matchingCode) && Intrinsics.f(this.qrCode, v2Var.qrCode) && Intrinsics.f(this.smdp, v2Var.smdp) && Intrinsics.f(this.installationType, v2Var.installationType) && Intrinsics.f(this.installationUrl, v2Var.installationUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getQrCode() {
        return this.qrCode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSmdp() {
        return this.smdp;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.iccId.hashCode() * 31, 31, this.lpa), 31, this.matchingCode);
        String str = this.qrCode;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.smdp);
        String str2 = this.installationType;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.installationUrl;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
