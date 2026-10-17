package n6l;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Ln6l/t;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "points", "b", "discount", "finalTotal", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("points")
    @NotNull
    private final jo3.a points;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("discount")
    @NotNull
    private final jo3.a discount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("finalTotal")
    @NotNull
    private final jo3.a finalTotal;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getFinalTotal() {
        return this.finalTotal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getPoints() {
        return this.points;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.points, tVar.points) && Intrinsics.f(this.discount, tVar.discount) && Intrinsics.f(this.finalTotal, tVar.finalTotal);
    }

    public final int hashCode() {
        return this.finalTotal.hashCode() + v7.j(this.discount, this.points.hashCode() * 31, 31);
    }
}
