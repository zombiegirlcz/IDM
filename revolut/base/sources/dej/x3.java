package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4 f113692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f113693b;

    public x3(a4 mobilePlan, int i) {
        Intrinsics.checkNotNullParameter(mobilePlan, "mobilePlan");
        this.f113692a = mobilePlan;
        this.f113693b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj2;
        return Intrinsics.f(this.f113692a, x3Var.f113692a) && this.f113693b == x3Var.f113693b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113693b) + (this.f113692a.hashCode() * 31);
    }
}
