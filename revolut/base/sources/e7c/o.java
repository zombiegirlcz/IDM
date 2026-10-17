package e7c;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0015\u0010\u0004R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\n\u0010\u001bR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001bR\u001a\u0010\"\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b!\u0010\rR\u001c\u0010&\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010(\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b'\u0010%R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010,\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004¨\u0006-"}, d2 = {"Le7c/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "name", "", "b", "J", "m", "()J", "unitPriceAmount", "Le7c/f0;", "c", "Le7c/f0;", "g", "()Le7c/f0;", "quantity", "l", "type", "", "Le7c/j;", "e", "Ljava/util/List;", "()Ljava/util/List;", "discounts", "Le7c/m0;", "f", "h", "taxes", "i", "totalAmount", "Ljava/lang/Long;", "k", "()Ljava/lang/Long;", "totalTaxAmount", "j", "totalDiscountAmount", "imageUrls", "description", "productId", "productUrl", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitPriceAmount")
    private final long unitPriceAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantity")
    private final f0 quantity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("discounts")
    @NotNull
    private final List<j> discounts;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("taxes")
    @NotNull
    private final List<m0> taxes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalAmount")
    private final long totalAmount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTaxAmount")
    private final Long totalTaxAmount;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("totalDiscountAmount")
    private final Long totalDiscountAmount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("imageUrls")
    @NotNull
    private final List<String> imageUrls;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("description")
    private final String description;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("productId")
    private final String productId;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("productUrl")
    private final String productUrl;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getDiscounts() {
        return this.discounts;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getImageUrls() {
        return this.imageUrls;
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
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.name, oVar.name) && this.unitPriceAmount == oVar.unitPriceAmount && Intrinsics.f(this.quantity, oVar.quantity) && Intrinsics.f(this.type, oVar.type) && Intrinsics.f(this.discounts, oVar.discounts) && Intrinsics.f(this.taxes, oVar.taxes) && this.totalAmount == oVar.totalAmount && Intrinsics.f(this.totalTaxAmount, oVar.totalTaxAmount) && Intrinsics.f(this.totalDiscountAmount, oVar.totalDiscountAmount) && Intrinsics.f(this.imageUrls, oVar.imageUrls) && Intrinsics.f(this.description, oVar.description) && Intrinsics.f(this.productId, oVar.productId) && Intrinsics.f(this.productUrl, oVar.productUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getProductUrl() {
        return this.productUrl;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final f0 getQuantity() {
        return this.quantity;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    public final int hashCode() {
        int iC = a0.d.c(this.name.hashCode() * 31, 31, this.unitPriceAmount);
        f0 f0Var = this.quantity;
        int iHashCode = (iC + (f0Var == null ? 0 : f0Var.hashCode())) * 31;
        String str = this.type;
        int iC2 = a0.d.c(p.a.d(p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.discounts), 31, this.taxes), 31, this.totalAmount);
        Long l2 = this.totalTaxAmount;
        int iHashCode2 = (iC2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.totalDiscountAmount;
        int iD = p.a.d((iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31, 31, this.imageUrls);
        String str2 = this.description;
        int iHashCode3 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productUrl;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Long getTotalDiscountAmount() {
        return this.totalDiscountAmount;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Long getTotalTaxAmount() {
        return this.totalTaxAmount;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getUnitPriceAmount() {
        return this.unitPriceAmount;
    }
}
