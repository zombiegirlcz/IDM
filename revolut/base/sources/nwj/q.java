package nwj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lnwj/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "accessCode", "b", "d", "refreshCode", "", "c", "J", "()J", "expiryDate", "ownerId", "feature_user_auth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("accessCode")
    @NotNull
    private final String accessCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("refreshCode")
    @NotNull
    private final String refreshCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiryDate")
    private final long expiryDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ownerId")
    @NotNull
    private final String ownerId;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAccessCode() {
        return this.accessCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getExpiryDate() {
        return this.expiryDate;
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
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.accessCode, qVar.accessCode) && Intrinsics.f(this.refreshCode, qVar.refreshCode) && this.expiryDate == qVar.expiryDate && Intrinsics.f(this.ownerId, qVar.ownerId);
    }

    public final int hashCode() {
        return this.ownerId.hashCode() + a0.d.c(p.a.c(this.accessCode.hashCode() * 31, 31, this.refreshCode), 31, this.expiryDate);
    }
}
