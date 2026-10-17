package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f164633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f164634b;

    public i3(int i, Integer num) {
        this.f164633a = i;
        this.f164634b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj2;
        return this.f164633a == i3Var.f164633a && Intrinsics.f(this.f164634b, i3Var.f164634b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f164633a) * 31;
        Integer num = this.f164634b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
