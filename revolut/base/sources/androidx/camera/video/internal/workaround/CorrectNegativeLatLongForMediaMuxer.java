package androidx.camera.video.internal.workaround;

import android.util.Pair;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CorrectNegativeLatLongForMediaMuxer {
    public static Pair<Double, Double> adjustGeoLocation(double d, double d5) {
        if (DeviceQuirks.get(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            d = adjustInternal(d);
            d5 = adjustInternal(d5);
        }
        return Pair.create(Double.valueOf(d), Double.valueOf(d5));
    }

    private static double adjustInternal(double d) {
        return d >= 0.0d ? d : ((d * 10000.0d) - 1.0d) / 10000.0d;
    }
}
