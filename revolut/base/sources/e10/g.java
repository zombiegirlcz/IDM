package e10;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f121806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f121807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f121808c;
    public final t d;

    public g(t blur, t dark, t bright, t glare) {
        Intrinsics.checkNotNullParameter(blur, "blur");
        Intrinsics.checkNotNullParameter(dark, "dark");
        Intrinsics.checkNotNullParameter(bright, "bright");
        Intrinsics.checkNotNullParameter(glare, "glare");
        this.f121806a = blur;
        this.f121807b = dark;
        this.f121808c = bright;
        this.d = glare;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f121806a, gVar.f121806a) && Intrinsics.f(this.f121807b, gVar.f121807b) && Intrinsics.f(this.f121808c, gVar.f121808c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f121808c.hashCode() + ((this.f121807b.hashCode() + (this.f121806a.hashCode() * 31)) * 31)) * 31);
    }
}
