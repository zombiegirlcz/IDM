package hn4;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0006\u0010\u0004¨\u0006#"}, d2 = {"Lhn4/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "g", "()Z", "isEligible", "", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "reasons", "Ljo3/a;", "Ljo3/a;", "d", "()Ljo3/a;", "repaymentAmount", "Ljava/lang/String;", "f", "repaymentStrategy", "Lhn4/j;", "e", "Lhn4/j;", "()Lhn4/j;", "repaymentDeferral", "Lhn4/i;", "Lhn4/i;", "()Lhn4/i;", "payoffBreakdown", "journeyType", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("isEligible")
    private final boolean isEligible;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("reasons")
    private final List<String> reasons;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("repaymentAmount")
    private final jo3.a repaymentAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("repaymentStrategy")
    private final String repaymentStrategy;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("repaymentDeferral")
    private final j repaymentDeferral;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("payoffBreakdown")
    private final i payoffBreakdown;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("journeyType")
    private final String journeyType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getJourneyType() {
        return this.journeyType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getPayoffBreakdown() {
        return this.payoffBreakdown;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getReasons() {
        return this.reasons;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getRepaymentAmount() {
        return this.repaymentAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final j getRepaymentDeferral() {
        return this.repaymentDeferral;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.isEligible == aVar.isEligible && Intrinsics.f(this.reasons, aVar.reasons) && Intrinsics.f(this.repaymentAmount, aVar.repaymentAmount) && Intrinsics.f(this.repaymentStrategy, aVar.repaymentStrategy) && Intrinsics.f(this.repaymentDeferral, aVar.repaymentDeferral) && Intrinsics.f(this.payoffBreakdown, aVar.payoffBreakdown) && Intrinsics.f(this.journeyType, aVar.journeyType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getRepaymentStrategy() {
        return this.repaymentStrategy;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isEligible) * 31;
        List<String> list = this.reasons;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        jo3.a aVar = this.repaymentAmount;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.repaymentStrategy;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.repaymentDeferral;
        int iHashCode5 = (iHashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        i iVar = this.payoffBreakdown;
        int iHashCode6 = (iHashCode5 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        String str2 = this.journeyType;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }
}
