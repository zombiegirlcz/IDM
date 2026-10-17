package i55;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000b\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0006\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0007\u001a\u0004\b!\u0010\tR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0014\u001a\u0004\b$\u0010\u0016R\"\u0010'\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b\u0010\u0010\u0016¨\u0006("}, d2 = {"Li55/b0;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "initialAmount", "b", "J", "f", "()J", "minAmount", "c", "e", "maxAmount", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "partialRepaymentTypes", "allowedPocketTypes", "", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "requireSameCurrency", "allowJointAccountPockets", "k", "zeroBreakageFeeAmount", "i", "strategySelectionThreshold", "Li55/i0;", "j", "suggestions", "Li55/a;", "excludedAmountRanges", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("initialAmount")
    private final Long initialAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minAmount")
    private final long minAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxAmount")
    private final long maxAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("supportedPartialRepaymentStrategies")
    private final List<String> partialRepaymentTypes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("allowedPocketTypes")
    private final List<String> allowedPocketTypes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("requireSameCurrency")
    private final Boolean requireSameCurrency;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("allowJointAccountPockets")
    private final Boolean allowJointAccountPockets;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("zeroBreakageFeeAmount")
    private final Long zeroBreakageFeeAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("strategySelectionThreshold")
    private final Long strategySelectionThreshold;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("suggestions")
    private final List<i0> suggestions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("excludedAmountRanges")
    private final List<a> excludedAmountRanges;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getAllowJointAccountPockets() {
        return this.allowJointAccountPockets;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getAllowedPocketTypes() {
        return this.allowedPocketTypes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getExcludedAmountRanges() {
        return this.excludedAmountRanges;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getInitialAmount() {
        return this.initialAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getMaxAmount() {
        return this.maxAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.initialAmount, b0Var.initialAmount) && this.minAmount == b0Var.minAmount && this.maxAmount == b0Var.maxAmount && Intrinsics.f(this.partialRepaymentTypes, b0Var.partialRepaymentTypes) && Intrinsics.f(this.allowedPocketTypes, b0Var.allowedPocketTypes) && Intrinsics.f(this.requireSameCurrency, b0Var.requireSameCurrency) && Intrinsics.f(this.allowJointAccountPockets, b0Var.allowJointAccountPockets) && Intrinsics.f(this.zeroBreakageFeeAmount, b0Var.zeroBreakageFeeAmount) && Intrinsics.f(this.strategySelectionThreshold, b0Var.strategySelectionThreshold) && Intrinsics.f(this.suggestions, b0Var.suggestions) && Intrinsics.f(this.excludedAmountRanges, b0Var.excludedAmountRanges);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getMinAmount() {
        return this.minAmount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getPartialRepaymentTypes() {
        return this.partialRepaymentTypes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getRequireSameCurrency() {
        return this.requireSameCurrency;
    }

    public final int hashCode() {
        Long l2 = this.initialAmount;
        int iC = a0.d.c(a0.d.c((l2 == null ? 0 : l2.hashCode()) * 31, 31, this.minAmount), 31, this.maxAmount);
        List<String> list = this.partialRepaymentTypes;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.allowedPocketTypes;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.requireSameCurrency;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.allowJointAccountPockets;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l3 = this.zeroBreakageFeeAmount;
        int iHashCode5 = (iHashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.strategySelectionThreshold;
        int iHashCode6 = (iHashCode5 + (l4 == null ? 0 : l4.hashCode())) * 31;
        List<i0> list3 = this.suggestions;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<a> list4 = this.excludedAmountRanges;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Long getStrategySelectionThreshold() {
        return this.strategySelectionThreshold;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final List getSuggestions() {
        return this.suggestions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getZeroBreakageFeeAmount() {
        return this.zeroBreakageFeeAmount;
    }
}
