package yn4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u001a"}, d2 = {"Lyn4/q;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "interestRate", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "currentCycleDueDate", "c", "lastInstalmentOldDueDate", "Ljo3/a;", "d", "Ljo3/a;", "()Ljo3/a;", "ongoingStatementBalance", "", "Lyn4/p;", "e", "Ljava/util/List;", "()Ljava/util/List;", "quotes", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestRate")
    @NotNull
    private final String interestRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentCycleDueDate")
    @NotNull
    private final LocalDate currentCycleDueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastInstalmentOldDueDate")
    @NotNull
    private final LocalDate lastInstalmentOldDueDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ongoingStatementBalance")
    @NotNull
    private final jo3.a ongoingStatementBalance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quotes")
    @NotNull
    private final List<p> quotes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getCurrentCycleDueDate() {
        return this.currentCycleDueDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getLastInstalmentOldDueDate() {
        return this.lastInstalmentOldDueDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getOngoingStatementBalance() {
        return this.ongoingStatementBalance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getQuotes() {
        return this.quotes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.interestRate, qVar.interestRate) && Intrinsics.f(this.currentCycleDueDate, qVar.currentCycleDueDate) && Intrinsics.f(this.lastInstalmentOldDueDate, qVar.lastInstalmentOldDueDate) && Intrinsics.f(this.ongoingStatementBalance, qVar.ongoingStatementBalance) && Intrinsics.f(this.quotes, qVar.quotes);
    }

    public final int hashCode() {
        return this.quotes.hashCode() + v7.j(this.ongoingStatementBalance, wp5.y.a(wp5.y.a(this.interestRate.hashCode() * 31, 31, this.currentCycleDueDate), 31, this.lastInstalmentOldDueDate), 31);
    }
}
