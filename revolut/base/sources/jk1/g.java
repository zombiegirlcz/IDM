package jk1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0015"}, d2 = {"Ljk1/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "action", "Lk02/e;", "Lk02/e;", "c", "()Lk02/e;", "authorisation", "e", "redirectUrl", "d", "f", "userAgent", "acDecodeConfig", "paymentIntentId", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("action")
    private final String action = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("authorisation")
    private final k02.e authorisation = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("redirectUrl")
    private final String redirectUrl = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("userAgent")
    private final String userAgent = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("acDecodeConfig")
    private final String acDecodeConfig = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("paymentIntentId")
    private final String paymentIntentId = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAcDecodeConfig() {
        return this.acDecodeConfig;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final k02.e getAuthorisation() {
        return this.authorisation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPaymentIntentId() {
        return this.paymentIntentId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.action, gVar.action) && Intrinsics.f(this.authorisation, gVar.authorisation) && Intrinsics.f(this.redirectUrl, gVar.redirectUrl) && Intrinsics.f(this.userAgent, gVar.userAgent) && Intrinsics.f(this.acDecodeConfig, gVar.acDecodeConfig) && Intrinsics.f(this.paymentIntentId, gVar.paymentIntentId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    public final int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        k02.e eVar = this.authorisation;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str2 = this.redirectUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userAgent;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acDecodeConfig;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.paymentIntentId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }
}
