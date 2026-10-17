package m8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203518a;

    public p(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f203518a = category;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f203518a, ((p) obj2).f203518a);
    }

    public final int hashCode() {
        return this.f203518a.hashCode();
    }
}
