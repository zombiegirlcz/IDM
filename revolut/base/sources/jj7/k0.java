package jj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Ljj7/k0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "name", "b", "getPolicyId", "policyId", "Ljj7/i0;", "c", "Ljj7/i0;", "getCancellation", "()Ljj7/i0;", "cancellation", "", "Ljj7/n0;", "d", "Ljava/util/List;", "getExpenses", "()Ljava/util/List;", "expenses", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("policyId")
    @NotNull
    private final String policyId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final i0 cancellation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expenses")
    @NotNull
    private final List<n0> expenses;

    public k0(String name, String policyId, i0 cancellation, ArrayList expenses) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(cancellation, "cancellation");
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        this.name = name;
        this.policyId = policyId;
        this.cancellation = cancellation;
        this.expenses = expenses;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.name, k0Var.name) && Intrinsics.f(this.policyId, k0Var.policyId) && Intrinsics.f(this.cancellation, k0Var.cancellation) && Intrinsics.f(this.expenses, k0Var.expenses);
    }

    public final int hashCode() {
        return this.expenses.hashCode() + ((this.cancellation.hashCode() + p.a.c(this.name.hashCode() * 31, 31, this.policyId)) * 31);
    }
}
