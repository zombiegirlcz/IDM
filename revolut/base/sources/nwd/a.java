package nwd;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lnwd/a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "rate", "", "b", "Z", "()Z", "consent", "", "J", "()J", "payoutPeriod", "d", "warmUpPeriod", "feature_staking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    @NotNull
    private final BigDecimal rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("consent")
    private final boolean consent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payoutPeriod")
    private final long payoutPeriod;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("warmUpPeriod")
    private final long warmUpPeriod;

    public a(BigDecimal rate, boolean z, long j2, long j3) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.rate = rate;
        this.consent = z;
        this.payoutPeriod = j2;
        this.warmUpPeriod = j3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getConsent() {
        return this.consent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getPayoutPeriod() {
        return this.payoutPeriod;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getWarmUpPeriod() {
        return this.warmUpPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.rate, aVar.rate) && this.consent == aVar.consent && this.payoutPeriod == aVar.payoutPeriod && this.warmUpPeriod == aVar.warmUpPeriod;
    }

    public final int hashCode() {
        return Long.hashCode(this.warmUpPeriod) + a0.d.c(j6.a.c(this.rate.hashCode() * 31, 31, this.consent), 31, this.payoutPeriod);
    }
}
