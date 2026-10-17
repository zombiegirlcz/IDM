package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f201373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f201374c;

    public h0(String text, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f201372a = text;
        this.f201373b = i;
        this.f201374c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f201372a, h0Var.f201372a) && this.f201373b == h0Var.f201373b && this.f201374c == h0Var.f201374c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f201374c) + j6.a.b(this.f201373b, this.f201372a.hashCode() * 31, 31);
    }
}
