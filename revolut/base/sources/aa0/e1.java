package aa0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2730c;

    public e1(String text, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f2728a = text;
        this.f2729b = z;
        this.f2730c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f2728a, e1Var.f2728a) && this.f2729b == e1Var.f2729b && this.f2730c == e1Var.f2730c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2730c) + j6.a.c(this.f2728a.hashCode() * 31, 31, this.f2729b);
    }
}
