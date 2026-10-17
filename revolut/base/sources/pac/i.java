package pac;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\t\u0010\u000eR\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0017\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001d"}, d2 = {"Lpac/i;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "name", "b", "imageUrl", "", "Lpac/k;", "Ljava/util/List;", "()Ljava/util/List;", "modifierSets", "d", "f", "variants", "", "e", "I", "()I", "quantity", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "price", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("imageUrl")
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("modifierSets")
    private final List<k> modifierSets;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("variants")
    private final List<String> variants;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("quantity")
    private final int quantity;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("price")
    @NotNull
    private final jo3.a price;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getModifierSets() {
        return this.modifierSets;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getQuantity() {
        return this.quantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.name, iVar.name) && Intrinsics.f(this.imageUrl, iVar.imageUrl) && Intrinsics.f(this.modifierSets, iVar.modifierSets) && Intrinsics.f(this.variants, iVar.variants) && this.quantity == iVar.quantity && Intrinsics.f(this.price, iVar.price);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getVariants() {
        return this.variants;
    }

    public final int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<k> list = this.modifierSets;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.variants;
        return this.price.hashCode() + j6.a.b(this.quantity, (iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31, 31);
    }
}
