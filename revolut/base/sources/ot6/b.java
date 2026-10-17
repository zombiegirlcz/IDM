package ot6;

import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0014"}, d2 = {"Lot6/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "rate", "Ljo3/a;", "Ljo3/a;", "c", "()Ljo3/a;", "saleVolumeTarget", "", "I", "()I", "minSaleNumber", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final double rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("saleVolumeTarget")
    @NotNull
    private final jo3.a saleVolumeTarget;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("minSaleNumber")
    private final int minSaleNumber;

    public b(double d, int i, jo3.a saleVolumeTarget) {
        Intrinsics.checkNotNullParameter(saleVolumeTarget, "saleVolumeTarget");
        this.rate = d;
        this.saleVolumeTarget = saleVolumeTarget;
        this.minSaleNumber = i;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getMinSaleNumber() {
        return this.minSaleNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getSaleVolumeTarget() {
        return this.saleVolumeTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Double.compare(this.rate, bVar.rate) == 0 && Intrinsics.f(this.saleVolumeTarget, bVar.saleVolumeTarget) && this.minSaleNumber == bVar.minSaleNumber;
    }

    public final int hashCode() {
        return Integer.hashCode(this.minSaleNumber) + v7.j(this.saleVolumeTarget, Double.hashCode(this.rate) * 31, 31);
    }
}
