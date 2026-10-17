package n30;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Ln30/d0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "fcmTokenHash", "getFcmToken", "fcmToken", "c", "accessToken", "", "d", "J", "()J", "timeMillis", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fcmTokenHash")
    private final String fcmTokenHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fcmToken")
    private final String fcmToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accessToken")
    private final String accessToken;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("syncTimeMillis")
    private final long timeMillis;

    public d0() {
        this(0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFcmTokenHash() {
        return this.fcmTokenHash;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimeMillis() {
        return this.timeMillis;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.fcmTokenHash, d0Var.fcmTokenHash) && Intrinsics.f(this.fcmToken, d0Var.fcmToken) && Intrinsics.f(this.accessToken, d0Var.accessToken) && this.timeMillis == d0Var.timeMillis;
    }

    public final int hashCode() {
        String str = this.fcmTokenHash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fcmToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.accessToken;
        return Long.hashCode(this.timeMillis) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public /* synthetic */ d0(int i) {
        this(null, null, null, 0L);
    }

    public d0(String str, String str2, String str3, long j2) {
        this.fcmTokenHash = str;
        this.fcmToken = str2;
        this.accessToken = str3;
        this.timeMillis = j2;
    }
}
