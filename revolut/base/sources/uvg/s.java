package uvg;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\t\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u001f"}, d2 = {"Luvg/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "asset", "Lorg/joda/time/LocalDate;", "b", "Lorg/joda/time/LocalDate;", "h", "()Lorg/joda/time/LocalDate;", "sellDate", "Ljo3/a;", "c", "Ljo3/a;", "d", "()Ljo3/a;", "pnlFifo", "pnlAverage", "e", "g", "ref", "Lko3/a;", "f", "Lko3/a;", "()Lko3/a;", "openingPrice", "quantity", "productType", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("asset")
    @NotNull
    private final String asset;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("sellDate")
    @NotNull
    private final LocalDate sellDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("pnlFifo")
    @NotNull
    private final jo3.a pnlFifo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pnlAverage")
    @NotNull
    private final jo3.a pnlAverage;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("ref")
    private final String ref;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("openingPrice")
    private final ko3.a openingPrice;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantity")
    private final String quantity;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("productType")
    private final String productType;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAsset() {
        return this.asset;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ko3.a getOpeningPrice() {
        return this.openingPrice;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getPnlAverage() {
        return this.pnlAverage;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPnlFifo() {
        return this.pnlFifo;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductType() {
        return this.productType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.asset, sVar.asset) && Intrinsics.f(this.sellDate, sVar.sellDate) && Intrinsics.f(this.pnlFifo, sVar.pnlFifo) && Intrinsics.f(this.pnlAverage, sVar.pnlAverage) && Intrinsics.f(this.ref, sVar.ref) && Intrinsics.f(this.openingPrice, sVar.openingPrice) && Intrinsics.f(this.quantity, sVar.quantity) && Intrinsics.f(this.productType, sVar.productType);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LocalDate getSellDate() {
        return this.sellDate;
    }

    public final int hashCode() {
        int iJ = v7.j(this.pnlAverage, v7.j(this.pnlFifo, com.revolut.data.database.models.openbanking.d.g(this.sellDate, this.asset.hashCode() * 31, 31), 31), 31);
        String str = this.ref;
        int iHashCode = (iJ + (str == null ? 0 : str.hashCode())) * 31;
        ko3.a aVar = this.openingPrice;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.quantity;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productType;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
