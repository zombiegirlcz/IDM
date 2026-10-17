package d49;

import android.location.Location;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes13.dex */
public final class a {
    public final float a(double d, double d5, double d6, double d10) {
        float[] fArr = {BitmapDescriptorFactory.HUE_RED};
        Location.distanceBetween(d, d5, d6, d10, fArr);
        return fArr[0];
    }
}
