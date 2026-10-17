package ip0;

import com.revolut.core.ui_kit.models.Clause;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f164021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164022b;

    public e5(Clause label, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f164021a = value;
        this.f164022b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj2;
        return Intrinsics.f(this.f164021a, e5Var.f164021a) && this.f164022b.equals(e5Var.f164022b);
    }

    public final int hashCode() {
        return this.f164022b.hashCode() + (this.f164021a.hashCode() * 31);
    }
}
