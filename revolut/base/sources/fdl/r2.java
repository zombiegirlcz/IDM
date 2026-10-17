package fdl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001:\u0013\nE.<9\u001a\f\u0005\t\r\u001eA\u0014\u0012\u0018(\u0007?2J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001c\u0010%\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001e\u0010$R\u001c\u0010*\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\"\u00100\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b.\u0010/R\"\u00104\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/R\u001a\u00108\u001a\u0002058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b2\u00107R\"\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b9\u0010/R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b<\u0010/R\u001c\u0010C\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR$\u0010G\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010D\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010-\u001a\u0004\bF\u0010/R\u001c\u0010K\u001a\u0004\u0018\u00010H8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010I\u001a\u0004\b?\u0010JR\u001c\u0010P\u001a\u0004\u0018\u00010L8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010M\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lfdl/r2;", "Lfdl/g;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "n", "instrument", "b", "i", "ref", "c", "d", "stockExchangeCode", "getDescription", "description", "Lfdl/r2$h;", "e", "Lfdl/r2$h;", "m", "()Lfdl/r2$h;", "lifecycle", "Lfdl/r2$c;", "f", "Lfdl/r2$c;", "h", "()Lfdl/r2$c;", "coupon", "Lfdl/r2$a;", "g", "Lfdl/r2$a;", "()Lfdl/r2$a;", "call", "Lfdl/r2$b;", "Lfdl/r2$b;", "()Lfdl/r2$b;", "capitalProtection", "Lfdl/r2$d;", "Lfdl/r2$d;", "j", "()Lfdl/r2$d;", "finalPayout", "", "Lfdl/r2$g;", "Ljava/util/List;", "l", "()Ljava/util/List;", "keyDrivers", "Lfdl/r2$s;", "k", "v", "underlyingAssets", "Lfdl/r2$e;", "Lfdl/r2$e;", "()Lfdl/r2$e;", "issuer", "q", "mainIndicators", "Lfdl/r2$j;", "r", "payoutScenarios", "Lfdl/r2$k;", "o", "Lfdl/r2$k;", "s", "()Lfdl/r2$k;", "payoutScenariosGraph", "Lfdl/r2$l;", "p", "t", "performanceTrackers", "Lfdl/r2$i;", "Lfdl/r2$i;", "()Lfdl/r2$i;", "lossProbability", "Lfdl/r2$p;", "Lfdl/r2$p;", "u", "()Lfdl/r2$p;", "referenceAsset", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r2 implements fdl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("instrument")
    @NotNull
    private final String instrument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchange")
    @NotNull
    private final String stockExchangeCode;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("lifecycle")
    @NotNull
    private final h lifecycle;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("coupon")
    private final c coupon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("call")
    private final a call;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("capitalProtection")
    private final b capitalProtection;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("finalPayout")
    private final d finalPayout;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("keyDrivers")
    private final List<g> keyDrivers;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("underlyingAssets")
    private final List<s> underlyingAssets;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("issuer")
    @NotNull
    private final e issuer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("mainIndicators")
    private final List<String> mainIndicators;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @lg.b("payoutScenarios")
    private final List<j> payoutScenarios;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @lg.b("payoutScenariosGraph")
    private final k payoutScenariosGraph;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @lg.b("performanceTrackers")
    private final List<l> performanceTrackers;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @lg.b("lossProbability")
    private final i lossProbability;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @lg.b("referenceAsset")
    private final p referenceAsset;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0015"}, d2 = {"Lfdl/r2$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "accumulatingReturn", "b", "f", "redemption", "c", "Ljava/lang/String;", "d", "frequency", "barrier", "e", "firstObservationDate", "performanceBasis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("accumulatingReturn")
        private final BigDecimal accumulatingReturn;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("redemption")
        private final BigDecimal redemption;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("frequency")
        private final String frequency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("barrier")
        private final BigDecimal barrier;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("firstObservationDate")
        private final String firstObservationDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("performanceBasis")
        private final String performanceBasis;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getAccumulatingReturn() {
            return this.accumulatingReturn;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getBarrier() {
            return this.barrier;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFirstObservationDate() {
            return this.firstObservationDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPerformanceBasis() {
            return this.performanceBasis;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.accumulatingReturn, aVar.accumulatingReturn) && Intrinsics.f(this.redemption, aVar.redemption) && Intrinsics.f(this.frequency, aVar.frequency) && Intrinsics.f(this.barrier, aVar.barrier) && Intrinsics.f(this.firstObservationDate, aVar.firstObservationDate) && Intrinsics.f(this.performanceBasis, aVar.performanceBasis);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final BigDecimal getRedemption() {
            return this.redemption;
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.accumulatingReturn;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.redemption;
            int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            String str = this.frequency;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.barrier;
            int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            String str2 = this.firstObservationDate;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.performanceBasis;
            return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\f\u0010\u0004¨\u0006\u0011"}, d2 = {"Lfdl/r2$b;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "capitalProtected", "barrier", "c", "d", "strike", "Ljava/lang/String;", "performanceBasis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("capitalProtected")
        private final BigDecimal capitalProtected;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("barrier")
        private final BigDecimal barrier;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("strike")
        private final BigDecimal strike;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("performanceBasis")
        private final String performanceBasis;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getBarrier() {
            return this.barrier;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getCapitalProtected() {
            return this.capitalProtected;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPerformanceBasis() {
            return this.performanceBasis;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getStrike() {
            return this.strike;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.capitalProtected, bVar.capitalProtected) && Intrinsics.f(this.barrier, bVar.barrier) && Intrinsics.f(this.strike, bVar.strike) && Intrinsics.f(this.performanceBasis, bVar.performanceBasis);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.capitalProtected;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.barrier;
            int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.strike;
            int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            String str = this.performanceBasis;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0015"}, d2 = {"Lfdl/r2$c;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "e", "()Ljava/math/BigDecimal;", "rate", "b", "Ljava/lang/String;", "c", "frequency", "f", "type", "d", "barrier", "firstObservationDate", "performanceBasis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("rate")
        private final BigDecimal rate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("frequency")
        private final String frequency;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        private final String type;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("barrier")
        private final BigDecimal barrier;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("firstObservationDate")
        private final String firstObservationDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("performanceBasis")
        private final String performanceBasis;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getBarrier() {
            return this.barrier;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFirstObservationDate() {
            return this.firstObservationDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFrequency() {
            return this.frequency;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPerformanceBasis() {
            return this.performanceBasis;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BigDecimal getRate() {
            return this.rate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.rate, cVar.rate) && Intrinsics.f(this.frequency, cVar.frequency) && Intrinsics.f(this.type, cVar.type) && Intrinsics.f(this.barrier, cVar.barrier) && Intrinsics.f(this.firstObservationDate, cVar.firstObservationDate) && Intrinsics.f(this.performanceBasis, cVar.performanceBasis);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.rate;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            String str = this.frequency;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.type;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.barrier;
            int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            String str3 = this.firstObservationDate;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.performanceBasis;
            return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\r\u0010\u0004¨\u0006\u0013"}, d2 = {"Lfdl/r2$d;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "profitMultiplier", "b", "lossMultiplier", "c", "e", "strike", "cap", "Ljava/lang/String;", "performanceBasis", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("profitMultiplier")
        private final BigDecimal profitMultiplier;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("lossMultiplier")
        private final BigDecimal lossMultiplier;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("strike")
        private final BigDecimal strike;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("cap")
        private final BigDecimal cap;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("performanceBasis")
        private final String performanceBasis;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getCap() {
            return this.cap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getLossMultiplier() {
            return this.lossMultiplier;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPerformanceBasis() {
            return this.performanceBasis;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getProfitMultiplier() {
            return this.profitMultiplier;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BigDecimal getStrike() {
            return this.strike;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.profitMultiplier, dVar.profitMultiplier) && Intrinsics.f(this.lossMultiplier, dVar.lossMultiplier) && Intrinsics.f(this.strike, dVar.strike) && Intrinsics.f(this.cap, dVar.cap) && Intrinsics.f(this.performanceBasis, dVar.performanceBasis);
        }

        public final int hashCode() {
            BigDecimal bigDecimal = this.profitMultiplier;
            int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.lossMultiplier;
            int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.strike;
            int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
            BigDecimal bigDecimal4 = this.cap;
            int iHashCode4 = (iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
            String str = this.performanceBasis;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lfdl/r2$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "groupEntity", "b", "c", "issuingEntity", "Lfdl/r2$f;", "Lfdl/r2$f;", "d", "()Lfdl/r2$f;", "ratings", "Lfdl/r2$e$a;", "Lfdl/r2$e$a;", "()Lfdl/r2$e$a;", "issuerId", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("groupEntity")
        @NotNull
        private final String groupEntity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("issuingEntity")
        @NotNull
        private final String issuingEntity;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("ratings")
        private final f ratings;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("issuerId")
        private final a issuerId;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lfdl/r2$e$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "origin", "b", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("origin")
            @NotNull
            private final String origin;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getOrigin() {
                return this.origin;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.origin, aVar.origin) && Intrinsics.f(this.value, aVar.value);
            }

            public final int hashCode() {
                return this.value.hashCode() + (this.origin.hashCode() * 31);
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getGroupEntity() {
            return this.groupEntity;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getIssuerId() {
            return this.issuerId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getIssuingEntity() {
            return this.issuingEntity;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final f getRatings() {
            return this.ratings;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.groupEntity, eVar.groupEntity) && Intrinsics.f(this.issuingEntity, eVar.issuingEntity) && Intrinsics.f(this.ratings, eVar.ratings) && Intrinsics.f(this.issuerId, eVar.issuerId);
        }

        public final int hashCode() {
            int iC = p.a.c(this.groupEntity.hashCode() * 31, 31, this.issuingEntity);
            f fVar = this.ratings;
            int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
            a aVar = this.issuerId;
            return iHashCode + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lfdl/r2$f;", "", "", "toString", "()Ljava/lang/String;", "Lodl/a;", "a", "Lodl/a;", "()Lodl/a;", "fitch", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("fitch")
        private final odl.a fitch;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final odl.a getFitch() {
            return this.fitch;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.fitch, ((f) obj2).fitch);
        }

        public final int hashCode() {
            odl.a aVar = this.fitch;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lfdl/r2$g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "title", "description", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.title, gVar.title) && Intrinsics.f(this.description, gVar.description);
        }

        public final int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.description;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0012"}, d2 = {"Lfdl/r2$h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "noteTradeDate", "b", "d", "issueDate", "c", "finalObservationDate", "e", "maturityDate", "effectiveMaturityDate", "cancellationDeadlineDate", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("noteTradeDate")
        @NotNull
        private final String noteTradeDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("issueDate")
        @NotNull
        private final String issueDate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("finalObservationDate")
        @NotNull
        private final String finalObservationDate;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("maturityDate")
        @NotNull
        private final String maturityDate;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("effectiveMaturityDate")
        private final String effectiveMaturityDate;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("cancellationDeadlineDate")
        private final String cancellationDeadlineDate;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCancellationDeadlineDate() {
            return this.cancellationDeadlineDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEffectiveMaturityDate() {
            return this.effectiveMaturityDate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFinalObservationDate() {
            return this.finalObservationDate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getIssueDate() {
            return this.issueDate;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getMaturityDate() {
            return this.maturityDate;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.noteTradeDate, hVar.noteTradeDate) && Intrinsics.f(this.issueDate, hVar.issueDate) && Intrinsics.f(this.finalObservationDate, hVar.finalObservationDate) && Intrinsics.f(this.maturityDate, hVar.maturityDate) && Intrinsics.f(this.effectiveMaturityDate, hVar.effectiveMaturityDate) && Intrinsics.f(this.cancellationDeadlineDate, hVar.cancellationDeadlineDate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getNoteTradeDate() {
            return this.noteTradeDate;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.noteTradeDate.hashCode() * 31, 31, this.issueDate), 31, this.finalObservationDate), 31, this.maturityDate);
            String str = this.effectiveMaturityDate;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.cancellationDeadlineDate;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Lfdl/r2$i;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "value", "", "I", "()I", "observationWindowMonths", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final BigDecimal value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("observationWindowMonths")
        private final int observationWindowMonths;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getObservationWindowMonths() {
            return this.observationWindowMonths;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof i)) {
                return false;
            }
            i iVar = (i) obj2;
            return Intrinsics.f(this.value, iVar.value) && this.observationWindowMonths == iVar.observationWindowMonths;
        }

        public final int hashCode() {
            return Integer.hashCode(this.observationWindowMonths) + (this.value.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lfdl/r2$j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "tab", "b", "d", "title", "body", "", "Lfdl/r2$n;", "Ljava/util/List;", "()Ljava/util/List;", "ranges", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("tab")
        @NotNull
        private final String tab;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("body")
        @NotNull
        private final String body;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("ranges")
        private final List<n> ranges;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final List getRanges() {
            return this.ranges;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTab() {
            return this.tab;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof j)) {
                return false;
            }
            j jVar = (j) obj2;
            return Intrinsics.f(this.tab, jVar.tab) && Intrinsics.f(this.title, jVar.title) && Intrinsics.f(this.body, jVar.body) && Intrinsics.f(this.ranges, jVar.ranges);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.tab.hashCode() * 31, 31, this.title), 31, this.body);
            List<n> list = this.ranges;
            return iC + (list == null ? 0 : list.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lfdl/r2$k;", "", "", "toString", "()Ljava/lang/String;", "", "Lfdl/r2$k$a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "chart", "Ljava/math/BigDecimal;", "b", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "defaultX", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("chart")
        private final List<a> chart;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("defaultX")
        private final BigDecimal defaultX;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0014"}, d2 = {"Lfdl/r2$k$a;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "c", "()Ljava/math/BigDecimal;", "x", "b", "d", "y", "", "Z", "()Z", "inPrevSegment", "Ljava/lang/String;", "nextSegmentType", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("x")
            @NotNull
            private final BigDecimal x;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("y")
            @NotNull
            private final BigDecimal y;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("inPrevSegment")
            private final boolean inPrevSegment;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            @lg.b("nextSegmentType")
            private final String nextSegmentType;

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getInPrevSegment() {
                return this.inPrevSegment;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getNextSegmentType() {
                return this.nextSegmentType;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BigDecimal getX() {
                return this.x;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BigDecimal getY() {
                return this.y;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.x, aVar.x) && Intrinsics.f(this.y, aVar.y) && this.inPrevSegment == aVar.inPrevSegment && Intrinsics.f(this.nextSegmentType, aVar.nextSegmentType);
            }

            public final int hashCode() {
                int iC = j6.a.c(t61.a.d(this.y, this.x.hashCode() * 31, 31), 31, this.inPrevSegment);
                String str = this.nextSegmentType;
                return iC + (str == null ? 0 : str.hashCode());
            }
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getChart() {
            return this.chart;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getDefaultX() {
            return this.defaultX;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof k)) {
                return false;
            }
            k kVar = (k) obj2;
            return Intrinsics.f(this.chart, kVar.chart) && Intrinsics.f(this.defaultX, kVar.defaultX);
        }

        public final int hashCode() {
            List<a> list = this.chart;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            BigDecimal bigDecimal = this.defaultX;
            return iHashCode + (bigDecimal != null ? bigDecimal.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lfdl/r2$l;", "", "", "toString", "()Ljava/lang/String;", "Lfdl/r2$r;", "a", "Lfdl/r2$r;", "b", "()Lfdl/r2$r;", "title", "body", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final r title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("body")
        @NotNull
        private final r body;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final r getBody() {
            return this.body;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final r getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof l)) {
                return false;
            }
            l lVar = (l) obj2;
            return Intrinsics.f(this.title, lVar.title) && Intrinsics.f(this.body, lVar.body);
        }

        public final int hashCode() {
            return this.body.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lfdl/r2$m;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "mean", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("mean")
        private final jo3.a mean;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final jo3.a getMean() {
            return this.mean;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof m) && Intrinsics.f(this.mean, ((m) obj2).mean);
        }

        public final int hashCode() {
            jo3.a aVar = this.mean;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfdl/r2$n;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "d", "()Ljava/math/BigDecimal;", "start", "b", "c", "end", "Ljava/lang/String;", "e", "type", "description", "Lfdl/r2$o;", "Lfdl/r2$o;", "()Lfdl/r2$o;", "calculator", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("start")
        @NotNull
        private final BigDecimal start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("end")
        @NotNull
        private final BigDecimal end;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("calculator")
        private final o calculator;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final o getCalculator() {
            return this.calculator;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BigDecimal getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BigDecimal getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getType() {
            return this.type;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof n)) {
                return false;
            }
            n nVar = (n) obj2;
            return Intrinsics.f(this.start, nVar.start) && Intrinsics.f(this.end, nVar.end) && Intrinsics.f(this.type, nVar.type) && Intrinsics.f(this.description, nVar.description) && Intrinsics.f(this.calculator, nVar.calculator);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(t61.a.d(this.end, this.start.hashCode() * 31, 31), 31, this.type), 31, this.description);
            o oVar = this.calculator;
            return iC + (oVar == null ? 0 : oVar.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lfdl/r2$o;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "start", "end", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("start")
        @NotNull
        private final BigDecimal start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("end")
        @NotNull
        private final BigDecimal end;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BigDecimal getStart() {
            return this.start;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof o)) {
                return false;
            }
            o oVar = (o) obj2;
            return Intrinsics.f(this.start, oVar.start) && Intrinsics.f(this.end, oVar.end);
        }

        public final int hashCode() {
            return this.end.hashCode() + (this.start.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\r"}, d2 = {"Lfdl/r2$p;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "expectedReturn", "b", "Ljava/lang/String;", "fullName", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("expectedReturn")
        @NotNull
        private final BigDecimal expectedReturn;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fullName")
        @NotNull
        private final String fullName;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getExpectedReturn() {
            return this.expectedReturn;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof p)) {
                return false;
            }
            p pVar = (p) obj2;
            return Intrinsics.f(this.expectedReturn, pVar.expectedReturn) && Intrinsics.f(this.fullName, pVar.fullName);
        }

        public final int hashCode() {
            return this.fullName.hashCode() + (this.expectedReturn.hashCode() * 31);
        }
    }

    public static abstract class q {

        @NotNull
        public static final a Companion = new a();

        public static final class a {
            private a() {
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lfdl/r2$q$b;", "Lfdl/r2$q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "placeholder", "style", "Ljava/time/LocalDate;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            @NotNull
            private final String placeholder;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("style")
            private final String style;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final LocalDate value;

            @Override // fdl.r2.q
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final LocalDate getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.placeholder, bVar.placeholder) && Intrinsics.f(this.style, bVar.style) && Intrinsics.f(this.value, bVar.value);
            }

            public final int hashCode() {
                int iHashCode = this.placeholder.hashCode() * 31;
                String str = this.style;
                return this.value.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lfdl/r2$q$c;", "Lfdl/r2$q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "placeholder", "style", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            @NotNull
            private final String placeholder;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("style")
            private final String style;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final jo3.a value;

            @Override // fdl.r2.q
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final jo3.a getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.placeholder, cVar.placeholder) && Intrinsics.f(this.style, cVar.style) && Intrinsics.f(this.value, cVar.value);
            }

            public final int hashCode() {
                int iHashCode = this.placeholder.hashCode() * 31;
                String str = this.style;
                return this.value.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lfdl/r2$q$d;", "Lfdl/r2$q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "placeholder", "style", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            @NotNull
            private final String placeholder;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("style")
            private final String style;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final BigDecimal value;

            @Override // fdl.r2.q
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BigDecimal getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.placeholder, dVar.placeholder) && Intrinsics.f(this.style, dVar.style) && Intrinsics.f(this.value, dVar.value);
            }

            public final int hashCode() {
                int iHashCode = this.placeholder.hashCode() * 31;
                String str = this.style;
                return this.value.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lfdl/r2$q$e;", "Lfdl/r2$q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "placeholder", "style", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class e extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            @NotNull
            private final String placeholder;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("style")
            private final String style;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final BigDecimal value;

            @Override // fdl.r2.q
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BigDecimal getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.placeholder, eVar.placeholder) && Intrinsics.f(this.style, eVar.style) && Intrinsics.f(this.value, eVar.value);
            }

            public final int hashCode() {
                int iHashCode = this.placeholder.hashCode() * 31;
                String str = this.style;
                return this.value.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lfdl/r2$q$f;", "Lfdl/r2$q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "placeholder", "style", "c", "value", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class f extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            @NotNull
            private final String placeholder;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("style")
            private final String style;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("value")
            @NotNull
            private final String value;

            @Override // fdl.r2.q
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStyle() {
                return this.style;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getValue() {
                return this.value;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof f)) {
                    return false;
                }
                f fVar = (f) obj2;
                return Intrinsics.f(this.placeholder, fVar.placeholder) && Intrinsics.f(this.style, fVar.style) && Intrinsics.f(this.value, fVar.value);
            }

            public final int hashCode() {
                int iHashCode = this.placeholder.hashCode() * 31;
                String str = this.style;
                return this.value.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lfdl/r2$q$g;", "Lfdl/r2$q;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "placeholder", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class g extends q {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("placeholder")
            @NotNull
            private final String placeholder;

            @Override // fdl.r2.q
            /* JADX INFO: renamed from: a */
            public final String getStyle() {
                return null;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getPlaceholder() {
                return this.placeholder;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof g) && Intrinsics.f(this.placeholder, ((g) obj2).placeholder);
            }

            public final int hashCode() {
                return this.placeholder.hashCode();
            }
        }

        private q() {
        }

        /* JADX INFO: renamed from: a */
        public abstract String getStyle();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lfdl/r2$r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "template", "", "Lfdl/r2$q;", "Ljava/util/List;", "()Ljava/util/List;", "args", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("template")
        @NotNull
        private final String template;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("args")
        private final List<q> args;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getArgs() {
            return this.args;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTemplate() {
            return this.template;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof r)) {
                return false;
            }
            r rVar = (r) obj2;
            return Intrinsics.f(this.template, rVar.template) && Intrinsics.f(this.args, rVar.args);
        }

        public final int hashCode() {
            int iHashCode = this.template.hashCode() * 31;
            List<q> list = this.args;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lfdl/r2$s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "ref", "b", "fullName", "c", "description", "Lfdl/r2$m;", "d", "Lfdl/r2$m;", "()Lfdl/r2$m;", "priceTarget", "Lko3/a;", "Lko3/a;", "()Lko3/a;", "initialBuyPrice", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("ref")
        @NotNull
        private final String ref;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("fullName")
        @NotNull
        private final String fullName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("description")
        private final String description;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("priceTarget")
        private final m priceTarget;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("initialBuyPrice")
        private final ko3.a initialBuyPrice;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ko3.a getInitialBuyPrice() {
            return this.initialBuyPrice;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final m getPriceTarget() {
            return this.priceTarget;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getRef() {
            return this.ref;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof s)) {
                return false;
            }
            s sVar = (s) obj2;
            return Intrinsics.f(this.ref, sVar.ref) && Intrinsics.f(this.fullName, sVar.fullName) && Intrinsics.f(this.description, sVar.description) && Intrinsics.f(this.priceTarget, sVar.priceTarget) && Intrinsics.f(this.initialBuyPrice, sVar.initialBuyPrice);
        }

        public final int hashCode() {
            int iC = p.a.c(this.ref.hashCode() * 31, 31, this.fullName);
            String str = this.description;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            m mVar = this.priceTarget;
            int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            ko3.a aVar = this.initialBuyPrice;
            return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStockExchangeCode() {
        return this.stockExchangeCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj2;
        return Intrinsics.f(this.instrument, r2Var.instrument) && Intrinsics.f(this.ref, r2Var.ref) && Intrinsics.f(this.stockExchangeCode, r2Var.stockExchangeCode) && Intrinsics.f(this.description, r2Var.description) && Intrinsics.f(this.lifecycle, r2Var.lifecycle) && Intrinsics.f(this.coupon, r2Var.coupon) && Intrinsics.f(this.call, r2Var.call) && Intrinsics.f(this.capitalProtection, r2Var.capitalProtection) && Intrinsics.f(this.finalPayout, r2Var.finalPayout) && Intrinsics.f(this.keyDrivers, r2Var.keyDrivers) && Intrinsics.f(this.underlyingAssets, r2Var.underlyingAssets) && Intrinsics.f(this.issuer, r2Var.issuer) && Intrinsics.f(this.mainIndicators, r2Var.mainIndicators) && Intrinsics.f(this.payoutScenarios, r2Var.payoutScenarios) && Intrinsics.f(this.payoutScenariosGraph, r2Var.payoutScenariosGraph) && Intrinsics.f(this.performanceTrackers, r2Var.performanceTrackers) && Intrinsics.f(this.lossProbability, r2Var.lossProbability) && Intrinsics.f(this.referenceAsset, r2Var.referenceAsset);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getCall() {
        return this.call;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final b getCapitalProtection() {
        return this.capitalProtection;
    }

    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final c getCoupon() {
        return this.coupon;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.instrument.hashCode() * 31, 31, this.ref), 31, this.stockExchangeCode);
        String str = this.description;
        int iHashCode = (this.lifecycle.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        c cVar = this.coupon;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        a aVar = this.call;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.capitalProtection;
        int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        d dVar = this.finalPayout;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<g> list = this.keyDrivers;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<s> list2 = this.underlyingAssets;
        int iHashCode7 = (this.issuer.hashCode() + ((iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31)) * 31;
        List<String> list3 = this.mainIndicators;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<j> list4 = this.payoutScenarios;
        int iHashCode9 = (iHashCode8 + (list4 == null ? 0 : list4.hashCode())) * 31;
        k kVar = this.payoutScenariosGraph;
        int iHashCode10 = (iHashCode9 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        List<l> list5 = this.performanceTrackers;
        int iHashCode11 = (iHashCode10 + (list5 == null ? 0 : list5.hashCode())) * 31;
        i iVar = this.lossProbability;
        int iHashCode12 = (iHashCode11 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        p pVar = this.referenceAsset;
        return iHashCode12 + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final d getFinalPayout() {
        return this.finalPayout;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final e getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final List getKeyDrivers() {
        return this.keyDrivers;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final h getLifecycle() {
        return this.lifecycle;
    }

    @Override // fdl.g
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getInstrument() {
        return this.instrument;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final i getLossProbability() {
        return this.lossProbability;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final List getMainIndicators() {
        return this.mainIndicators;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final List getPayoutScenarios() {
        return this.payoutScenarios;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final k getPayoutScenariosGraph() {
        return this.payoutScenariosGraph;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final List getPerformanceTrackers() {
        return this.performanceTrackers;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final p getReferenceAsset() {
        return this.referenceAsset;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final List getUnderlyingAssets() {
        return this.underlyingAssets;
    }
}
