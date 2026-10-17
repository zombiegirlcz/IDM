package koe;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186321a;

    public k(List taxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        this.f186321a = taxResidencies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f186321a, ((k) obj2).f186321a);
    }

    public final int hashCode() {
        return this.f186321a.hashCode();
    }
}
