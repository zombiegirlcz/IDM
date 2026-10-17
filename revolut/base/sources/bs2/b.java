package bs2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr2.c f18025a;

    public b(kr2.c bottomSheet) {
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f18025a = bottomSheet;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f18025a, ((b) obj2).f18025a);
    }

    public final int hashCode() {
        return this.f18025a.hashCode();
    }
}
