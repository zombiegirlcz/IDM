package aw0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class q5 {

    @NotNull
    public static final n5 Companion = new n5();
    public static final o5 i = o5.VERTICAL_LINE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m5 f10489c;
    public final l5 d;
    public final o5 e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k0 f10490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p5 f10491h;

    public q5(float f, float f4, m5 m5Var, l5 l5Var, o5 o5Var, int i2, k0 k0Var, p5 p5Var) {
        this.f10487a = f;
        this.f10488b = f4;
        this.f10489c = m5Var;
        this.d = l5Var;
        this.e = o5Var;
        this.f = i2;
        this.f10490g = k0Var;
        this.f10491h = p5Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj2;
        return Float.compare(this.f10487a, q5Var.f10487a) == 0 && Float.compare(this.f10488b, q5Var.f10488b) == 0 && this.f10489c == q5Var.f10489c && Intrinsics.f(this.d, q5Var.d) && this.e == q5Var.e && Float.compare(6.0f, 6.0f) == 0 && Float.compare(16.0f, 16.0f) == 0 && Float.compare(4.0f, 4.0f) == 0 && Float.compare(4.0f, 4.0f) == 0 && Float.compare(2.0f, 2.0f) == 0 && this.f == q5Var.f && this.f10490g == q5Var.f10490g && this.f10491h == q5Var.f10491h;
    }

    public final int hashCode() {
        return this.f10491h.hashCode() + ((this.f10490g.hashCode() + j6.a.b(this.f, m72.b.b(2.0f, m72.b.b(4.0f, m72.b.b(4.0f, m72.b.b(16.0f, m72.b.b(6.0f, (this.e.hashCode() + ((this.d.hashCode() + ((this.f10489c.hashCode() + m72.b.b(this.f10488b, Float.hashCode(this.f10487a) * 31, 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    public q5() {
        l5 barCornerRadius = new l5(2.0f, 2.0f);
        Intrinsics.checkNotNullParameter(barCornerRadius, "barCornerRadius");
        o5 selectionMode = i;
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        this(-1.0f, -1.0f, m5.FIXED, barCornerRadius, selectionMode, 60, k0.SOLID, p5.DEFAULT);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q5(float f, float f4, l5 l5Var, o5 o5Var, m5 barGapType, k0 k0Var, p5 p5Var, int i2) {
        float f5 = (i2 & 1) != 0 ? -1.0f : f;
        float f6 = (i2 & 2) != 0 ? -1.0f : f4;
        l5 barCornerRadius = (i2 & 4) != 0 ? new l5(2.0f, 2.0f) : l5Var;
        o5 selectionMode = (i2 & 8) != 0 ? i : o5Var;
        int i3 = (i2 & 16) != 0 ? 60 : 10;
        k0 barBackgroundStyle = (i2 & 64) != 0 ? k0.SOLID : k0Var;
        p5 yAxisPlacementStyle = (i2 & 128) != 0 ? p5.DEFAULT : p5Var;
        Intrinsics.checkNotNullParameter(barCornerRadius, "barCornerRadius");
        Intrinsics.checkNotNullParameter(selectionMode, "selectionMode");
        Intrinsics.checkNotNullParameter(barGapType, "barGapType");
        Intrinsics.checkNotNullParameter(barBackgroundStyle, "barBackgroundStyle");
        Intrinsics.checkNotNullParameter(yAxisPlacementStyle, "yAxisPlacementStyle");
        this(f5, f6, barGapType, barCornerRadius, selectionMode, i3, barBackgroundStyle, yAxisPlacementStyle);
    }
}
