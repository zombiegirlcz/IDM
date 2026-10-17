package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f325861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325862b;

    public x0(v0 code, String str) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f325861a = code;
        this.f325862b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return this.f325861a == x0Var.f325861a && Intrinsics.f(this.f325862b, x0Var.f325862b);
    }

    public final int hashCode() {
        int iHashCode = this.f325861a.hashCode() * 31;
        String str = this.f325862b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
