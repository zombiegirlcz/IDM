package androidx.core.location;

import android.location.LocationManager;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes15.dex */
public abstract class LocationManagerCompat {
    static final WeakHashMap<Object, WeakReference<Object>> sLocationListeners = new WeakHashMap<>();

    public static class Api28Impl {
        public static boolean isLocationEnabled(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    public static boolean isLocationEnabled(LocationManager locationManager) {
        return Api28Impl.isLocationEnabled(locationManager);
    }
}
