package ctk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f108689a;

    public j(String ref2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f108689a = ref2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f108689a, ((j) obj2).f108689a);
    }

    public final int hashCode() {
        return this.f108689a.hashCode();
    }
}
