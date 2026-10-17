package x4e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302866a;

    public e(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f302866a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f302866a, ((e) obj2).f302866a);
    }

    public final int hashCode() {
        return this.f302866a.hashCode();
    }
}
