package cz3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0018\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\f\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\f\u001a\u0004\b*\u0010\u0004¨\u0006,"}, d2 = {"Lcz3/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "getOnAnalytics", "()Z", "onAnalytics", "b", "Ljava/lang/String;", "getAccountId", "accountId", "c", "datasourceId", "d", "getDevice", "device", "", "e", "Ljava/lang/Integer;", "getPreviousScreenDuration", "()Ljava/lang/Integer;", "previousScreenDuration", "f", "getFetchId", "fetchId", "g", "getPreviousScreen", "previousScreen", "h", ib.b.Screen, "i", "getUserId", "userId", "j", "otpStatus", "k", "status", "l", "getDescription", "description", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("onAnalytics")
    private final boolean onAnalytics = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("accountId")
    private final String accountId = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("datasourceId")
    private final String datasourceId = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("device")
    private final String device = null;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("previousScreenDuration")
    private final Integer previousScreenDuration = null;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fetchId")
    private final String fetchId = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("previousScreen")
    private final String previousScreen = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b(ib.b.Screen)
    private final String screen = null;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("userId")
    private final String userId = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("otpStatus")
    private final String otpStatus = null;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("status")
    private final String status = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description = null;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDatasourceId() {
        return this.datasourceId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOtpStatus() {
        return this.otpStatus;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.onAnalytics == aVar.onAnalytics && Intrinsics.f(this.accountId, aVar.accountId) && Intrinsics.f(this.datasourceId, aVar.datasourceId) && Intrinsics.f(this.device, aVar.device) && Intrinsics.f(this.previousScreenDuration, aVar.previousScreenDuration) && Intrinsics.f(this.fetchId, aVar.fetchId) && Intrinsics.f(this.previousScreen, aVar.previousScreen) && Intrinsics.f(this.screen, aVar.screen) && Intrinsics.f(this.userId, aVar.userId) && Intrinsics.f(this.otpStatus, aVar.otpStatus) && Intrinsics.f(this.status, aVar.status) && Intrinsics.f(this.description, aVar.description);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.onAnalytics) * 31;
        String str = this.accountId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.datasourceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.device;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.previousScreenDuration;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.fetchId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previousScreen;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.screen;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.otpStatus;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.status;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.description;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }
}
