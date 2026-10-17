package ts0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f273870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f273871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f273872c;
    public final g0 d;

    public h0() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f273870a == h0Var.f273870a && this.f273871b == h0Var.f273871b && this.f273872c == h0Var.f273872c && this.d == h0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f273872c.hashCode() + j6.a.c(Boolean.hashCode(this.f273870a) * 31, 31, this.f273871b)) * 31);
    }

    public h0(f0 selectionIndicator, g0 yAxisLabelPlacement, int i) {
        boolean z = (i & 1) == 0;
        boolean z3 = (i & 2) == 0;
        selectionIndicator = (i & 4) != 0 ? f0.NONE : selectionIndicator;
        yAxisLabelPlacement = (i & 8) != 0 ? g0.DEFAULT : yAxisLabelPlacement;
        Intrinsics.checkNotNullParameter(selectionIndicator, "selectionIndicator");
        Intrinsics.checkNotNullParameter(yAxisLabelPlacement, "yAxisLabelPlacement");
        this.f273870a = z;
        this.f273871b = z3;
        this.f273872c = selectionIndicator;
        this.d = yAxisLabelPlacement;
    }
}
