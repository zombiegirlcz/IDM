package g3e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140290a;

    public t(String filterId) {
        Intrinsics.checkNotNullParameter(filterId, "filterId");
        this.f140290a = filterId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f140290a, ((t) obj2).f140290a);
    }

    public final int hashCode() {
        return this.f140290a.hashCode();
    }
}
