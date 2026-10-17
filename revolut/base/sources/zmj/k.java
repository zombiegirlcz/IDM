package zmj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends cam.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f323562b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TextLocalisedClause buttonClause) {
        super(buttonClause, false);
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        this.f323562b = buttonClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f323562b.equals(((k) obj2).f323562b);
    }

    public final int hashCode() {
        return this.f323562b.hashCode();
    }

    @Override // cam.f
    public final Clause k() {
        return this.f323562b;
    }
}
