package nwd;

import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001a\u0010\u001c\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\f\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001e"}, d2 = {"Lnwd/c;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "g", "()Ljava/math/BigDecimal;", "rate", "", "b", "J", "()J", "lockupPeriod", "c", "f", "payoutPeriod", "d", "h", "warmUpPeriod", "Ljo3/a;", "e", "Ljo3/a;", "()Ljo3/a;", "minimumStakingAmount", "minimumTopupAmount", "maximumStakingAmount", "minimumWithdrawAmount", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final BigDecimal rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("lockupPeriod")
    private final long lockupPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payoutPeriod")
    private final long payoutPeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("warmUpPeriod")
    private final long warmUpPeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minimumStakingAmount")
    @NotNull
    private final jo3.a minimumStakingAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("minimumTopupAmount")
    @NotNull
    private final jo3.a minimumTopupAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximumStakingAmount")
    @NotNull
    private final jo3.a maximumStakingAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimumWithdrawAmount")
    @NotNull
    private final jo3.a minimumWithdrawAmount;

    public c(BigDecimal rate, long j2, long j3, long j5, jo3.a minimumStakingAmount, jo3.a minimumTopupAmount, jo3.a maximumStakingAmount, jo3.a minimumWithdrawAmount) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(minimumStakingAmount, "minimumStakingAmount");
        Intrinsics.checkNotNullParameter(minimumTopupAmount, "minimumTopupAmount");
        Intrinsics.checkNotNullParameter(maximumStakingAmount, "maximumStakingAmount");
        Intrinsics.checkNotNullParameter(minimumWithdrawAmount, "minimumWithdrawAmount");
        this.rate = rate;
        this.lockupPeriod = j2;
        this.payoutPeriod = j3;
        this.warmUpPeriod = j5;
        this.minimumStakingAmount = minimumStakingAmount;
        this.minimumTopupAmount = minimumTopupAmount;
        this.maximumStakingAmount = maximumStakingAmount;
        this.minimumWithdrawAmount = minimumWithdrawAmount;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getLockupPeriod() {
        return this.lockupPeriod;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMaximumStakingAmount() {
        return this.maximumStakingAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getMinimumStakingAmount() {
        return this.minimumStakingAmount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getMinimumTopupAmount() {
        return this.minimumTopupAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getMinimumWithdrawAmount() {
        return this.minimumWithdrawAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.rate, cVar.rate) && this.lockupPeriod == cVar.lockupPeriod && this.payoutPeriod == cVar.payoutPeriod && this.warmUpPeriod == cVar.warmUpPeriod && Intrinsics.f(this.minimumStakingAmount, cVar.minimumStakingAmount) && Intrinsics.f(this.minimumTopupAmount, cVar.minimumTopupAmount) && Intrinsics.f(this.maximumStakingAmount, cVar.maximumStakingAmount) && Intrinsics.f(this.minimumWithdrawAmount, cVar.minimumWithdrawAmount);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getPayoutPeriod() {
        return this.payoutPeriod;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getWarmUpPeriod() {
        return this.warmUpPeriod;
    }

    public final int hashCode() {
        return this.minimumWithdrawAmount.hashCode() + v7.j(this.maximumStakingAmount, v7.j(this.minimumTopupAmount, v7.j(this.minimumStakingAmount, a0.d.c(a0.d.c(a0.d.c(this.rate.hashCode() * 31, 31, this.lockupPeriod), 31, this.payoutPeriod), 31, this.warmUpPeriod), 31), 31), 31);
    }
}
