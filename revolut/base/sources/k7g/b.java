package k7g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f182056b;

    public b(String description, boolean z) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f182055a = description;
        this.f182056b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f182055a, bVar.f182055a) && this.f182056b == bVar.f182056b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f182056b) + (this.f182055a.hashCode() * 31);
    }
}
