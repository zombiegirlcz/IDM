package foi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f136997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f136998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f136999c;

    public j(h state, long j2) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f136997a = state;
        this.f136998b = j2;
        this.f136999c = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f136997a, jVar.f136997a) && this.f136998b == jVar.f136998b && Intrinsics.f(this.f136999c, jVar.f136999c);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f136997a.hashCode() * 31, 31, this.f136998b);
        Long l2 = this.f136999c;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
