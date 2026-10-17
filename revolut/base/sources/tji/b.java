package tji;

import android.animation.TimeInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f < 0.5f) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        double d = ((double) f) - 0.5d;
        return (float) (d * 2.0d * d * 2.0d);
    }
}
