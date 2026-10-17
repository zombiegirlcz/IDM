package gkl;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lgkl/p;", "Lgkl/x;", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "x", "()Z", "enabled", "Companion", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("enabled")
    private final boolean enabled;

    public p(boolean z) {
        this.enabled = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.enabled == ((p) obj2).enabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.enabled);
    }

    @Override // gkl.x
    /* JADX INFO: renamed from: x, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }
}
