package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f210004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f210005c;

    public t0(String text, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f210003a = text;
        this.f210004b = i;
        this.f210005c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj2;
        return Intrinsics.f(this.f210003a, t0Var.f210003a) && this.f210004b == t0Var.f210004b && this.f210005c == t0Var.f210005c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f210005c) + j6.a.b(this.f210004b, this.f210003a.hashCode() * 31, 31);
    }
}
