package zt0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f325006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f325008c;
    public final int d;
    public final int e;

    public d(String text, int i, float f, int i2, int i3) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f325006a = f;
        this.f325007b = text;
        this.f325008c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Float.compare(this.f325006a, dVar.f325006a) == 0 && Intrinsics.f(this.f325007b, dVar.f325007b) && this.f325008c == dVar.f325008c && this.d == dVar.d && this.e == dVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f325008c, p.a.c(Float.hashCode(this.f325006a) * 31, 31, this.f325007b), 31), 31);
    }
}
