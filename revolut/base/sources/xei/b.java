package xei;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lxei/b;", "", "", "toString", "()Ljava/lang/String;", "", "a", "D", "b", "()D", "latitude", "c", "longitude", "Lxei/d;", "Lxei/d;", "()Lxei/d;", "accuracyRadius", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("latitude")
    private final double latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("longitude")
    private final double longitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("accuracyRadius")
    private final d accuracyRadius;

    public b(double d, double d5, d dVar) {
        this.latitude = d;
        this.longitude = d5;
        this.accuracyRadius = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getAccuracyRadius() {
        return this.accuracyRadius;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Double.compare(this.latitude, bVar.latitude) == 0 && Double.compare(this.longitude, bVar.longitude) == 0 && Intrinsics.f(this.accuracyRadius, bVar.accuracyRadius);
    }

    public final int hashCode() {
        int iC = m72.b.c(Double.hashCode(this.latitude) * 31, this.longitude, 31);
        d dVar = this.accuracyRadius;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
