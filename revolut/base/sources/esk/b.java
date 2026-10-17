package esk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f128996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f128997c;

    public b(int i, boolean z, Integer num) {
        this.f128995a = i;
        this.f128996b = num;
        this.f128997c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f128995a == bVar.f128995a && Intrinsics.f(this.f128996b, bVar.f128996b) && this.f128997c == bVar.f128997c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f128995a) * 31;
        Integer num = this.f128996b;
        return Boolean.hashCode(this.f128997c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
