package on4;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\"\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u000b\u0010\u001e¨\u0006 "}, d2 = {"Lon4/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "d", "()D", "purchaseRate", "b", "f", "withdrawalRate", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apr", "Lrn4/d;", "Lrn4/d;", "()Lrn4/d;", "promotionalPeriod", "Lon4/c$a;", "e", "Lon4/c$a;", "()Lon4/c$a;", "rates", "", "Lio4/f;", "Ljava/util/List;", "()Ljava/util/List;", "detailsSection", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("purchaseRate")
    private final double purchaseRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("withdrawalRate")
    private final double withdrawalRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final Double apr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("promotionalPeriod")
    private final rn4.d promotionalPeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("rates")
    @NotNull
    private final a rates;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("detailsSection")
    private final List<io4.f> detailsSection;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u000e"}, d2 = {"Lon4/c$a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "withdrawal", "b", "c", "transfer", "apr", "purchase", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("withdrawal")
        @NotNull
        private final String withdrawal;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("transfer")
        @NotNull
        private final String transfer;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("apr")
        private final String apr;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("purchase")
        @NotNull
        private final String purchase;

        public a(String withdrawal, String transfer, String str, String purchase) {
            Intrinsics.checkNotNullParameter(withdrawal, "withdrawal");
            Intrinsics.checkNotNullParameter(transfer, "transfer");
            Intrinsics.checkNotNullParameter(purchase, "purchase");
            this.withdrawal = withdrawal;
            this.transfer = transfer;
            this.apr = str;
            this.purchase = purchase;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApr() {
            return this.apr;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPurchase() {
            return this.purchase;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTransfer() {
            return this.transfer;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getWithdrawal() {
            return this.withdrawal;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.withdrawal, aVar.withdrawal) && Intrinsics.f(this.transfer, aVar.transfer) && Intrinsics.f(this.apr, aVar.apr) && Intrinsics.f(this.purchase, aVar.purchase);
        }

        public final int hashCode() {
            int iC = p.a.c(this.withdrawal.hashCode() * 31, 31, this.transfer);
            String str = this.apr;
            return this.purchase.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }
    }

    public c(double d, double d5, Double d6, rn4.d dVar, a rates, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.purchaseRate = d;
        this.withdrawalRate = d5;
        this.apr = d6;
        this.promotionalPeriod = dVar;
        this.rates = rates;
        this.detailsSection = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDetailsSection() {
        return this.detailsSection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final rn4.d getPromotionalPeriod() {
        return this.promotionalPeriod;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getPurchaseRate() {
        return this.purchaseRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getRates() {
        return this.rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Double.compare(this.purchaseRate, cVar.purchaseRate) == 0 && Double.compare(this.withdrawalRate, cVar.withdrawalRate) == 0 && Intrinsics.f(this.apr, cVar.apr) && Intrinsics.f(this.promotionalPeriod, cVar.promotionalPeriod) && Intrinsics.f(this.rates, cVar.rates) && Intrinsics.f(this.detailsSection, cVar.detailsSection);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getWithdrawalRate() {
        return this.withdrawalRate;
    }

    public final int hashCode() {
        int iC = m72.b.c(Double.hashCode(this.purchaseRate) * 31, this.withdrawalRate, 31);
        Double d = this.apr;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        rn4.d dVar = this.promotionalPeriod;
        int iHashCode2 = (this.rates.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        List<io4.f> list = this.detailsSection;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
