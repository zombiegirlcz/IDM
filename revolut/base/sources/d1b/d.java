package d1b;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\u0004R\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004¨\u0006!"}, d2 = {"Ld1b/d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getId", "id", "b", "getQuantity", "quantity", "", "c", "D", "getAveragePrice", "()D", "averagePrice", "d", "getUnrealisedReturn", "unrealisedReturn", "e", "getUnrealisedReturnFgColor", "unrealisedReturnFgColor", "f", "getUnrealisedReturnBgColor", "unrealisedReturnBgColor", "g", "getQuantityFgColor", "quantityFgColor", "h", "getAccentColor", "accentColor", "feature_retail_advanced_charts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantity")
    @NotNull
    private final String quantity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("averagePrice")
    private final double averagePrice;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("unrealisedReturn")
    @NotNull
    private final String unrealisedReturn;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("unrealisedReturnFgColor")
    @NotNull
    private final String unrealisedReturnFgColor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("unrealisedReturnBgColor")
    @NotNull
    private final String unrealisedReturnBgColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("quantityFgColor")
    @NotNull
    private final String quantityFgColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("accentColor")
    @NotNull
    private final String accentColor;

    public d(String id10, String quantity, double d, String unrealisedReturn, String unrealisedReturnFgColor, String unrealisedReturnBgColor, String quantityFgColor, String accentColor) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(unrealisedReturn, "unrealisedReturn");
        Intrinsics.checkNotNullParameter(unrealisedReturnFgColor, "unrealisedReturnFgColor");
        Intrinsics.checkNotNullParameter(unrealisedReturnBgColor, "unrealisedReturnBgColor");
        Intrinsics.checkNotNullParameter(quantityFgColor, "quantityFgColor");
        Intrinsics.checkNotNullParameter(accentColor, "accentColor");
        this.id = id10;
        this.quantity = quantity;
        this.averagePrice = d;
        this.unrealisedReturn = unrealisedReturn;
        this.unrealisedReturnFgColor = unrealisedReturnFgColor;
        this.unrealisedReturnBgColor = unrealisedReturnBgColor;
        this.quantityFgColor = quantityFgColor;
        this.accentColor = accentColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.id, dVar.id) && Intrinsics.f(this.quantity, dVar.quantity) && Double.compare(this.averagePrice, dVar.averagePrice) == 0 && Intrinsics.f(this.unrealisedReturn, dVar.unrealisedReturn) && Intrinsics.f(this.unrealisedReturnFgColor, dVar.unrealisedReturnFgColor) && Intrinsics.f(this.unrealisedReturnBgColor, dVar.unrealisedReturnBgColor) && Intrinsics.f(this.quantityFgColor, dVar.quantityFgColor) && Intrinsics.f(this.accentColor, dVar.accentColor);
    }

    public final int hashCode() {
        return this.accentColor.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c(m72.b.c(p.a.c(this.id.hashCode() * 31, 31, this.quantity), this.averagePrice, 31), 31, this.unrealisedReturn), 31, this.unrealisedReturnFgColor), 31, this.unrealisedReturnBgColor), 31, this.quantityFgColor);
    }
}
