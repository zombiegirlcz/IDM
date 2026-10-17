package v93;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lv93/d;", "", "", "toString", "()Ljava/lang/String;", "Lv93/c;", "a", "Lv93/c;", "b", "()Lv93/c;", "price", "originalPrice", "feature_cards_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("current")
    @NotNull
    private final c price;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("original")
    private final c originalPrice;

    public d(c price, c cVar) {
        Intrinsics.checkNotNullParameter(price, "price");
        this.price = price;
        this.originalPrice = cVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getOriginalPrice() {
        return this.originalPrice;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getPrice() {
        return this.price;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.price, dVar.price) && Intrinsics.f(this.originalPrice, dVar.originalPrice);
    }

    public final int hashCode() {
        int iHashCode = this.price.hashCode() * 31;
        c cVar = this.originalPrice;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
