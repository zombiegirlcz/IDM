package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f124813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f124814c;
    public final m0 d;

    public h0(String str, g0 g0Var, long j2, gcm.g2 g2Var) {
        this.f124812a = str;
        this.f124813b = (g0) Preconditions.checkNotNull(g0Var, "severity");
        this.f124814c = j2;
        this.d = g2Var;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Objects.equal(this.f124812a, h0Var.f124812a) && Objects.equal(this.f124813b, h0Var.f124813b) && this.f124814c == h0Var.f124814c && Objects.equal(null, null) && Objects.equal(this.d, h0Var.d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f124812a, this.f124813b, Long.valueOf(this.f124814c), null, this.d);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("description", this.f124812a).add("severity", this.f124813b).add("timestampNanos", this.f124814c).add("channelRef", (Object) null).add("subchannelRef", this.d).toString();
    }
}
