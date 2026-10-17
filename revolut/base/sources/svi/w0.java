package svi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f266014b;

    public w0(String text, a1 a1Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f266013a = text;
        this.f266014b = a1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f266013a, w0Var.f266013a) && this.f266014b == w0Var.f266014b;
    }

    public final int hashCode() {
        int iHashCode = this.f266013a.hashCode() * 31;
        a1 a1Var = this.f266014b;
        return iHashCode + (a1Var == null ? 0 : a1Var.hashCode());
    }
}
