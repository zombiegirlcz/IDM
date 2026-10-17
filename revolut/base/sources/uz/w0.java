package uz;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f284563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f284564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f284565c;
    public final int d;

    public w0(p0 maskState, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(maskState, "maskState");
        this.f284563a = maskState;
        this.f284564b = i;
        this.f284565c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return this.f284563a == w0Var.f284563a && this.f284564b == w0Var.f284564b && this.f284565c == w0Var.f284565c && this.d == w0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f284565c, j6.a.b(this.f284564b, this.f284563a.hashCode() * 31, 31), 31);
    }
}
