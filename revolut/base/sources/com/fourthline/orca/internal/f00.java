package com.fourthline.orca.internal;

import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f00 implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f28304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f28305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f28306c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Float.valueOf(((Location) obj2).getAccuracy()), Float.valueOf(((Location) obj3).getAccuracy()));
        }
    }

    public f00(AndroidDataCollectorHelper helper, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f28304a = helper;
        this.f28305b = destination;
        this.f28306c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location a(LocationManager locationManager, String str) {
        return locationManager.getLastKnownLocation(str);
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        boolean z;
        if (this.f28306c) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.f28304a;
            this.f28305b.put("locationServicesEnabled", Boolean.valueOf(androidDataCollectorHelper.isLocationServicesEnabled()));
            this.f28305b.put("gpsIsFullAccuracyGranted", Boolean.valueOf(androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_FINE_LOCATION")));
            LocationManager locationManager = androidDataCollectorHelper.getLocationManager();
            if (locationManager != null) {
                if (androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_COARSE_LOCATION") || androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_FINE_LOCATION")) {
                    boolean z3 = true;
                    List<String> providers = locationManager.getProviders(true);
                    Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                    Location location = (Location) nkm.y.w(nkm.y.F(nkm.y.n(nkm.y.z(zhm.d0.Q(providers), new tl1(locationManager, 0)), new bi1(22)), new b()));
                    if (location != null) {
                        this.f28305b.put("gpsLatitude", Double.valueOf(location.getLatitude()));
                        this.f28305b.put("gpslongitude", Double.valueOf(location.getLongitude()));
                        this.f28305b.put("gpsAccuracy", Float.valueOf(location.getAccuracy()));
                        float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                        if (speedAccuracyMetersPerSecond == BitmapDescriptorFactory.HUE_RED) {
                            z = false;
                        } else {
                            this.f28305b.put("gpsSpeedAccuracy", Float.valueOf(speedAccuracyMetersPerSecond));
                            z = true;
                        }
                        float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                        if (verticalAccuracyMeters == BitmapDescriptorFactory.HUE_RED) {
                            z3 = false;
                        } else {
                            this.f28305b.put("gpsAltitudeAccuracy", Float.valueOf(verticalAccuracyMeters));
                        }
                        if (z) {
                            this.f28305b.put("gpsSpeed", Float.valueOf(location.getSpeed()));
                        }
                        if (z3) {
                            this.f28305b.put("gpsAltitude", Double.valueOf(location.getAltitude()));
                        }
                        this.f28305b.put("gpsTimestamp", Long.valueOf(location.getTime() / ((long) 1000)));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Location it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Build.VERSION.SDK_INT < 31 || !it8.isMock();
    }
}
