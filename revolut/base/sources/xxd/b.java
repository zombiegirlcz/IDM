package xxd;

import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriod f309508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StatementPeriodSelection f309509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementPeriodSelection f309510c;

    public b(StatementPeriod availablePeriod, StatementPeriodSelection appliedSelection, StatementPeriodSelection draftSelection) {
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(appliedSelection, "appliedSelection");
        Intrinsics.checkNotNullParameter(draftSelection, "draftSelection");
        this.f309508a = availablePeriod;
        this.f309509b = appliedSelection;
        this.f309510c = draftSelection;
    }

    public static b a(b bVar, StatementPeriodSelection appliedSelection, StatementPeriodSelection draftSelection, int i) {
        StatementPeriod availablePeriod = bVar.f309508a;
        if ((i & 2) != 0) {
            appliedSelection = bVar.f309509b;
        }
        if ((i & 4) != 0) {
            draftSelection = bVar.f309510c;
        }
        Intrinsics.checkNotNullParameter(availablePeriod, "availablePeriod");
        Intrinsics.checkNotNullParameter(appliedSelection, "appliedSelection");
        Intrinsics.checkNotNullParameter(draftSelection, "draftSelection");
        return new b(availablePeriod, appliedSelection, draftSelection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f309508a, bVar.f309508a) && Intrinsics.f(this.f309509b, bVar.f309509b) && Intrinsics.f(this.f309510c, bVar.f309510c);
    }

    public final int hashCode() {
        return this.f309510c.hashCode() + ((this.f309509b.hashCode() + (this.f309508a.hashCode() * 31)) * 31);
    }
}
