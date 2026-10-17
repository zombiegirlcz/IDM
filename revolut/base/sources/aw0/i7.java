package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7 f10356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g7 f10358c;
    public final g7 d;
    public final g7 e;
    public final g7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h7 f10359g;

    public i7(f7 colorState, float f, g7 topLabel, g7 bottomLabel, g7 atValueExplanationLabel, g7 g7Var, h7 h7Var) {
        Intrinsics.checkNotNullParameter(colorState, "colorState");
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        Intrinsics.checkNotNullParameter(bottomLabel, "bottomLabel");
        Intrinsics.checkNotNullParameter(atValueExplanationLabel, "atValueExplanationLabel");
        this.f10356a = colorState;
        this.f10357b = f;
        this.f10358c = topLabel;
        this.d = bottomLabel;
        this.e = atValueExplanationLabel;
        this.f = g7Var;
        this.f10359g = h7Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i7)) {
            return false;
        }
        i7 i7Var = (i7) obj2;
        return this.f10356a == i7Var.f10356a && Float.compare(this.f10357b, i7Var.f10357b) == 0 && Intrinsics.f(this.f10358c, i7Var.f10358c) && Intrinsics.f(this.d, i7Var.d) && Intrinsics.f(this.e, i7Var.e) && Intrinsics.f(this.f, i7Var.f) && Intrinsics.f(this.f10359g, i7Var.f10359g);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f10358c.hashCode() + m72.b.b(this.f10357b, this.f10356a.hashCode() * 31, 31)) * 31)) * 31)) * 31;
        g7 g7Var = this.f;
        int iHashCode2 = (iHashCode + (g7Var == null ? 0 : g7Var.hashCode())) * 31;
        h7 h7Var = this.f10359g;
        return iHashCode2 + (h7Var != null ? h7Var.hashCode() : 0);
    }
}
