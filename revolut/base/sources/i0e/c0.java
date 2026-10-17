package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f157359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f157360b;

    public c0(ArrayList availablePeriods, StatementPeriod selectedPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f157359a = availablePeriods;
        this.f157360b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return this.f157359a.equals(c0Var.f157359a) && this.f157360b.equals(c0Var.f157360b);
    }

    public final int hashCode() {
        return this.f157360b.hashCode() + (this.f157359a.hashCode() * 31);
    }
}
