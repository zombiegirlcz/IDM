package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n4 extends cd.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f165457c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Clause subtitleClause, boolean z) {
        super(subtitleClause, R$attr.internal_textAppearanceBody1);
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        this.f165457c = subtitleClause;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj2;
        return Intrinsics.f(this.f165457c, n4Var.f165457c) && this.d == n4Var.d;
    }

    @Override // cd.e
    public final boolean f() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.f165457c.hashCode() * 31);
    }
}
