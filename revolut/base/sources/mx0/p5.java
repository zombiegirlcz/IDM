package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f209924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f209926c;

    public p5(int i, int i2, Integer num) {
        this.f209924a = i;
        this.f209925b = i2;
        this.f209926c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj2;
        return this.f209924a == p5Var.f209924a && this.f209925b == p5Var.f209925b && Intrinsics.f(this.f209926c, p5Var.f209926c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f209925b, Integer.hashCode(this.f209924a) * 31, 31);
        Integer num = this.f209926c;
        return iB + (num == null ? 0 : num.hashCode());
    }
}
