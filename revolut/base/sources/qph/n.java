package qph;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f248411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f248412b;

    public n(zel.f instrumentGroup, List filters) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f248411a = instrumentGroup;
        this.f248412b = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f248411a == nVar.f248411a && Intrinsics.f(this.f248412b, nVar.f248412b);
    }

    public final int hashCode() {
        return this.f248412b.hashCode() + (this.f248411a.hashCode() * 31);
    }
}
