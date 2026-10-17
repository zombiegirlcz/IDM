package d0j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110398a;

    public g0(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f110398a = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f110398a, ((g0) obj2).f110398a);
    }

    public final int hashCode() {
        return this.f110398a.hashCode();
    }
}
