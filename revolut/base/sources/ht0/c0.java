package ht0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f155117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f155119c;
    public final Integer d;
    public final Integer e;

    public c0(int i, int i2, int i3, Integer num, Integer num2) {
        this.f155117a = i;
        this.f155118b = i2;
        this.f155119c = i3;
        this.d = num;
        this.e = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f155117a == c0Var.f155117a && this.f155118b == c0Var.f155118b && this.f155119c == c0Var.f155119c && Intrinsics.f(this.d, c0Var.d) && Intrinsics.f(this.e, c0Var.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f155119c, j6.a.b(this.f155118b, Integer.hashCode(this.f155117a) * 31, 31), 31);
        Integer num = this.d;
        int iHashCode = (iB + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }
}
