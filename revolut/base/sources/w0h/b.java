package w0h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293759a;

    public b(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f293759a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f293759a, ((b) obj2).f293759a);
    }

    public final int hashCode() {
        return this.f293759a.hashCode();
    }
}
