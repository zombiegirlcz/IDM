package aj7;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0004R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0006\u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017¨\u0006%"}, d2 = {"Laj7/e;", "", "", "toString", "()Ljava/lang/String;", "Laj7/m;", "a", "Laj7/m;", "b", "()Laj7/m;", "claimIds", "", "J", "d", "()J", "createdDate", "c", "Ljava/lang/String;", "claimName", "", "Laj7/n;", "Ljava/util/List;", "g", "()Ljava/util/List;", "statusHistory", "Laj7/i;", "e", "Laj7/i;", "()Laj7/i;", "expenseSummary", "Laj7/b;", "f", "Laj7/b;", "()Laj7/b;", "cancellation", "Laj7/k;", "expenses", "feature_insurance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ids")
    @NotNull
    private final m claimIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    private final long createdDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    private final String claimName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("statusHistory")
    @NotNull
    private final List<n> statusHistory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("summary")
    @NotNull
    private final i expenseSummary;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cancellation")
    @NotNull
    private final b cancellation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("expenses")
    @NotNull
    private final List<k> expenses;

    public e(m claimIds, long j2, String str, ArrayList statusHistory, i expenseSummary, b cancellation, ArrayList expenses) {
        Intrinsics.checkNotNullParameter(claimIds, "claimIds");
        Intrinsics.checkNotNullParameter(statusHistory, "statusHistory");
        Intrinsics.checkNotNullParameter(expenseSummary, "expenseSummary");
        Intrinsics.checkNotNullParameter(cancellation, "cancellation");
        Intrinsics.checkNotNullParameter(expenses, "expenses");
        this.claimIds = claimIds;
        this.createdDate = j2;
        this.claimName = str;
        this.statusHistory = statusHistory;
        this.expenseSummary = expenseSummary;
        this.cancellation = cancellation;
        this.expenses = expenses;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getCancellation() {
        return this.cancellation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getClaimIds() {
        return this.claimIds;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getClaimName() {
        return this.claimName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getCreatedDate() {
        return this.createdDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final i getExpenseSummary() {
        return this.expenseSummary;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.claimIds, eVar.claimIds) && this.createdDate == eVar.createdDate && Intrinsics.f(this.claimName, eVar.claimName) && Intrinsics.f(this.statusHistory, eVar.statusHistory) && Intrinsics.f(this.expenseSummary, eVar.expenseSummary) && Intrinsics.f(this.cancellation, eVar.cancellation) && Intrinsics.f(this.expenses, eVar.expenses);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getExpenses() {
        return this.expenses;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getStatusHistory() {
        return this.statusHistory;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.claimIds.hashCode() * 31, 31, this.createdDate);
        String str = this.claimName;
        return this.expenses.hashCode() + ((this.cancellation.hashCode() + ((this.expenseSummary.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.statusHistory)) * 31)) * 31);
    }
}
