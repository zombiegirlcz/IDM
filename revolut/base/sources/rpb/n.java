package rpb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256332a;

    public n(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f256332a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f256332a, ((n) obj2).f256332a);
    }

    public final int hashCode() {
        return this.f256332a.hashCode();
    }
}
