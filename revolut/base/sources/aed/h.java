package aed;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3536b;

    public h(String id10, String currentUserId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currentUserId, "currentUserId");
        this.f3535a = id10;
        this.f3536b = currentUserId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f3535a, hVar.f3535a) && Intrinsics.f(this.f3536b, hVar.f3536b);
    }

    public final int hashCode() {
        return this.f3536b.hashCode() + (this.f3535a.hashCode() * 31);
    }
}
