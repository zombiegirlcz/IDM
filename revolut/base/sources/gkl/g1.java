package gkl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f144452a;

    public g1(m claimName) {
        Intrinsics.checkNotNullParameter(claimName, "claimName");
        this.f144452a = claimName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g1) && this.f144452a == ((g1) obj2).f144452a;
    }

    public final int hashCode() {
        return this.f144452a.hashCode();
    }
}
