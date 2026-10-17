package xzd;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f309930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CustomisationSelection f309931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementPeriod f309932c;
    public final boolean d;

    public k(Data customisationState, CustomisationSelection customisationSelection, StatementPeriod statementPeriod, boolean z) {
        Intrinsics.checkNotNullParameter(customisationState, "customisationState");
        Intrinsics.checkNotNullParameter(customisationSelection, "customisationSelection");
        this.f309930a = customisationState;
        this.f309931b = customisationSelection;
        this.f309932c = statementPeriod;
        this.d = z;
    }

    public static k a(k kVar, Data customisationState, CustomisationSelection customisationSelection, StatementPeriod statementPeriod, boolean z, int i) {
        if ((i & 1) != 0) {
            customisationState = kVar.f309930a;
        }
        if ((i & 2) != 0) {
            customisationSelection = kVar.f309931b;
        }
        if ((i & 4) != 0) {
            statementPeriod = kVar.f309932c;
        }
        if ((i & 8) != 0) {
            z = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(customisationState, "customisationState");
        Intrinsics.checkNotNullParameter(customisationSelection, "customisationSelection");
        return new k(customisationState, customisationSelection, statementPeriod, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f309930a, kVar.f309930a) && Intrinsics.f(this.f309931b, kVar.f309931b) && Intrinsics.f(this.f309932c, kVar.f309932c) && this.d == kVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f309931b.hashCode() + (this.f309930a.hashCode() * 31)) * 31;
        StatementPeriod statementPeriod = this.f309932c;
        return Boolean.hashCode(this.d) + ((iHashCode + (statementPeriod == null ? 0 : statementPeriod.hashCode())) * 31);
    }
}
