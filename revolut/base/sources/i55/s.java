package i55;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u001a"}, d2 = {"Li55/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "mode", "b", "d", "interestRate", "Li55/s$a;", "c", "Li55/s$a;", "()Li55/s$a;", "baseRate", "e", "margin", "apr", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "g", "()Ljava/time/LocalDate;", "nextScheduleRegeneration", "fixedRatePeriodType", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("mode")
    @NotNull
    private final String mode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("interestRate")
    @NotNull
    private final String interestRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseRate")
    private final a baseRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("margin")
    private final String margin;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("apr")
    private final String apr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("nextScheduleRegeneration")
    private final LocalDate nextScheduleRegeneration;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("fixedRatePeriodType")
    private final String fixedRatePeriodType;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"Li55/s$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "id", "Ljava/time/LocalDate;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "effectiveDate", "c", "rate", "d", "rateType", "feature_credit_loan_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("id")
        @NotNull
        private final String id;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("effectiveDate")
        @NotNull
        private final LocalDate effectiveDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("rate")
        @NotNull
        private final String rate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("rateType")
        @NotNull
        private final String rateType;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getEffectiveDate() {
            return this.effectiveDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getRate() {
            return this.rate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRateType() {
            return this.rateType;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.effectiveDate, aVar.effectiveDate) && Intrinsics.f(this.rate, aVar.rate) && Intrinsics.f(this.rateType, aVar.rateType);
        }

        public final int hashCode() {
            return this.rateType.hashCode() + p.a.c(wp5.y.a(this.id.hashCode() * 31, 31, this.effectiveDate), 31, this.rate);
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a getBaseRate() {
        return this.baseRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFixedRatePeriodType() {
        return this.fixedRatePeriodType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInterestRate() {
        return this.interestRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMargin() {
        return this.margin;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.mode, sVar.mode) && Intrinsics.f(this.interestRate, sVar.interestRate) && Intrinsics.f(this.baseRate, sVar.baseRate) && Intrinsics.f(this.margin, sVar.margin) && Intrinsics.f(this.apr, sVar.apr) && Intrinsics.f(this.nextScheduleRegeneration, sVar.nextScheduleRegeneration) && Intrinsics.f(this.fixedRatePeriodType, sVar.fixedRatePeriodType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getNextScheduleRegeneration() {
        return this.nextScheduleRegeneration;
    }

    public final int hashCode() {
        int iC = p.a.c(this.mode.hashCode() * 31, 31, this.interestRate);
        a aVar = this.baseRate;
        int iHashCode = (iC + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.margin;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.apr;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.nextScheduleRegeneration;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str3 = this.fixedRatePeriodType;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }
}
