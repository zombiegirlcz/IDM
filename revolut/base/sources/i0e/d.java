package i0e;

import com.revolut.feature.statements.api.models.StatementPeriodType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriodType f157361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f157362b;

    public d(StatementPeriodType currentPeriodType, LinkedHashMap periods) {
        Intrinsics.checkNotNullParameter(currentPeriodType, "currentPeriodType");
        Intrinsics.checkNotNullParameter(periods, "periods");
        this.f157361a = currentPeriodType;
        this.f157362b = periods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f157361a == dVar.f157361a && this.f157362b.equals(dVar.f157362b);
    }

    public final int hashCode() {
        return this.f157362b.hashCode() + (this.f157361a.hashCode() * 31);
    }
}
