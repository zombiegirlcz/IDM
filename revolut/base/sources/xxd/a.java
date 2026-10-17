package xxd;

import aii.r;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StatementPeriodSelection f309507a;

    public a(StatementPeriodSelection selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f309507a = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f309507a, ((a) obj2).f309507a);
    }

    public final int hashCode() {
        return this.f309507a.hashCode();
    }
}
