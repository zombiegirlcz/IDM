package wg;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes17.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f297216a;

    public b(double d) {
        this.f297216a = d;
    }

    public final LatLng a(a aVar) {
        double d = aVar.f297214a;
        double d5 = this.f297216a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (aVar.f297215b / d5))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d5) - 0.5d) * 360.0d);
    }

    public final a b(LatLng latLng) {
        double d = (latLng.longitude / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.latitude));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d5 = this.f297216a;
        return new a(d * d5, dLog * d5);
    }
}
