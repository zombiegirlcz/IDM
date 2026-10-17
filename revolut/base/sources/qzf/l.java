package qzf;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001e"}, d2 = {"Lqzf/l;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "h", "()Ljo3/a;", "refund", "b", "c", "monetaryRefund", "Lqzf/a;", "Lqzf/a;", "f", "()Lqzf/a;", "pointsRefund", "d", "penalty", "e", "monetaryPenalty", "pointsPenalty", "g", "cashbackReversal", "", "D", "()D", "pointsRewardReversal", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("refund")
    @NotNull
    private final jo3.a refund;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("monetaryRefund")
    @NotNull
    private final jo3.a monetaryRefund;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRefund")
    @NotNull
    private final a pointsRefund;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("penalty")
    @NotNull
    private final jo3.a penalty;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("monetaryPenalty")
    @NotNull
    private final jo3.a monetaryPenalty;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pointsPenalty")
    @NotNull
    private final a pointsPenalty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cashbackReversal")
    @NotNull
    private final jo3.a cashbackReversal;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("pointsRewardReversal")
    private final double pointsRewardReversal;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getCashbackReversal() {
        return this.cashbackReversal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMonetaryPenalty() {
        return this.monetaryPenalty;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getMonetaryRefund() {
        return this.monetaryRefund;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPenalty() {
        return this.penalty;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getPointsPenalty() {
        return this.pointsPenalty;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.refund, lVar.refund) && Intrinsics.f(this.monetaryRefund, lVar.monetaryRefund) && Intrinsics.f(this.pointsRefund, lVar.pointsRefund) && Intrinsics.f(this.penalty, lVar.penalty) && Intrinsics.f(this.monetaryPenalty, lVar.monetaryPenalty) && Intrinsics.f(this.pointsPenalty, lVar.pointsPenalty) && Intrinsics.f(this.cashbackReversal, lVar.cashbackReversal) && Double.compare(this.pointsRewardReversal, lVar.pointsRewardReversal) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getPointsRefund() {
        return this.pointsRefund;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getPointsRewardReversal() {
        return this.pointsRewardReversal;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getRefund() {
        return this.refund;
    }

    public final int hashCode() {
        return Double.hashCode(this.pointsRewardReversal) + v7.j(this.cashbackReversal, (this.pointsPenalty.hashCode() + v7.j(this.monetaryPenalty, v7.j(this.penalty, (this.pointsRefund.hashCode() + v7.j(this.monetaryRefund, this.refund.hashCode() * 31, 31)) * 31, 31), 31)) * 31, 31);
    }
}
