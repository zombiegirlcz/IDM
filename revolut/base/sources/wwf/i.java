package wwf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300656a;

    public i(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f300656a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f300656a, ((i) obj2).f300656a);
    }

    public final int hashCode() {
        return this.f300656a.hashCode();
    }
}
