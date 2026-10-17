package hui;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155685a;

    public m(String passId) {
        Intrinsics.checkNotNullParameter(passId, "passId");
        this.f155685a = passId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f155685a, ((m) obj2).f155685a);
    }

    public final int hashCode() {
        return this.f155685a.hashCode();
    }
}
