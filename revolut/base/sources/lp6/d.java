package lp6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo6.d f198931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f198932b;

    public d(String referenceId, yo6.d referenceType) {
        Intrinsics.checkNotNullParameter(referenceType, "referenceType");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        this.f198931a = referenceType;
        this.f198932b = referenceId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f198931a == dVar.f198931a && Intrinsics.f(this.f198932b, dVar.f198932b);
    }

    public final int hashCode() {
        return this.f198932b.hashCode() + (this.f198931a.hashCode() * 31);
    }
}
