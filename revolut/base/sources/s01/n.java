package s01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258800a;

    public n(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f258800a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f258800a, ((n) obj2).f258800a);
    }

    public final int hashCode() {
        return this.f258800a.hashCode();
    }
}
