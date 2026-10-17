package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l7 extends n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f10409c;
    public final float d;
    public final float e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f10410g;

    public l7(float f, float f4, Clause label, float f5, float f6, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f10407a = f;
        this.f10408b = f4;
        this.f10409c = label;
        this.d = f5;
        this.e = f6;
        this.f = clause;
        this.f10410g = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj2;
        return Float.compare(this.f10407a, l7Var.f10407a) == 0 && Float.compare(this.f10408b, l7Var.f10408b) == 0 && Intrinsics.f(this.f10409c, l7Var.f10409c) && Float.compare(this.d, l7Var.d) == 0 && Float.compare(this.e, l7Var.e) == 0 && Intrinsics.f(this.f, l7Var.f) && Intrinsics.f(this.f10410g, l7Var.f10410g);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.e, m72.b.b(this.d, p.a.a(m72.b.b(this.f10408b, Float.hashCode(this.f10407a) * 31, 31), 31, this.f10409c), 31), 31);
        Clause clause = this.f;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f10410g;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
