package fmg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f136431b;

    public i0(String text, j0 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f136430a = text;
        this.f136431b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f136430a, i0Var.f136430a) && this.f136431b == i0Var.f136431b;
    }

    public final int hashCode() {
        return this.f136431b.hashCode() + (this.f136430a.hashCode() * 31);
    }
}
