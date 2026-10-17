package roe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zme.f f255983a;

    public h(zme.f taxResidency) {
        Intrinsics.checkNotNullParameter(taxResidency, "taxResidency");
        this.f255983a = taxResidency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f255983a, ((h) obj2).f255983a);
    }

    public final int hashCode() {
        return this.f255983a.hashCode();
    }
}
