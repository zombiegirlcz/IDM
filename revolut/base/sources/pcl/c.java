package pcl;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\u0006\u0010\t¨\u0006\u000e"}, d2 = {"Lpcl/c;", "", "", "toString", "()Ljava/lang/String;", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "b", "()Ljava/math/BigDecimal;", "macaulayDuration", "c", "modifiedDuration", "convexity", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("macaulayDuration")
    private final BigDecimal macaulayDuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("modifiedDuration")
    private final BigDecimal modifiedDuration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("convexity")
    private final BigDecimal convexity;

    public c(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3) {
        this.macaulayDuration = bigDecimal;
        this.modifiedDuration = bigDecimal2;
        this.convexity = bigDecimal3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getConvexity() {
        return this.convexity;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final BigDecimal getMacaulayDuration() {
        return this.macaulayDuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getModifiedDuration() {
        return this.modifiedDuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.macaulayDuration, cVar.macaulayDuration) && Intrinsics.f(this.modifiedDuration, cVar.modifiedDuration) && Intrinsics.f(this.convexity, cVar.convexity);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.macaulayDuration;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.modifiedDuration;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.convexity;
        return iHashCode2 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }
}
