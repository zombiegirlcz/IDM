package w4e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294555a;

    public c(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f294555a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f294555a, ((c) obj2).f294555a);
    }

    public final int hashCode() {
        return this.f294555a.hashCode();
    }
}
