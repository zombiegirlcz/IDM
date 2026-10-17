package km6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f185726b;

    public d(String institutionId, boolean z) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f185725a = institutionId;
        this.f185726b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f185725a, dVar.f185725a) && this.f185726b == dVar.f185726b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185726b) + (this.f185725a.hashCode() * 31);
    }
}
