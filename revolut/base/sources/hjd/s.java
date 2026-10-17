package hjd;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bo3.a f152713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f152714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f152715c;

    public s(bo3.a boundaries, List markers, Map campaignOffers) {
        Intrinsics.checkNotNullParameter(boundaries, "boundaries");
        Intrinsics.checkNotNullParameter(markers, "markers");
        Intrinsics.checkNotNullParameter(campaignOffers, "campaignOffers");
        this.f152713a = boundaries;
        this.f152714b = markers;
        this.f152715c = campaignOffers;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f152713a.equals(sVar.f152713a) && this.f152714b.equals(sVar.f152714b) && this.f152715c.equals(sVar.f152715c);
    }

    public final int hashCode() {
        return this.f152715c.hashCode() + p.a.d(this.f152713a.hashCode() * 31, 31, this.f152714b);
    }
}
