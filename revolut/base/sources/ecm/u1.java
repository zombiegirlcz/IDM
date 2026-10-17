package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f124878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1 f124879c;

    public u1(List list, b bVar, s1 s1Var) {
        this.f124877a = Collections.unmodifiableList(new ArrayList(list));
        this.f124878b = (b) Preconditions.checkNotNull(bVar, "attributes");
        this.f124879c = s1Var;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Objects.equal(this.f124877a, u1Var.f124877a) && Objects.equal(this.f124878b, u1Var.f124878b) && Objects.equal(this.f124879c, u1Var.f124879c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f124877a, this.f124878b, this.f124879c);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("addresses", this.f124877a).add("attributes", this.f124878b).add("serviceConfig", this.f124879c).toString();
    }
}
