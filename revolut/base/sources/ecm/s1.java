package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes13.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f124873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f124874b;

    public s1(Object obj2) {
        this.f124874b = Preconditions.checkNotNull(obj2, "config");
        this.f124873a = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && s1.class == obj2.getClass()) {
            s1 s1Var = (s1) obj2;
            if (Objects.equal(this.f124873a, s1Var.f124873a) && Objects.equal(this.f124874b, s1Var.f124874b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f124873a, this.f124874b);
    }

    public final String toString() {
        Object obj2 = this.f124874b;
        return obj2 != null ? MoreObjects.toStringHelper(this).add("config", obj2).toString() : MoreObjects.toStringHelper(this).add("error", this.f124873a).toString();
    }

    public s1(g2 g2Var) {
        this.f124874b = null;
        this.f124873a = (g2) Preconditions.checkNotNull(g2Var, "status");
        Preconditions.checkArgument(!g2Var.e(), "cannot use OK status: %s", g2Var);
    }
}
