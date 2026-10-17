package dh0;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f114737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f114738b;

    public b(Rect rect, a aVar) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.f114737a = rect;
        this.f114738b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f114737a.equals(bVar.f114737a) && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Intrinsics.f(this.f114738b, bVar.f114738b);
    }

    public final int hashCode() {
        int iB = m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(BitmapDescriptorFactory.HUE_RED, m72.b.b(BitmapDescriptorFactory.HUE_RED, this.f114737a.hashCode() * 31, 31), 31), 31);
        a aVar = this.f114738b;
        return iB + (aVar == null ? 0 : aVar.f114736a.hashCode());
    }
}
