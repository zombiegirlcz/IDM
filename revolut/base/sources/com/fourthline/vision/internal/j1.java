package com.fourthline.vision.internal;

import android.hardware.SensorManager;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public abstract class j1 implements e4m.e {
    public static Map a(s0 s0Var, SensorManager sensorManager) {
        Map<String, Boolean> mapProvideSdkSensorAvailability = s0Var.provideSdkSensorAvailability(sensorManager);
        vc.s.k(mapProvideSdkSensorAvailability);
        return mapProvideSdkSensorAvailability;
    }

    @Override // phm.a
    public abstract /* synthetic */ Object get();
}
