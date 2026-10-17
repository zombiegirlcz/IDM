package t1e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f267252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f267253b;

    public c0() {
        this(3, (Integer) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f267252a, c0Var.f267252a) && Intrinsics.f(this.f267253b, c0Var.f267253b);
    }

    public final int hashCode() {
        Integer num = this.f267252a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f267253b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public /* synthetic */ c0(int i, Integer num) {
        this((i & 1) != 0 ? null : num, (Integer) null);
    }

    public c0(Integer num, Integer num2) {
        this.f267252a = num;
        this.f267253b = num2;
    }
}
