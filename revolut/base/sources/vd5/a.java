package vd5;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\f"}, d2 = {"Lvd5/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "smallPercent", "largePercent", "feature_crypto_config_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("smallPercent")
    private final double smallPercent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("largePercent")
    private final double largePercent;

    public a(double d, double d5) {
        this.smallPercent = d;
        this.largePercent = d5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getLargePercent() {
        return this.largePercent;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getSmallPercent() {
        return this.smallPercent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Double.compare(this.smallPercent, aVar.smallPercent) == 0 && Double.compare(this.largePercent, aVar.largePercent) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.largePercent) + (Double.hashCode(this.smallPercent) * 31);
    }
}
