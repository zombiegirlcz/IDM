package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f10306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10307c;

    public f5(float f, b1 color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f10305a = f;
        this.f10306b = color;
        this.f10307c = true;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj2;
        return Float.compare(this.f10305a, f5Var.f10305a) == 0 && Intrinsics.f(this.f10306b, f5Var.f10306b) && this.f10307c == f5Var.f10307c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10307c) + ((this.f10306b.hashCode() + (Float.hashCode(this.f10305a) * 31)) * 31);
    }

    public f5(float f, int i) {
        this(f, new w0(i));
    }
}
