package pdg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235217a;

    public t(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f235217a = propertyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f235217a, ((t) obj2).f235217a);
    }

    public final int hashCode() {
        return this.f235217a.hashCode();
    }
}
