package r9g;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\r"}, d2 = {"Lr9g/z;", "", "", "toString", "()Ljava/lang/String;", "", "Lofi/m;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "overall", "inRequestedCurrency", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("overall")
    private final List<ofi.m> overall;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("inRequestedCurrency")
    private final List<ofi.m> inRequestedCurrency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getInRequestedCurrency() {
        return this.inRequestedCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getOverall() {
        return this.overall;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.overall, zVar.overall) && Intrinsics.f(this.inRequestedCurrency, zVar.inRequestedCurrency);
    }

    public final int hashCode() {
        List<ofi.m> list = this.overall;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ofi.m> list2 = this.inRequestedCurrency;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }
}
