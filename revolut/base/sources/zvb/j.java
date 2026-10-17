package zvb;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lzvb/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "id", "b", "g", "source", "c", "f", "name", "cardImageUrl", "e", "brandId", "Lzvb/m;", "Lzvb/m;", "h", "()Lzvb/m;", "termsAndConditions", "description", "instructions", "", "Lzvb/i;", "i", "Ljava/util/List;", "()Ljava/util/List;", "voucherProducts", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("cardImageUrl")
    @NotNull
    private final String cardImageUrl;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("brandId")
    private final String brandId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("termsAndConditions")
    @NotNull
    private final m termsAndConditions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("instructions")
    @NotNull
    private final String instructions;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("voucherProducts")
    @NotNull
    private final List<i> voucherProducts;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrandId() {
        return this.brandId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardImageUrl() {
        return this.cardImageUrl;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getInstructions() {
        return this.instructions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.id, jVar.id) && Intrinsics.f(this.source, jVar.source) && Intrinsics.f(this.name, jVar.name) && Intrinsics.f(this.cardImageUrl, jVar.cardImageUrl) && Intrinsics.f(this.brandId, jVar.brandId) && Intrinsics.f(this.termsAndConditions, jVar.termsAndConditions) && Intrinsics.f(this.description, jVar.description) && Intrinsics.f(this.instructions, jVar.instructions) && Intrinsics.f(this.voucherProducts, jVar.voucherProducts);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final m getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.source), 31, this.name), 31, this.cardImageUrl);
        String str = this.brandId;
        return this.voucherProducts.hashCode() + p.a.c(p.a.c((this.termsAndConditions.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.description), 31, this.instructions);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final List getVoucherProducts() {
        return this.voucherProducts;
    }
}
