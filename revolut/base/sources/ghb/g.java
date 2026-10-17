package ghb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f143898a;

    public g(f status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f143898a = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f143898a, ((g) obj2).f143898a);
    }

    public final int hashCode() {
        return this.f143898a.hashCode();
    }
}
