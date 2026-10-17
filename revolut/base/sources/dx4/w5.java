package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w5 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f120819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s5 f120820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v5 f120821c;

    public w5(a1 icon, s5 iconBackgroundStyle, v5 v5Var) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconBackgroundStyle, "iconBackgroundStyle");
        this.f120819a = icon;
        this.f120820b = iconBackgroundStyle;
        this.f120821c = v5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w5)) {
            return false;
        }
        w5 w5Var = (w5) obj2;
        return this.f120819a == w5Var.f120819a && this.f120820b == w5Var.f120820b && Intrinsics.f(this.f120821c, w5Var.f120821c);
    }

    public final int hashCode() {
        int iHashCode = (this.f120820b.hashCode() + (this.f120819a.hashCode() * 31)) * 31;
        v5 v5Var = this.f120821c;
        return iHashCode + (v5Var == null ? 0 : v5Var.hashCode());
    }
}
