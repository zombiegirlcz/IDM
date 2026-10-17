package cu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108807b;

    public c(String currentAddressId, String str) {
        Intrinsics.checkNotNullParameter(currentAddressId, "currentAddressId");
        this.f108806a = currentAddressId;
        this.f108807b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f108806a, cVar.f108806a) && Intrinsics.f(this.f108807b, cVar.f108807b);
    }

    public final int hashCode() {
        int iHashCode = this.f108806a.hashCode() * 31;
        String str = this.f108807b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
