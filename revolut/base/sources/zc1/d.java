package zc1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b \u0010\rR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0004R\u001c\u0010'\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\u0004R(\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lzc1/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "name", "", "b", "J", "getUnitPriceAmount", "()J", "unitPriceAmount", "Lzc1/d$a;", "c", "Lzc1/d$a;", "getQuantity", "()Lzc1/d$a;", "quantity", "", "Lzc1/d$b;", "d", "Ljava/util/List;", "getTaxes", "()Ljava/util/List;", "taxes", "e", "getTotalAmount", "totalAmount", "f", "getTotalTaxAmount", "totalTaxAmount", "g", "getDescription", "description", "h", "getProductId", "productId", "", "i", "Ljava/util/Map;", "getMetadata", "()Ljava/util/Map;", "metadata", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("unit_price_amount")
    private final long unitPriceAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantity")
    @NotNull
    private final a quantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("taxes")
    private final List<b> taxes;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("total_amount")
    private final long totalAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("total_tax_amount")
    private final long totalTaxAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("product_id")
    private final String productId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("metadata")
    private final Map<String, String> metadata;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lzc1/d$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "getValue", "()I", "value", "b", "Ljava/lang/String;", "getUnit", "unit", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        private final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("unit")
        @NotNull
        private final String unit;

        public a(int i, String unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.value = i;
            this.unit = unit;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.value == aVar.value && Intrinsics.f(this.unit, aVar.unit);
        }

        public final int hashCode() {
            return this.unit.hashCode() + (Integer.hashCode(this.value) * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzc1/d$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRateId", "rateId", "b", "getName", "name", "", "c", "J", "getAmount", "()J", "amount", "", "d", "Ljava/lang/Double;", "getRate", "()Ljava/lang/Double;", "rate", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("rate_id")
        private final String rateId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("amount")
        private final long amount;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("rate")
        private final Double rate;

        public b(String str, String name, long j2, Double d) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.rateId = str;
            this.name = name;
            this.amount = j2;
            this.rate = d;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.rateId, bVar.rateId) && Intrinsics.f(this.name, bVar.name) && this.amount == bVar.amount && Intrinsics.f(this.rate, bVar.rate);
        }

        public final int hashCode() {
            String str = this.rateId;
            int iC = a0.d.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.name), 31, this.amount);
            Double d = this.rate;
            return iC + (d != null ? d.hashCode() : 0);
        }
    }

    public d(String name, long j2, a quantity, ArrayList arrayList, long j3, long j5, String str, String str2, Map map) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.name = name;
        this.unitPriceAmount = j2;
        this.quantity = quantity;
        this.taxes = arrayList;
        this.totalAmount = j3;
        this.totalTaxAmount = j5;
        this.description = str;
        this.productId = str2;
        this.metadata = map;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.name, dVar.name) && this.unitPriceAmount == dVar.unitPriceAmount && Intrinsics.f(this.quantity, dVar.quantity) && Intrinsics.f(this.taxes, dVar.taxes) && this.totalAmount == dVar.totalAmount && this.totalTaxAmount == dVar.totalTaxAmount && Intrinsics.f(this.description, dVar.description) && Intrinsics.f(this.productId, dVar.productId) && Intrinsics.f(this.metadata, dVar.metadata);
    }

    public final int hashCode() {
        int iHashCode = (this.quantity.hashCode() + a0.d.c(this.name.hashCode() * 31, 31, this.unitPriceAmount)) * 31;
        List<b> list = this.taxes;
        int iC = a0.d.c(a0.d.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.totalAmount), 31, this.totalTaxAmount);
        String str = this.description;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }
}
