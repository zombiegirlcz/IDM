package gfk;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k {

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lgfk/k$a;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "d", "pricingPlanId", "c", "currency", "Lgfk/o;", "Lgfk/o;", "()Lgfk/o;", "limit", "Lgfk/m;", "e", "Lgfk/m;", "()Lgfk/m;", "fee", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("limit")
        private final o limit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("fee")
        private final m fee;

        public a(String pricingPlanId, String currency, o oVar, m mVar) {
            Intrinsics.checkNotNullParameter("ATM", "productType");
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.productType = "ATM";
            this.pricingPlanId = pricingPlanId;
            this.currency = currency;
            this.limit = oVar;
            this.fee = mVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o getLimit() {
            return this.limit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPricingPlanId() {
            return this.pricingPlanId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.productType, aVar.productType) && Intrinsics.f(this.pricingPlanId, aVar.pricingPlanId) && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.limit, aVar.limit) && Intrinsics.f(this.fee, aVar.fee);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.productType.hashCode() * 31, 31, this.pricingPlanId), 31, this.currency);
            o oVar = this.limit;
            int iHashCode = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
            m mVar = this.fee;
            return iHashCode + (mVar != null ? mVar.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lgfk/k$b;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "d", "pricingPlanId", "c", "currency", "Lgfk/m;", "Lgfk/m;", "()Lgfk/m;", "fee", "e", "highestFee", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("fee")
        private final m fee;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("highestFee")
        private final m highestFee;

        public b(String pricingPlanId, String currency, m mVar, m mVar2) {
            Intrinsics.checkNotNullParameter("COMMODITY_EXCHANGE", "productType");
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.productType = "COMMODITY_EXCHANGE";
            this.pricingPlanId = pricingPlanId;
            this.currency = currency;
            this.fee = mVar;
            this.highestFee = mVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final m getHighestFee() {
            return this.highestFee;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPricingPlanId() {
            return this.pricingPlanId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.productType, bVar.productType) && Intrinsics.f(this.pricingPlanId, bVar.pricingPlanId) && Intrinsics.f(this.currency, bVar.currency) && Intrinsics.f(this.fee, bVar.fee) && Intrinsics.f(this.highestFee, bVar.highestFee);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.productType.hashCode() * 31, 31, this.pricingPlanId), 31, this.currency);
            m mVar = this.fee;
            int iHashCode = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
            m mVar2 = this.highestFee;
            return iHashCode + (mVar2 != null ? mVar2.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\f\u0010\u0015¨\u0006\u0019"}, d2 = {"Lgfk/k$c;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "e", "pricingPlanId", "c", "currency", "Lgfk/o;", "d", "Lgfk/o;", "()Lgfk/o;", "limit", "Lgfk/m;", "Lgfk/m;", "()Lgfk/m;", "fee", "f", "highestFee", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("limit")
        private final o limit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("fee")
        private final m fee;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @lg.b("highestFee")
        private final m highestFee;

        public c(String pricingPlanId, String currency, o oVar, m mVar, m mVar2) {
            Intrinsics.checkNotNullParameter("CRYPTO_EXCHANGE", "productType");
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.productType = "CRYPTO_EXCHANGE";
            this.pricingPlanId = pricingPlanId;
            this.currency = currency;
            this.limit = oVar;
            this.fee = mVar;
            this.highestFee = mVar2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final m getHighestFee() {
            return this.highestFee;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final o getLimit() {
            return this.limit;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPricingPlanId() {
            return this.pricingPlanId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.productType, cVar.productType) && Intrinsics.f(this.pricingPlanId, cVar.pricingPlanId) && Intrinsics.f(this.currency, cVar.currency) && Intrinsics.f(this.limit, cVar.limit) && Intrinsics.f(this.fee, cVar.fee) && Intrinsics.f(this.highestFee, cVar.highestFee);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.productType.hashCode() * 31, 31, this.pricingPlanId), 31, this.currency);
            o oVar = this.limit;
            int iHashCode = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
            m mVar = this.fee;
            int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            m mVar2 = this.highestFee;
            return iHashCode2 + (mVar2 != null ? mVar2.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgfk/k$d;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "c", "pricingPlanId", "currency", "Lgfk/o;", "d", "Lgfk/o;", "()Lgfk/o;", "limit", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("limit")
        private final o limit;

        public d(String pricingPlanId, String currency, o oVar) {
            Intrinsics.checkNotNullParameter("EXCHANGE", "productType");
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.productType = "EXCHANGE";
            this.pricingPlanId = pricingPlanId;
            this.currency = currency;
            this.limit = oVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o getLimit() {
            return this.limit;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPricingPlanId() {
            return this.pricingPlanId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.productType, dVar.productType) && Intrinsics.f(this.pricingPlanId, dVar.pricingPlanId) && Intrinsics.f(this.currency, dVar.currency) && Intrinsics.f(this.limit, dVar.limit);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.productType.hashCode() * 31, 31, this.pricingPlanId), 31, this.currency);
            o oVar = this.limit;
            return iC + (oVar == null ? 0 : oVar.hashCode());
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0017"}, d2 = {"Lgfk/k$e;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "d", "pricingPlanId", "c", "currency", "Lgfk/o;", "Lgfk/o;", "()Lgfk/o;", "limit", "Lgfk/m;", "e", "Lgfk/m;", "()Lgfk/m;", "fee", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class e extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("limit")
        private final o limit;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("fee")
        private final m fee;

        public e(String pricingPlanId, String currency, o oVar, m mVar) {
            Intrinsics.checkNotNullParameter("TRADE", "productType");
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.productType = "TRADE";
            this.pricingPlanId = pricingPlanId;
            this.currency = currency;
            this.limit = oVar;
            this.fee = mVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o getLimit() {
            return this.limit;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getPricingPlanId() {
            return this.pricingPlanId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.productType, eVar.productType) && Intrinsics.f(this.pricingPlanId, eVar.pricingPlanId) && Intrinsics.f(this.currency, eVar.currency) && Intrinsics.f(this.limit, eVar.limit) && Intrinsics.f(this.fee, eVar.fee);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.productType.hashCode() * 31, 31, this.pricingPlanId), 31, this.currency);
            o oVar = this.limit;
            int iHashCode = (iC + (oVar == null ? 0 : oVar.hashCode())) * 31;
            m mVar = this.fee;
            return iHashCode + (mVar != null ? mVar.hashCode() : 0);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lgfk/k$f;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "pricingPlanId", "Ljava/math/BigDecimal;", "c", "Ljava/math/BigDecimal;", "()Ljava/math/BigDecimal;", "discountPercentage", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class f extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("discountPercentage")
        private final BigDecimal discountPercentage;

        public f(String pricingPlanId, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter("TRANSFER", "productType");
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            this.productType = "TRANSFER";
            this.pricingPlanId = pricingPlanId;
            this.discountPercentage = bigDecimal;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BigDecimal getDiscountPercentage() {
            return this.discountPercentage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPricingPlanId() {
            return this.pricingPlanId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.productType, fVar.productType) && Intrinsics.f(this.pricingPlanId, fVar.pricingPlanId) && Intrinsics.f(this.discountPercentage, fVar.discountPercentage);
        }

        public final int hashCode() {
            int iC = p.a.c(this.productType.hashCode() * 31, 31, this.pricingPlanId);
            BigDecimal bigDecimal = this.discountPercentage;
            return iC + (bigDecimal == null ? 0 : bigDecimal.hashCode());
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004¨\u0006\f"}, d2 = {"Lgfk/k$g;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "getPricingPlanId", "pricingPlanId", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class g extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.productType, gVar.productType) && Intrinsics.f(this.pricingPlanId, gVar.pricingPlanId);
        }

        public final int hashCode() {
            return this.pricingPlanId.hashCode() + (this.productType.hashCode() * 31);
        }
    }

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\t\u0010\u0010¨\u0006\u0012"}, d2 = {"Lgfk/k$h;", "Lgfk/k;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getProductType", "productType", "b", "c", "pricingPlanId", "currency", "Lgfk/m;", "d", "Lgfk/m;", "()Lgfk/m;", "fee", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class h extends k {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("productType")
        @NotNull
        private final String productType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("pricingPlanId")
        @NotNull
        private final String pricingPlanId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("currency")
        @NotNull
        private final String currency;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("fee")
        private final m fee;

        public h(String pricingPlanId, String currency, m mVar) {
            Intrinsics.checkNotNullParameter("WEEKEND_EXCHANGE", "productType");
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.productType = "WEEKEND_EXCHANGE";
            this.pricingPlanId = pricingPlanId;
            this.currency = currency;
            this.fee = mVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m getFee() {
            return this.fee;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getPricingPlanId() {
            return this.pricingPlanId;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.productType, hVar.productType) && Intrinsics.f(this.pricingPlanId, hVar.pricingPlanId) && Intrinsics.f(this.currency, hVar.currency) && Intrinsics.f(this.fee, hVar.fee);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.productType.hashCode() * 31, 31, this.pricingPlanId), 31, this.currency);
            m mVar = this.fee;
            return iC + (mVar == null ? 0 : mVar.hashCode());
        }
    }

    private k() {
    }
}
