package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10564c;
    public final int d;

    public u6(float f, TextClause textClause, int i) {
        textClause = (i & 2) != 0 ? null : textClause;
        int i2 = R$attr.uikit_colorGreyTone50;
        this.f10562a = f;
        this.f10563b = textClause;
        this.f10564c = i2;
        this.d = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj2;
        return Float.compare(this.f10562a, u6Var.f10562a) == 0 && Intrinsics.f(this.f10563b, u6Var.f10563b) && this.f10564c == u6Var.f10564c && this.d == u6Var.d;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f10562a) * 31;
        Clause clause = this.f10563b;
        return Integer.hashCode(this.d) + j6.a.b(this.f10564c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
