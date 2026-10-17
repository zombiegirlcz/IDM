package xy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309598a;

    public v(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f309598a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f309598a, ((v) obj2).f309598a);
    }

    public final int hashCode() {
        return this.f309598a.hashCode();
    }
}
