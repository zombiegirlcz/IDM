package b1h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11802a;

    public b(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f11802a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f11802a, ((b) obj2).f11802a);
    }

    public final int hashCode() {
        return this.f11802a.hashCode();
    }
}
