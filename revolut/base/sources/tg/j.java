package tg;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: loaded from: classes17.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Marker f271018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LatLng f271019b;

    public j(Marker marker) {
        this.f271018a = marker;
        this.f271019b = marker.getPosition();
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof j)) {
            return false;
        }
        return this.f271018a.equals(((j) obj2).f271018a);
    }

    public final int hashCode() {
        return this.f271018a.hashCode();
    }
}
