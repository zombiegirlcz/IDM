package hw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f156003b;

    public g(int i, i style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f156002a = i;
        this.f156003b = style;
    }

    @Override // hw0.j
    public final i a() {
        return this.f156003b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f156002a == gVar.f156002a && this.f156003b == gVar.f156003b;
    }

    public final int hashCode() {
        return this.f156003b.hashCode() + (Integer.hashCode(this.f156002a) * 31);
    }
}
