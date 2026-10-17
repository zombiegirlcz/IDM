package hr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds6.j f154778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154779b;

    public f(ds6.j taxType, String taxProfileId) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(taxProfileId, "taxProfileId");
        this.f154778a = taxType;
        this.f154779b = taxProfileId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f154778a == fVar.f154778a && Intrinsics.f(this.f154779b, fVar.f154779b);
    }

    public final int hashCode() {
        return this.f154779b.hashCode() + (this.f154778a.hashCode() * 31);
    }
}
