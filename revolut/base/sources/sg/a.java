package sg;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements rg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai0.d f262564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg.a f262565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LatLng f262566c;
    public final Set d;

    public a(ai0.d dVar) {
        this.f262564a = dVar;
        LatLng latLngA = dVar.a();
        this.f262566c = latLngA;
        double d = (latLngA.longitude / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLngA.latitude));
        this.f262565b = new wg.a(d * 1.0d, (((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d) * 1.0d);
        this.d = Collections.singleton(dVar);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof a) {
            return ((a) obj2).f262564a.equals(this.f262564a);
        }
        return false;
    }

    @Override // rg.a
    public final Collection getItems() {
        return this.d;
    }

    @Override // rg.a
    public final LatLng getPosition() {
        return this.f262566c;
    }

    @Override // rg.a
    public final int getSize() {
        return 1;
    }

    public final int hashCode() {
        return this.f262564a.f5146a.hashCode();
    }
}
