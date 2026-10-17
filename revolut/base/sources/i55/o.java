package i55;

import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001f"}, d2 = {"Li55/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "h", "state", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "repaymentDate", "Ljava/time/LocalDateTime;", "d", "Ljava/time/LocalDateTime;", "()Ljava/time/LocalDateTime;", "actualRepaymentTime", "estimatedCollectionDate", "f", "currency", "", "J", "()J", "amount", "principal", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentDate")
    @NotNull
    private final LocalDate repaymentDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("actualRepaymentTime")
    private final LocalDateTime actualRepaymentTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("estimatedCollectionDate")
    private final LocalDate estimatedCollectionDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final long amount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("principal")
    private final long principal;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDateTime getActualRepaymentTime() {
        return this.actualRepaymentTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getEstimatedCollectionDate() {
        return this.estimatedCollectionDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.id, oVar.id) && Intrinsics.f(this.state, oVar.state) && Intrinsics.f(this.repaymentDate, oVar.repaymentDate) && Intrinsics.f(this.actualRepaymentTime, oVar.actualRepaymentTime) && Intrinsics.f(this.estimatedCollectionDate, oVar.estimatedCollectionDate) && Intrinsics.f(this.currency, oVar.currency) && this.amount == oVar.amount && this.principal == oVar.principal;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getPrincipal() {
        return this.principal;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getRepaymentDate() {
        return this.repaymentDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.state;
        int iA = wp5.y.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.repaymentDate);
        LocalDateTime localDateTime = this.actualRepaymentTime;
        int iHashCode2 = (iA + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDate localDate = this.estimatedCollectionDate;
        return Long.hashCode(this.principal) + a0.d.c(p.a.c((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.currency), 31, this.amount);
    }
}
