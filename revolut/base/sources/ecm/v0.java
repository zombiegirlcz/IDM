package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class v0 {
    public static final v0 e = new v0(null, null, g2.e, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f124882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f124883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2 f124884c;
    public final boolean d;

    public v0(x0 x0Var, l lVar, g2 g2Var, boolean z) {
        this.f124882a = x0Var;
        this.f124883b = lVar;
        this.f124884c = (g2) Preconditions.checkNotNull(g2Var, "status");
        this.d = z;
    }

    public static v0 a(g2 g2Var) {
        Preconditions.checkArgument(!g2Var.e(), "error status shouldn't be OK");
        return new v0(null, null, g2Var, false);
    }

    public static v0 b(x0 x0Var, mcm.v vVar) {
        return new v0((x0) Preconditions.checkNotNull(x0Var, "subchannel"), vVar, g2.e, false);
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Objects.equal(this.f124882a, v0Var.f124882a) && Objects.equal(this.f124884c, v0Var.f124884c) && Objects.equal(this.f124883b, v0Var.f124883b) && this.d == v0Var.d;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f124882a, this.f124884c, this.f124883b, Boolean.valueOf(this.d));
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("subchannel", this.f124882a).add("streamTracerFactory", this.f124883b).add("status", this.f124884c).add("drop", this.d).toString();
    }
}
