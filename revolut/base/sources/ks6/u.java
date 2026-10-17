package ks6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u001d\u0010\u000fR\u001a\u0010 \u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u001f\u0010\u000fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001a\u0010&\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b\u0005\u0010%¨\u0006'"}, d2 = {"Lks6/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "b", "c", "itemType", "", "J", "j", "()J", "unitPriceAmount", "Lks6/u$a;", "Lks6/u$a;", "f", "()Lks6/u$a;", "quantity", "", "Lks6/u$b;", "e", "Ljava/util/List;", "g", "()Ljava/util/List;", "taxes", "h", "totalAmount", "i", "totalTaxAmount", "description", "productId", "", "I", "()I", "color", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("itemType")
    @NotNull
    private final String itemType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitPriceAmount")
    private final long unitPriceAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("quantity")
    @NotNull
    private final a quantity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("taxes")
    private final List<b> taxes;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("totalAmount")
    private final long totalAmount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTaxAmount")
    private final long totalTaxAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("productId")
    private final String productId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("color")
    private final int color;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004¨\u0006\r"}, d2 = {"Lks6/u$a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "I", "b", "()I", "value", "Ljava/lang/String;", "unit", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getUnit() {
            return this.unit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getValue() {
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
            return this.value == aVar.value && Intrinsics.f(this.unit, aVar.unit);
        }

        public final int hashCode() {
            return this.unit.hashCode() + (Integer.hashCode(this.value) * 31);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lks6/u$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "rateId", "b", "name", "", "c", "J", "()J", "amount", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "rate", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("rateId")
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

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Double getRate() {
            return this.rate;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getRateId() {
            return this.rateId;
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

    public u(String name, String itemType, long j2, a quantity, ArrayList arrayList, long j3, long j5, String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(itemType, "itemType");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.name = name;
        this.itemType = itemType;
        this.unitPriceAmount = j2;
        this.quantity = quantity;
        this.taxes = arrayList;
        this.totalAmount = j3;
        this.totalTaxAmount = j5;
        this.description = str;
        this.productId = str2;
        this.color = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.name, uVar.name) && Intrinsics.f(this.itemType, uVar.itemType) && this.unitPriceAmount == uVar.unitPriceAmount && Intrinsics.f(this.quantity, uVar.quantity) && Intrinsics.f(this.taxes, uVar.taxes) && this.totalAmount == uVar.totalAmount && this.totalTaxAmount == uVar.totalTaxAmount && Intrinsics.f(this.description, uVar.description) && Intrinsics.f(this.productId, uVar.productId) && this.color == uVar.color;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    public final int hashCode() {
        int iHashCode = (this.quantity.hashCode() + a0.d.c(p.a.c(this.name.hashCode() * 31, 31, this.itemType), 31, this.unitPriceAmount)) * 31;
        List<b> list = this.taxes;
        int iC = a0.d.c(a0.d.c((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.totalAmount), 31, this.totalTaxAmount);
        String str = this.description;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productId;
        return Integer.hashCode(this.color) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getUnitPriceAmount() {
        return this.unitPriceAmount;
    }
}
