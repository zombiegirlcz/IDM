package u6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lu6l/i;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "()Z", "allowed", "b", "Ljava/lang/String;", "reason", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowed")
    private final boolean allowed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reason")
    @NotNull
    private final String reason;

    public i(boolean z, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.allowed = z;
        this.reason = reason;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAllowed() {
        return this.allowed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.allowed == iVar.allowed && Intrinsics.f(this.reason, iVar.reason);
    }

    public final int hashCode() {
        return this.reason.hashCode() + (Boolean.hashCode(this.allowed) * 31);
    }
}
