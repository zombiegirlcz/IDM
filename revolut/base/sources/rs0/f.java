package rs0;

import com.revolut.core.ui_kit.models.Clause;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f256917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f256918b;

    public f(Clause clause, BigDecimal value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f256917a = value;
        this.f256918b = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f256917a, fVar.f256917a) && this.f256918b.equals(fVar.f256918b);
    }

    public final int hashCode() {
        return this.f256918b.hashCode() + (this.f256917a.hashCode() * 31);
    }
}
