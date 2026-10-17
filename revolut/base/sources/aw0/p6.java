package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p6 implements o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f10467b;

    public p6(int i, Integer num) {
        this.f10466a = i;
        this.f10467b = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj2;
        return this.f10466a == p6Var.f10466a && Intrinsics.f(this.f10467b, p6Var.f10467b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f10466a) * 31;
        Integer num = this.f10467b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
