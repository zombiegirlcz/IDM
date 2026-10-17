package ot3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lot3/g0;", "Lot3/y;", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "simpleIncomeValidation", "incomeCheckSelection", "feature_credit_application_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g0 extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("simpleIncomeValidation")
    private final Boolean simpleIncomeValidation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("incomeCheckSelection")
    private final Boolean incomeCheckSelection;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getIncomeCheckSelection() {
        return this.incomeCheckSelection;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getSimpleIncomeValidation() {
        return this.simpleIncomeValidation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.simpleIncomeValidation, g0Var.simpleIncomeValidation) && Intrinsics.f(this.incomeCheckSelection, g0Var.incomeCheckSelection);
    }

    public final int hashCode() {
        Boolean bool = this.simpleIncomeValidation;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.incomeCheckSelection;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }
}
