package gzf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001c\u0010%\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010+\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u0006\u001a\u0004\b-\u0010\u0004R\u001a\u00102\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b\u000f\u00101R\u001c\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u00107\u001a\u0004\u0018\u0001048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b\u0005\u00106R\u001c\u0010;\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\b\t\u0010:R\"\u0010>\u001a\n\u0012\u0004\u0012\u00020<\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b=\u0010\u001dR\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b,\u0010\u0004R\u001c\u0010C\u001a\u0004\u0018\u00010@8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010A\u001a\u0004\b'\u0010B¨\u0006D"}, d2 = {"Lgzf/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "id", "b", "n", "status", "c", "e", "createdDate", "d", "f", "date", "p", "time", "Lqzf/k;", "Lqzf/k;", "g", "()Lqzf/k;", "experience", "", "Lg0g/a;", "Ljava/util/List;", "r", "()Ljava/util/List;", "visitors", "h", "failureReason", "Lgzf/a;", "Lgzf/a;", "o", "()Lgzf/a;", "ticket", "Lzzf/b;", "j", "Lzzf/b;", "l", "()Lzzf/b;", "pricing", "k", "m", "rewardType", "Lkzf/a;", "Lkzf/a;", "()Lkzf/a;", "cashback", "cancellationToken", "Lqzf/g;", "Lqzf/g;", "()Lqzf/g;", "cancellationPolicy", "Lizf/b;", "Lizf/b;", "()Lizf/b;", "cancellationRefund", "Lgzf/i;", "q", "transactions", "pointsReward", "Lvzf/a;", "Lvzf/a;", "()Lvzf/a;", "pointsOption", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final String createdDate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("time")
    private final String time;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("experience")
    @NotNull
    private final qzf.k experience;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("visitors")
    private final List<g0g.a> visitors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("failureReason")
    private final String failureReason;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("ticket")
    private final a ticket;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricing")
    @NotNull
    private final zzf.b pricing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("rewardType")
    private final String rewardType;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashback")
    @NotNull
    private final kzf.a cashback;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationToken")
    private final String cancellationToken;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("cancellationPolicy")
    private final qzf.g cancellationPolicy;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("cancellationRefund")
    private final izf.b cancellationRefund;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("transactions")
    private final List<i> transactions;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsReward")
    private final String pointsReward;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsOption")
    private final vzf.a pointsOption;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final qzf.g getCancellationPolicy() {
        return this.cancellationPolicy;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final izf.b getCancellationRefund() {
        return this.cancellationRefund;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getCancellationToken() {
        return this.cancellationToken;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final kzf.a getCashback() {
        return this.cashback;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.status, dVar.status) && Intrinsics.f(this.createdDate, dVar.createdDate) && Intrinsics.f(this.date, dVar.date) && Intrinsics.f(this.time, dVar.time) && Intrinsics.f(this.experience, dVar.experience) && Intrinsics.f(this.visitors, dVar.visitors) && Intrinsics.f(this.failureReason, dVar.failureReason) && Intrinsics.f(this.ticket, dVar.ticket) && Intrinsics.f(this.pricing, dVar.pricing) && Intrinsics.f(this.rewardType, dVar.rewardType) && Intrinsics.f(this.cashback, dVar.cashback) && Intrinsics.f(this.cancellationToken, dVar.cancellationToken) && Intrinsics.f(this.cancellationPolicy, dVar.cancellationPolicy) && Intrinsics.f(this.cancellationRefund, dVar.cancellationRefund) && Intrinsics.f(this.transactions, dVar.transactions) && Intrinsics.f(this.pointsReward, dVar.pointsReward) && Intrinsics.f(this.pointsOption, dVar.pointsOption);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final qzf.k getExperience() {
        return this.experience;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.status), 31, this.createdDate), 31, this.date);
        String str = this.time;
        int iHashCode = (this.experience.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        List<g0g.a> list = this.visitors;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.failureReason;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.ticket;
        int iHashCode4 = (this.pricing.hashCode() + ((iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        String str3 = this.rewardType;
        int iHashCode5 = (this.cashback.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.cancellationToken;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        qzf.g gVar = this.cancellationPolicy;
        int iHashCode7 = (iHashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        izf.b bVar = this.cancellationRefund;
        int iHashCode8 = (iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List<i> list2 = this.transactions;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.pointsReward;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        vzf.a aVar2 = this.pointsOption;
        return iHashCode10 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final vzf.a getPointsOption() {
        return this.pointsOption;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getPointsReward() {
        return this.pointsReward;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final zzf.b getPricing() {
        return this.pricing;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final a getTicket() {
        return this.ticket;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getTransactions() {
        return this.transactions;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final List getVisitors() {
        return this.visitors;
    }
}
