package com.fourthline.orca.internal;

import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class jw implements DeviceDataCollector {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f30057h = new a(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AndroidDataCollectorHelper f30058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f30059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30060c;
    private Float d;
    private Float e;
    private b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f30061g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f30062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f30063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f30064c;

        public b(float f, float f4, float f5) {
            this.f30062a = f;
            this.f30063b = f4;
            this.f30064c = f5;
        }

        public final float a() {
            return this.f30062a;
        }

        public final float b() {
            return this.f30063b;
        }

        public final float c() {
            return this.f30064c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Float.compare(this.f30062a, bVar.f30062a) == 0 && Float.compare(this.f30063b, bVar.f30063b) == 0 && Float.compare(this.f30064c, bVar.f30064c) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f30062a) * 31) + Float.hashCode(this.f30063b)) * 31) + Float.hashCode(this.f30064c);
        }

        public String toString() {
            return "MagneticField(x=" + this.f30062a + ", y=" + this.f30063b + ", z=" + this.f30064c + ")";
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj2, Object obj3) {
            return cim.b.b(Float.valueOf(((Location) obj2).getAccuracy()), Float.valueOf(((Location) obj3).getAccuracy()));
        }
    }

    public jw(AndroidDataCollectorHelper helper, Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f30058a = helper;
        this.f30059b = destination;
        this.f30060c = z;
    }

    private final float a(float f) {
        return f * 0.1f;
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f30060c) {
            AndroidDataCollectorHelper androidDataCollectorHelper = this.f30058a;
            Float f = this.d;
            if (f != null) {
                float fFloatValue = f.floatValue();
                this.f30059b.put("pressure", Float.valueOf(a(fFloatValue)));
                this.f30059b.put("altitudeRelative", Float.valueOf(SensorManager.getAltitude(1013.25f, fFloatValue)));
            }
            Float f4 = this.e;
            if (f4 != null) {
                this.f30059b.put("humidityRelative", Float.valueOf(f4.floatValue()));
            }
            b bVar = this.f;
            if (bVar != null) {
                this.f30059b.put("magneticFieldValues", "[" + bVar.a() + ", " + bVar.b() + ", " + bVar.c() + "]");
            }
            String str = this.f30061g;
            if (str != null) {
                this.f30059b.put("magneticFieldAccuracy", str);
            }
            LocationManager locationManager = androidDataCollectorHelper.getLocationManager();
            if (locationManager != null && (androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_COARSE_LOCATION") || androidDataCollectorHelper.isPermissionAvailable("android.permission.ACCESS_FINE_LOCATION"))) {
                List<String> providers = locationManager.getProviders(true);
                Intrinsics.checkNotNullExpressionValue(providers, "getProviders(...)");
                Location location = (Location) nkm.y.w(nkm.y.F(nkm.y.n(nkm.y.p(nkm.y.x(zhm.d0.Q(providers), new tl1(locationManager, 1))), new jm1(12)), new c()));
                if (location != null) {
                    GeomagneticField geomagneticField = new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), location.getTime());
                    this.f30059b.put("magneticFieldDeclination", Float.valueOf(geomagneticField.getDeclination()));
                    this.f30059b.put("magneticFieldInclination", Float.valueOf(geomagneticField.getInclination()));
                    this.f30059b.put("magneticFieldStrengthTotal", Float.valueOf(geomagneticField.getFieldStrength()));
                    this.f30059b.put("magneticFieldStrengthHorizontal", Float.valueOf(geomagneticField.getHorizontalStrength()));
                }
            }
            androidDataCollectorHelper.onSensorChanged(new mp1(this, 14));
            androidDataCollectorHelper.onAccuracyChanged(new ci1(this, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Location a(LocationManager locationManager, String str) {
        return locationManager.getLastKnownLocation(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(Location it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Build.VERSION.SDK_INT < 31 || !it8.isMock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(jw jwVar, SensorEvent sensorEvent) {
        Sensor sensor;
        Integer numValueOf = (sensorEvent == null || (sensor = sensorEvent.sensor) == null) ? null : Integer.valueOf(sensor.getType());
        if (numValueOf != null && numValueOf.intValue() == 6) {
            jwVar.d = Float.valueOf(sensorEvent.values[0]);
        } else if (numValueOf != null && numValueOf.intValue() == 12) {
            jwVar.e = Float.valueOf(sensorEvent.values[0]);
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            float[] fArr = sensorEvent.values;
            jwVar.f = new b(fArr[0], fArr[1], fArr[2]);
        }
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(jw jwVar, Sensor sensor, int i2) {
        String str = null;
        Integer numValueOf = sensor != null ? Integer.valueOf(sensor.getType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (i2 == 0) {
                str = "uncalibrated";
            } else if (i2 == 1) {
                str = "low";
            } else if (i2 == 2) {
                str = "medium";
            } else if (i2 == 3) {
                str = "high";
            }
            jwVar.f30061g = str;
        }
        return Unit.f186387a;
    }
}
