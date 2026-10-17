package eej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f125212a;

    public b(d restriction) {
        Intrinsics.checkNotNullParameter(restriction, "restriction");
        this.f125212a = restriction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f125212a, ((b) obj2).f125212a);
    }

    public final int hashCode() {
        return this.f125212a.hashCode();
    }
}
