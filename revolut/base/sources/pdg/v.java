package pdg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235219a;

    public v(String propertyId) {
        Intrinsics.checkNotNullParameter(propertyId, "propertyId");
        this.f235219a = propertyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f235219a, ((v) obj2).f235219a);
    }

    public final int hashCode() {
        return this.f235219a.hashCode();
    }
}
