package ic3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160207a;

    public d(String storeId) {
        Intrinsics.checkNotNullParameter(storeId, "storeId");
        this.f160207a = storeId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f160207a, ((d) obj2).f160207a);
    }

    public final int hashCode() {
        return this.f160207a.hashCode();
    }
}
