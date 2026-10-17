package pad;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, d2 = {"Lpad/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "accessToken", "", "b", "J", "()J", "expiration", "c", "d", "refreshCode", "ownerId", "feature_shared_network_authentication_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accessToken")
    @NotNull
    private final String accessToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tokenExpiryDate")
    private final long expiration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("refreshCode")
    @NotNull
    private final String refreshCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ownerId")
    @NotNull
    private final String ownerId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getExpiration() {
        return this.expiration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRefreshCode() {
        return this.refreshCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.accessToken, dVar.accessToken) && this.expiration == dVar.expiration && Intrinsics.f(this.refreshCode, dVar.refreshCode) && Intrinsics.f(this.ownerId, dVar.ownerId);
    }

    public final int hashCode() {
        return this.ownerId.hashCode() + p.a.c(a0.d.c(this.accessToken.hashCode() * 31, 31, this.expiration), 31, this.refreshCode);
    }
}
