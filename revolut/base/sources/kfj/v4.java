package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0006\u0010\rR\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u0010\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001a\u0010\u0017\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0012\u0010\t¨\u0006\u0018"}, d2 = {"Lkfj/v4;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "e", "()J", "spendBalanceBytes", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "currentBalanceBytes", "c", "g", "spendBalanceVoiceSeconds", "d", "currentBalanceVoiceSeconds", "f", "spendBalanceSmsCount", "currentBalanceSmsCount", "date", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("spendBalanceBytes")
    private final long spendBalanceBytes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currentBalanceBytes")
    private final Long currentBalanceBytes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("spendBalanceVoiceSeconds")
    private final long spendBalanceVoiceSeconds;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currentBalanceVoiceSeconds")
    private final Long currentBalanceVoiceSeconds;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("spendBalanceSmsCount")
    private final long spendBalanceSmsCount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("currentBalanceSmsCount")
    private final Long currentBalanceSmsCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("date")
    private final long date;

    public v4(long j2, Long l2, long j3, Long l3, long j5, Long l4, long j16) {
        this.spendBalanceBytes = j2;
        this.currentBalanceBytes = l2;
        this.spendBalanceVoiceSeconds = j3;
        this.currentBalanceVoiceSeconds = l3;
        this.spendBalanceSmsCount = j5;
        this.currentBalanceSmsCount = l4;
        this.date = j16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getCurrentBalanceBytes() {
        return this.currentBalanceBytes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getCurrentBalanceSmsCount() {
        return this.currentBalanceSmsCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCurrentBalanceVoiceSeconds() {
        return this.currentBalanceVoiceSeconds;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSpendBalanceBytes() {
        return this.spendBalanceBytes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj2;
        return this.spendBalanceBytes == v4Var.spendBalanceBytes && Intrinsics.f(this.currentBalanceBytes, v4Var.currentBalanceBytes) && this.spendBalanceVoiceSeconds == v4Var.spendBalanceVoiceSeconds && Intrinsics.f(this.currentBalanceVoiceSeconds, v4Var.currentBalanceVoiceSeconds) && this.spendBalanceSmsCount == v4Var.spendBalanceSmsCount && Intrinsics.f(this.currentBalanceSmsCount, v4Var.currentBalanceSmsCount) && this.date == v4Var.date;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getSpendBalanceSmsCount() {
        return this.spendBalanceSmsCount;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getSpendBalanceVoiceSeconds() {
        return this.spendBalanceVoiceSeconds;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.spendBalanceBytes) * 31;
        Long l2 = this.currentBalanceBytes;
        int iC = a0.d.c((iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.spendBalanceVoiceSeconds);
        Long l3 = this.currentBalanceVoiceSeconds;
        int iC2 = a0.d.c((iC + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.spendBalanceSmsCount);
        Long l4 = this.currentBalanceSmsCount;
        return Long.hashCode(this.date) + ((iC2 + (l4 != null ? l4.hashCode() : 0)) * 31);
    }
}
