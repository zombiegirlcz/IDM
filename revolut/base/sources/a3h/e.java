package a3h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1134a;

    public e(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f1134a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f1134a, ((e) obj2).f1134a);
    }

    public final int hashCode() {
        return this.f1134a.hashCode();
    }
}
