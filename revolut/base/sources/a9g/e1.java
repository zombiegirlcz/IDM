package a9g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2481b;

    public e1(String first, String last) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(last, "last");
        this.f2480a = first;
        this.f2481b = last;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f2480a, e1Var.f2480a) && Intrinsics.f(this.f2481b, e1Var.f2481b);
    }

    public final int hashCode() {
        return this.f2481b.hashCode() + (this.f2480a.hashCode() * 31);
    }
}
