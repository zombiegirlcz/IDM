package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m5 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5 f120684b;

    public m5(String url2, l5 shape) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.f120683a = url2;
        this.f120684b = shape;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj2;
        return Intrinsics.f(this.f120683a, m5Var.f120683a) && this.f120684b == m5Var.f120684b;
    }

    public final int hashCode() {
        return this.f120684b.hashCode() + (this.f120683a.hashCode() * 31);
    }
}
