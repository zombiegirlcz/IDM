package hu6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155564a;

    public b(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f155564a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f155564a, ((b) obj2).f155564a);
    }

    public final int hashCode() {
        return this.f155564a.hashCode();
    }
}
