package rs0;

import com.revolut.core.ui_kit.models.Clause;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f256915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256916b;

    public e(Clause label, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f256915a = value;
        this.f256916b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f256915a, eVar.f256915a) && this.f256916b.equals(eVar.f256916b);
    }

    public final int hashCode() {
        return this.f256916b.hashCode() + (this.f256915a.hashCode() * 31);
    }
}
