package kn4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0010\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\r\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\n\u0010\u0004¨\u0006\u0019"}, d2 = {"Lkn4/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "()J", "cap", "b", "g", "stepAmount", "c", "f", "minCap", "d", "e", "midCap", "maxCap", "Ljava/lang/Long;", "()Ljava/lang/Long;", "maxAdditionalCardholderLimit", "Ljava/lang/String;", "currency", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("cap")
    private final long cap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("stepAmount")
    private final long stepAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minCap")
    private final long minCap;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("midCap")
    private final long midCap;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("maxCap")
    private final long maxCap;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("maxAdditionalCardholderLimit")
    private final Long maxAdditionalCardholderLimit;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getMaxAdditionalCardholderLimit() {
        return this.maxAdditionalCardholderLimit;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMaxCap() {
        return this.maxCap;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getMidCap() {
        return this.midCap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.cap == aVar.cap && this.stepAmount == aVar.stepAmount && this.minCap == aVar.minCap && this.midCap == aVar.midCap && this.maxCap == aVar.maxCap && Intrinsics.f(this.maxAdditionalCardholderLimit, aVar.maxAdditionalCardholderLimit) && Intrinsics.f(this.currency, aVar.currency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getMinCap() {
        return this.minCap;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getStepAmount() {
        return this.stepAmount;
    }

    public final int hashCode() {
        int iC = a0.d.c(a0.d.c(a0.d.c(a0.d.c(Long.hashCode(this.cap) * 31, 31, this.stepAmount), 31, this.minCap), 31, this.midCap), 31, this.maxCap);
        Long l2 = this.maxAdditionalCardholderLimit;
        return this.currency.hashCode() + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
