package koe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zme.f f186322a;

    public l(zme.f taxResidency) {
        Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
        this.f186322a = taxResidency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f186322a, ((l) obj2).f186322a);
    }

    public final int hashCode() {
        return this.f186322a.hashCode();
    }
}
