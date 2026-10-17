package zmj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f323564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TextLocalisedClause buttonClause) {
        super(buttonClause, false);
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        this.f323564b = buttonClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f323564b.equals(((l) obj2).f323564b);
    }

    public final int hashCode() {
        return this.f323564b.hashCode();
    }

    @Override // cam.f
    public final Clause k() {
        return this.f323564b;
    }
}
