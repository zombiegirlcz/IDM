package au0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.ImageClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f9419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageClause f9420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f9421c;

    public x0(Clause leftText, ImageClause icon, Clause rightText) {
        Intrinsics.checkNotNullParameter(leftText, "leftText");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(rightText, "rightText");
        this.f9419a = leftText;
        this.f9420b = icon;
        this.f9421c = rightText;
    }

    @Override // au0.a1
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f9419a, x0Var.f9419a) && Intrinsics.f(this.f9420b, x0Var.f9420b) && Intrinsics.f(this.f9421c, x0Var.f9421c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + p.a.a((this.f9420b.hashCode() + (this.f9419a.hashCode() * 31)) * 31, 31, this.f9421c);
    }
}
