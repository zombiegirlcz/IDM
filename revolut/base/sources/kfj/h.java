package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\f¨\u0006\u0014"}, d2 = {"Lkfj/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "partnerTermsUrl", "", "b", "Z", "()Z", "autoRenewalDefaultState", "", "c", "J", "()J", "autoRenewalExpirationInDays", "onlyManualInstallationAvailable", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("partnerTermsUrl")
    @NotNull
    private final String partnerTermsUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoRenewalDefaultState")
    private final boolean autoRenewalDefaultState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("autoRenewalExpirationInDays")
    private final long autoRenewalExpirationInDays;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("onlyManualInstallationAvailable")
    private final boolean onlyManualInstallationAvailable;

    public h(long j2, String partnerTermsUrl, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(partnerTermsUrl, "partnerTermsUrl");
        this.partnerTermsUrl = partnerTermsUrl;
        this.autoRenewalDefaultState = z;
        this.autoRenewalExpirationInDays = j2;
        this.onlyManualInstallationAvailable = z3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAutoRenewalDefaultState() {
        return this.autoRenewalDefaultState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAutoRenewalExpirationInDays() {
        return this.autoRenewalExpirationInDays;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getOnlyManualInstallationAvailable() {
        return this.onlyManualInstallationAvailable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPartnerTermsUrl() {
        return this.partnerTermsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.partnerTermsUrl, hVar.partnerTermsUrl) && this.autoRenewalDefaultState == hVar.autoRenewalDefaultState && this.autoRenewalExpirationInDays == hVar.autoRenewalExpirationInDays && this.onlyManualInstallationAvailable == hVar.onlyManualInstallationAvailable;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.onlyManualInstallationAvailable) + a0.d.c(j6.a.c(this.partnerTermsUrl.hashCode() * 31, 31, this.autoRenewalDefaultState), 31, this.autoRenewalExpirationInDays);
    }
}
