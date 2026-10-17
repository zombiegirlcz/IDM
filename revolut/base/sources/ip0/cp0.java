package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class cp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f163773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163774c;
    public final boolean d;
    public final boolean e;
    public final xo0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ap0 f163775g;

    public cp0(boolean z, String str, xo0 heightMode, ap0 renderingMode, int i) {
        str = (i & 2) != 0 ? null : str;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        boolean z6 = (i & 16) == 0;
        heightMode = (i & 32) != 0 ? xo0.WRAP_CONTENT : heightMode;
        renderingMode = (i & 64) != 0 ? ap0.DEFAULT : renderingMode;
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(renderingMode, "renderingMode");
        this.f163772a = z;
        this.f163773b = str;
        this.f163774c = z3;
        this.d = z4;
        this.e = z6;
        this.f = heightMode;
        this.f163775g = renderingMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cp0)) {
            return false;
        }
        cp0 cp0Var = (cp0) obj2;
        return this.f163772a == cp0Var.f163772a && Intrinsics.f(this.f163773b, cp0Var.f163773b) && this.f163774c == cp0Var.f163774c && this.d == cp0Var.d && this.e == cp0Var.e && this.f == cp0Var.f && this.f163775g == cp0Var.f163775g;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f163772a) * 31;
        String str = this.f163773b;
        return this.f163775g.hashCode() + ((this.f.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f163774c), 31, this.d), 31, this.e)) * 31);
    }
}
