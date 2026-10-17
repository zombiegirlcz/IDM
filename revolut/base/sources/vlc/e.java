package vlc;

import ip0.v7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R \u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\tR\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lvlc/e;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "e", "()Ljava/math/BigDecimal;", "standardDeviation", "b", "c", "mean", "Lvlc/e$a;", "Lvlc/e$a;", "()Lvlc/e$a;", "config", "d", "getFee$annotations", "()V", "fee", "", "Lvlc/c;", "Ljava/util/List;", "()Ljava/util/List;", "simulatedAnnualReturns", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("standardDeviation")
    private final BigDecimal standardDeviation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("mean")
    @NotNull
    private final BigDecimal mean;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("config")
    @NotNull
    private final a config;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final BigDecimal fee;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("simulatedAnnualReturns")
    private final List<c> simulatedAnnualReturns;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lvlc/e$a;", "", "", "toString", "()Ljava/lang/String;", "Lvlc/e$a$a;", "a", "Lvlc/e$a$a;", "b", "()Lvlc/e$a$a;", "startingAmountRange", "monthlyContributionRange", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("starting-amount-range")
        @NotNull
        private final C1605a startingAmountRange;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("monthly-contribution-range")
        @NotNull
        private final C1605a monthlyContributionRange;

        /* JADX INFO: renamed from: vlc.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000e\u0010\t¨\u0006\u0010"}, d2 = {"Lvlc/e$a$a;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "min", "b", "max", "default", "d", "stepSize", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1605a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("min")
            @NotNull
            private final jo3.a min;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("max")
            @NotNull
            private final jo3.a max;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("default")
            @NotNull
            private final jo3.a default;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("step-size")
            @NotNull
            private final jo3.a stepSize;

            public C1605a(jo3.a min, jo3.a max, jo3.a aVar, jo3.a stepSize) {
                Intrinsics.checkNotNullParameter(min, "min");
                Intrinsics.checkNotNullParameter(max, "max");
                Intrinsics.checkNotNullParameter(aVar, "default");
                Intrinsics.checkNotNullParameter(stepSize, "stepSize");
                this.min = min;
                this.max = max;
                this.default = aVar;
                this.stepSize = stepSize;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jo3.a getDefault() {
                return this.default;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final jo3.a getMax() {
                return this.max;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final jo3.a getMin() {
                return this.min;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final jo3.a getStepSize() {
                return this.stepSize;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1605a)) {
                    return false;
                }
                C1605a c1605a = (C1605a) obj2;
                return Intrinsics.f(this.min, c1605a.min) && Intrinsics.f(this.max, c1605a.max) && Intrinsics.f(this.default, c1605a.default) && Intrinsics.f(this.stepSize, c1605a.stepSize);
            }

            public final int hashCode() {
                return this.stepSize.hashCode() + v7.j(this.default, v7.j(this.max, this.min.hashCode() * 31, 31), 31);
            }
        }

        public a(C1605a startingAmountRange, C1605a monthlyContributionRange) {
            Intrinsics.checkNotNullParameter(startingAmountRange, "startingAmountRange");
            Intrinsics.checkNotNullParameter(monthlyContributionRange, "monthlyContributionRange");
            this.startingAmountRange = startingAmountRange;
            this.monthlyContributionRange = monthlyContributionRange;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C1605a getMonthlyContributionRange() {
            return this.monthlyContributionRange;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final C1605a getStartingAmountRange() {
            return this.startingAmountRange;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.startingAmountRange, aVar.startingAmountRange) && Intrinsics.f(this.monthlyContributionRange, aVar.monthlyContributionRange);
        }

        public final int hashCode() {
            return this.monthlyContributionRange.hashCode() + (this.startingAmountRange.hashCode() * 31);
        }
    }

    public e(BigDecimal bigDecimal, BigDecimal mean, a config, BigDecimal fee2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.standardDeviation = bigDecimal;
        this.mean = mean;
        this.config = config;
        this.fee = fee2;
        this.simulatedAnnualReturns = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getMean() {
        return this.mean;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getSimulatedAnnualReturns() {
        return this.simulatedAnnualReturns;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BigDecimal getStandardDeviation() {
        return this.standardDeviation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.standardDeviation, eVar.standardDeviation) && Intrinsics.f(this.mean, eVar.mean) && Intrinsics.f(this.config, eVar.config) && Intrinsics.f(this.fee, eVar.fee) && Intrinsics.f(this.simulatedAnnualReturns, eVar.simulatedAnnualReturns);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.standardDeviation;
        int iD = t61.a.d(this.fee, (this.config.hashCode() + t61.a.d(this.mean, (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31, 31)) * 31, 31);
        List<c> list = this.simulatedAnnualReturns;
        return iD + (list != null ? list.hashCode() : 0);
    }
}
