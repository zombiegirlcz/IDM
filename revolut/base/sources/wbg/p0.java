package wbg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f296193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f296194b;

    public p0(TextLocalisedClause text, r0 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f296193a = text;
        this.f296194b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return this.f296193a.equals(p0Var.f296193a) && this.f296194b == p0Var.f296194b;
    }

    public final int hashCode() {
        return this.f296194b.hashCode() + (this.f296193a.hashCode() * 31);
    }
}
