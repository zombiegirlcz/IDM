package jcl;

import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\t\u0010\u0019R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\f\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010$\u001a\u0004\u0018\u00010 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010(\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b\u0011\u0010'R\u001c\u0010,\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010*\u001a\u0004\b\u0017\u0010+¨\u0006-"}, d2 = {"Ljcl/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "i", "ref", "b", "j", "symbol", "c", "d", "exchange", "h", "quantity", "e", "available", "f", "k", "total", "Ljo3/b;", "g", "Ljo3/b;", "()Ljo3/b;", "averagePrice", "Lko3/b;", "Lko3/b;", "()Lko3/b;", "decimalAveragePrice", "instrumentType", "Ljava/time/ZonedDateTime;", "Ljava/time/ZonedDateTime;", "l", "()Ljava/time/ZonedDateTime;", "updatedDate", "Ljcl/b;", "Ljcl/b;", "()Ljcl/b;", "fundHoldingDetails", "Ljcl/f;", "Ljcl/f;", "()Ljcl/f;", "marginDetails", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String ref;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("symbol")
    @NotNull
    private final String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchange")
    private final String exchange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("quantity")
    @NotNull
    private final String quantity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("available")
    @NotNull
    private final String available;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final String total;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("averagePrice")
    private final jo3.b averagePrice;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("decimalAveragePrice")
    private final ko3.b decimalAveragePrice;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("instrumentType")
    private final String instrumentType;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedDate")
    private final ZonedDateTime updatedDate;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("fundHoldingDetails")
    private final b fundHoldingDetails;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("marginDetails")
    private final f marginDetails;

    public g(String ref2, String symbol, String str, String quantity, String available, String total, jo3.b bVar, String str2, ZonedDateTime zonedDateTime, b bVar2, f fVar) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(available, "available");
        Intrinsics.checkNotNullParameter(total, "total");
        this.ref = ref2;
        this.symbol = symbol;
        this.exchange = str;
        this.quantity = quantity;
        this.available = available;
        this.total = total;
        this.averagePrice = bVar;
        this.decimalAveragePrice = null;
        this.instrumentType = str2;
        this.updatedDate = zonedDateTime;
        this.fundHoldingDetails = bVar2;
        this.marginDetails = fVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getAveragePrice() {
        return this.averagePrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ko3.b getDecimalAveragePrice() {
        return this.decimalAveragePrice;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExchange() {
        return this.exchange;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getFundHoldingDetails() {
        return this.fundHoldingDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.ref, gVar.ref) && Intrinsics.f(this.symbol, gVar.symbol) && Intrinsics.f(this.exchange, gVar.exchange) && Intrinsics.f(this.quantity, gVar.quantity) && Intrinsics.f(this.available, gVar.available) && Intrinsics.f(this.total, gVar.total) && Intrinsics.f(this.averagePrice, gVar.averagePrice) && Intrinsics.f(this.decimalAveragePrice, gVar.decimalAveragePrice) && Intrinsics.f(this.instrumentType, gVar.instrumentType) && Intrinsics.f(this.updatedDate, gVar.updatedDate) && Intrinsics.f(this.fundHoldingDetails, gVar.fundHoldingDetails) && Intrinsics.f(this.marginDetails, gVar.marginDetails);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInstrumentType() {
        return this.instrumentType;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f getMarginDetails() {
        return this.marginDetails;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    public final int hashCode() {
        int iC = p.a.c(this.ref.hashCode() * 31, 31, this.symbol);
        String str = this.exchange;
        int iC2 = p.a.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.quantity), 31, this.available), 31, this.total);
        jo3.b bVar = this.averagePrice;
        int iHashCode = (iC2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ko3.b bVar2 = this.decimalAveragePrice;
        int iHashCode2 = (iHashCode + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str2 = this.instrumentType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.updatedDate;
        int iHashCode4 = (iHashCode3 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        b bVar3 = this.fundHoldingDetails;
        int iHashCode5 = (iHashCode4 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        f fVar = this.marginDetails;
        return iHashCode5 + (fVar != null ? fVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ZonedDateTime getUpdatedDate() {
        return this.updatedDate;
    }
}
