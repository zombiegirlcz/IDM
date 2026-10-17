package bdg;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14599a;

    public b(Integer num) {
        this.f14599a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f14599a, ((b) obj2).f14599a);
    }

    public final int hashCode() {
        Integer num = this.f14599a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
