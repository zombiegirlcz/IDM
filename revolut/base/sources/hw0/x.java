package hw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f156022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f156023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f156024c;
    public final y d;
    public final c e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f156025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f156026h;
    public final ms0.v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f156027j;
    public final boolean k;

    public x(float f, float f4, Clause clause, y yVar, c badgePlacement, b badgeGravity, boolean z, boolean z3, w lineStyle, int i) {
        f4 = (i & 2) != 0 ? f : f4;
        clause = (i & 4) != 0 ? null : clause;
        yVar = (i & 8) != 0 ? null : yVar;
        badgePlacement = (i & 16) != 0 ? c.BELOW_LINE : badgePlacement;
        badgeGravity = (i & 32) != 0 ? b.START : badgeGravity;
        z = (i & 64) != 0 ? false : z;
        z3 = (i & 128) != 0 ? true : z3;
        ms0.v badgeStyle = ms0.v.WhiteTransparentBackground;
        lineStyle = (i & 512) != 0 ? w.DASH : lineStyle;
        boolean z4 = (i & 1024) != 0;
        Intrinsics.checkNotNullParameter(badgePlacement, "badgePlacement");
        Intrinsics.checkNotNullParameter(badgeGravity, "badgeGravity");
        Intrinsics.checkNotNullParameter(badgeStyle, "badgeStyle");
        Intrinsics.checkNotNullParameter(lineStyle, "lineStyle");
        this.f156022a = f;
        this.f156023b = f4;
        this.f156024c = clause;
        this.d = yVar;
        this.e = badgePlacement;
        this.f = badgeGravity;
        this.f156025g = z;
        this.f156026h = z3;
        this.i = badgeStyle;
        this.f156027j = lineStyle;
        this.k = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Float.compare(this.f156022a, xVar.f156022a) == 0 && Float.compare(this.f156023b, xVar.f156023b) == 0 && Intrinsics.f(this.f156024c, xVar.f156024c) && this.d == xVar.d && this.e == xVar.e && this.f == xVar.f && this.f156025g == xVar.f156025g && this.f156026h == xVar.f156026h && this.i == xVar.i && this.f156027j == xVar.f156027j && this.k == xVar.k;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f156023b, Float.hashCode(this.f156022a) * 31, 31);
        Clause clause = this.f156024c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        y yVar = this.d;
        return Boolean.hashCode(this.k) + ((this.f156027j.hashCode() + ((this.i.hashCode() + j6.a.c(j6.a.c((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (yVar != null ? yVar.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f156025g), 31, this.f156026h)) * 31)) * 31);
    }
}
