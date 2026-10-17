package aw0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l2 f10388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f10389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color.Solid f10390c;
    public final Color.Solid d;
    public final j2 e;
    public final f2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2 f10391g;

    public k2() {
        this(null, null, null, null, 63);
    }

    @Override // aw0.n2
    public final f2 a() {
        return this.f;
    }

    @Override // aw0.n2
    public final e2 b() {
        return this.f10391g;
    }

    @Override // aw0.n2
    public final Color c() {
        return this.d;
    }

    @Override // aw0.n2
    public final l2 d() {
        return this.f10388a;
    }

    @Override // aw0.n2
    public final Color e() {
        return this.f10390c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return this.f10388a == k2Var.f10388a && Intrinsics.f(this.f10389b, k2Var.f10389b) && Intrinsics.f(this.f10390c, k2Var.f10390c) && Intrinsics.f(this.d, k2Var.d) && Intrinsics.f(this.e, k2Var.e) && this.f == k2Var.f;
    }

    @Override // aw0.n2
    public final j2 f() {
        return this.e;
    }

    @Override // aw0.n2
    public final Color g() {
        return this.f10389b;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + j6.a.b(this.d.f51464b, j6.a.b(this.f10390c.f51464b, ehe.n.d(this.f10389b, this.f10388a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public k2(l2 performanceStyle, Color.Solid currentLineColor, g2 g2Var, f2 comparisonStyle, int i) {
        performanceStyle = (i & 1) != 0 ? l2.GREATER_VALUE_GREEN : performanceStyle;
        currentLineColor = (i & 2) != 0 ? new Color.Solid(R$attr.uikit_colorAccentNeutral) : currentLineColor;
        Color.Solid neutralColor = new Color.Solid(R$attr.uikit_colorAccentNeutral);
        Color.Solid neutralTranslucentColor = new Color.Solid(R$attr.uikit_colorAccentNeutral_20);
        j2 dottedLineStyle = g2Var;
        dottedLineStyle = (i & 16) != 0 ? h2.f10334a : dottedLineStyle;
        comparisonStyle = (i & 32) != 0 ? f2.CURRENT_OR_SELECTED_OF_PREVIOUS_LINE : comparisonStyle;
        Intrinsics.checkNotNullParameter(performanceStyle, "performanceStyle");
        Intrinsics.checkNotNullParameter(currentLineColor, "currentLineColor");
        Intrinsics.checkNotNullParameter(neutralColor, "neutralColor");
        Intrinsics.checkNotNullParameter(neutralTranslucentColor, "neutralTranslucentColor");
        Intrinsics.checkNotNullParameter(dottedLineStyle, "dottedLineStyle");
        Intrinsics.checkNotNullParameter(comparisonStyle, "comparisonStyle");
        this.f10388a = performanceStyle;
        this.f10389b = currentLineColor;
        this.f10390c = neutralColor;
        this.d = neutralTranslucentColor;
        this.e = dottedLineStyle;
        this.f = comparisonStyle;
        this.f10391g = e2.MONOCHROMATIC;
    }
}
