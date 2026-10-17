package bx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19389c;
    public final int d;

    public a(float f, int i, String title, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f19387a = f;
        this.f19388b = title;
        this.f19389c = z;
        this.d = i;
    }

    public final String a() {
        return this.f19388b;
    }

    public final float b() {
        return this.f19387a;
    }

    public final boolean c() {
        return this.f19389c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Float.compare(this.f19387a, aVar.f19387a) == 0 && Intrinsics.f(this.f19388b, aVar.f19388b) && this.f19389c == aVar.f19389c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.c(p.a.c(Float.hashCode(this.f19387a) * 31, 31, this.f19388b), 31, this.f19389c);
    }
}
