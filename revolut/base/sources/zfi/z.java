package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f322009b;

    public z(String reference, boolean z) {
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f322008a = reference;
        this.f322009b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f322008a, zVar.f322008a) && this.f322009b == zVar.f322009b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f322009b) + (this.f322008a.hashCode() * 31);
    }
}
