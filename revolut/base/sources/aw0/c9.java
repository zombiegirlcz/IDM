package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c9 implements f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b9 f10262b;

    public c9(float f, b9 color) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.f10261a = f;
        this.f10262b = color;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c9)) {
            return false;
        }
        c9 c9Var = (c9) obj2;
        return Float.compare(this.f10261a, c9Var.f10261a) == 0 && this.f10262b == c9Var.f10262b;
    }

    public final int hashCode() {
        return this.f10262b.hashCode() + (Float.hashCode(this.f10261a) * 31);
    }
}
