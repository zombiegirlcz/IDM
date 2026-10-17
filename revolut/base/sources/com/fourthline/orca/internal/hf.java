package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class hf {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Map b(ff ffVar, ef efVar, String str) {
        aim.f builder = new aim.f();
        builder.put("file_name", str);
        boolean z = false;
        builder.put("gps_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getGps().getEnabled()));
        builder.put("gps_data_collected", Boolean.valueOf(!efVar.f().isEmpty()));
        builder.put("network_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getNetwork().getEnabled()));
        builder.put("network_data_collected", Boolean.valueOf(!efVar.k().isEmpty()));
        builder.put("system_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getSystem().getEnabled()));
        builder.put("system_data_collected", Boolean.valueOf(!efVar.o().isEmpty()));
        builder.put("battery_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getBattery().getEnabled()));
        builder.put("battery_data_collected", Boolean.valueOf(!efVar.a().isEmpty()));
        builder.put("cellular_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getCellular().getEnabled()));
        builder.put("cellular_data_collected", Boolean.valueOf(!efVar.b().isEmpty()));
        builder.put("locale_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getLocale().getEnabled()));
        builder.put("locale_data_collected", Boolean.valueOf(!efVar.h().isEmpty()));
        builder.put("hardware_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getHardware().getEnabled()));
        builder.put("hardware_data_collected", Boolean.valueOf(!efVar.g().isEmpty()));
        builder.put("screen_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getIb.b.Screen java.lang.String().getEnabled()));
        builder.put("screen_data_collected", Boolean.valueOf(!efVar.m().isEmpty()));
        builder.put("motion_data_enabled", Boolean.valueOf(ffVar.getEnabled() && ffVar.getMotion().getEnabled()));
        builder.put("motion_data_collected", Boolean.valueOf(!efVar.i().isEmpty()));
        if (ffVar.getEnabled() && ffVar.getEnvironment().getEnabled()) {
            z = true;
        }
        builder.put("environment_data_enabled", Boolean.valueOf(z));
        builder.put("environment_data_collected", Boolean.valueOf(!efVar.d().isEmpty()));
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }
}
