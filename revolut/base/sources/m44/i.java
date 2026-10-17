package m44;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cu3.e f202654a;

    public i(cu3.e addressType) {
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        this.f202654a = addressType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f202654a == ((i) obj2).f202654a;
    }

    public final int hashCode() {
        return this.f202654a.hashCode();
    }
}
