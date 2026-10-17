package ya6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311972a;

    public k(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f311972a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f311972a, ((k) obj2).f311972a);
    }

    public final int hashCode() {
        return this.f311972a.hashCode();
    }
}
