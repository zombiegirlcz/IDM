package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f157394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriod f157395b;

    public z(ArrayList availablePeriods, StatementPeriod selectedPeriod) {
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f157394a = availablePeriods;
        this.f157395b = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f157394a.equals(zVar.f157394a) && this.f157395b.equals(zVar.f157395b);
    }

    public final int hashCode() {
        return this.f157395b.hashCode() + (this.f157394a.hashCode() * 31);
    }
}
