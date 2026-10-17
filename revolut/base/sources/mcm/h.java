package mcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import ecm.b1;
import ecm.s0;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f204382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f204383b;

    public h(b1 b1Var, Object obj2) {
        this.f204382a = (s0) Preconditions.checkNotNull(b1Var, "childFactory");
        this.f204383b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Objects.equal(this.f204382a, hVar.f204382a) && Objects.equal(this.f204383b, hVar.f204383b);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f204382a, this.f204383b);
    }

    public final String toString() {
        return MoreObjects.toStringHelper("GracefulSwitchLoadBalancer.Config").add("childFactory", this.f204382a).add("childConfig", this.f204383b).toString();
    }
}
