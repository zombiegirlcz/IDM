package wbg;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f296190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f296191b;

    public o0(TextLocalisedClause text, r0 style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f296190a = text;
        this.f296191b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return this.f296190a.equals(o0Var.f296190a) && this.f296191b == o0Var.f296191b;
    }

    public final int hashCode() {
        return this.f296191b.hashCode() + (this.f296190a.hashCode() * 31);
    }
}
