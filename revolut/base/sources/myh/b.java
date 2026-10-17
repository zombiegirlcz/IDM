package myh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f210508a;

    public b(dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f210508a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f210508a, ((b) obj2).f210508a);
    }

    public final int hashCode() {
        return this.f210508a.hashCode();
    }
}
