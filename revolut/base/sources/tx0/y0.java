package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class y0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.d0 f275275b;

    public y0() {
        this(null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return Intrinsics.f(this.f275274a, y0Var.f275274a) && Intrinsics.f(this.f275275b, y0Var.f275275b);
    }

    public final int hashCode() {
        return this.f275275b.hashCode() + (this.f275274a.hashCode() * 31);
    }

    public y0(aw0.d0 aspectRatio, int i) {
        aspectRatio = (i & 2) != 0 ? new aw0.d0(100, 83) : aspectRatio;
        Intrinsics.checkNotNullParameter("", "id");
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        this.f275274a = "";
        this.f275275b = aspectRatio;
    }
}
