package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f167228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.v5 f167229b;

    public y0(int i, c1 barColor) {
        Intrinsics.checkNotNullParameter(barColor, "barColor");
        aw0.v5 barColor2 = new aw0.v5(barColor.f163671a);
        Intrinsics.checkNotNullParameter(barColor2, "barColor");
        this.f167228a = i;
        this.f167229b = barColor2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj2;
        return this.f167228a == y0Var.f167228a && this.f167229b.equals(y0Var.f167229b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167229b.f10572a) + (Integer.hashCode(this.f167228a) * 31);
    }
}
