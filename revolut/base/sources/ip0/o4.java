package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o4 extends cd.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f165620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(Clause subtitleClause) {
        super(subtitleClause, R$attr.internal_textAppearanceBody3);
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        this.f165620c = subtitleClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o4) && this.f165620c.equals(((o4) obj2).f165620c);
    }

    @Override // cd.e
    public final boolean f() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f165620c.hashCode() * 31);
    }
}
