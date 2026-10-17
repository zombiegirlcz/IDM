package ctk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108688a;

    public i(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f108688a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f108688a, ((i) obj2).f108688a);
    }

    public final int hashCode() {
        return this.f108688a.hashCode();
    }
}
