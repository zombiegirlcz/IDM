package ffb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f134793a;

    public e(a location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f134793a = location;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f134793a, ((e) obj2).f134793a);
    }

    public final int hashCode() {
        return this.f134793a.hashCode();
    }
}
