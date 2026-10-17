package afl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f4665b;

    public z(Integer num, Integer num2) {
        this.f4664a = num;
        this.f4665b = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f4664a, zVar.f4664a) && Intrinsics.f(this.f4665b, zVar.f4665b);
    }

    public final int hashCode() {
        Integer num = this.f4664a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f4665b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
