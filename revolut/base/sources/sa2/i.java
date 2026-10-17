package sa2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261275a;

    public i(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f261275a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f261275a, ((i) obj2).f261275a);
    }

    public final int hashCode() {
        return this.f261275a.hashCode();
    }
}
