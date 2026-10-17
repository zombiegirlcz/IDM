package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1wSDK implements SensorEventListener {
    private final int AFInAppEventParameterName;
    private final int AFInAppEventType;
    private double AFKeystoreWrapper;

    @NonNull
    private final Executor AFLogger;
    private long d;
    private final float[][] registerClient = new float[2][];
    private final long[] unregisterClient = new long[2];

    @NonNull
    private final String valueOf;

    @NonNull
    private final String values;

    public AFj1wSDK(Sensor sensor, @NonNull ExecutorService executorService) {
        int type = sensor.getType();
        this.AFInAppEventParameterName = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.values = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.valueOf = str;
        this.AFInAppEventType = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
        this.AFLogger = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AFKeystoreWrapper, reason: merged with bridge method [inline-methods] */
    public void AFInAppEventType(SensorEvent sensorEvent) {
        long j2 = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.registerClient;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.unregisterClient[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            this.registerClient[1] = fArrCopyOf;
            this.unregisterClient[1] = jCurrentTimeMillis;
            this.AFKeystoreWrapper = values(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j2 - this.d) {
            this.d = j2;
            if (Arrays.equals(fArr4, fArr)) {
                this.unregisterClient[1] = jCurrentTimeMillis;
                return;
            }
            double dValues = values(fArr3, fArr);
            if (dValues > this.AFKeystoreWrapper) {
                this.registerClient[1] = Arrays.copyOf(fArr, fArr.length);
                this.unregisterClient[1] = jCurrentTimeMillis;
                this.AFKeystoreWrapper = dValues;
            }
        }
    }

    private boolean valueOf(int i, @NonNull String str, @NonNull String str2) {
        return this.AFInAppEventParameterName == i && this.values.equals(str) && this.valueOf.equals(str2);
    }

    private static double values(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i = 0; i < iMin; i++) {
            dPow += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final void AFInAppEventParameterName(@NonNull Map<AFj1wSDK, Map<String, Object>> map, boolean z) {
        if (!valueOf()) {
            if (map.containsKey(this)) {
                return;
            }
            map.put(this, AFInAppEventParameterName());
            return;
        }
        map.put(this, AFInAppEventParameterName());
        if (z) {
            int length = this.registerClient.length;
            for (int i = 0; i < length; i++) {
                this.registerClient[i] = null;
            }
            int length2 = this.unregisterClient.length;
            for (int i2 = 0; i2 < length2; i2++) {
                this.unregisterClient[i2] = 0;
            }
            this.AFKeystoreWrapper = 0.0d;
            this.d = 0L;
        }
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof AFj1wSDK)) {
            return false;
        }
        AFj1wSDK aFj1wSDK = (AFj1wSDK) obj2;
        return valueOf(aFj1wSDK.AFInAppEventParameterName, aFj1wSDK.values, aFj1wSDK.valueOf);
    }

    public final int hashCode() {
        return this.AFInAppEventType;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.AFLogger.execute(new g(this, sensorEvent, 3));
        } else {
            AFInAppEventType(sensorEvent);
        }
    }

    private boolean valueOf() {
        return this.registerClient[0] != null;
    }

    @NonNull
    private static List<Float> values(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    @NonNull
    private Map<String, Object> AFInAppEventParameterName() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.AFInAppEventParameterName));
        concurrentHashMap.put("sN", this.values);
        concurrentHashMap.put("sV", this.valueOf);
        float[] fArr = this.registerClient[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", values(fArr));
        }
        float[] fArr2 = this.registerClient[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", values(fArr2));
        }
        return concurrentHashMap;
    }
}
