package ks6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\n\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R \u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u000e\u0010 ¨\u0006\""}, d2 = {"Lks6/y;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "name", "c", "g", "unitName", "", "d", "D", "i", "()D", "unitQuantity", "Ljo3/b;", "e", "Ljo3/b;", "h", "()Ljo3/b;", "unitPrice", "f", "subtotal", "total", "totalTax", "", "Lks6/b0;", "Ljava/util/List;", "()Ljava/util/List;", "taxes", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class y {

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
    private final jo3.b unitPrice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("subtotal")
    @NotNull
    private final jo3.b subtotal;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.b total;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("totalTax")
    @NotNull
    private final jo3.b totalTax;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("taxes")
    @NotNull
    private final List<b0> taxes;

    public y(String id10, String name, String unitName, double d, jo3.b unitPrice, jo3.b subtotal, jo3.b total, jo3.b totalTax, ArrayList taxes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(unitName, "unitName");
        Intrinsics.checkNotNullParameter(unitPrice, "unitPrice");
        Intrinsics.checkNotNullParameter(subtotal, "subtotal");
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.id = id10;
        this.name = name;
        this.unitName = unitName;
        this.unitQuantity = d;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
        this.total = total;
        this.totalTax = totalTax;
        this.taxes = taxes;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getSubtotal() {
        return this.subtotal;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final jo3.b getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.id, yVar.id) && Intrinsics.f(this.name, yVar.name) && Intrinsics.f(this.unitName, yVar.unitName) && Double.compare(this.unitQuantity, yVar.unitQuantity) == 0 && Intrinsics.f(this.unitPrice, yVar.unitPrice) && Intrinsics.f(this.subtotal, yVar.subtotal) && Intrinsics.f(this.total, yVar.total) && Intrinsics.f(this.totalTax, yVar.totalTax) && Intrinsics.f(this.taxes, yVar.taxes);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final jo3.b getTotalTax() {
        return this.totalTax;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUnitName() {
        return this.unitName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final jo3.b getUnitPrice() {
        return this.unitPrice;
    }

    public final int hashCode() {
        return this.taxes.hashCode() + wp5.y.e(this.totalTax, wp5.y.e(this.total, wp5.y.e(this.subtotal, wp5.y.e(this.unitPrice, m72.b.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.name), 31, this.unitName), this.unitQuantity, 31), 31), 31), 31), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final double getUnitQuantity() {
        return this.unitQuantity;
    }
}
