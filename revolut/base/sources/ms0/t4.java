package ms0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f208444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f208445b;

    public t4(Clause value, TextLocalisedClause label) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f208444a = value;
        this.f208445b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        return this.f208444a.equals(t4Var.f208444a) && this.f208445b.equals(t4Var.f208445b);
    }

    public final int hashCode() {
        return this.f208445b.hashCode() + (this.f208444a.hashCode() * 31);
    }
}
