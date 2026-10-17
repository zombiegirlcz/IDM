package i6f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7f.c f158991a;

    public z(h7f.c status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f158991a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z) && Intrinsics.f(this.f158991a, ((z) obj2).f158991a);
    }

    public final int hashCode() {
        return this.f158991a.hashCode();
    }
}
