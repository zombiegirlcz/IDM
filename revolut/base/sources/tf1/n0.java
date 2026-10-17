package tf1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n0 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f270187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f270188b;

    public n0(ArrayList nonErrorContentItems, List advisedProductIds) {
        Intrinsics.checkNotNullParameter(nonErrorContentItems, "nonErrorContentItems");
        Intrinsics.checkNotNullParameter(advisedProductIds, "advisedProductIds");
        this.f270187a = nonErrorContentItems;
        this.f270188b = advisedProductIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return this.f270187a.equals(n0Var.f270187a) && Intrinsics.f(this.f270188b, n0Var.f270188b);
    }

    public final int hashCode() {
        return this.f270188b.hashCode() + (this.f270187a.hashCode() * 31);
    }
}
