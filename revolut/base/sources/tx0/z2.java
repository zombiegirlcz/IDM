package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f275291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f275292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f275293c;
    public final b3 d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aw0.v1 f275294g;

    public z2(a3 expandAnimatorTiming, int i, int i2, b3 expandedViewsBackgroundColorState, int i3, int i5, aw0.v1 contextualColorScheme) {
        Intrinsics.checkNotNullParameter(expandAnimatorTiming, "expandAnimatorTiming");
        Intrinsics.checkNotNullParameter(expandedViewsBackgroundColorState, "expandedViewsBackgroundColorState");
        Intrinsics.checkNotNullParameter(contextualColorScheme, "contextualColorScheme");
        this.f275291a = expandAnimatorTiming;
        this.f275292b = i;
        this.f275293c = i2;
        this.d = expandedViewsBackgroundColorState;
        this.e = i3;
        this.f = i5;
        this.f275294g = contextualColorScheme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return this.f275291a == z2Var.f275291a && this.f275292b == z2Var.f275292b && this.f275293c == z2Var.f275293c && this.d == z2Var.d && this.e == z2Var.e && this.f == z2Var.f && this.f275294g == z2Var.f275294g;
    }

    public final int hashCode() {
        return this.f275294g.hashCode() + j6.a.b(this.f, j6.a.b(this.e, (this.d.hashCode() + j6.a.b(this.f275293c, j6.a.b(this.f275292b, this.f275291a.hashCode() * 31, 31), 31)) * 31, 31), 31);
    }
}
