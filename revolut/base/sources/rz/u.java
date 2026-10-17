package rz;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes16.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f258457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f258458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f258459c;
    public final int d;

    public u(int i, int i2, int i3, int i5) {
        this.f258457a = i;
        this.f258458b = i2;
        this.f258459c = i3;
        this.d = i5;
    }

    public final Rect a() {
        int i = this.f258459c;
        int i2 = this.f258457a;
        int i3 = this.d;
        int i5 = this.f258458b;
        return new Rect(i2, i5, i + i2, i3 + i5);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f258457a == uVar.f258457a && this.f258458b == uVar.f258458b && this.f258459c == uVar.f258459c && this.d == uVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f258459c, j6.a.b(this.f258458b, Integer.hashCode(this.f258457a) * 31, 31), 31);
    }
}
