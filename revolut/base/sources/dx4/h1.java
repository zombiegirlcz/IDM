package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h1 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1 f120611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f120612b;

    public h1(f1 icon, g1 style) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f120611a = icon;
        this.f120612b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj2;
        return this.f120611a == h1Var.f120611a && this.f120612b == h1Var.f120612b;
    }

    public final int hashCode() {
        return this.f120612b.hashCode() + (this.f120611a.hashCode() * 31);
    }
}
