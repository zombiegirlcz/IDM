package pdg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235211a;

    public o(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f235211a = propertyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f235211a, ((o) obj2).f235211a);
    }

    public final int hashCode() {
        return this.f235211a.hashCode();
    }
}
