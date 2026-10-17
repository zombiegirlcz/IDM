package mx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f209577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f209578c;

    public a4(String text, int i, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f209576a = text;
        this.f209577b = i;
        this.f209578c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return Intrinsics.f(this.f209576a, a4Var.f209576a) && this.f209577b == a4Var.f209577b && this.f209578c == a4Var.f209578c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f209578c) + j6.a.b(this.f209577b, this.f209576a.hashCode() * 31, 31);
    }
}
