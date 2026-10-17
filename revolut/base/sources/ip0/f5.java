package ip0;

import com.revolut.core.ui_kit.models.Clause;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f164191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164192b;

    public f5(Clause clause, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f164191a = value;
        this.f164192b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj2;
        return Intrinsics.f(this.f164191a, f5Var.f164191a) && this.f164192b.equals(f5Var.f164192b);
    }

    public final int hashCode() {
        return this.f164192b.hashCode() + (this.f164191a.hashCode() * 31);
    }
}
