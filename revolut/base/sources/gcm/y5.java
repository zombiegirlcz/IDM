package gcm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class y5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ecm.b1 f142978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f142979b;

    public y5(ecm.b1 b1Var, Object obj2) {
        this.f142978a = (ecm.b1) Preconditions.checkNotNull(b1Var, "provider");
        this.f142979b = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && y5.class == obj2.getClass()) {
            y5 y5Var = (y5) obj2;
            if (Objects.equal(this.f142978a, y5Var.f142978a) && Objects.equal(this.f142979b, y5Var.f142979b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f142978a, this.f142979b);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("provider", this.f142978a).add("config", this.f142979b).toString();
    }
}
