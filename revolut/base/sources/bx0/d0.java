package bx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19404c;

    public d0(float f, int i, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f19402a = f;
        this.f19403b = label;
        this.f19404c = i;
    }

    public final String a() {
        return this.f19403b;
    }

    public final int b() {
        return this.f19404c;
    }

    public final float c() {
        return this.f19402a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Float.compare(this.f19402a, d0Var.f19402a) == 0 && Intrinsics.f(this.f19403b, d0Var.f19403b) && this.f19404c == d0Var.f19404c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19404c) + p.a.c(Float.hashCode(this.f19402a) * 31, 31, this.f19403b);
    }
}
