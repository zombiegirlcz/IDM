package vxb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\rR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lvxb/f0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/b;", "a", "Ljo3/b;", "b", "()Ljo3/b;", "monthlySpent", "", "I", "()I", "miles", "", "Lvxb/e0;", "c", "Ljava/util/List;", "()Ljava/util/List;", "savings", "feature_rev_points_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("monthlySpent")
    @NotNull
    private final jo3.b monthlySpent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("miles")
    private final int miles;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("savings")
    @NotNull
    private final List<e0> savings;

    public f0(jo3.b monthlySpent, int i, ArrayList savings) {
        Intrinsics.checkNotNullParameter(monthlySpent, "monthlySpent");
        Intrinsics.checkNotNullParameter(savings, "savings");
        this.monthlySpent = monthlySpent;
        this.miles = i;
        this.savings = savings;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMiles() {
        return this.miles;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getMonthlySpent() {
        return this.monthlySpent;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getSavings() {
        return this.savings;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.monthlySpent, f0Var.monthlySpent) && this.miles == f0Var.miles && Intrinsics.f(this.savings, f0Var.savings);
    }

    public final int hashCode() {
        return this.savings.hashCode() + j6.a.b(this.miles, this.monthlySpent.hashCode() * 31, 31);
    }
}
