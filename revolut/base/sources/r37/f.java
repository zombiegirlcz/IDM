package r37;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.j f251195a;

    public f(ds6.j taxType) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f251195a = taxType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f251195a == ((f) obj2).f251195a;
    }

    public final int hashCode() {
        return this.f251195a.hashCode();
    }
}
