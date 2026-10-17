package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f209802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f209803b;

    public l7(Clause value, TextLocalisedClause label) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f209802a = label;
        this.f209803b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l7)) {
            return false;
        }
        l7 l7Var = (l7) obj2;
        return this.f209802a.equals(l7Var.f209802a) && Intrinsics.f(this.f209803b, l7Var.f209803b);
    }

    public final int hashCode() {
        return this.f209803b.hashCode() + (this.f209802a.hashCode() * 31);
    }
}
