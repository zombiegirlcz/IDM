package pb2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234611a;

    public m(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f234611a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f234611a, ((m) obj2).f234611a);
    }

    public final int hashCode() {
        return this.f234611a.hashCode();
    }
}
