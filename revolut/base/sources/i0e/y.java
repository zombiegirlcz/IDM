package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriod f157393a;

    public y(StatementPeriod availablePeriod) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        this.f157393a = availablePeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f157393a, ((y) obj2).f157393a);
    }

    public final int hashCode() {
        return this.f157393a.hashCode();
    }
}
