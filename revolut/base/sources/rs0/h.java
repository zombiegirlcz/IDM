package rs0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f256924a;

    public h(float f) {
        this.f256924a = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof h) {
            return Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0 && Float.compare(this.f256924a, ((h) obj2).f256924a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f256924a) + (Float.hashCode(BitmapDescriptorFactory.HUE_RED) * 31);
    }
}
