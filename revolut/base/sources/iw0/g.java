package iw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f168893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f168894b;

    public g(e color, i style) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f168893a = color;
        this.f168894b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f168893a == gVar.f168893a && this.f168894b == gVar.f168894b;
    }

    public final int hashCode() {
        return this.f168894b.hashCode() + (this.f168893a.hashCode() * 31);
    }
}
