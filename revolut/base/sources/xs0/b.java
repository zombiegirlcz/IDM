package xs0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f308382a = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f308383b = BitmapDescriptorFactory.HUE_RED;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Float.compare(this.f308382a, bVar.f308382a) == 0 && Float.compare(this.f308383b, bVar.f308383b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f308383b) + (Float.hashCode(this.f308382a) * 31);
    }
}
