package ecm;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f124889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f124890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f124891c;

    public w0(List list, b bVar, Object obj2) {
        this.f124889a = Collections.unmodifiableList(new ArrayList((Collection) Preconditions.checkNotNull(list, "addresses")));
        this.f124890b = (b) Preconditions.checkNotNull(bVar, "attributes");
        this.f124891c = obj2;
    }

    public final jpf.a a() {
        jpf.a aVar = new jpf.a();
        b bVar = b.f124779b;
        aVar.f177267a = this.f124889a;
        aVar.f177268b = this.f124890b;
        aVar.f177269c = this.f124891c;
        return aVar;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Objects.equal(this.f124889a, w0Var.f124889a) && Objects.equal(this.f124890b, w0Var.f124890b) && Objects.equal(this.f124891c, w0Var.f124891c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f124889a, this.f124890b, this.f124891c);
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("addresses", this.f124889a).add("attributes", this.f124890b).add("loadBalancingPolicyConfig", this.f124891c).toString();
    }
}
