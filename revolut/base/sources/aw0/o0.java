package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b9 f10445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f10446c;
    public final Clause d;
    public final TextLocalisedClause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f10447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0 f10448h;

    public /* synthetic */ o0(float f, b9 b9Var, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        this(f, b9Var, textLocalisedClause, null, textLocalisedClause2, null, textLocalisedClause3, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Float.compare(this.f10444a, o0Var.f10444a) == 0 && this.f10445b == o0Var.f10445b && Intrinsics.f(this.f10446c, o0Var.f10446c) && Intrinsics.f(this.d, o0Var.d) && Intrinsics.f(this.e, o0Var.e) && Intrinsics.f(this.f, o0Var.f) && Intrinsics.f(this.f10447g, o0Var.f10447g) && this.f10448h == o0Var.f10448h;
    }

    public final int hashCode() {
        int iA = t61.a.a((this.f10445b.hashCode() + (Float.hashCode(this.f10444a) * 31)) * 31, 31, this.f10446c);
        Clause clause = this.d;
        int iA2 = t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
        Clause clause2 = this.f;
        int iA3 = t61.a.a((iA2 + (clause2 == null ? 0 : clause2.hashCode())) * 31, 31, this.f10447g);
        n0 n0Var = this.f10448h;
        return iA3 + (n0Var != null ? n0Var.hashCode() : 0);
    }

    public o0(float f, b9 color, TextLocalisedClause leftLabel, TextLocalisedClause textLocalisedClause, TextLocalisedClause topLabel, TextLocalisedClause textLocalisedClause2, TextLocalisedClause rightLabel, n0 n0Var) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(leftLabel, "leftLabel");
        Intrinsics.checkNotNullParameter(topLabel, "topLabel");
        Intrinsics.checkNotNullParameter(rightLabel, "rightLabel");
        this.f10444a = f;
        this.f10445b = color;
        this.f10446c = leftLabel;
        this.d = textLocalisedClause;
        this.e = topLabel;
        this.f = textLocalisedClause2;
        this.f10447g = rightLabel;
        this.f10448h = n0Var;
    }
}
