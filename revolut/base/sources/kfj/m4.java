package kfj;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\n\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006\""}, d2 = {"Lkfj/m4;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "strategy", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "amount", "c", "g", "token", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "expirationDate", "e", "cancellationDate", "points", "Lkfj/l4;", "Lkfj/l4;", "()Lkfj/l4;", "breakdown", "", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isFullRefund", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("strategy")
    @NotNull
    private final String strategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("token")
    private final String token;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expirationDate")
    private final Long expirationDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cancellationDate")
    private final Long cancellationDate;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final String points;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("breakdown")
    private final l4 breakdown;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("isFullRefund")
    private final Boolean isFullRefund;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l4 getBreakdown() {
        return this.breakdown;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCancellationDate() {
        return this.cancellationDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPoints() {
        return this.points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m4)) {
            return false;
        }
        m4 m4Var = (m4) obj2;
        return Intrinsics.f(this.strategy, m4Var.strategy) && Intrinsics.f(this.amount, m4Var.amount) && Intrinsics.f(this.token, m4Var.token) && Intrinsics.f(this.expirationDate, m4Var.expirationDate) && Intrinsics.f(this.cancellationDate, m4Var.cancellationDate) && Intrinsics.f(this.points, m4Var.points) && Intrinsics.f(this.breakdown, m4Var.breakdown) && Intrinsics.f(this.isFullRefund, m4Var.isFullRefund);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStrategy() {
        return this.strategy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getIsFullRefund() {
        return this.isFullRefund;
    }

    public final int hashCode() {
        int iJ = v7.j(this.amount, this.strategy.hashCode() * 31, 31);
        String str = this.token;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.expirationDate;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.cancellationDate;
        int iC = p.a.c((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.points);
        l4 l4Var = this.breakdown;
        int iHashCode3 = (iC + (l4Var == null ? 0 : l4Var.hashCode())) * 31;
        Boolean bool = this.isFullRefund;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }
}
