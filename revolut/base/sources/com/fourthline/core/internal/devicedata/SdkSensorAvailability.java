package com.fourthline.core.internal.devicedata;

import android.hardware.SensorManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR&\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/fourthline/core/internal/devicedata/SdkSensorAvailability;", "", "<init>", "()V", "Landroid/hardware/SensorManager;", "sensorManager", "", "", "", "getAvailabilityMap", "(Landroid/hardware/SensorManager;)Ljava/util/Map;", "", "Lkotlin/Pair;", "", "a", "Ljava/util/List;", "SENSOR_KEYS_AND_TYPES", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SdkSensorAvailability {

    @NotNull
    public static final SdkSensorAvailability INSTANCE = new SdkSensorAvailability();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final List SENSOR_KEYS_AND_TYPES = v.k(new Pair(11, "rotation_vector"), new Pair(2, "magnetic_field"), new Pair(4, "gyroscope"), new Pair(1, "accelerometer"), new Pair(6, "pressure"), new Pair(12, "relative_humidity"));

    private SdkSensorAvailability() {
    }

    @NotNull
    public final Map<String, Boolean> getAvailabilityMap(SensorManager sensorManager) {
        if (sensorManager == null) {
            return r0.g();
        }
        List<Pair> list = SENSOR_KEYS_AND_TYPES;
        int iB = q0.b(w.t(list, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Pair pair : list) {
            linkedHashMap.put((String) pair.f186386b, Boolean.valueOf(sensorManager.getDefaultSensor(((Number) pair.f186385a).intValue()) != null));
        }
        return linkedHashMap;
    }
}
