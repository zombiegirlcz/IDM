package aw0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4 f10232c;

    public a5(float f, Clause clause, z4 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f10230a = f;
        this.f10231b = clause;
        this.f10232c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj2;
        return Float.compare(this.f10230a, a5Var.f10230a) == 0 && Intrinsics.f(this.f10231b, a5Var.f10231b) && this.f10232c == a5Var.f10232c;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f10230a) * 31;
        Clause clause = this.f10231b;
        return this.f10232c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    public /* synthetic */ a5(float f, Clause clause) {
        this(f, clause, z4.TRANSPARENT);
    }
}
