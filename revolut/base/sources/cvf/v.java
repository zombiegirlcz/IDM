package cvf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000f"}, d2 = {"Lcvf/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "status", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "expiresInSeconds", "retryAfterSeconds", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("expiresInSeconds")
    private final Integer expiresInSeconds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("retryAfterSeconds")
    private final Integer retryAfterSeconds;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getExpiresInSeconds() {
        return this.expiresInSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getRetryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.status, vVar.status) && Intrinsics.f(this.expiresInSeconds, vVar.expiresInSeconds) && Intrinsics.f(this.retryAfterSeconds, vVar.retryAfterSeconds);
    }

    public final int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Integer num = this.expiresInSeconds;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.retryAfterSeconds;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
