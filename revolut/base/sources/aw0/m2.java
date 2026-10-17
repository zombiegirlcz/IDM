package aw0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f10418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color.Solid f10419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color.Solid f10420c;
    public final Color d;
    public final f2 e;
    public final e2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10422h;
    public final i2 i;

    public m2() {
        this(null, null, null, false, 255);
    }

    @Override // aw0.n2
    public final f2 a() {
        return this.e;
    }

    @Override // aw0.n2
    public final e2 b() {
        return this.f;
    }

    @Override // aw0.n2
    public final Color c() {
        return this.d;
    }

    @Override // aw0.n2
    public final l2 d() {
        return this.f10418a;
    }

    @Override // aw0.n2
    public final Color e() {
        return this.f10420c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj2;
        return this.f10418a == m2Var.f10418a && Intrinsics.f(this.f10419b, m2Var.f10419b) && Intrinsics.f(this.f10420c, m2Var.f10420c) && Intrinsics.f(this.d, m2Var.d) && this.e == m2Var.e && this.f == m2Var.f && this.f10421g == m2Var.f10421g && this.f10422h == m2Var.f10422h;
    }

    @Override // aw0.n2
    public final j2 f() {
        return this.i;
    }

    @Override // aw0.n2
    public final Color g() {
        return this.f10419b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10422h) + j6.a.c((this.f.hashCode() + ((this.e.hashCode() + ehe.n.d(this.d, j6.a.b(this.f10420c.f51464b, j6.a.b(this.f10419b.f51464b, this.f10418a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31, this.f10421g);
    }

    public m2(l2 performanceStyle, Color.Solid currentLineColor, Color.Solid neutralColor, Color neutralTranslucentColor, f2 comparisonStyle, e2 colorMode, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(performanceStyle, "performanceStyle");
        Intrinsics.checkNotNullParameter(currentLineColor, "currentLineColor");
        Intrinsics.checkNotNullParameter(neutralColor, "neutralColor");
        Intrinsics.checkNotNullParameter(neutralTranslucentColor, "neutralTranslucentColor");
        Intrinsics.checkNotNullParameter(comparisonStyle, "comparisonStyle");
        Intrinsics.checkNotNullParameter(colorMode, "colorMode");
        this.f10418a = performanceStyle;
        this.f10419b = currentLineColor;
        this.f10420c = neutralColor;
        this.d = neutralTranslucentColor;
        this.e = comparisonStyle;
        this.f = colorMode;
        this.f10421g = z;
        this.f10422h = z3;
        this.i = i2.f10351a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m2(l2 l2Var, f2 f2Var, e2 e2Var, boolean z, int i) {
        l2 l2Var2 = (i & 1) != 0 ? l2.GREATER_VALUE_GREEN : l2Var;
        int i2 = R$attr.uikit_colorAccentNeutral;
        this(l2Var2, new Color.Solid(i2), new Color.Solid(i2), new Color.Solid(R$attr.uikit_colorAccentNeutral_20), (i & 16) != 0 ? f2.CURRENT_OR_SELECTED_OF_PREVIOUS_LINE : f2Var, (i & 32) != 0 ? e2.PERFORMANCE : e2Var, (i & 64) != 0 ? false : z, (i & 128) == 0);
    }
}
