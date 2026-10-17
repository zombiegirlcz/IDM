package s7a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260660a;

    public y(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f260660a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f260660a, ((y) obj2).f260660a);
    }

    public final int hashCode() {
        return this.f260660a.hashCode();
    }
}
