package bwb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19286b;

    public d(String query, boolean z) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f19285a = query;
        this.f19286b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f19285a, dVar.f19285a) && this.f19286b == dVar.f19286b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19286b) + (this.f19285a.hashCode() * 31);
    }
}
