package qt6;

import ip0.v7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\n\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u000e\u0010 ¨\u0006#"}, d2 = {"Lqt6/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "name", "c", "g", "unitName", "", "d", "D", "i", "()D", "unitQuantity", "Ljo3/a;", "e", "Ljo3/a;", "h", "()Ljo3/a;", "unitPrice", "f", "subtotal", "total", "totalTax", "", "Lqt6/k;", "Ljava/util/List;", "()Ljava/util/List;", "taxes", "Companion", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("unitName")
    @NotNull
    private final String unitName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("unitQuantity")
    private final double unitQuantity;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("unitPrice")
    @NotNull
    private final jo3.a unitPrice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("subtotal")
    @NotNull
    private final jo3.a subtotal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTax")
    @NotNull
    private final jo3.a totalTax;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("taxes")
    @NotNull
    private final List<k> taxes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getSubtotal() {
        return this.subtotal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.id, cVar.id) && Intrinsics.f(this.name, cVar.name) && Intrinsics.f(this.unitName, cVar.unitName) && Double.compare(this.unitQuantity, cVar.unitQuantity) == 0 && Intrinsics.f(this.unitPrice, cVar.unitPrice) && Intrinsics.f(this.subtotal, cVar.subtotal) && Intrinsics.f(this.total, cVar.total) && Intrinsics.f(this.totalTax, cVar.totalTax) && Intrinsics.f(this.taxes, cVar.taxes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.a getTotalTax() {
        return this.totalTax;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUnitName() {
        return this.unitName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.a getUnitPrice() {
        return this.unitPrice;
    }

    public final int hashCode() {
        return this.taxes.hashCode() + v7.j(this.totalTax, v7.j(this.total, v7.j(this.subtotal, v7.j(this.unitPrice, m72.b.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.unitName), this.unitQuantity, 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getUnitQuantity() {
        return this.unitQuantity;
    }
}
