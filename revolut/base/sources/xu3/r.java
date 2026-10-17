package xu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308939a;

    public r(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f308939a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f308939a, ((r) obj2).f308939a);
    }

    public final int hashCode() {
        return this.f308939a.hashCode();
    }
}
