package xne;

import aii.r;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307473a;

    public b(List taxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        this.f307473a = taxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f307473a, ((b) obj2).f307473a);
    }

    public final int hashCode() {
        return this.f307473a.hashCode();
    }
}
