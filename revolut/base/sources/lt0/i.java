package lt0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private i() {
    }

    public static float a(long j2, long j3, long j5) {
        long j16 = j3 - j5;
        Long lValueOf = Long.valueOf(j16);
        if (j16 == 0) {
            lValueOf = null;
        }
        return lValueOf != null ? (j2 - j5) / lValueOf.longValue() : BitmapDescriptorFactory.HUE_RED;
    }
}
